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


import com.dao.TuidanxinxiDao;
import com.entity.TuidanxinxiEntity;
import com.service.TuidanxinxiService;
import com.entity.vo.TuidanxinxiVO;
import com.entity.view.TuidanxinxiView;

@Service("tuidanxinxiService")
public class TuidanxinxiServiceImpl extends ServiceImpl<TuidanxinxiDao, TuidanxinxiEntity> implements TuidanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuidanxinxiEntity> page = this.selectPage(
                new Query<TuidanxinxiEntity>(params).getPage(),
                new EntityWrapper<TuidanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuidanxinxiEntity> wrapper) {
		  Page<TuidanxinxiView> page =new Query<TuidanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuidanxinxiVO> selectListVO(Wrapper<TuidanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuidanxinxiVO selectVO(Wrapper<TuidanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuidanxinxiView> selectListView(Wrapper<TuidanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuidanxinxiView selectView(Wrapper<TuidanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
