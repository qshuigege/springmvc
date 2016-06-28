package cn.itcast.ssm.mapper;

import java.util.List;

import cn.itcast.ssm.po.WXAccountCustom;
import cn.itcast.ssm.po.WXAccountVo;

public interface WXAccountMapper {
	public List<WXAccountCustom> findWXAccountList(WXAccountVo wxAccountVo)throws Exception;

}
