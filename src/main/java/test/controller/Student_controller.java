package test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import test.bean.student;
import test.dao.studentdao;

@Controller
public class Student_controller {
	
	@Autowired                            // for connection to dao file
	studentdao dao;
	

	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(@ModelAttribute("stud") student stud)
	{
		dao.insert(stud);
		
		return "redirect:/welcome";
	}
	
	@RequestMapping(value="/welcome")
	
	public String welcome(Model m)
	{
		List<student> list=dao.getallstudents();
		m.addAttribute("list",list);
		return "welcome"; //welcome.jsp
	}
	
	@RequestMapping(value="/deletestud/{id}", method=RequestMethod.GET)
	
	public String delete(@PathVariable int id)
	{
		dao.deletestudent(id);
		
		return "redirect:/welcome";
	}
	
	@RequestMapping(value="/editstud/{id}", method=RequestMethod.GET)
	
	public String edit(@PathVariable int id,Model m)
	{ 
		student stud=dao.getstudent(id);
		m.addAttribute("command",stud);
		return "edit";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	
	public String update(@ModelAttribute("stud") student stud)
	{
		dao.updatestudent(stud);       // create updatestudent function in dao file
		
		return "redirect:/welcome";
	}
}
