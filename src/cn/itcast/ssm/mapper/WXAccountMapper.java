package cn.itcast.ssm.mapper;

import java.util.List;
import java.util.Map;

import cn.itcast.ssm.po.WXAccountCustom;
import cn.itcast.ssm.po.WXAccountVo;

public interface WXAccountMapper {
	public List<WXAccountCustom> findWXAccountList(WXAccountVo wxAccountVo)throws Exception;
	
	public int isBinded(String unionid) throws Exception;
	
	public String getOrgidByUniqueid(String uniqueid) throws Exception;
	
	public String getOrgidByUseridAndUniqueid(Map<String, String> map) throws Exception;
}
