package de.bohnottensen.number_converter.service;

public class BinaryNumberService extends AbstractNumberConverter {

    @Override
    public String convertNumber(int number) {
        StringBuilder sb = new StringBuilder(1);

        while (number > 0) {
            sb.append(number % 2);
            number = number / 2;
        }

        return sb.reverse().toString();
    }

}
