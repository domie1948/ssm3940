package com.entity.view;

import com.entity.CanzhuozhuangtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 餐桌状态
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 16:17:04
 */
@TableName("canzhuozhuangtai")
public class CanzhuozhuangtaiView  extends CanzhuozhuangtaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CanzhuozhuangtaiView(){
	}
 
 	public CanzhuozhuangtaiView(CanzhuozhuangtaiEntity canzhuozhuangtaiEntity){
 	try {
			BeanUtils.copyProperties(this, canzhuozhuangtaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
