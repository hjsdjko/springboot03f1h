package com.dao;

import com.entity.JiezhongdingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiezhongdingdanVO;
import com.entity.view.JiezhongdingdanView;


/**
 * 接种订单
 * 
 * @author 
 * @email 
 * @date 2021-03-23 14:12:32
 */
public interface JiezhongdingdanDao extends BaseMapper<JiezhongdingdanEntity> {
	
	List<JiezhongdingdanVO> selectListVO(@Param("ew") Wrapper<JiezhongdingdanEntity> wrapper);
	
	JiezhongdingdanVO selectVO(@Param("ew") Wrapper<JiezhongdingdanEntity> wrapper);
	
	List<JiezhongdingdanView> selectListView(@Param("ew") Wrapper<JiezhongdingdanEntity> wrapper);

	List<JiezhongdingdanView> selectListView(Pagination page,@Param("ew") Wrapper<JiezhongdingdanEntity> wrapper);
	
	JiezhongdingdanView selectView(@Param("ew") Wrapper<JiezhongdingdanEntity> wrapper);
	
}
