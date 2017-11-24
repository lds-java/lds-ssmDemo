package icf.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import common.controller.BaseController;
import icf.service.AnswerSheetService;
import utils.Pager;
import utils.RequestParamsToJson;
/**
 * 答题卡控制器
 * @author lds
 *
 */
@Controller
@RequestMapping("/answerSheetController")
public class AnswerSheetController extends BaseController {

	@Autowired
	private AnswerSheetService answerSheetService;
	
	@RequestMapping("/selectById")
	public String selectByID(HttpServletRequest request){
		JSONObject json_id = RequestParamsToJson.getParameterMap(request);
		
		@SuppressWarnings("unused")
		Pager<Object> pg = answerSheetService.selectByID(json_id);
		System.out.println(pg.getContent().toString());
	return "login/login";
				
	}
	
}
