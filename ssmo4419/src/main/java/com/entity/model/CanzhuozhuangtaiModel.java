package com.entity.model;

import com.entity.CanzhuozhuangtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 餐桌状态
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-19 16:17:04
 */
public class CanzhuozhuangtaiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 餐饮店名称
	 */
	
	private String canyindianmingcheng;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 餐桌
	 */
	
	private String canzhuo;
		
	/**
	 * 餐桌状态
	 */
	
	private String canzhuozhuangtai;
		
	/**
	 * 用餐人数
	 */
	
	private Integer yongcanrenshu;
		
	/**
	 * 用餐时间
	 */
	
	private String yongcanshijian;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
	 * 设置：餐桌
	 */
	 
	public void setCanzhuo(String canzhuo) {
		this.canzhuo = canzhuo;
	}
	
	/**
	 * 获取：餐桌
	 */
	public String getCanzhuo() {
		return canzhuo;
	}
				
	
	/**
	 * 设置：餐桌状态
	 */
	 
	public void setCanzhuozhuangtai(String canzhuozhuangtai) {
		this.canzhuozhuangtai = canzhuozhuangtai;
	}
	
	/**
	 * 获取：餐桌状态
	 */
	public String getCanzhuozhuangtai() {
		return canzhuozhuangtai;
	}
				
	
	/**
	 * 设置：用餐人数
	 */
	 
	public void setYongcanrenshu(Integer yongcanrenshu) {
		this.yongcanrenshu = yongcanrenshu;
	}
	
	/**
	 * 获取：用餐人数
	 */
	public Integer getYongcanrenshu() {
		return yongcanrenshu;
	}
				
	
	/**
	 * 设置：用餐时间
	 */
	 
	public void setYongcanshijian(String yongcanshijian) {
		this.yongcanshijian = yongcanshijian;
	}
	
	/**
	 * 获取：用餐时间
	 */
	public String getYongcanshijian() {
		return yongcanshijian;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
