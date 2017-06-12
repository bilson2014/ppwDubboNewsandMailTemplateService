package com.paipianwang.pat.facade.information.service.dao.impl;


import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.paipianwang.pat.common.core.dao.impl.BaseDaoImpl;
import com.paipianwang.pat.facade.information.entity.PmsNews;
import com.paipianwang.pat.facade.information.service.dao.PmsNewsDao;

@Repository("pmsNewsDao")
public class PmsNewsDaoImpl extends BaseDaoImpl<PmsNews> implements PmsNewsDao {

	@Autowired
	private SqlSessionTemplate sessionTemplate = null;
	
	public static final String SQL_FIND_NEXT_NEWS = "findNextNew";
	public static final String SQL_FIND_PRE_NEWS = "findPreNew";

	@Override
	public PmsNews findNextNew(final String tags, final int newId, final Integer recommend) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("tags", tags);
		paramMap.put("id", newId);
		// 可见
		paramMap.put("visible", 0);
		// 是否推荐，即是否最热资讯
		if(recommend != null)
			paramMap.put("recommend", 1);
		PmsNews news = sessionTemplate.selectOne(getStatement(SQL_FIND_NEXT_NEWS), paramMap);
		return news;
	}

	@Override
	public PmsNews findPreNew(final String tags, final int newId, final Integer recommend) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("tags", tags);
		paramMap.put("id", newId);
		// 可见
		paramMap.put("visible", 0);
		// 是否推荐，即是否最热资讯
		if(recommend != null)
			paramMap.put("recommend", 1);
		PmsNews news = sessionTemplate.selectOne(getStatement(SQL_FIND_PRE_NEWS), paramMap);
		return news;
	}
}
