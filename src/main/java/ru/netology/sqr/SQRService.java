package ru.netology.sqr;

public class SQRService {
    public int calculateNumberSquares(int number1, int number2) {
        int account = 0;
        for (int i = 10; i < 99; i++) {
            if (i * i >= number1 && i * i <= number2) {
                account++;
            }

        }
        return account;
    }
}
