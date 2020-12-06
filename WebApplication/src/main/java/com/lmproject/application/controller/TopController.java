/**
 * Copyright 2019 Takanori Nishi
 */
package com.lmproject.application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lmproject.application.constants.ViewnameConstant;
import com.lmproject.application.database.dao.UsersDao;
import com.lmproject.application.database.entity.User;
import com.lmproject.application.form.UserForm;

/**
 * クラス名：TopController.java<br>
 * <p>
 * 作成日：2020/12/03<br>
 * 最終更新日：2020/12/03<br>
 * @author nishi
 * </p>
 *
 */
@Controller
public class TopController {
	/**
	 * @param mv
	 * @return topページ
	 */
	@RequestMapping(value = "/top", method = RequestMethod.GET)
	public ModelAndView top(ModelAndView mv) {

		List<User> userlist = new ArrayList<User>();

		UsersDao dao = new UsersDao();
		userlist = dao.getUserLIst();
		mv.addObject("userlist", userlist);
		mv.addObject("userForm", new UserForm());

		mv.setViewName(ViewnameConstant.TOP);

		return mv;
	}

	/**
	 * @param mv
	 * @param userform user情報
	 * @return topページ
	 */
	@RequestMapping(value = "/top", method = RequestMethod.POST)
	public ModelAndView postTop(ModelAndView mv,UserForm userform) {

		UsersDao dao = new UsersDao();
		String userId=userform.getUserId();
		User user = dao.findByUserid(userId);

		System.out.print(userform.getUserId());

		userform.setUserId(userId);
		userform.setMailAddress(user.getMailAddress());
		userform.setUsername(user.getUserName());

		mv.addObject("user", userform);

		mv.setViewName(ViewnameConstant.USER);

		return mv;
	}
}
