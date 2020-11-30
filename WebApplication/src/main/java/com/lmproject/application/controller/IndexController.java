/**
 *
 */
package com.lmproject.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author nishi
 *
 */
@Controller
public class IndexController {
	/**
	 * @param mv
	 * @return topページ
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
    public ModelAndView index(ModelAndView mv) {
        mv.setViewName("/login");
        return mv;
    }
}
