package icf.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;

import common.service.serviceimpl.CommonServiceImpl;
import icf.dao.AnswerSheetDao;
import icf.model.User;
import icf.service.AnswerSheetService;
import utils.Pager;
/**
 * service实现
 * @author lds
 *
 */
@Service("answerSheetService")
@Transactional
public class AnswerSheetServiceImpl  extends CommonServiceImpl implements AnswerSheetService{
	
	@Autowired
	private AnswerSheetDao answerSheetDao;

	@Override
	public Pager<Object> selectByID(JSONObject json) {
		
		Pager<Object> p = new Pager<>();
		List list = new ArrayList<>();
		User user = answerSheetDao.selectByID(json);
		list.add(user);
		p.setContent(list);
		return p;
	}


}
