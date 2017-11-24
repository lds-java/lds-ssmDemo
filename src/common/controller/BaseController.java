package common.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jeecgframework.p3.core.common.utils.DateConvertEditor;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * 基础控制器
 * 
 * @author lds
 *
 */

public class BaseController {

	/**
	 * 将前台传递过来的日期格式的字符串，自动转化为Date类型
	 * 
	 * @param binder
	 */
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		binder.registerCustomEditor(Date.class, new DateConvertEditor());
	}

	/**
	 * 抽取由都好分割的主键列表
	 * @param ids
	 * @return
	 */
	protected List<String> extraIdListByComma(String ids) {
		List<String> result = new ArrayList<String>();
		if (StringUtils.hasText(ids)) {
			for (String id : ids.split(",")) {
				if (StringUtils.hasLength(id)) {
					result.add(id.trim());
				}
			}
		}
		return result;
	}
}
