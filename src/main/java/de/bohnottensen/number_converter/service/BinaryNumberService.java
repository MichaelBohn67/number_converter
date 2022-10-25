package de.bohnottensen.number_converter.service;

public class BinaryNumberService extends AbstractNumberConverter {
    public String convertNumber(int number) {
        StringBuilder sb = new StringBuilder(1);

        while (number > 0) {
            sb.append(number % 2);
            number = number / 2;
        }

        return sb.reverse().toString();
    }

    @Override
    int convertNumber(String number) {
        return 0;
    }
}
