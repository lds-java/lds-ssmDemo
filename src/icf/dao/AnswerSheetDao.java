package icf.dao;

import com.alibaba.fastjson.JSONObject;

import icf.model.AnswerSheet;
import icf.model.User;

public interface AnswerSheetDao  {

	User selectByID(JSONObject json);
	
}
