/**
 *
 */
package com.student2.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luyao
 *
 */
public class PrintStudent2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Student2 studentOne = new Student2();
		studentOne.setId(1);
		studentOne.setName("wang");
		studentOne.setBirthday("1990/1/6");
		studentOne.setAge(21);
		studentOne.setScore(100);
		studentOne.setClassid(5);
		System.out.println(studentOne);

		Student2 studentTwo = new Student2();
		studentTwo.setId(2);
		studentTwo.setName("zhang");
		studentTwo.setBirthday("1995/10/6");
		studentTwo.setAge(26);
		studentTwo.setScore(100);
		studentTwo.setClassid(3);
		System.out.println(studentTwo);

		Student2 studentThree = new Student2();
		studentThree.setId(3);
		studentThree.setName("fang");
		studentThree.setBirthday("1999/1/6");
		studentThree.setAge(29);
		studentThree.setScore(90);
		studentThree.setClassid(2);
		System.out.println(studentThree);

		Student2 studentFour = new Student2();
		studentFour.setId(4);
		studentFour.setName("gang");
		studentFour.setBirthday("1890/1/6");
		studentFour.setAge(1021);
		studentFour.setScore(100);
		studentFour.setClassid(1);
		System.out.println(studentFour);

		Student2 studentFive = new Student2(5, "gao", "1995/6/25", 32, 322, 3);


		System.out.println(studentFive.getBirthday());

		List<Student2> studentList = new ArrayList<Student2>();
		studentList.add(studentOne);
		studentList.add(studentTwo);
		studentList.add(studentThree);
		studentList.add(studentFour);
		studentList.add(studentFive);
		System.out.println(studentList);

		System.out.println(studentList.get(0));


		double SumScore = GetSumStudentscore(studentList);
		System.out.println("学生成績合計："+ SumScore);
		double SumAge = GetSumStudentAge(studentList);
		System.out.println("学生年齢合計："+ SumAge);




	}
	private static double GetSumStudentAge(List<Student2> studentList) {
		// TODO 自動生成されたメソッド・スタブ
		double GetSumStudentAge = 0;
		for (Student2 stu:studentList) {
			GetSumStudentAge+=stu.getAge();
		}
		return GetSumStudentAge;
	}
	/**
	 * Listで学生成績合計を計算する
	 * @param studentList
	 * @return　SumStudentscore
	 */
private static double GetSumStudentscore(List<Student2> studentList) {
		// TODO 自動生成されたメソッド・スタブ
		double SumStudentScore = 0;
		for (Student2 stu:studentList) {
			SumStudentScore+=stu.getScore();



		}
		return SumStudentScore;





	}

}
