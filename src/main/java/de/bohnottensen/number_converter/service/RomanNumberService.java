package de.bohnottensen.number_converter.service;

import de.bohnottensen.number_converter.data.RomanNumeral;

import java.util.List;

public class RomanNumberService extends AbstractNumberConverter {

    static final List<RomanNumeral> ROMAN_NUMMERALS = RomanNumeral.getReverseSortedValues();
    static final int ROMAN_NUMERALS_SIZE = ROMAN_NUMMERALS.size();
    static final String ILLEGAL_ARGUMENT_EXCEPTION = "Number must be greater than 0";

    @Override
    String convertNumber(int number) {
        if(number <=0) {
            throw new IllegalArgumentException(ILLEGAL_ARGUMENT_EXCEPTION);
        }
        StringBuilder result = new StringBuilder(1);
        int i = 0;
        while(i < ROMAN_NUMERALS_SIZE)  {
            RomanNumeral currentSymbol = ROMAN_NUMMERALS.get(i);
            if(currentSymbol.getValue() <= number){
                result.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }
        return result.toString();
    }

}
