package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.ssm.mapper.MybatisTestMapper;
import cn.itcast.ssm.po.Test;
import cn.itcast.ssm.service.MybatisTestService;

@Service
public class MybatisTestServiceImpl implements MybatisTestService{

	@Autowired
	private MybatisTestMapper mapper;
	
	@Override
	public List<Test> getList(Test test) throws Exception {
		return mapper.getList(test);
	}

	@Override
	public int save(Test test) throws Exception {
		return mapper.save(test);
	}
	
	
	
}
