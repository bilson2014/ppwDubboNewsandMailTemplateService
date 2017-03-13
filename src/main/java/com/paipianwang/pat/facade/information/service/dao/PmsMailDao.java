package com.paipianwang.pat.facade.information.service.dao;

import com.paipianwang.pat.common.core.dao.BaseDao;
import com.paipianwang.pat.facade.information.entity.PmsMail;

/**
 * 邮件数据访问接口
 * @version 1.0
 *
 */
public interface PmsMailDao extends BaseDao<PmsMail>{

	public PmsMail getTemplateByType(final String mailType);

	
	
}
