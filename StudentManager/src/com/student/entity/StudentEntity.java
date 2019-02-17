package com.student.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * 学生エンティティ.
 * @author fengying.
 *
 */
public class StudentEntity implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1105086683725038109L;

	/**
	 * シリアル・バージョン ID
	 */

	/**
	 * ID
	 */

	private int id;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 生年月日
	 */

	private Date birthday;

	/**
	 * 年齢
	 */

	private Integer age;

	/**
	 * 成績
	 */
	private Integer score;

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday セットする birthday
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return score
	 */
	public Integer getScore() {
		return score;
	}

	/**
	 * @param score セットする score
	 */
	public void setScore(Integer score) {
		this.score = score;
	}
}
