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


import com.dao.YimiaojiezhongDao;
import com.entity.YimiaojiezhongEntity;
import com.service.YimiaojiezhongService;
import com.entity.vo.YimiaojiezhongVO;
import com.entity.view.YimiaojiezhongView;

@Service("yimiaojiezhongService")
public class YimiaojiezhongServiceImpl extends ServiceImpl<YimiaojiezhongDao, YimiaojiezhongEntity> implements YimiaojiezhongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YimiaojiezhongEntity> page = this.selectPage(
                new Query<YimiaojiezhongEntity>(params).getPage(),
                new EntityWrapper<YimiaojiezhongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YimiaojiezhongEntity> wrapper) {
		  Page<YimiaojiezhongView> page =new Query<YimiaojiezhongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YimiaojiezhongVO> selectListVO(Wrapper<YimiaojiezhongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YimiaojiezhongVO selectVO(Wrapper<YimiaojiezhongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YimiaojiezhongView> selectListView(Wrapper<YimiaojiezhongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YimiaojiezhongView selectView(Wrapper<YimiaojiezhongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
