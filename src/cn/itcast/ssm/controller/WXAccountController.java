package cn.itcast.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.WXAccountCustom;
import cn.itcast.ssm.po.WXAccountVo;
import cn.itcast.ssm.service.WXAccountService;

@Controller
public class WXAccountController {

	@Autowired
	private WXAccountService wxAccountService;

	@RequestMapping("/queryWXAccount")
	public ModelAndView queryWXAccount() throws Exception{
		WXAccountVo wxAccountVo = new WXAccountVo();
		WXAccountCustom wxAccountCustom = new WXAccountCustom();
		wxAccountCustom.setNickname("辉哥");
		wxAccountVo.setWxAccountCustom(wxAccountCustom);
		List<WXAccountCustom> wxaccountList = wxAccountService.findWXAccountList(wxAccountVo);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("wxaccountList", wxaccountList);
		modelAndView.setViewName("/WEB-INF/jsp/wxaccount/wxaccountList.jsp");
		return modelAndView;
	}
}
