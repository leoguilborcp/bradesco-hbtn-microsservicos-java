package com.example.calculator.model;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void sumTest() {
        // TODO
        Calculator calculator = new Calculator();
        Double result = calculator.sum(2.0, 3.0);
        assert result == 5.0;
    }

    @Test
    public void numbersNullSumTest() {
        // TODO
        Calculator calculator = new Calculator();
        try {
            calculator.sum(null, 3.0);
            assert false; // Deve falhar se não lançar exceção
        } catch (NullPointerException e) {
            assert e.getMessage().equals("Número 1 e número 2 são obrigatórios.");
        }
    }

    @Test
    void subTest() {
        // TODO
        Calculator calculator = new Calculator();
        Double result = calculator.sub(5.0, 3.0);
        assert result == 2.0;
    }

    @Test
    void divideTest() {
        // TODO
        Calculator calculator = new Calculator();   
        Double result = calculator.divide(10.0, 2.0);
        assert result == 5.0;
    }

    @Test
    public void divisionByZeroTest() {
        // TODO
        Calculator calculator = new Calculator();
        try {
            calculator.divide(10.0, 0.0);
            assert false; // Deve falhar se não lançar exceção
        } catch (ArithmeticException e) {
            assert e.getMessage().equals("Divisão por zero não é permitido.");
        }
    }

    @Test
    void factorialTest() {
        // TODO
        Calculator calculator = new Calculator();
        Integer result = calculator.factorial(5);
        assert result == 120;
    }

    @Test
    void integerToBinaryTest() {
        // TODO
        Calculator calculator = new Calculator();
        Integer result = calculator.integerToBinary(5);
        assert result == 101;
    }

    @Test
    void integerToHexadecimalTest() {
        // TODO
        Calculator calculator = new Calculator();
        String result = calculator.integerToHexadecimal(170);
        assert result.equals("aa");
    }

    @Test
    void calculeDayBetweenDateTest() {
        // TODO
        Calculator calculator = new Calculator();
        java.time.LocalDate date1 = java.time.LocalDate.of(2023, 1, 1); 
        java.time.LocalDate date2 = java.time.LocalDate.of(2023, 1, 15);
        int result = calculator.calculeDayBetweenDate(date1, date2);
        assert result == 14;
    }
}