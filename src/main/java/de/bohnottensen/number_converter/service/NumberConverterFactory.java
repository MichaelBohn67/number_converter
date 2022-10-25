package de.bohnottensen.number_converter.service;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NumberConverterFactory {

    public static AbstractNumberConverter getNumberConverterService(String type) {
        AbstractNumberConverter converter;
        switch (type) {
            case "binary":
                converter = new BinaryNumberService();
                break;
            case "decimal":
                converter = new DecimalNumberService();
                break;
            default:
                converter = new RomanNumberService();
                break;
        }
        return converter;
    }
}
