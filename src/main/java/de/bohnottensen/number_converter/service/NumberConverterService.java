package de.bohnottensen.number_converter.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberConverterService {

    @GetMapping("/convert/{number}/{type}")
    public String convertIntegerToBinary(@PathVariable int number, @PathVariable String type) {
        AbstractNumberConverter service = NumberConverterFactory.getNumberConverterService(type);
        return service.convertNumber(number);
    }

}
