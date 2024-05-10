package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiezhongdingdanDao;
import com.entity.JiezhongdingdanEntity;
import com.service.JiezhongdingdanService;
import com.entity.vo.JiezhongdingdanVO;
import com.entity.view.JiezhongdingdanView;

@Service("jiezhongdingdanService")
public class JiezhongdingdanServiceImpl extends ServiceImpl<JiezhongdingdanDao, JiezhongdingdanEntity> implements JiezhongdingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiezhongdingdanEntity> page = this.selectPage(
                new Query<JiezhongdingdanEntity>(params).getPage(),
                new EntityWrapper<JiezhongdingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiezhongdingdanEntity> wrapper) {
		  Page<JiezhongdingdanView> page =new Query<JiezhongdingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiezhongdingdanVO> selectListVO(Wrapper<JiezhongdingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiezhongdingdanVO selectVO(Wrapper<JiezhongdingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiezhongdingdanView> selectListView(Wrapper<JiezhongdingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiezhongdingdanView selectView(Wrapper<JiezhongdingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
