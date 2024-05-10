package com.entity.view;

import com.entity.HesuanjiancezhengmingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 核酸检测证明
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-23 14:12:32
 */
@TableName("hesuanjiancezhengming")
public class HesuanjiancezhengmingView  extends HesuanjiancezhengmingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HesuanjiancezhengmingView(){
	}
 
 	public HesuanjiancezhengmingView(HesuanjiancezhengmingEntity hesuanjiancezhengmingEntity){
 	try {
			BeanUtils.copyProperties(this, hesuanjiancezhengmingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
