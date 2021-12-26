package com.example.firstdemo.mail;

import com.example.firstdemo.test.AnnotationTest;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("2432342");
        list.add("er453tre");

        for (String s : list) {
            System.out.println(s);
        }
        Collections.sort(list);
        Runnable run1 = () -> System.out.println("32423543543");
        run1.run();
        Class clazz = Test.class;
        Test t = new Test();
        Class cc = t.getClass();
        Method[] methods = clazz.getMethods();
        for (Method me : methods) {
            if (me.isAnnotationPresent(AnnotationTest.class)) {
                System.out.println(me.getAnnotation(AnnotationTest.class).value());
            }
        }

    }

    @AnnotationTest(value = "123rwer")
    public void test() {

    }
}

class Student {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
