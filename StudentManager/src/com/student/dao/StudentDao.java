package com.student.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.student.entity.StudentEntity;
import com.student.mapper.StudentMapper;

public class StudentDao {

	//@Fields jdbcTemplate
	private JdbcTemplate jdbcTemplate;


	/**
	 * @param jdbcTemplate セットする jdbcTemplate
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	/**
	 * 学生エンティティリストを取得する.
	 * @return　学生エンティティリスト.
	 */
	public List<StudentEntity> selectStudentEntity(){

		List<StudentEntity> studentEntityList = new ArrayList<>();
		String sql = "SELECT id,name,birthday,age,score FROM student";
		studentEntityList = jdbcTemplate.query(sql, new StudentMapper());

		return studentEntityList;
	}
 }
