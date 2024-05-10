package com.dao;

import com.entity.HesuanjiancezhengmingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HesuanjiancezhengmingVO;
import com.entity.view.HesuanjiancezhengmingView;


/**
 * 核酸检测证明
 * 
 * @author 
 * @email 
 * @date 2021-03-23 14:12:32
 */
public interface HesuanjiancezhengmingDao extends BaseMapper<HesuanjiancezhengmingEntity> {
	
	List<HesuanjiancezhengmingVO> selectListVO(@Param("ew") Wrapper<HesuanjiancezhengmingEntity> wrapper);
	
	HesuanjiancezhengmingVO selectVO(@Param("ew") Wrapper<HesuanjiancezhengmingEntity> wrapper);
	
	List<HesuanjiancezhengmingView> selectListView(@Param("ew") Wrapper<HesuanjiancezhengmingEntity> wrapper);

	List<HesuanjiancezhengmingView> selectListView(Pagination page,@Param("ew") Wrapper<HesuanjiancezhengmingEntity> wrapper);
	
	HesuanjiancezhengmingView selectView(@Param("ew") Wrapper<HesuanjiancezhengmingEntity> wrapper);
	
}
