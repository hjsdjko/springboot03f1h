package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HesuanjiancezhengmingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HesuanjiancezhengmingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HesuanjiancezhengmingView;


/**
 * 核酸检测证明
 *
 * @author 
 * @email 
 * @date 2021-03-23 14:12:32
 */
public interface HesuanjiancezhengmingService extends IService<HesuanjiancezhengmingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HesuanjiancezhengmingVO> selectListVO(Wrapper<HesuanjiancezhengmingEntity> wrapper);
   	
   	HesuanjiancezhengmingVO selectVO(@Param("ew") Wrapper<HesuanjiancezhengmingEntity> wrapper);
   	
   	List<HesuanjiancezhengmingView> selectListView(Wrapper<HesuanjiancezhengmingEntity> wrapper);
   	
   	HesuanjiancezhengmingView selectView(@Param("ew") Wrapper<HesuanjiancezhengmingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HesuanjiancezhengmingEntity> wrapper);
   	
}

