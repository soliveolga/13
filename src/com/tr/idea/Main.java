package com.like.idea;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ввести сюда текст из задания:");  // I love java 8 Я люблю java 14 core1
        String string = input.nextLine();

        Pattern p = Pattern.compile("[a-zA-Z]+");   //пункт 1
        Matcher m = p.matcher(string);
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
    }
}
