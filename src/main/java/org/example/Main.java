package org.example;

import ru.netology.sqr.services.SQRService;

public class Main {
    public static void main(String[] args) {
        int finish = 99;
        int start = 10;

        SQRService calcResult = new SQRService();
        int result = calcResult.calcSQR(finish, start);
        System.out.println(" Количество " + result);
    }
}