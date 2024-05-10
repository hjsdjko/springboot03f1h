package com.dao;

import com.entity.JiancejinduEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiancejinduVO;
import com.entity.view.JiancejinduView;


/**
 * 检测进度
 * 
 * @author 
 * @email 
 * @date 2021-03-23 14:12:32
 */
public interface JiancejinduDao extends BaseMapper<JiancejinduEntity> {
	
	List<JiancejinduVO> selectListVO(@Param("ew") Wrapper<JiancejinduEntity> wrapper);
	
	JiancejinduVO selectVO(@Param("ew") Wrapper<JiancejinduEntity> wrapper);
	
	List<JiancejinduView> selectListView(@Param("ew") Wrapper<JiancejinduEntity> wrapper);

	List<JiancejinduView> selectListView(Pagination page,@Param("ew") Wrapper<JiancejinduEntity> wrapper);
	
	JiancejinduView selectView(@Param("ew") Wrapper<JiancejinduEntity> wrapper);
	
}
