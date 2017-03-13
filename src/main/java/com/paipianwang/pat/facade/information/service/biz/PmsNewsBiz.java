package com.paipianwang.pat.facade.information.service.biz;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paipianwang.pat.facade.information.entity.PmsNews;
import com.paipianwang.pat.facade.information.service.dao.PmsNewsDao;

/**
 * 新闻--服务层接口
 * 事物管理层
 * @version 1.0
 */
@Service
public class PmsNewsBiz {

	@Autowired
	private PmsNewsDao pmsNewsDao;

	public List<PmsNews> RecommendNews() {
		final List<PmsNews> list = pmsNewsDao.RecommendNews(); 
		return list;
	}

	
}
