package com.cursor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class MyLinkedList {

    public void task1() {
        System.out.println("\nTask 1");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.addLast(25);
        System.out.println(list);
    }

    public void task2() {
        System.out.println("\nTask 2");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    public void task3() {
        System.out.println("\nTask 3");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        System.out.println(list);
        for (int i = 1; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public void task4() {
        System.out.println("\nTask 4");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        System.out.println(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    public void task5() {
        System.out.println("\nTask 5");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        System.out.println(list);
        list.add(1, 27);
        System.out.println(list);
    }

    public void task6() {
        System.out.println("\nTask 6");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        System.out.println(list);
        list.addFirst(2);
        list.addLast(4);
        System.out.println(list);
    }

    public void task7() {
        System.out.println("\nTask 7");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        System.out.println(list);
        System.out.println(list.offerFirst(0));
        System.out.println(list);
    }

    public void task8() {
        System.out.println("\nTask 8");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        System.out.println(list);
        System.out.println(list.offerLast(0));
        System.out.println(list);
    }

    public void task9() {
        System.out.println("\nTask 9");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        System.out.println(list);
        list.add(0, 17);
        list.add(3, 99);
        System.out.println(list);
    }

    public void task10() {
        System.out.println("\nTask 10");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
    }

    public void task11() {
        System.out.println("\nTask 11");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + ")" + list.get(i) + " ");
        }
    }

    public void task12() {
        System.out.println("\nTask 12");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        System.out.println(list);
        System.out.println(list.remove(0));
        System.out.println(list);
    }

    public void task13() {
        System.out.println("\nTask 13");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);
    }

    public void task14() {
        System.out.println("\nTask 14");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }

    public void task15() {
        System.out.println("\nTask 15");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        System.out.println(list);
        Collections.swap(list, 0, 2);
        System.out.println(list);
    }

    public void task16() {
        System.out.println("\nTask 16");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        list.add(2);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }

    public void task17() {
        System.out.println("\nTask 17");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        list.add(2);
        System.out.println(list);
        LinkedList<Integer> anotherList = new LinkedList<>();
        anotherList.add(127);
        anotherList.add(19);
        anotherList.add(25);
        list.addAll(anotherList);
        System.out.println(list);
    }

    public void task18() {
        System.out.println("\nTask 18");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        list.add(2);
        System.out.println(list);
        LinkedList<Integer> clonedList = (LinkedList<Integer>) list.clone();
        System.out.println(clonedList);
    }

    public void task19() {
        System.out.println("\nTask 19");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        list.add(2);
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list);
    }

    public void task20() {
        System.out.println("\nTask 20");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        list.add(2);
        System.out.println(list);
        System.out.println(list.peekFirst());
    }

    public void task21() {
        System.out.println("\nTask 21");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        list.add(2);
        System.out.println(list);
        System.out.println(list.peekLast());
    }

    public void task22() {
        System.out.println("\nTask 22");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        list.add(2);
        System.out.println(list);
        if (list.contains(2)) {
            System.out.println("List contains this element");
        } else {
            System.out.println("There is no such element");
        }
    }

    public void task23() {
        System.out.println("\nTask 23");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        list.add(2);
        System.out.println(list);
        ArrayList<Integer> convertList = new ArrayList<>(list);
        System.out.println(convertList);
    }

    public void task24() {
        System.out.println("\nTask 24");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        list.add(2);
        System.out.println(list);
        LinkedList<Integer> anotherList = new LinkedList<>();
        anotherList.add(114);
        anotherList.add(72);
        anotherList.add(2);
        anotherList.add(91);
        System.out.println(anotherList);
        System.out.println(list.equals(anotherList));
    }

    public void task25() {
        System.out.println("\nTask 25");
        LinkedList<Integer> list = new LinkedList<>();
        if (list.isEmpty()) {
            System.out.println("LinkedList is empty");
        } else {
            System.out.println("LinkedList has such element: " + list);
        }
        list.add(114);
        list.add(72);
        list.add(91);
        list.add(2);
        if (list.isEmpty()) {
            System.out.println("LinkedList is empty");
        } else {
            System.out.println("LinkedList has such element: " + list);
        }
    }

    public void task26() {
        System.out.println("\nTask 26");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(114);
        list.add(72);
        list.add(91);
        list.add(2);
        System.out.println(list);
        list.set(3, 0);
        System.out.println(list);
    }
}
