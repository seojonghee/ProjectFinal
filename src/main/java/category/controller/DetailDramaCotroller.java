package category.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import category.detail.DetailBean;
import category.detail.DetailDao;
import category.model.CategoryBean;
import category.model.CategoryDao;
import member.model.MemberBean;
import member.model.MemberJjimBean;
import member.model.MemberJjimDao;

@Controller
public class DetailDramaCotroller {
	
	private final String command="/detailDrama.category";
	private final String getPage="detailDrama";
	
	@Autowired
	CategoryDao cdao;
	
	@Autowired
	DetailDao ddao;
	
	@Autowired
	MemberJjimDao mjdao;
	
	@RequestMapping(value=command,method=RequestMethod.GET)
	public ModelAndView doAction(@RequestParam("num") int num,HttpSession session) {
		
		ModelAndView mav=new ModelAndView();
		
		MemberBean loginInfo = (MemberBean) session.getAttribute("loginInfo");
		if(loginInfo == null) {
			session.setAttribute("destination", "redirect:drama.category");
			mav.addObject("msg", "로그인을 해야합니다");
			mav.setViewName("alert");
		}else {
		DetailBean db=ddao.detailVideoView(num);
		List<DetailBean> dlists = ddao.detailVideoGenre(db.getGenre());
		List<CategoryBean> clists=cdao.selectAll();
		List<MemberJjimBean> mjlists = mjdao.getByData(loginInfo.getId());
		
		
		mav.addObject("db",db);
		mav.addObject("dlists",dlists);
		mav.addObject("clists",clists);
		mav.addObject("mjlists", mjlists);
		
		mav.setViewName(getPage);
		}
		return mav;
	}
}
