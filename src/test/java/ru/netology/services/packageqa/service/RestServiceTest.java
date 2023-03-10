package ru.netology.services.packageqa.service;

import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServiceTest {

    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/rest.csv")
    public void ShouldCalcRest(int income, int expenses, int threshold, int expected) {

        //@Test
        //public void ShouldCalcRest() {

        RestService service = new RestService();

        //int income = 100_000;
        //int expenses = 60_000;
        //int threshold = 150_000;
        //int expected = 2;

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }
}
