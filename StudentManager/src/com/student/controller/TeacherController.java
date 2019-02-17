package com.student.controller;

import java.util.ArrayList;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teacher.bean.Teacher;
import com.teacher.dao.TeacherDao;

public class TeacherController {
	/**
	 *
	 */

	@RequestMapping(value = "/allTeacher")
	public String queryteaAll(Model model) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TeacherDao teacherdao = (TeacherDao) context.getBean("teacherdao");
		ArrayList<Teacher> teacherlist = new ArrayList<Teacher>();
		teacherlist = (ArrayList<Teacher>) teacherdao.queryteaAll();
		model.addAttribute("teachers", teacherlist);
		return " teacher";

	}

}
