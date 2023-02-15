package ru.netology.sqr;
public class SQRService {
    public int calculateSQR(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min) {
                if (i * i <= max) {
                    count = count + 1;
                }
            }
        }
        System.out.println("Количество квадратов в диапазоне " + count );
        return count;
    }
}