package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiezhongdingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiezhongdingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiezhongdingdanView;


/**
 * 接种订单
 *
 * @author 
 * @email 
 * @date 2021-03-23 14:12:32
 */
public interface JiezhongdingdanService extends IService<JiezhongdingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiezhongdingdanVO> selectListVO(Wrapper<JiezhongdingdanEntity> wrapper);
   	
   	JiezhongdingdanVO selectVO(@Param("ew") Wrapper<JiezhongdingdanEntity> wrapper);
   	
   	List<JiezhongdingdanView> selectListView(Wrapper<JiezhongdingdanEntity> wrapper);
   	
   	JiezhongdingdanView selectView(@Param("ew") Wrapper<JiezhongdingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiezhongdingdanEntity> wrapper);
   	
}

