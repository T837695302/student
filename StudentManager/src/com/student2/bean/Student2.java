package com.student2.bean;

public class Student2 {
	//変数定義 id
	private int id;
	// 変数定義	名前
	private String name;
	// 変数定義生年月日
	private String birthday;
	// 変数定義年齢
	private int age;
	// 変数定義成績
	private double score;
	// 変数定義id
	private int classid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", birthday=" + birthday + ", age=" + age + ", score=" + score
				+ ", classid=" + classid + "]";
	}
	public Student2(int id, String name, String birthday, int age, double score, int classid) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.age = age;
		this.score = score;
		this.classid = classid;
	}
	public Student2() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}


}
