package com.entity.view;

import com.entity.CanyindianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 餐饮店
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 16:17:04
 */
@TableName("canyindian")
public class CanyindianView  extends CanyindianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CanyindianView(){
	}
 
 	public CanyindianView(CanyindianEntity canyindianEntity){
 	try {
			BeanUtils.copyProperties(this, canyindianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
