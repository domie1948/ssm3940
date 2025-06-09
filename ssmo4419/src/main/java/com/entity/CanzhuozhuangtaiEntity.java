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
 * 餐桌状态
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-19 16:17:04
 */
@TableName("canzhuozhuangtai")
public class CanzhuozhuangtaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CanzhuozhuangtaiEntity() {
		
	}
	
	public CanzhuozhuangtaiEntity(T t) {
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
