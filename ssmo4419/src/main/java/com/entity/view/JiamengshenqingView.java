package com.entity.view;

import com.entity.JiamengshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 加盟申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 16:17:04
 */
@TableName("jiamengshenqing")
public class JiamengshenqingView  extends JiamengshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiamengshenqingView(){
	}
 
 	public JiamengshenqingView(JiamengshenqingEntity jiamengshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, jiamengshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
