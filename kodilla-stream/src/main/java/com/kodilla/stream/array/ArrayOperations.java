package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        return IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();



        //metoda powinna:
        //- przy pomocy strumienia IntStream oraz metody range(int startInclusive, int endExclusive)
        // wyświetlić kolejne elementy tablicy, a następni
        // - przy pomocy drugiego strumienia IntStream oraz metody range(int startInclusive, int endExclusive),
        // a także kolektora average() obliczyć średnią. Na końcu metoda powinna zwracać średnią jako wynik typu double.
    }
}
