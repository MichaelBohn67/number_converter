package de.bohnottensen.number_converter.data;

import lombok.Getter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public enum RomanNumbers {

    I(1),
    IV(4),
    V(5),
    IX(9),
    X(10),
    L(50),
    XC(90),
    C(100),
    CD(400),
    D(500),
    CM(900),
    M(1000);

    private final int i;

    RomanNumbers(int i) {
        this.i = i;
    }

    public static List<RomanNumbers> getReverseSortedValues() {
        return Arrays.stream(values())
                .sorted(Comparator.comparing((RomanNumbers e) -> e.i).reversed())
                .collect(Collectors.toList());
    }
}
