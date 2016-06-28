package cn.itcast.ssm.mapper;

import java.util.List;

import cn.itcast.ssm.po.Test;

public interface MybatisTestMapper {
	
	public List<Test> getList(Test test)throws Exception;
	
	public int save(Test test) throws Exception;
	
}

