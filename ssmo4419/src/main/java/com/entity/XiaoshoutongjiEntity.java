package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 销售统计
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-19 16:17:04
 */
@TableName("xiaoshoutongji")
public class XiaoshoutongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaoshoutongjiEntity() {
		
	}
	
	public XiaoshoutongjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 餐饮店账号
	 */
					
	private String canyindianzhanghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
