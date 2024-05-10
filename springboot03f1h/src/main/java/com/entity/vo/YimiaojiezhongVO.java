package com.entity.vo;

import com.entity.YimiaojiezhongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 疫苗接种
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-23 14:12:32
 */
public class YimiaojiezhongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 接种点
	 */
	
	private String jiezhongdian;
		
	/**
	 * 地区
	 */
	
	private String diqu;
		
	/**
	 * 接种费用
	 */
	
	private Integer jiezhongfeiyong;
		
	/**
	 * 接种余位
	 */
	
	private Integer jiezhongyuwei;
		
	/**
	 * 医护工号
	 */
	
	private String yihugonghao;
		
	/**
	 * 医护姓名
	 */
	
	private String yihuxingming;
		
	/**
	 * 说明
	 */
	
	private String shuoming;
		
	/**
	 * 开始时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaishishijian;
		
	/**
	 * 结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jieshushijian;
				
	
	/**
	 * 设置：接种点
	 */
	 
	public void setJiezhongdian(String jiezhongdian) {
		this.jiezhongdian = jiezhongdian;
	}
	
	/**
	 * 获取：接种点
	 */
	public String getJiezhongdian() {
		return jiezhongdian;
	}
				
	
	/**
	 * 设置：地区
	 */
	 
	public void setDiqu(String diqu) {
		this.diqu = diqu;
	}
	
	/**
	 * 获取：地区
	 */
	public String getDiqu() {
		return diqu;
	}
				
	
	/**
	 * 设置：接种费用
	 */
	 
	public void setJiezhongfeiyong(Integer jiezhongfeiyong) {
		this.jiezhongfeiyong = jiezhongfeiyong;
	}
	
	/**
	 * 获取：接种费用
	 */
	public Integer getJiezhongfeiyong() {
		return jiezhongfeiyong;
	}
				
	
	/**
	 * 设置：接种余位
	 */
	 
	public void setJiezhongyuwei(Integer jiezhongyuwei) {
		this.jiezhongyuwei = jiezhongyuwei;
	}
	
	/**
	 * 获取：接种余位
	 */
	public Integer getJiezhongyuwei() {
		return jiezhongyuwei;
	}
				
	
	/**
	 * 设置：医护工号
	 */
	 
	public void setYihugonghao(String yihugonghao) {
		this.yihugonghao = yihugonghao;
	}
	
	/**
	 * 获取：医护工号
	 */
	public String getYihugonghao() {
		return yihugonghao;
	}
				
	
	/**
	 * 设置：医护姓名
	 */
	 
	public void setYihuxingming(String yihuxingming) {
		this.yihuxingming = yihuxingming;
	}
	
	/**
	 * 获取：医护姓名
	 */
	public String getYihuxingming() {
		return yihuxingming;
	}
				
	
	/**
	 * 设置：说明
	 */
	 
	public void setShuoming(String shuoming) {
		this.shuoming = shuoming;
	}
	
	/**
	 * 获取：说明
	 */
	public String getShuoming() {
		return shuoming;
	}
				
	
	/**
	 * 设置：开始时间
	 */
	 
	public void setKaishishijian(Date kaishishijian) {
		this.kaishishijian = kaishishijian;
	}
	
	/**
	 * 获取：开始时间
	 */
	public Date getKaishishijian() {
		return kaishishijian;
	}
				
	
	/**
	 * 设置：结束时间
	 */
	 
	public void setJieshushijian(Date jieshushijian) {
		this.jieshushijian = jieshushijian;
	}
	
	/**
	 * 获取：结束时间
	 */
	public Date getJieshushijian() {
		return jieshushijian;
	}
			
}
