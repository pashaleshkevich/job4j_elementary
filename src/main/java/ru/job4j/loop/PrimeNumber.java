package ru.job4j.loop;

import static ru.job4j.loop.CheckPrimeNumber.check;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
           if (check(number)) {
                count++;
            }
        }
        return count;
    }
}
