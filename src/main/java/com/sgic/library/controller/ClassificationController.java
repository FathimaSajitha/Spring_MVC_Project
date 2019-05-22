package com.sgic.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sgic.library.model.Classification;
import com.sgic.library.service.ClassificationService;

@Controller
public class ClassificationController {

	@Autowired
	public ClassificationService classificationService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String printWelcome(Model model) {
	model.addAttribute("classification",new Classification());
	return "AddClassification";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(@ModelAttribute("classification")Classification classification) {
		classificationService.createClassification(classification);
		return "redirect:/ListClassifications";
	}
	@RequestMapping(value = "/ListClassifications", method = RequestMethod.GET)
	public ModelAndView save (ModelAndView modelandview) {
		modelandview.setViewName("ListClassifications");
		List<Classification> list = classificationService.ListClassification();
		modelandview.addObject("list",list);
		return modelandview;
		
	}
}
