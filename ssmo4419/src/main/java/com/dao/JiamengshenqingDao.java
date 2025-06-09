package com.dao;

import com.entity.JiamengshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiamengshenqingVO;
import com.entity.view.JiamengshenqingView;


/**
 * 加盟申请
 * 
 * @author 
 * @email 
 * @date 2021-04-19 16:17:04
 */
public interface JiamengshenqingDao extends BaseMapper<JiamengshenqingEntity> {
	
	List<JiamengshenqingVO> selectListVO(@Param("ew") Wrapper<JiamengshenqingEntity> wrapper);
	
	JiamengshenqingVO selectVO(@Param("ew") Wrapper<JiamengshenqingEntity> wrapper);
	
	List<JiamengshenqingView> selectListView(@Param("ew") Wrapper<JiamengshenqingEntity> wrapper);

	List<JiamengshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<JiamengshenqingEntity> wrapper);
	
	JiamengshenqingView selectView(@Param("ew") Wrapper<JiamengshenqingEntity> wrapper);
	
}
