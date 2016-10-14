package nju.software.zky.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import nju.software.zky.data.DAO.TestDAO;
import nju.software.zky.data.dataobject.Test;
import nju.software.zky.service.TestService;

@Service("testService")
public class TestServiceImp implements TestService{

	@Resource
	private TestDAO testDao;
//	public void setTestDAO(TestDAO testDAO) {
//		this.testDao = testDAO;
//	}
//	
//	public TestDAO getTestDAO(){
//		return testDao;
//	}

	@Override
	public void save1(Test test){
		testDao.save(test);
	}
	
	@Override
	public Integer save(Test test) {
		// TODO Auto-generated method stub
		return (Integer) testDao.save(test);
		//return 0;
	}
	
	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
//		Test test = testDAO.getById(id);
//		if(test == null){
//			return false;
//		}
//		return testDAO.delete(test);
		return true;
	}
	
	@Override
	public boolean update(Test test){
//		Test oldtest = testDAO.getById(test.getId());
//		if(oldtest == null){
//			return false;
//		}
//		oldtest.setPassword(test.getPassword());
//		oldtest.setUsername(test.getUsername());
//		return testDAO.update(test);
		return false;
	}
	
	@Override
	public Test getById(int id){
		//return testDAO.getById(id);
		Test test = new Test();
		return test;
	}

//	@Override
//	public List<Test> getAll(int page, int row) {
//		// TODO Auto-generated method stub
//		//return testDAO.find("from Test", new Object[]{}, page, row);
//		List<Test> test=new List<Test>();
//		return test;
//	}

	@Override
	public long countAll() {
		// TODO Auto-generated method stub
		//return testDAO.count("select count(*) from ServerInfo");
		return 0;
	}
	
//	@Override
//	public List<Test> getAll() {
//		// TODO Auto-generated method stub
//		//return testDAO.find("from ServerInfo");
//	}
}
