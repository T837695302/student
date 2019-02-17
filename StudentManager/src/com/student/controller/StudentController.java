package com.student.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.dao.StudentDao;
import com.student.entity.StudentEntity;
import com.student.form.StudentForm;

@Controller
public class StudentController {

	@RequestMapping(value = "/displayStudentList")
	public String displayAll(Model model) {

		StudentDao studentDao = getStudentDao();

		List<StudentEntity> studentEntityList = studentDao.selectStudentEntity();

		List<StudentForm> studentFormList = new ArrayList<>();

		if (studentEntityList != null && !studentEntityList.isEmpty()) {

			for (StudentEntity studentEntity : studentEntityList) {
				StudentForm studentForm = new StudentForm();
				studentForm.setId(toString(studentEntity.getId()));
				studentForm.setName(studentEntity.getName());
				studentForm.setBirthday(getStringDate(studentEntity.getBirthday()));
				studentForm.setAge(toString(studentEntity.getAge()));
				studentForm.setScore(toString(studentEntity.getScore()));

				studentFormList.add(studentForm);

			}

		}
		model.addAttribute("studentFormList", studentFormList);
		return "student";

	}

	private String toString(Integer num) {
		if (num == null) {
			return "";
		} else {
			return String.valueOf(num);
		}
	}

	private String getStringDate(Date birthday) {
		if (birthday == null) {
			return "";
		}
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
		String birthdayStr = formatter.format(birthday);
		return birthdayStr;

	}

	private StudentDao getStudentDao() {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDao studentDao = (StudentDao) context.getBean("studentDao");

		return studentDao;
	}
}