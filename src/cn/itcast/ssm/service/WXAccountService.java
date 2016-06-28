package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.po.WXAccountCustom;
import cn.itcast.ssm.po.WXAccountVo;

public interface WXAccountService {
	public List<WXAccountCustom> findWXAccountList(WXAccountVo wxAccountVo)throws Exception;
}
