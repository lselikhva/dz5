package com.company;

public class Main {

    public static void main(String[] args) {
        String fullName = "Ivanov Ivan Ivanovich";
        String forAccounting = fullName.replaceAll(" " ,"; ");
        System.out.println(forAccounting);
// четвертая задача урок со строками
        String fullName1 = "Иванов Семён Семенович";
        String newString = fullName1.replaceAll("ё","е");

        System.out.println("Данные ФИО сотрудника — " + newString);
    }
}