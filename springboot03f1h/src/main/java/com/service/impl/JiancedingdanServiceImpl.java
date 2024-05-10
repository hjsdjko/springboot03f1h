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


import com.dao.JiancedingdanDao;
import com.entity.JiancedingdanEntity;
import com.service.JiancedingdanService;
import com.entity.vo.JiancedingdanVO;
import com.entity.view.JiancedingdanView;

@Service("jiancedingdanService")
public class JiancedingdanServiceImpl extends ServiceImpl<JiancedingdanDao, JiancedingdanEntity> implements JiancedingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiancedingdanEntity> page = this.selectPage(
                new Query<JiancedingdanEntity>(params).getPage(),
                new EntityWrapper<JiancedingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiancedingdanEntity> wrapper) {
		  Page<JiancedingdanView> page =new Query<JiancedingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiancedingdanVO> selectListVO(Wrapper<JiancedingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiancedingdanVO selectVO(Wrapper<JiancedingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiancedingdanView> selectListView(Wrapper<JiancedingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiancedingdanView selectView(Wrapper<JiancedingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
