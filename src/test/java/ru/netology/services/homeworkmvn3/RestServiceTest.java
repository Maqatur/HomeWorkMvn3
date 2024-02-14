package ru.netology.services.homeworkmvn3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/rest.csv")
    public void testForaFreelancer(int expected, int income, int expenses, int threshold) {

        RestService service = new RestService();
        int actual = service.calcRest(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

}
