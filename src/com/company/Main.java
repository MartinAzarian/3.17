package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(8);

        Scanner scanner = new Scanner(System.in);
        int specifieldElement = scanner.nextInt();
        arrayList.set(2, specifieldElement);
    }
}
