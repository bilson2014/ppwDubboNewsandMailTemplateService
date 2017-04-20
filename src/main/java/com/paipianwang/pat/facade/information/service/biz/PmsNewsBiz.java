package com.paipianwang.pat.facade.information.service.biz;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paipianwang.pat.common.entity.DataGrid;
import com.paipianwang.pat.common.entity.PageParam;
import com.paipianwang.pat.common.util.ValidateUtil;
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

	public DataGrid<PmsNews> listWithPagination(PageParam pageParam, Map<String, Object> paramMap) {
		return pmsNewsDao.listWithPagination(pageParam, paramMap);
	}

	@Transactional
	public long insert(PmsNews pmsNews) {
		return pmsNewsDao.insert(pmsNews);
	}

	@Transactional
	public long update(PmsNews pmsNews) {
		return pmsNewsDao.update(pmsNews);
	}

	@Transactional
	public long deleteByIds(long[] ids) {
		if(ValidateUtil.isValid(ids)) {
			return pmsNewsDao.deleteByIds(ids);
		}
		return 0;
	}

	public PmsNews findNewsById(long newsId) {
		return pmsNewsDao.getById(newsId);
	}

}
