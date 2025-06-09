package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CanyindianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CanyindianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CanyindianView;


/**
 * 餐饮店
 *
 * @author 
 * @email 
 * @date 2021-04-19 16:17:04
 */
public interface CanyindianService extends IService<CanyindianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CanyindianVO> selectListVO(Wrapper<CanyindianEntity> wrapper);
   	
   	CanyindianVO selectVO(@Param("ew") Wrapper<CanyindianEntity> wrapper);
   	
   	List<CanyindianView> selectListView(Wrapper<CanyindianEntity> wrapper);
   	
   	CanyindianView selectView(@Param("ew") Wrapper<CanyindianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CanyindianEntity> wrapper);
   	
}

