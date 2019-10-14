package com.varo.spring.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.varo.exceptions.KittyNotFoundException;
import com.varo.spring.model.Kitty;
import com.varo.spring.service.KittyService;

@RequestMapping("/mvc")
@Controller("menuControllerMVC")
public class MenuControllerMVC {

	private static final Logger logger = LoggerFactory.getLogger(MenuControllerMVC.class);

	@RequestMapping("/")
	String getKittys(Model model) throws Exception {
		logger.info("-- en Menu");
		return "index";
	}

}