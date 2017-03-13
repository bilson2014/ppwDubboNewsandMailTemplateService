package com.paipianwang.pat.facade.information.service.dao.impl;


import java.util.List;

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
	
	public static final String SQL_RECOMMEND_NEWS = "RecommendNews";

	@Override
	public List<PmsNews> RecommendNews() {
		return sessionTemplate.selectList(getStatement(SQL_RECOMMEND_NEWS));
	}
}
