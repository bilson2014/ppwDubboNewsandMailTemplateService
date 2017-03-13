package com.paipianwang.pat.facade.information.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paipianwang.pat.facade.information.entity.PmsMail;
import com.paipianwang.pat.facade.information.service.PmsMailFacade;
import com.paipianwang.pat.facade.information.service.biz.PmsMailBiz;

/**
 * 邮件Dubbo服务接口实现
 * @version 1.0
 */
@Service("pmsMailFacade")
public class PmsMailServiceImpl implements PmsMailFacade {

	@Autowired
	private final PmsMailBiz biz = null;

	@Override
	public PmsMail getTemplateByType(final String mailType) {
		final PmsMail ret = biz.getTemplateByType(mailType);
		return ret;
	}
	
	
}
