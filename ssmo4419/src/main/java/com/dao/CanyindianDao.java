package com.dao;

import com.entity.CanyindianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CanyindianVO;
import com.entity.view.CanyindianView;


/**
 * 餐饮店
 * 
 * @author 
 * @email 
 * @date 2021-04-19 16:17:04
 */
public interface CanyindianDao extends BaseMapper<CanyindianEntity> {
	
	List<CanyindianVO> selectListVO(@Param("ew") Wrapper<CanyindianEntity> wrapper);
	
	CanyindianVO selectVO(@Param("ew") Wrapper<CanyindianEntity> wrapper);
	
	List<CanyindianView> selectListView(@Param("ew") Wrapper<CanyindianEntity> wrapper);

	List<CanyindianView> selectListView(Pagination page,@Param("ew") Wrapper<CanyindianEntity> wrapper);
	
	CanyindianView selectView(@Param("ew") Wrapper<CanyindianEntity> wrapper);
	
}
