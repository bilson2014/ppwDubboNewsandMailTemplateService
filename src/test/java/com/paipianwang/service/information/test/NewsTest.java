/*package com.paipianwang.service.information.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.paipianwang.pat.common.entity.PageParam;
import com.paipianwang.pat.facade.information.entity.PmsNews;
import com.paipianwang.pat.facade.information.service.biz.PmsNewsBiz;

public class NewsTest extends BaseTestAction{

	@Autowired
	private final PmsNewsBiz biz = null;
	
	@Test
	public void test() {
		PageParam page = new PageParam();
		page.setBegin(0);
		page.setLimit(10);
		
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("tags", "行业资讯");
		param.put("recommend", 0);
		param.put("status", true);
		param.put("visible", 0);
 		List<PmsNews> list = biz.listWithPagination(page, param).getRows();
 		System.err.println(list.size());
 		System.err.println(list);
	}
	
	@Test
	public void testNextNew() {
		PmsNews news = biz.findNextNew("行业资讯", 29);
		if(news != null) {
			System.err.println(news.getId());
			System.out.println(news.getStatus());
		} else {
			System.err.println("没有下一条新闻");
		}
	}
	
	@Test
	public void testPreNew() {
		PmsNews news = biz.findPreNew(null, 30);
		if(news != null) {
			System.err.println(news.getId());
			System.out.println(news.getStatus());
		} else {
			System.err.println("没有下一条新闻");
		}
	}
}
*/