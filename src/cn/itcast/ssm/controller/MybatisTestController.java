package cn.itcast.ssm.controller;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.ssm.po.Test;
import cn.itcast.ssm.service.MybatisTestService;

@Controller
public class MybatisTestController {

	@Autowired
	private MybatisTestService service;

	/*@RequestMapping("/queryWXAccount")
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
	}*/

	@RequestMapping("/controller/MybatisTestController/save")
	public void save(HttpServletRequest request, HttpServletResponse response) throws Exception{
		//response.setCharacterEncoding("utf-8");
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		
		Test test = new Test("aaa", new BigDecimal(123), new Date(), 'd', 1);
		for (int i = 0; i < 10; i++) {
			test.setBbb(new BigDecimal(i+101));
			test.setEee(i+1);
			service.save(test);
		}
		PrintWriter out = response.getWriter();
		out.print("save");
		out.flush();
		out.close();
	}

	@RequestMapping("/controller/MybatisTestController/getList")
	public void getList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		//response.setCharacterEncoding("utf-8");
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		List<Test> list = service.getList(null);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i).toString()).append("<br/>");
		}
		PrintWriter out = response.getWriter();
		out.print(sb.toString());
		out.flush();
		out.close();
	}
}
