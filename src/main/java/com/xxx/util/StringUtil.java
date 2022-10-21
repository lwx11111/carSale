package com.xxx.util;

public class StringUtil {
    public boolean isEmpty(String str){
        if(str==null||str.trim().equals("")){
            return true;
        }
        return false;
    }
}
