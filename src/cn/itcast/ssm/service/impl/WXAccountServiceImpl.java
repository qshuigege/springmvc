package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.WXAccountMapper;
import cn.itcast.ssm.po.WXAccountCustom;
import cn.itcast.ssm.po.WXAccountVo;
import cn.itcast.ssm.service.WXAccountService;

public class WXAccountServiceImpl implements WXAccountService{

	@Autowired
	private WXAccountMapper wxAccountMapper;
	
	@Override
	public List<WXAccountCustom> findWXAccountList(WXAccountVo wxAccountVo) throws Exception {

		return wxAccountMapper.findWXAccountList(wxAccountVo);
		
	}

}
