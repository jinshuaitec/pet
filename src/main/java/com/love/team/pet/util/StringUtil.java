package com.love.team.pet.util;

/**
 * @author PC
 */
public class StringUtil {

	public static boolean isNotEmpty(String str){
		return !isEmpty(str);
	}

	public static boolean isEmpty(CharSequence cs) {
		return cs == null || cs.length() == 0;
	}

}
