package cn.itcast.ssm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.ssm.mapper.WXAccountMapper;
import cn.itcast.ssm.po.WXAccountCustom;
import cn.itcast.ssm.po.WXAccountVo;
import cn.itcast.ssm.service.WXAccountService;
@Service
public class WXAccountServiceImpl implements WXAccountService{

	@Autowired
	private WXAccountMapper wxAccountMapper;
	
	@Override
	public List<WXAccountCustom> findWXAccountList(WXAccountVo wxAccountVo) throws Exception {

		return wxAccountMapper.findWXAccountList(wxAccountVo);
		
	}

	@Override
	public int isBinded(String unionid) throws Exception {
		return wxAccountMapper.isBinded(unionid);
	}

	@Override
	public String getOrgidByUniqueid(String uniqueid) throws Exception {
		return wxAccountMapper.getOrgidByUniqueid(uniqueid);
	}

	@Override
	public String getOrgidByUseridAndUniqueid(Map<String, String> map) throws Exception {
		return wxAccountMapper.getOrgidByUseridAndUniqueid(map);
	}

}
