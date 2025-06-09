package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.CanzhuozhuangtaiEntity;
import com.entity.view.CanzhuozhuangtaiView;

import com.service.CanzhuozhuangtaiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 餐桌状态
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-19 16:17:04
 */
@RestController
@RequestMapping("/canzhuozhuangtai")
public class CanzhuozhuangtaiController {
    @Autowired
    private CanzhuozhuangtaiService canzhuozhuangtaiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,CanzhuozhuangtaiEntity canzhuozhuangtai, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("canyindian")) {
			canzhuozhuangtai.setCanyindianzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yuangong")) {
			canzhuozhuangtai.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<CanzhuozhuangtaiEntity> ew = new EntityWrapper<CanzhuozhuangtaiEntity>();
		PageUtils page = canzhuozhuangtaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, canzhuozhuangtai), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,CanzhuozhuangtaiEntity canzhuozhuangtai, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("canyindian")) {
			canzhuozhuangtai.setCanyindianzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yuangong")) {
			canzhuozhuangtai.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<CanzhuozhuangtaiEntity> ew = new EntityWrapper<CanzhuozhuangtaiEntity>();
		PageUtils page = canzhuozhuangtaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, canzhuozhuangtai), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( CanzhuozhuangtaiEntity canzhuozhuangtai){
       	EntityWrapper<CanzhuozhuangtaiEntity> ew = new EntityWrapper<CanzhuozhuangtaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( canzhuozhuangtai, "canzhuozhuangtai")); 
        return R.ok().put("data", canzhuozhuangtaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(CanzhuozhuangtaiEntity canzhuozhuangtai){
        EntityWrapper< CanzhuozhuangtaiEntity> ew = new EntityWrapper< CanzhuozhuangtaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( canzhuozhuangtai, "canzhuozhuangtai")); 
		CanzhuozhuangtaiView canzhuozhuangtaiView =  canzhuozhuangtaiService.selectView(ew);
		return R.ok("查询餐桌状态成功").put("data", canzhuozhuangtaiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        CanzhuozhuangtaiEntity canzhuozhuangtai = canzhuozhuangtaiService.selectById(id);
        return R.ok().put("data", canzhuozhuangtai);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        CanzhuozhuangtaiEntity canzhuozhuangtai = canzhuozhuangtaiService.selectById(id);
        return R.ok().put("data", canzhuozhuangtai);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CanzhuozhuangtaiEntity canzhuozhuangtai, HttpServletRequest request){
    	canzhuozhuangtai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(canzhuozhuangtai);

        canzhuozhuangtaiService.insert(canzhuozhuangtai);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody CanzhuozhuangtaiEntity canzhuozhuangtai, HttpServletRequest request){
    	canzhuozhuangtai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(canzhuozhuangtai);
    	canzhuozhuangtai.setUserid((Long)request.getSession().getAttribute("userId"));

        canzhuozhuangtaiService.insert(canzhuozhuangtai);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CanzhuozhuangtaiEntity canzhuozhuangtai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(canzhuozhuangtai);
        canzhuozhuangtaiService.updateById(canzhuozhuangtai);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        canzhuozhuangtaiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<CanzhuozhuangtaiEntity> wrapper = new EntityWrapper<CanzhuozhuangtaiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("canyindian")) {
			wrapper.eq("canyindianzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yuangong")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = canzhuozhuangtaiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
