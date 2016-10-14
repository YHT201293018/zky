package nju.software.zky.service;

import java.util.List;

import nju.software.zky.data.dataobject.Test;

public interface TestService {
	
	public void save1(Test test);

    public Integer save(Test test);
	
	//public List<Test> getAll(int page, int row);

	public long countAll();

	//public List<Test> getAll();

	public boolean delete(int id);

	public boolean update(Test serverInfo);

	public Test getById(int id);
}
