package com.everydayCode.targetcode;

import java.util.LinkedList;
import java.util.Queue;

/*
请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceSpaceStr {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("helloworld ");
        replaceSpace(str);
    }
    public static String replaceSpace(StringBuffer str) {
        StringBuffer result = new StringBuffer("");
        int index  = 0;
        Queue<String> queue = new LinkedList<String>();
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == 32){
                queue.add("%20");
            }else{
                queue.add(str.charAt(i)+"");
            }
        }
        for(String p:queue){
            result.append(p);
        }
//        String a = queue.stream().map(p -> result.append(p)).collect(Collectors.joining(""));
        return result.toString();
    }
}
