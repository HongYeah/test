package test;

import java.util.Arrays;

public class Temp {
	public static void main(String[] args) {
		test1();
	}
	
	private static void test1(){
		double rs = 10 / (double)3;
		System.out.println(rs);
		System.out.println(Math.ceil(rs));
	}
	
	private static void test0(){
		String str = "a-b-c";
		String[] ss = str.split("-");
		System.out.println(Arrays.toString(ss));
	}
	private static void test3() {
		
	}
}
