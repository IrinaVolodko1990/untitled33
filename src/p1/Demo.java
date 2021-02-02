package p1;

import java.util.Arrays;
class ArraysCopy {
    public static void main(String[] args) {
        float [] numbers = {167.5f, -2, 16.6f, 99.8f, 26, 92, 43.4f,
                -234, 35, 80};
        float [] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(numbersCopy));
        System.out.println("01-02-2021");
        System.out.println("кое что новое");
        System.out.println("кое что новое2");
    }}