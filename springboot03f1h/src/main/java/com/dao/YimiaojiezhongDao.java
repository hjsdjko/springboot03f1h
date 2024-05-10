package com.dao;

import com.entity.YimiaojiezhongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YimiaojiezhongVO;
import com.entity.view.YimiaojiezhongView;


/**
 * 疫苗接种
 * 
 * @author 
 * @email 
 * @date 2021-03-23 14:12:32
 */
public interface YimiaojiezhongDao extends BaseMapper<YimiaojiezhongEntity> {
	
	List<YimiaojiezhongVO> selectListVO(@Param("ew") Wrapper<YimiaojiezhongEntity> wrapper);
	
	YimiaojiezhongVO selectVO(@Param("ew") Wrapper<YimiaojiezhongEntity> wrapper);
	
	List<YimiaojiezhongView> selectListView(@Param("ew") Wrapper<YimiaojiezhongEntity> wrapper);

	List<YimiaojiezhongView> selectListView(Pagination page,@Param("ew") Wrapper<YimiaojiezhongEntity> wrapper);
	
	YimiaojiezhongView selectView(@Param("ew") Wrapper<YimiaojiezhongEntity> wrapper);
	
}
