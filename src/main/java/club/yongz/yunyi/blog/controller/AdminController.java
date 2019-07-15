package club.yongz.yunyi.blog.controller;

import java.util.ArrayList;
import java.util.List;

import club.yongz.yunyi.blog.vo.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 管理员功能控制器
 * @author OJ's big hole
 *
 */
@Controller
@RequestMapping("/admins")
public class AdminController {

	/**
	 * 管理员功能导航
	 * 1model
	 * @return
	 */
	@GetMapping
	public ModelAndView listUsers(Model model){
		System.out.println("hehe!");
		List<Menu> list = new ArrayList<>();
		list.add(new Menu("用户管理", "/users"));
		list.add(new Menu("角色管理", "/roles"));
		list.add(new Menu("博客管理", "/blogs"));
		list.add(new Menu("评论管理", "/commits"));
		model.addAttribute("list", list);
		return new ModelAndView("admins/index", "model", model);
	}

}
