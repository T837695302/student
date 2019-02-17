package test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BaseContent {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// addInteger(new Integer(3),new Integer(5));
		// compare(3,3);
		// compare(new Integer(3),new Integer(3));
		// compare("a", "b");
		// addlong(5l, 6l);
		// StaticClassTest.staticMethod();

		// StaticClassTest staticClassTest = new StaticClassTest();
		// staticClassTest.notStatic();
		// romove(2,10);
		// multiply(2,10);
		// divide(13,5);
		// mod(13,5);
		// add(new BigDecimal ("2"), new BigDecimal("3"));
		// subtract(new BigDecimal("2"), new BigDecimal("3"));
		// multiply(new BigDecimal("2"), new BigDecimal("3"));
		// multiply(new BigDecimal("2.2"), new BigDecimal("3.3"));
		// divide(new BigDecimal("4"), new BigDecimal("2"));
		// equals(new BigDecimal("4.0"), new BigDecimal("4"));
		// test();
		// logicNot(false);

		//
		// vipjisan(true, 500);
		// vipjisan(false, 500);

		// logicAnd(false, false);
		// logicAnd(false, true);
		// logicAnd(true, false);
		// logicAnd(true, true);

		// logicOr(false, false);
		// logicOr(false, true);
		// logicOr(true, false);
		// logicOr(true, true);

		ifMethod(true, false,true);

	}

	private static void add(int num1, int num2) {

		int total = num1 + num2;

		System.out.println("パラメータ1:" + num1);
		System.out.println("パラメータ2:" + num2);
		System.out.println("計算結果:" + total);
	}

	private static void addInteger(Integer num1, Integer num2) {

		int total = num1 + num2;

		System.out.println("パラメータ1:" + num1);
		System.out.println("パラメータ2:" + num2);
		System.out.println("計算結果:" + total);

	}

	private static void addlong(Long l1, Long l2) {
		long total = l1 + l2;

	}

	private static void compare(Integer num1, Integer num2) {
		if (num1 == num2) {
			System.out.println("一致");
		} else {
			System.out.println("不一致");
		}
	}

	private static void compare(String str1, String str2) {
		if (str1.equals(str2)) {
			System.out.println("一致");
		} else {
			System.out.println("不一致");
		}
	}
	// 以上の方法はすべて掛け算の計算し方、integer、数字など，不光是數字，還有字符串

	private static void romove(int num1, int num2) {
		int returnNum = num1 - num2;
		System.out.println("計算結果:" + returnNum);
	}
	// 以上の方法はマイナスの計算し方

	private static void multiply(int num1, int num2) {

		int returnNum = num1 * num2;
		System.out.println("計算結果:" + returnNum);
	}
	// 以上是乘法的算法

	private static void divide(int num1, int num2) {
		int returnNum = num1 / num2;
		System.out.println("divide計算結果:" + returnNum);
	}

	// 以上是除法的算法，divide：除法{且是整除}
	private static void mod(int num1, int num2) {
		int returnNum = num1 % num2;
		System.out.println("mod計算結果:" + returnNum);
	}

	private static void add(BigDecimal num1, BigDecimal num2) {
		BigDecimal returnNum = num1.add(num2);
		System.out.println("add計算結果:" + returnNum);
	}

	private static void subtract(BigDecimal num1, BigDecimal num2) {
		BigDecimal returnNum = num1.subtract(num2);
		System.out.println("subtract計算結果:" + returnNum);
	}

	private static void multiply(BigDecimal num1, BigDecimal num2) {
		BigDecimal returnNum = num1.multiply(num2);
		System.out.println("multiply計算結果:" + returnNum);
	}

	private static void divide(BigDecimal num1, BigDecimal num2) {
		BigDecimal returnNum = num1.divide(num2, 2, RoundingMode.HALF_UP);
		System.out.println("divide計算結果:" + returnNum);
	}

	private static void equals(BigDecimal num1, BigDecimal num2) {
		if (num1.compareTo(num2) == 0) {
			System.out.println("same");
		} else
			System.out.println("not same");
	}
	// 以上にあるbigDecimal付きのは精密計算の仕方である

	// private static void beforeAddAdd() {
	//
	// System.out.println("beforeAddAdd..............Start");
	// for (int i = 0; i < 0; ++i) {
	// System.out.println("i=:" + i);
	// }
	// System.out.println("beforeAddAdd..............End");
	// }
	//
	// private static void afterAddAdd() {
	//
	// System.out.println("afterAddAdd..............Start");
	// for (int i = 0; i < 0; i++) {
	// System.out.println("i=:" + i);
	// }
	// System.out.println("afterAddAdd..............End");
	// }
	private static void test() {
		int d = 25;
		System.out.println("d--" + (d--));
		System.out.println("--d" + (--d));

	}

	private static void logicNot(boolean flag) {

		if (!flag) {
			System.out.println(flag + "非運算結果" + "true");
		} else
			System.out.println(flag + "非運算結果" + "false");
	}

	/**
	 * VIPであると、1に戻す。VIPじゃないと、０に戻す。
	 *
	 * @param vipFlag
	 * @param boolean
	 *            num VIPであると、1に戻す。VIPじゃないと、０に戻す。 １ true,0 false
	 */
	private static void vipjisan(boolean vipFlag, double num) {
		double cost = 0;
		if (vipFlag) {
			cost = num * 0.8;
		} else {
			cost = num;
		}
		System.out.println("all cost" + cost);

	}

	private static void logicAnd(boolean flag1, boolean flag2) {
		if (flag1 && flag2) {
			System.out.println("与運算結果" + true);
		} else {
			System.out.println("与運算結果" + false);
		}
	}

	private static void logicOr(boolean flag1, boolean flag2) {
		if (flag1 || flag2) {
			System.out.println("与運算結果" + true);
		} else {
			System.out.println("与運算結果" + false);
		}
	}

	private static void ifMethod(boolean... flags) {

		if (flags[0]) {
			if(flags[2]) {
				System.out.println("diyige he disange shi true");
			}
			System.out.println("diyige shi true");
		} else if (flags[1]) {
			System.out.println("dierge shi true");
		} else {
			System.out.println("suo you dou shi false");
		}
	}

}