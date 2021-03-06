/**
 *
 */
package com.lmproject.application.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lmproject.application.constants.ViewnameConstant;
import com.lmproject.application.database.dao.UsersDao;
import com.lmproject.application.database.entity.User;
import com.lmproject.application.form.LoginForm;

/**
 * @author nishi
 *
 */
@Controller
public class LoginController {
	private User loginUser = null;

	/**
	 * @param mv
	 * @return ログイン画面
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getLogin(ModelAndView mv) {
		mv.addObject("loginForm", new LoginForm());
		mv.setViewName(ViewnameConstant.LOGIN);
		return mv;
	}

	/**
	 * @param loginForm
	 * @param mv
	 * @return 遷移先画面
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView postLogin(@ModelAttribute LoginForm loginForm, ModelAndView mv) {
		if (loginForm.getLoginname() != null) {
			this.loginUser = this.doLogin(loginForm.getLoginname(), loginForm.getPassword());
		} else {
			System.out.println("NULLEXCEPTION");
		}
		if (loginUser != null) {
			ModelAndView modelAndView = new ModelAndView("redirect:/top");
			System.out.print("ISLOGIN=TRUE");
			mv = modelAndView;
			mv.addObject("loginForm", loginForm);

		} else {
			mv.addObject("loginForm", loginForm);
			mv.addObject("errorMsg", "ログインに失敗しました。");
			System.out.print("ISLOGIN=FALSE");
			mv.setViewName(ViewnameConstant.LOGIN);
		}

		return mv;
	}

	/**
	 *
	 * @param username
	 * @param password
	 * @return
	 */
	private User doLogin(String username, String password) {
		UsersDao dao = new UsersDao();
		List<User> userlist = dao.select(username);
		User ret = null;
		if (userlist != null) {
			for (User user : userlist) {
				ret = new User();
				System.out.println("DBPassword::" + user.getPassword());
				try {
					byte[] cipher_byte;
					MessageDigest md = MessageDigest.getInstance("SHA-256");
					md.update(password.getBytes());
					cipher_byte = md.digest();
					StringBuilder sb = new StringBuilder(2 * cipher_byte.length);
					for (byte b : cipher_byte) {
						sb.append(String.format("%02x", b & 0xff));
					}
					System.out.println(sb);
				} catch (NoSuchAlgorithmException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
		}

		return ret;
	}
}
