package com.cursor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class MyHashSet {

    public void task1() {
        System.out.println("\nTask 1");
        HashSet<Integer> set = new HashSet<>();
        set.add(14);
        set.add(24);
        set.add(74);
        System.out.println(set);
    }

    public void task2() {
        System.out.println("\nTask 2");
        HashSet<Integer> set = new HashSet<>();
        set.add(14);
        set.add(24);
        set.add(74);
        for (Integer i : set) {
            System.out.print(i + " ");
        }
    }

    public void task3() {
        System.out.println("\nTask 3");
        HashSet<Integer> set = new HashSet<>();
        set.add(14);
        set.add(24);
        set.add(74);
        System.out.println(set.size());
    }

    public void task4() {
        System.out.println("\nTask 4");
        HashSet<Integer> set = new HashSet<>();
        set.add(14);
        set.add(24);
        set.add(74);
        System.out.println(set);
        set.clear();
        System.out.println(set);
    }

    public void task5() {
        System.out.println("\nTask 5");
        HashSet<Integer> set = new HashSet<>();
        if (set.isEmpty()) {
            System.out.println("HashSet is empty");
        } else {
            System.out.println("HashSet contains such elements: " + set);
        }
        set.add(14);
        set.add(24);
        set.add(74);
        if (set.isEmpty()) {
            System.out.println("HashSet is empty");
        } else {
            System.out.println("HashSet contains such elements: " + set);
        }
    }

    public void task6() {
        System.out.println("\nTask 6");
        HashSet<Integer> set = new HashSet<>();
        set.add(14);
        set.add(24);
        set.add(74);
        System.out.println(set);
        HashSet<Integer> anotherSet = (HashSet<Integer>) set.clone();
        System.out.println(anotherSet);
    }

    public void task7() {
        System.out.println("\nTask 7");
        HashSet<Integer> set = new HashSet<>();
        set.add(14);
        set.add(24);
        set.add(74);
        System.out.println(set);
        Integer[] array = (Integer[]) set.toArray();
        System.out.println("Array:");
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void task8() {
        System.out.println("\nTask 8");
        HashSet<Integer> set = new HashSet<>();
        set.add(14);
        set.add(24);
        set.add(74);
        System.out.println(set);
        TreeSet<Integer> treeSet = new TreeSet<>(set);
        System.out.println(treeSet);
    }

    public void task9() {
        System.out.println("\nTask 9");
        HashSet<Integer> set = new HashSet<>();
        set.add(14);
        set.add(24);
        set.add(74);
        System.out.println(set);
        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
    }

    public void task10() {
        System.out.println("\nTask 10");
        HashSet<Integer> set = new HashSet<>();
        set.add(14);
        set.add(24);
        set.add(74);
        System.out.println(set);
        HashSet<Integer> anotherSet = new HashSet<>();
        anotherSet.add(14);
        anotherSet.add(24);
        anotherSet.add(74);
        System.out.println(set.equals(anotherSet));
    }

    public void task11() {
        System.out.println("\nTask 11");
        HashSet<Integer> set = new HashSet<>();
        set.add(14);
        set.add(24);
        set.add(74);
        System.out.println(set);
        HashSet<Integer> anotherSet = new HashSet<>();
        anotherSet.add(43);
        anotherSet.add(24);
        anotherSet.add(71);
        System.out.println(anotherSet);
        set.retainAll(anotherSet);
        System.out.println(set);
    }

    public void task12() {
        System.out.println("\nTask 11");
        HashSet<Integer> set = new HashSet<>();
        set.add(14);
        set.add(24);
        set.add(74);
        System.out.println(set);
        set.clear();
        System.out.println(set);
    }
}
