package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YimiaojiezhongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YimiaojiezhongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YimiaojiezhongView;


/**
 * 疫苗接种
 *
 * @author 
 * @email 
 * @date 2021-03-23 14:12:32
 */
public interface YimiaojiezhongService extends IService<YimiaojiezhongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YimiaojiezhongVO> selectListVO(Wrapper<YimiaojiezhongEntity> wrapper);
   	
   	YimiaojiezhongVO selectVO(@Param("ew") Wrapper<YimiaojiezhongEntity> wrapper);
   	
   	List<YimiaojiezhongView> selectListView(Wrapper<YimiaojiezhongEntity> wrapper);
   	
   	YimiaojiezhongView selectView(@Param("ew") Wrapper<YimiaojiezhongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YimiaojiezhongEntity> wrapper);
   	
}

