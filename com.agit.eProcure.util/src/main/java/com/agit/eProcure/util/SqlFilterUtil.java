package com.agit.eProcure.util;

public class SqlFilterUtil {

    public static String bothLike(String input) {
        return "%".concat((input==null?"":input.trim()).concat("%"));
    }
    public static String leftLike(String input) {
        return "%".concat((input==null?"":input.trim()));
    }
    public static String rightLike(String input) {
        return (input==null?"":input.trim()).concat("%");
    }
    
}
