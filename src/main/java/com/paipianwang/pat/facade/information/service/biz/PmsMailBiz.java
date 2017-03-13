package com.paipianwang.pat.facade.information.service.biz;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paipianwang.pat.facade.information.entity.PmsMail;
import com.paipianwang.pat.facade.information.service.dao.PmsMailDao;

/**
 * 邮件--服务层接口
 * 事物管理层
 * @version 1.0
 */
@Service
public class PmsMailBiz {

	@Autowired
	private PmsMailDao pmsMailDao;

	public PmsMail getTemplateByType(final String mailType) {
		final PmsMail ret = pmsMailDao.getTemplateByType(mailType);
		return ret;
	}

	
}
