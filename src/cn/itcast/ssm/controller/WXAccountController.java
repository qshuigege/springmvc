package cn.itcast.ssm.controller;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	public ModelAndView queryWXAccount(HttpServletRequest request) throws Exception{
		String nickname = request.getParameter("nickname");
		nickname = new String(nickname.getBytes("ISO-8859-1"), "utf-8");
		System.out.println(nickname);
		WXAccountVo wxAccountVo = new WXAccountVo();
		WXAccountCustom wxAccountCustom = new WXAccountCustom();
		wxAccountCustom.setNickname(nickname);
		wxAccountVo.setWxAccountCustom(wxAccountCustom);
		List<WXAccountCustom> wxaccountList = wxAccountService.findWXAccountList(wxAccountVo);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("wxaccountList", wxaccountList);
		modelAndView.setViewName("/WEB-INF/jsp/wxaccount/wxaccountList.jsp");
		return modelAndView;
	}

	@RequestMapping("/controller/WXAccountController/test")
	public void test(HttpServletRequest request, HttpServletResponse response) throws Exception{
		//response.setCharacterEncoding("utf-8");
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		String aaa = request.getParameter("aaa");
		PrintWriter out = response.getWriter();
		out.print("访问参数为-->"+aaa);
		out.flush();
		out.close();
	}

	@RequestMapping("/controller/WXAccountController/isBinded")
	public void isBinded(HttpServletRequest request, HttpServletResponse response, String unionid) throws Exception{
		//response.setCharacterEncoding("utf-8");
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		//String aaa = request.getParameter("aaa");
		int num = wxAccountService.isBinded(unionid);
		PrintWriter out = response.getWriter();
		out.print("是否绑定？-->"+num);
		out.flush();
		out.close();
	}

	@RequestMapping("/controller/WXAccountController/getOrgidByUniqueid")
	public void getOrgidByUniqueid(HttpServletRequest request, HttpServletResponse response, String uniqueid) throws Exception{
		//response.setCharacterEncoding("utf-8");
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		//String aaa = request.getParameter("aaa");
		String orgid = wxAccountService.getOrgidByUniqueid(uniqueid);
		PrintWriter out = response.getWriter();
		out.print("orgid是-->"+orgid);
		out.flush();
		out.close();
	}

	@RequestMapping("/controller/WXAccountController/getOrgidByUseridAndUniqueid")
	public void getOrgidByUseridAndUniqueid(HttpServletRequest request, HttpServletResponse response) throws Exception{
		//response.setCharacterEncoding("utf-8");
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		String userid = request.getParameter("userid");
		String uniqueid = request.getParameter("uniqueid");
		Map<String, String> map = new HashMap<String, String>();
		map.put("userid", userid);
		map.put("uniqueid", uniqueid);
		String orgid = wxAccountService.getOrgidByUseridAndUniqueid(map);
		PrintWriter out = response.getWriter();
		out.print("orgid是-->"+orgid);
		out.flush();
		out.close();
	}
}
