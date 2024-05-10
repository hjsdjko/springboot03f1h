package com.dao;

import com.entity.JiancedingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiancedingdanVO;
import com.entity.view.JiancedingdanView;


/**
 * 检测订单
 * 
 * @author 
 * @email 
 * @date 2021-03-23 14:12:32
 */
public interface JiancedingdanDao extends BaseMapper<JiancedingdanEntity> {
	
	List<JiancedingdanVO> selectListVO(@Param("ew") Wrapper<JiancedingdanEntity> wrapper);
	
	JiancedingdanVO selectVO(@Param("ew") Wrapper<JiancedingdanEntity> wrapper);
	
	List<JiancedingdanView> selectListView(@Param("ew") Wrapper<JiancedingdanEntity> wrapper);

	List<JiancedingdanView> selectListView(Pagination page,@Param("ew") Wrapper<JiancedingdanEntity> wrapper);
	
	JiancedingdanView selectView(@Param("ew") Wrapper<JiancedingdanEntity> wrapper);
	
}
