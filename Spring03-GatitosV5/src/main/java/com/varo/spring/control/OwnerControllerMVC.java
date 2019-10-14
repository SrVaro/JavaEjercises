package com.varo.spring.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.varo.exceptions.KittyNotFoundException;
import com.varo.formatters.OwnerEditor;
import com.varo.spring.model.Kitty;
import com.varo.spring.model.Owner;
import com.varo.spring.service.KittyService;
import com.varo.spring.service.OwnerService;

@RequestMapping("/mvc/owners")
@Controller("ownerControllerMVC")
public class OwnerControllerMVC {

	private static final Logger logger = LoggerFactory.getLogger(OwnerControllerMVC.class);

	@Autowired
	private OwnerService ownerService;

	@RequestMapping("/")
	String getOwners(Model model) throws Exception {
		logger.info("-- en Listado");
		List<Owner> listOwner = ownerService.list();
		model.addAttribute("ownerList", listOwner);
		return "owners";
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String newOwner(Model model) {
		logger.info("-- en NEW");
		model.addAttribute("owner", new Owner());
		return "ownerForm";
	}

	// El parámetro HttpServletRequest es viejuno
	// Se soluciona con RequestParam
	// @RequestParam("id") int id
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String editOwner(HttpServletRequest request, Model model) {
		logger.info("-- en EDIT");
		int ownerId = Integer.parseInt(request.getParameter("id"));
		Owner owner = ownerService.get(ownerId).orElseThrow(KittyNotFoundException::new);
		model.addAttribute("owner", owner);
		return "ownerForm";
	}

	// El parámetro HttpServletRequest es viejuno
	// Se soluciona con RequestParam
	// @RequestParam("id") int id
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteOwner(HttpServletRequest request) {
		logger.info("-- en DELETE");
		int ownerId = Integer.parseInt(request.getParameter("id"));
		ownerService.delete(ownerId);
		return "redirect:/mvc/owners/";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveKitty(@ModelAttribute Owner owner) {
		logger.info("-- en SAVE");
		ownerService.add(owner);
		return "redirect:/mvc/owners/";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    binder.registerCustomEditor(Owner.class, new OwnerEditor());
	}
}
