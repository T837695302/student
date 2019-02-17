package com.teacher.bean;

/**
 * 先生クラスの生成
 *
 * @author Sui
 */

public class Teacher {
	int id; // ID
	String teachername; // 先生の名前
	String course;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", teachername=" + teachername + ", course=" + course + "]";
	}
	public Teacher(int id, String teachername, String course) {
		super();
		this.id = id;
		this.teachername = teachername;
		this.course = course;
	}
	public Teacher() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

}
