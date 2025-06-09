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


import com.dao.JiamengshenqingDao;
import com.entity.JiamengshenqingEntity;
import com.service.JiamengshenqingService;
import com.entity.vo.JiamengshenqingVO;
import com.entity.view.JiamengshenqingView;

@Service("jiamengshenqingService")
public class JiamengshenqingServiceImpl extends ServiceImpl<JiamengshenqingDao, JiamengshenqingEntity> implements JiamengshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiamengshenqingEntity> page = this.selectPage(
                new Query<JiamengshenqingEntity>(params).getPage(),
                new EntityWrapper<JiamengshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiamengshenqingEntity> wrapper) {
		  Page<JiamengshenqingView> page =new Query<JiamengshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiamengshenqingVO> selectListVO(Wrapper<JiamengshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiamengshenqingVO selectVO(Wrapper<JiamengshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiamengshenqingView> selectListView(Wrapper<JiamengshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiamengshenqingView selectView(Wrapper<JiamengshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
