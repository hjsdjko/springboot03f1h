package com.entity.view;

import com.entity.JiancejinduEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 检测进度
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-23 14:12:32
 */
@TableName("jiancejindu")
public class JiancejinduView  extends JiancejinduEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiancejinduView(){
	}
 
 	public JiancejinduView(JiancejinduEntity jiancejinduEntity){
 	try {
			BeanUtils.copyProperties(this, jiancejinduEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
