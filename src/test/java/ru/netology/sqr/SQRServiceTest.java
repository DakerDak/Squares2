package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"first range,200,300,3",
            "second range,100,120,1",
            "third range,9409,9604,2",
            "fourth range,0,99,0",
            "fifth range,9605,10000,0"})
    public void shouldCalculateNumberSquares(String testName, int number1, int number2, int expected) {
        SQRService service = new SQRService();

        int actual = service.calculateNumberSquares(number1, number2);
        assertEquals(expected, actual);
    }


}

//
//package ru.netology.sqr;
//
//        import org.junit.jupiter.api.Test;
//
//        import static org.junit.jupiter.api.Assertions.*;
//
//class SQRServiceTest {
//    @Test
//    public void shouldCalculateNumberSquares() {
//        SQRService service = new SQRService();
//        int number1 = 200;
//        int number2 = 300;
//        int expected = 3;
//        int actual = service.calculateNumberSquares(number1, number2);
//        assertEquals(expected, actual);
//    }
//
//
//}