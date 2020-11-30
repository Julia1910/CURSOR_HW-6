package com.cursor;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class View {
    private Map<String, String> menu;
    private Map<String, Printable> methodsMenu;
    private Scanner input = new Scanner(System.in);

    public View() {
        menu = new LinkedHashMap<>();
        menu.put("1", "1 - Work with MyArrayList");
        menu.put("2", "2 - Work with MyLinkedList");
        menu.put("3", "3 - Work with MyHashSet");
        menu.put("4", "4 - Work with MyTreeSet");
        menu.put("Q", "Q - Exit");

        methodsMenu = new LinkedHashMap<>();
        methodsMenu.put("1", this::pressButton1);
        methodsMenu.put("2", this::pressButton2);
        methodsMenu.put("3", this::pressButton3);
        methodsMenu.put("4", this::pressButton4);

    }


    public void pressButton1() {
        System.out.println("Choose task from 1 to 22");
        int number = input.nextInt();
        MyArrayList list = new MyArrayList();
        String function = "task" + number;
        Method method;
        try {
            method = list.getClass().getMethod(function);
            method.invoke(list);
        } catch (SecurityException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
        }

    }

    public void pressButton2() {
        System.out.println("Choose task from 1 to 26");
        int number = input.nextInt();
        MyLinkedList list = new MyLinkedList();
        String function = "task" + number;
        Method method;
        try {
            method = list.getClass().getMethod(function);
            method.invoke(list);
        } catch (SecurityException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
        }

    }

    public void pressButton3() {
        System.out.println("Choose task from 1 to 12");
        int number = input.nextInt();
        MyHashSet set = new MyHashSet();
        String function = "task" + number;
        Method method;
        try {
            method = set.getClass().getMethod(function);
            method.invoke(set);
        } catch (SecurityException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
        }

    }

    public void pressButton4() {
        System.out.println("Choose task from 1 to 16");
        int number = input.nextInt();
        MyTreeSet set = new MyTreeSet();
        String function = "task" + number;
        Method method;
        try {
            method = set.getClass().getMethod(function);
            method.invoke(set);
        } catch (SecurityException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
        }

    }


    private void outputMenu() {
        System.out.println("\nMENU:");
        for (String str : menu.values()) {
            System.out.println(str);
        }
    }

    public void show() {
        String keyMenu;
        do {
            outputMenu();
            System.out.println("Please, select menu point.");
            keyMenu = input.nextLine().toUpperCase();
            try {
                methodsMenu.get(keyMenu).print();
            } catch (Exception e) {
            }
        } while (!keyMenu.equals("Q"));
    }

}
