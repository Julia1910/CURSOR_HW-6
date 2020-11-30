package com.cursor;

import java.util.TreeSet;

public class MyTreeSet {

    public void task1() {
        System.out.println("\nTask 1");
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Black");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Yellow");
        System.out.println(colors);
    }

    public void task2() {
        System.out.println("\nTask 2");
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Black");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Yellow");
        for (String color : colors) {
            System.out.print(color + " ");
        }
    }

    public void task3() {
        System.out.println("\nTask 3");
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Black");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Yellow");
        System.out.println(colors);
        TreeSet<String> treeSet = new TreeSet<>(colors);
        System.out.println(treeSet);
    }

    public void task4() {
        System.out.println("\nTask 4");
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Black");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Yellow");
        System.out.println(colors);
        colors = (TreeSet<String>) colors.descendingSet();
        System.out.println(colors);
    }

    public void task5() {
        System.out.println("\nTask 5");
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Black");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Yellow");
        System.out.println(colors);
        System.out.println("First: " + colors.first());
        System.out.println("Last: " + colors.last());
    }

    public void task6() {
        System.out.println("\nTask 6");
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Black");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Yellow");
        System.out.println(colors);
    }

    public void task7() {
        System.out.println("\nTask 7");
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Black");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Yellow");
        System.out.println("Size: " + colors.size());
    }

    public void task8() {
        System.out.println("\nTask 8");
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Black");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Yellow");
        System.out.println(colors);
        TreeSet<String> colors1 = new TreeSet<>();
        colors1.add("Red");
        colors1.add("Black");
        colors1.add("Pink");
        colors1.add("Yellow");
        colors1.add("Purple");
        System.out.println(colors1);
        System.out.println(colors.equals(colors1));
    }

    public void task9() {
        System.out.println("\nTask 9");
        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(14);
        integers.add(4);
        integers.add(5);
        integers.add(8);
        System.out.println(integers);
        integers.stream().filter(i -> i > 7).forEach(System.out::println);
    }

    public void task10() {
        System.out.println("\nTask 10");
        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(14);
        integers.add(4);
        integers.add(5);
        integers.add(8);
        System.out.println(integers);
        System.out.println("Greater than or equal to 6 : " + integers.ceiling(6));
        System.out.println("Greater than or equal to 4 : " + integers.ceiling(4));
    }

    public void task11() {
        System.out.println("\nTask 11");
        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(14);
        integers.add(4);
        integers.add(5);
        integers.add(8);
        System.out.println(integers);
        System.out.println("Less than or equal to 6 : " + integers.floor(6));
        System.out.println("Less than or equal to 4 : " + integers.floor(4));
    }

    public void task12() {
        System.out.println("\nTask 12");
        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(14);
        integers.add(4);
        integers.add(5);
        integers.add(8);
        System.out.println(integers);
        System.out.println("Strictly greater to 5 : " + integers.higher(5));
        System.out.println("Strictly greater to 14 : " + integers.higher(14));
    }

    public void task13() {
        System.out.println("\nTask 13");
        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(14);
        integers.add(4);
        integers.add(5);
        integers.add(8);
        System.out.println(integers);
        System.out.println("Strictly less to 5 : " + integers.lower(4));
        System.out.println("Strictly less to 14 : " + integers.lower(14));
    }

    public void task14() {
        System.out.println("\nTask 14");
        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(14);
        integers.add(4);
        integers.add(5);
        integers.add(8);
        System.out.println(integers);
        System.out.println(integers.pollFirst());
        System.out.println(integers);
    }

    public void task15() {
        System.out.println("\nTask 15");
        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(14);
        integers.add(4);
        integers.add(5);
        integers.add(8);
        System.out.println(integers);
        System.out.println(integers.pollLast());
        System.out.println(integers);
    }

    public void task16() {
        System.out.println("\nTask 16");
        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(14);
        integers.add(4);
        integers.add(5);
        integers.add(8);
        System.out.println(integers);
        System.out.println(integers.remove(5));
        System.out.println(integers);
    }
}
