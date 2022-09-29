package Homework;

import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("Строки.");
        System.out.println("Задание 1.");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println(" ");
        System.out.println("Задание 2.");
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper);
        System.out.println(" ");
        System.out.println("Задание 3.");
        String[] fullNameWords = fullName.split(" ", 1);
        fullNameWords[0] = "Иванов Семён Семёнович";
        String joinedString = Arrays.toString(fullNameWords);
        if (joinedString.contains("ё")) {
            System.out.println("Данные ФИО сотрудника — " + joinedString.replace('ё', 'е'));
        }
    }
}
