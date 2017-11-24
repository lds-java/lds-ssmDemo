package common.service.serviceimpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import common.service.CommonService;

@Service("commonService")
@Transactional
public class CommonServiceImpl implements CommonService {

}
