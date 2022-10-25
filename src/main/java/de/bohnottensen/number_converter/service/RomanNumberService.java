package de.bohnottensen.number_converter.service;

import de.bohnottensen.number_converter.data.RomanNumeral;

import java.util.List;

public class RomanNumberService extends AbstractNumberConverter {
    @Override
    String convertNumber(int number) {
        return null;
    }

    public int convertNumber(String input) {
        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();
        String romanNumeral = input.toUpperCase();
        int result = 0;


        int i = 0;

        while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
            RomanNumeral symbol = romanNumerals.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }

        if (romanNumeral.length() > 0) {
            throw new IllegalArgumentException(input + " cannot be converted to a Roman Numeral");
        }

        return result;
    }
}
