package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CanyindianDao;
import com.entity.CanyindianEntity;
import com.service.CanyindianService;
import com.entity.vo.CanyindianVO;
import com.entity.view.CanyindianView;

@Service("canyindianService")
public class CanyindianServiceImpl extends ServiceImpl<CanyindianDao, CanyindianEntity> implements CanyindianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CanyindianEntity> page = this.selectPage(
                new Query<CanyindianEntity>(params).getPage(),
                new EntityWrapper<CanyindianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CanyindianEntity> wrapper) {
		  Page<CanyindianView> page =new Query<CanyindianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CanyindianVO> selectListVO(Wrapper<CanyindianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CanyindianVO selectVO(Wrapper<CanyindianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CanyindianView> selectListView(Wrapper<CanyindianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CanyindianView selectView(Wrapper<CanyindianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
