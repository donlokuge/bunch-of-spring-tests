package com.example.mvctest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.mvctest.controller.object.Form;

@Controller
public class FormExample {
	
	@GetMapping("/fill")
	public String fill(Model model){
		
		model.addAttribute("fillForm",new Form());
				
		  return "fill";
	}
	
	
	@PostMapping("/fill")
	public String filledForm(@ModelAttribute Form form){
		
		System.out.println(form.getContent());
		
		return "filled-form";
	}

	
	
}
