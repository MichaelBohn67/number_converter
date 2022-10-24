package com.example.number_converter.service;

import com.example.number_converter.data.RomanNumbers;

import java.util.List;

public class RomanNumberService {
    public String convertToRoman(int number) {
        List<RomanNumbers> romanNummerals = RomanNumbers.getReverseSortedValues();
        StringBuilder result = new StringBuilder(1);
        int i = 0;
        while((number > 0) && (i < romanNummerals.size()))  {
            RomanNumbers currentSymbol = romanNummerals.get(i);
            if(currentSymbol.getI() <= number){
                result.append(currentSymbol.name());
                number -= currentSymbol.getI();
            } else {
                i++;
            }
        }
        return result.toString();
    }


}
