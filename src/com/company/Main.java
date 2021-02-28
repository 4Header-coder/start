package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*
Влад К, [28 февр. 2021 г., 17:41:51]:
2) В обычном, консольном приложении, сделать генерацию массива на 100 рандомных элементов и сделать коммит

3) Реализовать алгоритм сортировки по возрастанию и убыванию, сделать коммит в репозиторий

4) Реализовать алгоритм поиска максимального и минимального элемента в массиве, сделать коммит в репозиторий
 */
        int arr[];
        arr = new int [99];
        for (int i=0;i<arr.length;i++)
            arr[i] = (int) ( Math.random() * 99);
        for (int i: arr)
            System.out.print(i + " ");

    }

}
