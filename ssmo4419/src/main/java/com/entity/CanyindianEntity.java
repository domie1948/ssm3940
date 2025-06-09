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
 * 餐饮店
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-19 16:17:04
 */
@TableName("canyindian")
public class CanyindianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CanyindianEntity() {
		
	}
	
	public CanyindianEntity(T t) {
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
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 餐饮店名称
	 */
					
	private String canyindianmingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 地址
	 */
					
	private String dizhi;
	
	/**
	 * 餐饮店详情
	 */
					
	private String canyindianxiangqing;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	
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
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
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
	 * 设置：地址
	 */
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
	/**
	 * 设置：餐饮店详情
	 */
	public void setCanyindianxiangqing(String canyindianxiangqing) {
		this.canyindianxiangqing = canyindianxiangqing;
	}
	/**
	 * 获取：餐饮店详情
	 */
	public String getCanyindianxiangqing() {
		return canyindianxiangqing;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}

}
