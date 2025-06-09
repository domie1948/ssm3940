package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuidanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuidanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuidanxinxiView;


/**
 * 退单信息
 *
 * @author 
 * @email 
 * @date 2021-04-19 16:17:04
 */
public interface TuidanxinxiService extends IService<TuidanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuidanxinxiVO> selectListVO(Wrapper<TuidanxinxiEntity> wrapper);
   	
   	TuidanxinxiVO selectVO(@Param("ew") Wrapper<TuidanxinxiEntity> wrapper);
   	
   	List<TuidanxinxiView> selectListView(Wrapper<TuidanxinxiEntity> wrapper);
   	
   	TuidanxinxiView selectView(@Param("ew") Wrapper<TuidanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuidanxinxiEntity> wrapper);
   	
}

