package com.rays.projects;

public class Question16 {
	public static void main(String[] args) {

		int[] number = { 10, 26, 45, 78, 56 };
		maxValue(number);
	}

	public static void maxValue(int[] n) {
		int y = 0;
		int x = n[0];

		for (int i = 0; i < n.length; i++) {
			if (n[i] > x) {
				y = x;
				x = n[i];
			} else if (n[i] > y && n[i] < x) {
				y = n[i];

			}
		}
		System.out.println(y);
	}
}
