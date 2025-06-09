package com.entity.vo;

import com.entity.CaipinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 菜品信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-19 16:17:04
 */
public class CaipinxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 菜品名称
	 */
	
	private String caipinmingcheng;
		
	/**
	 * 菜系
	 */
	
	private String caixi;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 口味偏好
	 */
	
	private String kouweipianhao;
		
	/**
	 * 简介
	 */
	
	private String jianjie;
		
	/**
	 * 餐饮店账号
	 */
	
	private String canyindianzhanghao;
		
	/**
	 * 餐饮店名称
	 */
	
	private String canyindianmingcheng;
				
	
	/**
	 * 设置：菜品名称
	 */
	 
	public void setCaipinmingcheng(String caipinmingcheng) {
		this.caipinmingcheng = caipinmingcheng;
	}
	
	/**
	 * 获取：菜品名称
	 */
	public String getCaipinmingcheng() {
		return caipinmingcheng;
	}
				
	
	/**
	 * 设置：菜系
	 */
	 
	public void setCaixi(String caixi) {
		this.caixi = caixi;
	}
	
	/**
	 * 获取：菜系
	 */
	public String getCaixi() {
		return caixi;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：口味偏好
	 */
	 
	public void setKouweipianhao(String kouweipianhao) {
		this.kouweipianhao = kouweipianhao;
	}
	
	/**
	 * 获取：口味偏好
	 */
	public String getKouweipianhao() {
		return kouweipianhao;
	}
				
	
	/**
	 * 设置：简介
	 */
	 
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	
	/**
	 * 获取：简介
	 */
	public String getJianjie() {
		return jianjie;
	}
				
	
	/**
	 * 设置：餐饮店账号
	 */
	 
	public void setCanyindianzhanghao(String canyindianzhanghao) {
		this.canyindianzhanghao = canyindianzhanghao;
	}
	
	/**
	 * 获取：餐饮店账号
	 */
	public String getCanyindianzhanghao() {
		return canyindianzhanghao;
	}
				
	
	/**
	 * 设置：餐饮店名称
	 */
	 
	public void setCanyindianmingcheng(String canyindianmingcheng) {
		this.canyindianmingcheng = canyindianmingcheng;
	}
	
	/**
	 * 获取：餐饮店名称
	 */
	public String getCanyindianmingcheng() {
		return canyindianmingcheng;
	}
			
}
