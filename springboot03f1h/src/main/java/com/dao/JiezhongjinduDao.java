package com.dao;

import com.entity.JiezhongjinduEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiezhongjinduVO;
import com.entity.view.JiezhongjinduView;


/**
 * 接种进度
 * 
 * @author 
 * @email 
 * @date 2021-03-23 14:12:32
 */
public interface JiezhongjinduDao extends BaseMapper<JiezhongjinduEntity> {
	
	List<JiezhongjinduVO> selectListVO(@Param("ew") Wrapper<JiezhongjinduEntity> wrapper);
	
	JiezhongjinduVO selectVO(@Param("ew") Wrapper<JiezhongjinduEntity> wrapper);
	
	List<JiezhongjinduView> selectListView(@Param("ew") Wrapper<JiezhongjinduEntity> wrapper);

	List<JiezhongjinduView> selectListView(Pagination page,@Param("ew") Wrapper<JiezhongjinduEntity> wrapper);
	
	JiezhongjinduView selectView(@Param("ew") Wrapper<JiezhongjinduEntity> wrapper);
	
}
