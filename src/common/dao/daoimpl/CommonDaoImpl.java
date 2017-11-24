package common.dao.daoimpl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import common.dao.CommonDao;

public class CommonDaoImpl implements CommonDao {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	public SqlSession getSqlSession(){
		
		return sqlSessionFactory.openSession();
	}
	
	
}
