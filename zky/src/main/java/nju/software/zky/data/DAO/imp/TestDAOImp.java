package nju.software.zky.data.DAO.imp;

import org.springframework.stereotype.Repository;

import nju.software.zky.data.DAO.imp.BaseDAOImp;
import nju.software.zky.data.DAO.TestDAO;
import nju.software.zky.data.dataobject.Test;

@Repository("testDao")
public class TestDAOImp extends BaseDAOImp<Test> implements TestDAO{

	@Override
	public Test getById(int id) {
		// TODO Auto-generated method stub
		return this.get(Test.class, id);
	}
}
