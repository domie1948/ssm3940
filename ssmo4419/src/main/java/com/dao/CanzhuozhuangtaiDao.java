package com.dao;

import com.entity.CanzhuozhuangtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CanzhuozhuangtaiVO;
import com.entity.view.CanzhuozhuangtaiView;


/**
 * 餐桌状态
 * 
 * @author 
 * @email 
 * @date 2021-04-19 16:17:04
 */
public interface CanzhuozhuangtaiDao extends BaseMapper<CanzhuozhuangtaiEntity> {
	
	List<CanzhuozhuangtaiVO> selectListVO(@Param("ew") Wrapper<CanzhuozhuangtaiEntity> wrapper);
	
	CanzhuozhuangtaiVO selectVO(@Param("ew") Wrapper<CanzhuozhuangtaiEntity> wrapper);
	
	List<CanzhuozhuangtaiView> selectListView(@Param("ew") Wrapper<CanzhuozhuangtaiEntity> wrapper);

	List<CanzhuozhuangtaiView> selectListView(Pagination page,@Param("ew") Wrapper<CanzhuozhuangtaiEntity> wrapper);
	
	CanzhuozhuangtaiView selectView(@Param("ew") Wrapper<CanzhuozhuangtaiEntity> wrapper);
	
}
