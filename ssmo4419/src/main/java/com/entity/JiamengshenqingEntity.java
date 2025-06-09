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
 * 加盟申请
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-19 16:17:04
 */
@TableName("jiamengshenqing")
public class JiamengshenqingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiamengshenqingEntity() {
		
	}
	
	public JiamengshenqingEntity(T t) {
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
	 * 申请编号
	 */
					
	private String shenqingbianhao;
	
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
	 * 加盟名称
	 */
					
	private String jiamengmingcheng;
	
	/**
	 * 加盟地区
	 */
					
	private String jiamengdiqu;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 申请时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shenqingshijian;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：申请编号
	 */
	public void setShenqingbianhao(String shenqingbianhao) {
		this.shenqingbianhao = shenqingbianhao;
	}
	/**
	 * 获取：申请编号
	 */
	public String getShenqingbianhao() {
		return shenqingbianhao;
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
	 * 设置：加盟名称
	 */
	public void setJiamengmingcheng(String jiamengmingcheng) {
		this.jiamengmingcheng = jiamengmingcheng;
	}
	/**
	 * 获取：加盟名称
	 */
	public String getJiamengmingcheng() {
		return jiamengmingcheng;
	}
	/**
	 * 设置：加盟地区
	 */
	public void setJiamengdiqu(String jiamengdiqu) {
		this.jiamengdiqu = jiamengdiqu;
	}
	/**
	 * 获取：加盟地区
	 */
	public String getJiamengdiqu() {
		return jiamengdiqu;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：申请时间
	 */
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
