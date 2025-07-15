package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Patrick Mahomes";
        names[1] = "Joe Burrow";
        names[2] = "Aaron Rodgers";
        names[3] = "Josh Allen";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
