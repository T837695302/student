package com.teacher.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.student.mapper.TeacherMapper;
import com.teacher.bean.Teacher;

public class TeacherDao {

	private JdbcTemplate jdbctemplate;

	/**
	 * gatter及びsetterの生成(S)...（setterの選択）
	 *
	 * @param jdbctemplate
	 */
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	/**
	 *
	 */
	public List<Teacher> queryteaAll() {
		String sql = "select id,teachername,course  from teacher";

		return jdbctemplate.query(sql, new TeacherMapper());
	}
}
