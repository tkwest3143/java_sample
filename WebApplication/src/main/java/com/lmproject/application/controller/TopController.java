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

import com.lmproject.application.database.dao.UsersDao;
import com.lmproject.application.database.entity.User;

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

		mv.setViewName("top");

		return mv;
	}
}
