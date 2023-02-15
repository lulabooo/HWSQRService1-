package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    SQRService sqrService = new SQRService();

    @Test
    void calculateSQOne() {
        int expected = 3;
        int actual = sqrService.calculateSQR(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    void calculateSQRTwo() {

        int expected = 0;
        int actual = sqrService.calculateSQR(10, 99);
        assertEquals(expected, actual);

    }

    @Test
    void calculateSQRThree() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = sqrService.calculateSQR(100, 100);
        assertEquals(expected, actual);
    }

    @Test
    void calculateSQRFour() {
        SQRService service = new SQRService();

        int expected = 22;
        int actual = sqrService.calculateSQR(100, 1_000);

        assertEquals(expected, actual);
    }
}
