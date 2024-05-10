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


import com.dao.JiezhongjinduDao;
import com.entity.JiezhongjinduEntity;
import com.service.JiezhongjinduService;
import com.entity.vo.JiezhongjinduVO;
import com.entity.view.JiezhongjinduView;

@Service("jiezhongjinduService")
public class JiezhongjinduServiceImpl extends ServiceImpl<JiezhongjinduDao, JiezhongjinduEntity> implements JiezhongjinduService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiezhongjinduEntity> page = this.selectPage(
                new Query<JiezhongjinduEntity>(params).getPage(),
                new EntityWrapper<JiezhongjinduEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiezhongjinduEntity> wrapper) {
		  Page<JiezhongjinduView> page =new Query<JiezhongjinduView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiezhongjinduVO> selectListVO(Wrapper<JiezhongjinduEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiezhongjinduVO selectVO(Wrapper<JiezhongjinduEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiezhongjinduView> selectListView(Wrapper<JiezhongjinduEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiezhongjinduView selectView(Wrapper<JiezhongjinduEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
