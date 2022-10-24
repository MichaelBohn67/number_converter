package de.bohnottensen.number_converter.service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberConverterService {

    @PostMapping("/binary/{number}")
    public String convertIntegerToBinary(@RequestParam int number) {
        BinaryNumberService service = new BinaryNumberService();
        return service.convertNumber(number);
    }

    @PostMapping("/roman/{number}")
    public String convertIntegerToRoman(@RequestParam int number) {
        RomanNumberService service = new RomanNumberService();
        return service.convertNumber(number);
    }
}
