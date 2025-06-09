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


import com.dao.CanzhuozhuangtaiDao;
import com.entity.CanzhuozhuangtaiEntity;
import com.service.CanzhuozhuangtaiService;
import com.entity.vo.CanzhuozhuangtaiVO;
import com.entity.view.CanzhuozhuangtaiView;

@Service("canzhuozhuangtaiService")
public class CanzhuozhuangtaiServiceImpl extends ServiceImpl<CanzhuozhuangtaiDao, CanzhuozhuangtaiEntity> implements CanzhuozhuangtaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CanzhuozhuangtaiEntity> page = this.selectPage(
                new Query<CanzhuozhuangtaiEntity>(params).getPage(),
                new EntityWrapper<CanzhuozhuangtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CanzhuozhuangtaiEntity> wrapper) {
		  Page<CanzhuozhuangtaiView> page =new Query<CanzhuozhuangtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CanzhuozhuangtaiVO> selectListVO(Wrapper<CanzhuozhuangtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CanzhuozhuangtaiVO selectVO(Wrapper<CanzhuozhuangtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CanzhuozhuangtaiView> selectListView(Wrapper<CanzhuozhuangtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CanzhuozhuangtaiView selectView(Wrapper<CanzhuozhuangtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
