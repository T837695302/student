package com.student.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.student.entity.StudentEntity;

public class StudentMapper implements RowMapper<StudentEntity> {

	@Override
	public StudentEntity mapRow(ResultSet resultSet, int rowNum) throws SQLException {

		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setId(resultSet.getInt("id"));
		studentEntity.setName(resultSet.getString("name"));
		studentEntity.setBirthday(resultSet.getDate("birthday"));
		studentEntity.setAge(resultSet.getInt("age"));
		studentEntity.setScore(resultSet.getInt("score"));

		return studentEntity;
	}

}
