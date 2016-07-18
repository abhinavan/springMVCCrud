package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import bean.Student;

@Controller
public class StudentController 
{
	@RequestMapping("/register")
	public ModelAndView addStudent(HttpServletRequest request,HttpServletResponse response)
	{
		String name=request.getParameter("name");
		String course=request.getParameter("course");
		int roll=Integer.parseInt(request.getParameter("roll"));
		Student st=new Student(name, course, roll);
		
		return new ModelAndView("successAdd","message","RECORDS ARE ADDED");
	}
	@RequestMapping("/show")
	public ModelAndView selectStudent(HttpServletRequest req,HttpServletResponse res)
	{
		
		String name=req.getParameter("name");
		String course=req.getParameter("course");
		int roll=Integer.parseInt(req.getParameter("roll"));
		Student st=new Student(name, course, roll);
		List<Student> list=new ArrayList<>();
		list.add(st);
		list.add(new Student("abhinav","FALTU",22));
		list.add(new Student("anand","BANSAL",12));
		return new ModelAndView("viewResult","list",list);
	}
	

}
