package com.company;

import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("HashSet: " + numbers);

        // Using remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("5 kaldırıldı mı? " + value1);

        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Tüm öğeler kaldırıldı mı? " + value2);
    }
}
