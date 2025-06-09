package com.dao;

import com.entity.TuidanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuidanxinxiVO;
import com.entity.view.TuidanxinxiView;


/**
 * 退单信息
 * 
 * @author 
 * @email 
 * @date 2021-04-19 16:17:04
 */
public interface TuidanxinxiDao extends BaseMapper<TuidanxinxiEntity> {
	
	List<TuidanxinxiVO> selectListVO(@Param("ew") Wrapper<TuidanxinxiEntity> wrapper);
	
	TuidanxinxiVO selectVO(@Param("ew") Wrapper<TuidanxinxiEntity> wrapper);
	
	List<TuidanxinxiView> selectListView(@Param("ew") Wrapper<TuidanxinxiEntity> wrapper);

	List<TuidanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TuidanxinxiEntity> wrapper);
	
	TuidanxinxiView selectView(@Param("ew") Wrapper<TuidanxinxiEntity> wrapper);
	
}
