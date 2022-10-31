package ru.netology.sqr.services;

public class SQRService {
    public int calcSQR(int finish, int start) {
        int result = 0;
        for (int i = 1; i <= finish; i++) {
            if (i * i >= start & i * i <= finish) {
                result = result + 1;
            }
        }
        return result;
    }
}
