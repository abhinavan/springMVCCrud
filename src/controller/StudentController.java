package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import bean.Student;

@Controller
public class StudentController 
{
	public StudentController() 
	{
		System.out.println("Hello");
	}

	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute("student") Student student)
	{
		System.out.println("Name: "+student.getName());
		System.out.println("Course: "+student.getCourse());
		System.out.println("RollNo: "+student.getRoll());
		return new ModelAndView("successAdd","message","RECORDS added successfully");
	}
	@RequestMapping("/show")
	public ModelAndView selectStudent()
	{
		List<Student> list=new ArrayList<>();
		list.add(new Student("abhinav","FALTU",22));
		list.add(new Student("anand","BANSAL",12));
		return new ModelAndView("viewResult","list",list);
	}
}
