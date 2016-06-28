package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.po.Test;

public interface MybatisTestService {
	
	public List<Test> getList(Test test)throws Exception;
	
	public int save(Test test) throws Exception;
	
}
