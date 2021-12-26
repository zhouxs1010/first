package com.example.firstdemo.mail;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UtilTest {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        List<String> list3 = new Vector<>();
        List<String> list4 = new CopyOnWriteArrayList();
        list1.add("2432342");
        list1.add("er453tre");
        list2.add("linked1");
        list2.add("linked2");
        System.out.println(list2.get(1));

        for (String s : list1) {
            System.out.println(s);
        }
        Set<String> set = new HashSet<>();
        Set<String> set2 = new TreeSet<>();
        Map<String, Object> map1 = new HashMap<>();
        Map<String, Object> map2 = new TreeMap<>();
        Map<String, Object> map3 = new Hashtable<>();
        Map<String, Object> map4 = new LinkedHashMap<>();
        Map<String, Object> map5 = new ConcurrentHashMap<>();

        System.out.println(1 << 30);

        AtomicInteger in = new AtomicInteger(10);
        int i = in.addAndGet(12);
        System.out.println(i);
        Lock lock = new ReentrantLock();

        Executors.newCachedThreadPool();
        Executors.newSingleThreadExecutor();
        Executors.newFixedThreadPool(10);
        Executors.newScheduledThreadPool(10);
    }
}

