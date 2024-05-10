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

import com.entity.JiancedingdanEntity;
import com.entity.view.JiancedingdanView;

import com.service.JiancedingdanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 检测订单
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-23 14:12:32
 */
@RestController
@RequestMapping("/jiancedingdan")
public class JiancedingdanController {
    @Autowired
    private JiancedingdanService jiancedingdanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiancedingdanEntity jiancedingdan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jiancedingdan.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yihurenyuan")) {
			jiancedingdan.setYihugonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiancedingdanEntity> ew = new EntityWrapper<JiancedingdanEntity>();
		PageUtils page = jiancedingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiancedingdan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiancedingdanEntity jiancedingdan, HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jiancedingdan.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yihurenyuan")) {
			jiancedingdan.setYihugonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiancedingdanEntity> ew = new EntityWrapper<JiancedingdanEntity>();
		PageUtils page = jiancedingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiancedingdan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiancedingdanEntity jiancedingdan){
       	EntityWrapper<JiancedingdanEntity> ew = new EntityWrapper<JiancedingdanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiancedingdan, "jiancedingdan")); 
        return R.ok().put("data", jiancedingdanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiancedingdanEntity jiancedingdan){
        EntityWrapper< JiancedingdanEntity> ew = new EntityWrapper< JiancedingdanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiancedingdan, "jiancedingdan")); 
		JiancedingdanView jiancedingdanView =  jiancedingdanService.selectView(ew);
		return R.ok("查询检测订单成功").put("data", jiancedingdanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiancedingdanEntity jiancedingdan = jiancedingdanService.selectById(id);
        return R.ok().put("data", jiancedingdan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiancedingdanEntity jiancedingdan = jiancedingdanService.selectById(id);
        return R.ok().put("data", jiancedingdan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiancedingdanEntity jiancedingdan, HttpServletRequest request){
    	jiancedingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiancedingdan);
        jiancedingdanService.insert(jiancedingdan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiancedingdanEntity jiancedingdan, HttpServletRequest request){
    	jiancedingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiancedingdan);
    	jiancedingdan.setUserid((Long)request.getSession().getAttribute("userId"));
        jiancedingdanService.insert(jiancedingdan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiancedingdanEntity jiancedingdan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiancedingdan);
        jiancedingdanService.updateById(jiancedingdan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiancedingdanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JiancedingdanEntity> wrapper = new EntityWrapper<JiancedingdanEntity>();
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

		int count = jiancedingdanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
