package com.cursor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyArrayList {

    public void task1() {
        System.out.println("Task 1");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        System.out.println(colors);
    }

    public void task2() {
        System.out.println("\nTask 2");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        for (String i : colors) {
            System.out.print(i + " ");
        }
    }

    public void task3() {
        System.out.println("\nTask 3");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        System.out.println(colors);
        colors.add(0, "White");
        System.out.println(colors);
    }

    public void task4() {
        System.out.println("\nTask 4");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        System.out.println(colors.get(2));
    }

    public void task5() {
        System.out.println("\nTask 5");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        System.out.println(colors);
        colors.set(3, "White");
        System.out.println(colors);
    }

    public void task6() {
        System.out.println("\nTask 6");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        System.out.println(colors);
        System.out.println(colors.remove(2));
        System.out.println(colors);
    }

    public void task7() {
        System.out.println("\nTask 7");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        if (colors.contains("Blue")) {
            System.out.println("Element is found");
        } else {
            System.out.println("There is no such element");
        }
    }

    public void task8() {
        System.out.println("\nTask 8");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        System.out.println(colors);
        Collections.sort(colors);
        System.out.println(colors);
    }

    public void task9() {
        System.out.println("\nTask 9");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        System.out.println(colors);
        ArrayList<String> copyColors = new ArrayList<>();
        Collections.copy(copyColors, colors);
        System.out.println(copyColors);

    }

    public void task10() {
        System.out.println("\nTask 10");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        System.out.println(colors);
        Collections.shuffle(colors);
        System.out.println(colors);
    }

    public void task11() {
        System.out.println("\nTask 11");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        System.out.println(colors);
        Collections.reverse(colors);
        System.out.println(colors);
    }

    public void task12() {
        System.out.println("\nTask 12");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        System.out.println(colors);
        List<String> portion = colors.subList(0, 2);
        System.out.println(portion);
    }

    public void task13() {
        System.out.println("\nTask 13");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        System.out.println(colors);
        ArrayList<String> colors2 = new ArrayList<>();
        colors2.add("Red");
        colors2.add("Green");
        colors2.add("Yellow");
        colors2.add("Black");
        colors2.add("Orange");
        System.out.println(colors.equals(colors2));
    }

    public void task14() {
        System.out.println("\nTask 14");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        System.out.println(colors);
        Collections.swap(colors, 0, 4);
        System.out.println(colors);
    }

    public void task15() {
        System.out.println("\nTask 15");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        System.out.println(colors);
        ArrayList<String> colors2 = new ArrayList<>();
        colors2.add("Pink");
        colors2.add("White");
        System.out.println(colors2);
        colors.addAll(colors2);
        System.out.println(colors);
    }

    public void task16() {
        System.out.println("\nTask 16");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        System.out.println(colors);
        ArrayList<String> colorsClone = (ArrayList<String>) colors.clone();
        System.out.println(colorsClone);
    }

    public void task17() {
        System.out.println("\nTask 17");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        System.out.println(colors);
        colors.clear();
        System.out.println(colors);
    }

    public void task18() {
        System.out.println("\nTask 18");
        ArrayList<String> colors = new ArrayList<>();
        if (colors.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList isn't empty: " + colors);
        }
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        if (colors.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList isn't empty: " + colors);
        }
    }

    public void task19() {
        System.out.println("\nTask 19");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        System.out.println(colors.size());
        colors.trimToSize();
        System.out.println(colors.size());
    }

    public void task20() {
        System.out.println("\nTask 20");
        ArrayList<String> colors = new ArrayList<>(5);
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        System.out.println(colors.size());
        colors.ensureCapacity(7);
        colors.add("Pink");
        colors.add("White");
        System.out.println(colors.size());
    }

    public void task21() {
        System.out.println("\nTask 21");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        System.out.println(colors);
        colors.set(1, "White");
        System.out.println(colors);
    }

    public void task22() {
        System.out.println("\nTask 22");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");
        colors.add("Green");
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(i + "." + colors.get(i) + " ");
        }
        System.out.println();
    }


}
