package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiancejinduEntity;
import com.entity.view.JiancejinduView;

import com.service.JiancejinduService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 检测进度
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-23 14:12:32
 */
@RestController
@RequestMapping("/jiancejindu")
public class JiancejinduController {
    @Autowired
    private JiancejinduService jiancejinduService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiancejinduEntity jiancejindu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jiancejindu.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yihurenyuan")) {
			jiancejindu.setYihugonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiancejinduEntity> ew = new EntityWrapper<JiancejinduEntity>();
		PageUtils page = jiancejinduService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiancejindu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiancejinduEntity jiancejindu, HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jiancejindu.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yihurenyuan")) {
			jiancejindu.setYihugonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiancejinduEntity> ew = new EntityWrapper<JiancejinduEntity>();
		PageUtils page = jiancejinduService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiancejindu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiancejinduEntity jiancejindu){
       	EntityWrapper<JiancejinduEntity> ew = new EntityWrapper<JiancejinduEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiancejindu, "jiancejindu")); 
        return R.ok().put("data", jiancejinduService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiancejinduEntity jiancejindu){
        EntityWrapper< JiancejinduEntity> ew = new EntityWrapper< JiancejinduEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiancejindu, "jiancejindu")); 
		JiancejinduView jiancejinduView =  jiancejinduService.selectView(ew);
		return R.ok("查询检测进度成功").put("data", jiancejinduView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiancejinduEntity jiancejindu = jiancejinduService.selectById(id);
        return R.ok().put("data", jiancejindu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiancejinduEntity jiancejindu = jiancejinduService.selectById(id);
        return R.ok().put("data", jiancejindu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiancejinduEntity jiancejindu, HttpServletRequest request){
    	jiancejindu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiancejindu);
        jiancejinduService.insert(jiancejindu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiancejinduEntity jiancejindu, HttpServletRequest request){
    	jiancejindu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiancejindu);
    	jiancejindu.setUserid((Long)request.getSession().getAttribute("userId"));
        jiancejinduService.insert(jiancejindu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiancejinduEntity jiancejindu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiancejindu);
        jiancejinduService.updateById(jiancejindu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiancejinduService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JiancejinduEntity> wrapper = new EntityWrapper<JiancejinduEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yihurenyuan")) {
			wrapper.eq("yihugonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = jiancejinduService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
