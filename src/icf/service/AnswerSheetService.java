package icf.service;

import com.alibaba.fastjson.JSONObject;

import common.service.CommonService;
/**
 * 答题卡服务层接口
 * @author lds
 *
 */
import utils.Pager;
public interface AnswerSheetService extends CommonService {

	public Pager<Object> selectByID(JSONObject json);
	
}
