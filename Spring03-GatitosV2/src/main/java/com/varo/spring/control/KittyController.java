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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.varo.spring.model.Kitty;
import com.varo.spring.service.KittyService;

@Controller("kittyController")
@JsonIgnoreProperties(ignoreUnknown = true)
public class KittyController {

	private static final Logger logger = LoggerFactory.getLogger(KittyController.class);

	@Autowired
	private KittyService kittyService;

	@RequestMapping("/")
	String getKittys(Model model) throws Exception {
		logger.info("-- en Listado");
		List<Kitty> listKitty = kittyService.list();
		model.addAttribute("kittyList", listKitty);
		return "index";
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String newKitty(Model model) {
		logger.info("-- en NEW");
		model.addAttribute("kitty", new Kitty());
		return "kittyForm";
	}

	// El parámetro HttpServletRequest es viejuno
	// Se soluciona con RequestParam
	// @RequestParam("id") int id
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String editKitty(HttpServletRequest request, Model model) {
		logger.info("-- en EDIT");
		int kittyId = Integer.parseInt(request.getParameter("id"));
		Kitty kitty = kittyService.get(kittyId);
		model.addAttribute("kitty", kitty);
		return "kittyForm";
	}

	// El parámetro HttpServletRequest es viejuno
	// Se soluciona con RequestParam
	// @RequestParam("id") int id
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteKitty(HttpServletRequest request) {
		logger.info("-- en DELETE");
		int kittyId = Integer.parseInt(request.getParameter("id"));
		kittyService.delete(kittyId);
		return "redirect:/";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveKitty(@ModelAttribute Kitty kitty) {
		logger.info("-- en SAVE");
		kittyService.add(kitty);
		return "redirect:/";
	}

	@GetMapping("/kitty")
	String getAvailableOperations(Model model) {
		model.addAttribute("img", kittyService.getImage());

		return "index";
	}

}