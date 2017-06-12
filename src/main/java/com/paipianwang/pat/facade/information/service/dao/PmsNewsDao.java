package com.paipianwang.pat.facade.information.service.dao;

import com.paipianwang.pat.common.core.dao.BaseDao;
import com.paipianwang.pat.facade.information.entity.PmsNews;

/**
 * 新闻数据访问接口
 * @version 1.0
 */
public interface PmsNewsDao extends BaseDao<PmsNews>{

	public PmsNews findNextNew(final String tags, final int newId, final Integer recommend);

	public PmsNews findPreNew(final String tags, final int newId, final Integer recommend);

}
