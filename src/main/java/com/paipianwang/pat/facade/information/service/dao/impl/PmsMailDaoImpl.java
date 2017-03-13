package com.paipianwang.pat.facade.information.service.dao.impl;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.paipianwang.pat.common.core.dao.impl.BaseDaoImpl;
import com.paipianwang.pat.facade.information.entity.PmsMail;
import com.paipianwang.pat.facade.information.service.dao.PmsMailDao;

@Repository("pmsMailDao")
public class PmsMailDaoImpl extends BaseDaoImpl<PmsMail> implements PmsMailDao {

	@Autowired
	private SqlSessionTemplate sessionTemplate = null;
	
	public static final String SQL_GET_TEMPLATE_BYTYPE = "getTemplateByType";

	@Override
	public PmsMail getTemplateByType(final String mailType) {
		return sessionTemplate.selectOne(getStatement(SQL_GET_TEMPLATE_BYTYPE), mailType);
	}
	

}
