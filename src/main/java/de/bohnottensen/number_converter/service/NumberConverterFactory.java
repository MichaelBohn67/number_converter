package de.bohnottensen.number_converter.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class NumberConverterFactory {

    public static AbstractNumberConverter getNumberConverterService(String type) {
        AbstractNumberConverter converter;
        switch (type) {
            case "binary":
                converter = new BinaryNumberService();
                break;
            default:
                converter = new RomanNumberService();
                break;
        }
        return converter;
    }

}
