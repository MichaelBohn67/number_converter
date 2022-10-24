package de.bohnottensen.number_converter.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberConverterService {

    @GetMapping("/binary/{number}")
    public String convertIntegerToBinary(@PathVariable int number) {
        BinaryNumberService service = new BinaryNumberService();
        return service.convertNumber(number);
    }

    @GetMapping("/roman/{number}")
    public String convertIntegerToRoman(@PathVariable int number) {
        RomanNumberService service = new RomanNumberService();
        return service.convertNumber(number);
    }
}
