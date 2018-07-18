package cn.colg;

import java.util.ArrayList;
import java.util.List;

/**
 * 部门Mapper 测试
 *
 * @author colg
 */
public class HelloWorld {

    private static String message;

    public static void main(String[] args) {
        System.out.println("hello world");

        List<String> list = new ArrayList<>();
        list.add("aaa");
        if (null == list) {
            System.out.println("a");
        }

    }

    private static void test(String message) {
        System.out.println(message);
    }

    private static void test2() {
        System.out.println("test2");
    }

    private String userName;

}
