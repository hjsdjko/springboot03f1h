package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiezhongjinduEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiezhongjinduVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiezhongjinduView;


/**
 * 接种进度
 *
 * @author 
 * @email 
 * @date 2021-03-23 14:12:32
 */
public interface JiezhongjinduService extends IService<JiezhongjinduEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiezhongjinduVO> selectListVO(Wrapper<JiezhongjinduEntity> wrapper);
   	
   	JiezhongjinduVO selectVO(@Param("ew") Wrapper<JiezhongjinduEntity> wrapper);
   	
   	List<JiezhongjinduView> selectListView(Wrapper<JiezhongjinduEntity> wrapper);
   	
   	JiezhongjinduView selectView(@Param("ew") Wrapper<JiezhongjinduEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiezhongjinduEntity> wrapper);
   	
}

