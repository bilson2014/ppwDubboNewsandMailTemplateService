package com.paipianwang.pat.facade.information.service.impl;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paipianwang.pat.common.entity.DataGrid;
import com.paipianwang.pat.common.entity.PageParam;
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

	@Override
	public DataGrid<PmsNews> listWithPagination(PageParam pageParam, Map<String, Object> paramMap) {
		final DataGrid<PmsNews> dataGrid = biz.listWithPagination(pageParam, paramMap);
		return dataGrid;
	}

	@Override
	public long insert(PmsNews pmsNews) {
		final long ret = biz.insert(pmsNews);
		return ret;
	}

	@Override
	public long update(PmsNews pmsNews) {
		final long ret = biz.update(pmsNews);
		return ret;
	}

	@Override
	public long deleteByIds(long[] ids) {
		final long ret = biz.deleteByIds(ids);
		return ret;
	}

	@Override
	public PmsNews findNewsById(long newsId) {
		return biz.findNewsById(newsId);
	}

}
