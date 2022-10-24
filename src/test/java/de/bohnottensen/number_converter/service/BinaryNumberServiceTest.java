package de.bohnottensen.number_converter.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryNumberServiceTest {
    
    private final BinaryNumberService service = new BinaryNumberService();

    @Test
    void givenDecimalOneReturnI(){
        String result = service.convertNumber(1);

        assertEquals("1", result);
    }

    @Test
    void givenDecimalThreeReturnIII(){
        String result = service.convertNumber(3);

        assertEquals("11", result);
    }

    @Test
    void givenDecimal28ReturnXXVIII(){
        String result = service.convertNumber(28);

        assertEquals("11100", result);
    }

    @Test
    void givenDecimal1952ReturnXXVIII(){
        String result = service.convertNumber(255);

        assertEquals("11111111", result);
    }

}
