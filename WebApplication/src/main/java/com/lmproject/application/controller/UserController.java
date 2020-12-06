/**
 * Copyright 2019 Takanori Nishi
 */
package com.lmproject.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lmproject.application.database.dao.UsersDao;
import com.lmproject.application.database.entity.User;
import com.lmproject.application.form.UserForm;

/**
 * クラス名：UserController.java<br>
 * <p>
 * 作成日：2020/12/06<br>
 * 最終更新日：2020/12/06<br>
 * @author nishi
 * </p>
 *
 */
@Controller
public class UserController {

	/**
	 * @param mv
	 * @param userform ユーザ情報
	 * @return topページ
	 */
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public ModelAndView index(ModelAndView mv, UserForm userform) {
		UsersDao dao = new UsersDao();
		User userinfo = dao.findByUserid(userform.getUserId());

		userinfo.setUserName(userform.getUsername());
		userinfo.setMailAddress(userform.getMailAddress());
		dao.update(userinfo);
		ModelAndView modelAndView = new ModelAndView("redirect:/top");
		mv = modelAndView;

		return mv;
	}

}
