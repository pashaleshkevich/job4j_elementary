package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int index = 1; index < input.length(); index++) {
            if (symbol == input.charAt(index)) {
                counter++;
            } else {
                result = result + input.charAt(index - 1);
                if (counter != 1) {
                    result = result + counter;
                }
                symbol = input.charAt(index);
                counter = 1;
            }
        }
        if (counter == 1) {
            result = result + input.charAt(input.length() - 1);
        } else {
            result = result + input.charAt(input.length() - 1) + counter;
        }
        return result;
    }
}
