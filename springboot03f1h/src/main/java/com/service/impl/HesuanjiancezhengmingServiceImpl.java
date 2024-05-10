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


import com.dao.HesuanjiancezhengmingDao;
import com.entity.HesuanjiancezhengmingEntity;
import com.service.HesuanjiancezhengmingService;
import com.entity.vo.HesuanjiancezhengmingVO;
import com.entity.view.HesuanjiancezhengmingView;

@Service("hesuanjiancezhengmingService")
public class HesuanjiancezhengmingServiceImpl extends ServiceImpl<HesuanjiancezhengmingDao, HesuanjiancezhengmingEntity> implements HesuanjiancezhengmingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HesuanjiancezhengmingEntity> page = this.selectPage(
                new Query<HesuanjiancezhengmingEntity>(params).getPage(),
                new EntityWrapper<HesuanjiancezhengmingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HesuanjiancezhengmingEntity> wrapper) {
		  Page<HesuanjiancezhengmingView> page =new Query<HesuanjiancezhengmingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HesuanjiancezhengmingVO> selectListVO(Wrapper<HesuanjiancezhengmingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HesuanjiancezhengmingVO selectVO(Wrapper<HesuanjiancezhengmingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HesuanjiancezhengmingView> selectListView(Wrapper<HesuanjiancezhengmingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HesuanjiancezhengmingView selectView(Wrapper<HesuanjiancezhengmingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
