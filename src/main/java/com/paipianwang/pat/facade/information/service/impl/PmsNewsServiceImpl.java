package com.paipianwang.pat.facade.information.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paipianwang.pat.facade.information.entity.PmsNews;
import com.paipianwang.pat.facade.information.service.PmsNewsFacade;
import com.paipianwang.pat.facade.information.service.biz.PmsNewsBiz;

/**
 * 新闻Dubbo服务接口实现
 * @version 1.0
 */
@Service("pmsNewsFacade")
public class PmsNewsServiceImpl implements PmsNewsFacade {

	@Autowired
	private final PmsNewsBiz biz = null;

	@Override
	public List<PmsNews> RecommendNews() {
		final List<PmsNews> list = biz.RecommendNews(); 
		return list;
	}

	
	
}
