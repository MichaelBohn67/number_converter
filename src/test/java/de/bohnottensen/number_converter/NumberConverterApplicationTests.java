package de.bohnottensen.number_converter;

import de.bohnottensen.number_converter.service.NumberConverterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

@SpringBootTest
class NumberConverterApplicationTests {

    @Autowired
    private NumberConverterService service;

    @Autowired
    private NumberConverterApplication numberConverterApplication;

    @Test
    void contextLoads() {
        assertThat(service, notNullValue());
        assertThat(numberConverterApplication, notNullValue());
    }

}
