package de.bohnottensen.number_converter.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumberServiceTest {

    private final RomanNumberService service = new RomanNumberService();

    @Test
    void givenDecimalOneReturnI(){
        String result = service.convertNumber(1);

        assertEquals("I", result);
    }

    @Test
    void givenDecimalThreeReturnIII(){
        String result = service.convertNumber(3);

        assertEquals("III", result);
    }

    @Test
    void givenDecimal28ReturnXXVIII(){
        String result = service.convertNumber(28);

        assertEquals("XXVIII", result);
    }

    @Test
    void givenDecimal1952ReturnXXVIII(){
        String result = service.convertNumber(1952);

        assertEquals("MCMLII", result);
    }

    @Test
    void givenDecimal3001ReturnMMMI(){
        String result = service.convertNumber(3001);

        assertEquals("MMMI", result);
    }

    @Test
    void givenDecimal0ReturnEmptyString(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            service.convertNumber(0);
        });

        String expectedMessage = "Number must be greater than 0";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
