package cn.itcast.ssm.test.aop;

import org.springframework.stereotype.Component;


@Component
public class TestService {

	public void save(){
		
		System.out.println("我是save()方法");
		
	}
}
