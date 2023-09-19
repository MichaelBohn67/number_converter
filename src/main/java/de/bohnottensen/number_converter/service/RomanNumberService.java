package de.bohnottensen.number_converter.service;

import de.bohnottensen.number_converter.data.RomanNumeral;

import java.util.List;

public class RomanNumberService extends AbstractNumberConverter {
    @Override
    String convertNumber(int number) {
        List<RomanNumeral> romanNummerals = RomanNumeral.getReverseSortedValues();
        StringBuilder result = new StringBuilder(1);
        int i = 0;
        while((number > 0) && (i < romanNummerals.size()))  {
            RomanNumeral currentSymbol = romanNummerals.get(i);
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
