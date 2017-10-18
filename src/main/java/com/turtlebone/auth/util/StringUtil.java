package com.turtlebone.auth.util;

public class StringUtil {
	public static boolean isEmpty(String str) {
		return str == null || str.trim().length() == 0;
	}
	public static String getString(String str) {
		return isEmpty(str) ? "" : str;
	}
}
