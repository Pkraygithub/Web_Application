package com.WebApplication.Web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.WebApplication.Web.Service.IReg_FoemService;
import com.WebApplication.Web.model.Reg_Form;

@Controller
@RequestMapping("/Admission")
public class Reg_FormController {

	@Autowired
	private IReg_FoemService service;

	@GetMapping("/home")
	public String save(Model model) {

		model.addAttribute("reg_Form", new Reg_Form());

		return "index";

	}

	@PostMapping("/save_form")
	public String saveReg_Form(@ModelAttribute Reg_Form regForm, Model model) {

		Integer id = service.saveReg_Form(regForm);

		String msg = "Student Roll Number is ->" + id;

		model.addAttribute("adm", msg);

		return "index";
	}

}