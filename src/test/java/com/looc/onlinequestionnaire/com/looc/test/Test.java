package com.looc.onlinequestionnaire.com.looc.test;

/**
 * @program online-questionnaire
 * @description:
 * @author: Shanice
 * @create: 2019/06/19 21:37
 */
public class Test {
    public static void main(String[] args) {
        String name = "a`b`c`hahah`zhegs`b`c";
        String[] split = name.split("`");

        for (String s : split) {
            System.out.print(s+"    ");
        }

    }
}
