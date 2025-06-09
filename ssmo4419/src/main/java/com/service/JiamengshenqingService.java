package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiamengshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiamengshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiamengshenqingView;


/**
 * 加盟申请
 *
 * @author 
 * @email 
 * @date 2021-04-19 16:17:04
 */
public interface JiamengshenqingService extends IService<JiamengshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiamengshenqingVO> selectListVO(Wrapper<JiamengshenqingEntity> wrapper);
   	
   	JiamengshenqingVO selectVO(@Param("ew") Wrapper<JiamengshenqingEntity> wrapper);
   	
   	List<JiamengshenqingView> selectListView(Wrapper<JiamengshenqingEntity> wrapper);
   	
   	JiamengshenqingView selectView(@Param("ew") Wrapper<JiamengshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiamengshenqingEntity> wrapper);
   	
}

