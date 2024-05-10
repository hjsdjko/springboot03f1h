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


import com.dao.JiancejinduDao;
import com.entity.JiancejinduEntity;
import com.service.JiancejinduService;
import com.entity.vo.JiancejinduVO;
import com.entity.view.JiancejinduView;

@Service("jiancejinduService")
public class JiancejinduServiceImpl extends ServiceImpl<JiancejinduDao, JiancejinduEntity> implements JiancejinduService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiancejinduEntity> page = this.selectPage(
                new Query<JiancejinduEntity>(params).getPage(),
                new EntityWrapper<JiancejinduEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiancejinduEntity> wrapper) {
		  Page<JiancejinduView> page =new Query<JiancejinduView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiancejinduVO> selectListVO(Wrapper<JiancejinduEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiancejinduVO selectVO(Wrapper<JiancejinduEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiancejinduView> selectListView(Wrapper<JiancejinduEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiancejinduView selectView(Wrapper<JiancejinduEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
