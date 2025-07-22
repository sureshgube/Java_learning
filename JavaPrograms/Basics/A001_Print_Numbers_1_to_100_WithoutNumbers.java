package Basics;

public class A001_Print_Numbers_1_to_100_WithoutNumbers {
    public static void main(String[] args) {
        // Using a loop to print numbers from 1 to 100 without using numeric

        int one= 'A' - 'A' + 1; // This will be 1
        String size="..........";
        for (int i = one ; i <= (size.length()* size.length()); i++) {
            System.out.println(i);
        }
        // ASCII a-97, b-98, c-99, d-100
        for (int i=one;i<='d';i++)
        {
            System.out.println(i);
        }
    }
}