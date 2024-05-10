package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiancejinduEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiancejinduVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiancejinduView;


/**
 * 检测进度
 *
 * @author 
 * @email 
 * @date 2021-03-23 14:12:32
 */
public interface JiancejinduService extends IService<JiancejinduEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiancejinduVO> selectListVO(Wrapper<JiancejinduEntity> wrapper);
   	
   	JiancejinduVO selectVO(@Param("ew") Wrapper<JiancejinduEntity> wrapper);
   	
   	List<JiancejinduView> selectListView(Wrapper<JiancejinduEntity> wrapper);
   	
   	JiancejinduView selectView(@Param("ew") Wrapper<JiancejinduEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiancejinduEntity> wrapper);
   	
}

