package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CanzhuozhuangtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CanzhuozhuangtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CanzhuozhuangtaiView;


/**
 * 餐桌状态
 *
 * @author 
 * @email 
 * @date 2021-04-19 16:17:04
 */
public interface CanzhuozhuangtaiService extends IService<CanzhuozhuangtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CanzhuozhuangtaiVO> selectListVO(Wrapper<CanzhuozhuangtaiEntity> wrapper);
   	
   	CanzhuozhuangtaiVO selectVO(@Param("ew") Wrapper<CanzhuozhuangtaiEntity> wrapper);
   	
   	List<CanzhuozhuangtaiView> selectListView(Wrapper<CanzhuozhuangtaiEntity> wrapper);
   	
   	CanzhuozhuangtaiView selectView(@Param("ew") Wrapper<CanzhuozhuangtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CanzhuozhuangtaiEntity> wrapper);
   	
}

