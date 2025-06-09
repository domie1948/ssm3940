package com.dao;

import com.entity.CanzhuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CanzhuoVO;
import com.entity.view.CanzhuoView;


/**
 * 餐桌
 * 
 * @author 
 * @email 
 * @date 2021-04-19 16:17:04
 */
public interface CanzhuoDao extends BaseMapper<CanzhuoEntity> {
	
	List<CanzhuoVO> selectListVO(@Param("ew") Wrapper<CanzhuoEntity> wrapper);
	
	CanzhuoVO selectVO(@Param("ew") Wrapper<CanzhuoEntity> wrapper);
	
	List<CanzhuoView> selectListView(@Param("ew") Wrapper<CanzhuoEntity> wrapper);

	List<CanzhuoView> selectListView(Pagination page,@Param("ew") Wrapper<CanzhuoEntity> wrapper);
	
	CanzhuoView selectView(@Param("ew") Wrapper<CanzhuoEntity> wrapper);
	
}
