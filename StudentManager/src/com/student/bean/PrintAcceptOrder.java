/**
 *
 */
package com.student.bean;

import java.util.ArrayList;

/**
 * @author xumin
 *
 */
public class PrintAcceptOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		AcceptOrder acceptorderOne = new AcceptOrder(10001,001,102,300,"20010401");
		AcceptOrder acceptorderTwo = new AcceptOrder(10002,002,101,200,"20010401");
		AcceptOrder acceptorderThree = new AcceptOrder(10003,004,101,150,"20010401");
		AcceptOrder acceptorderFour = new AcceptOrder(10004,004,102,80,"20010402");
		AcceptOrder acceptorderFive = new AcceptOrder(10005,002,104,110,"20010402");
		AcceptOrder acceptorderSix = new AcceptOrder(10006,001,103,250,"20010402");
		AcceptOrder acceptorderSeven = new AcceptOrder(10007,003,102,45,"20010402");
		AcceptOrder acceptorderEight = new AcceptOrder(10008,004,101,135,"20010403");
		AcceptOrder acceptorderNine = new AcceptOrder(10009,003,103,65,"20010403");
		AcceptOrder acceptorderTen = new AcceptOrder(10010,001,101,290,"20010403");
		AcceptOrder acceptorderEleven = new AcceptOrder(10011,003,103,60,"20010404");
		AcceptOrder acceptorderTwelve = new AcceptOrder(10012,004,101,175,"20010404");

		//list and map
		//ArrayList<型>変数名＝new ArrayList<型>();
		ArrayList<AcceptOrder> acceptorderlist=new ArrayList<AcceptOrder>();
		acceptorderlist.add(acceptorderOne);
		acceptorderlist.add(acceptorderTwo);
		acceptorderlist.add(acceptorderThree);
		acceptorderlist.add(acceptorderFour);
		acceptorderlist.add(acceptorderFive);
		acceptorderlist.add(acceptorderSix);
		acceptorderlist.add(acceptorderSeven);
		acceptorderlist.add(acceptorderEight);
		acceptorderlist.add(acceptorderNine);
		acceptorderlist.add(acceptorderTen);
		acceptorderlist.add(acceptorderEleven);
		acceptorderlist.add(acceptorderTwelve);

		printAcceptOrder(acceptorderlist);



	}
	/**
	 * 学生の情報を印刷する
	 *
	 * @param ArrayList<AcceptOrder>
	 *            return void
	 */
	private static void printAcceptOrder(ArrayList<AcceptOrder> acceptorderlist) {
		for(AcceptOrder value:acceptorderlist) {
			System.out.print(value.toString());

		}

	}
}
