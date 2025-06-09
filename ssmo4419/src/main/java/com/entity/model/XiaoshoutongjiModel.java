package com.entity.model;

import com.entity.XiaoshoutongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 销售统计
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-19 16:17:04
 */
public class XiaoshoutongjiModel  implements Serializable {
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
	 * 总盈利
	 */
	
	private Integer zongyingli;
		
	/**
	 * 统计时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tongjishijian;
				
	
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
	 * 设置：总盈利
	 */
	 
	public void setZongyingli(Integer zongyingli) {
		this.zongyingli = zongyingli;
	}
	
	/**
	 * 获取：总盈利
	 */
	public Integer getZongyingli() {
		return zongyingli;
	}
				
	
	/**
	 * 设置：统计时间
	 */
	 
	public void setTongjishijian(Date tongjishijian) {
		this.tongjishijian = tongjishijian;
	}
	
	/**
	 * 获取：统计时间
	 */
	public Date getTongjishijian() {
		return tongjishijian;
	}
			
}
