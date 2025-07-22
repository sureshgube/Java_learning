package Basics;

import java.util.Arrays;

public class A003_PrintOneToHunderd_WithoutLoop_Recursions {

    public static void main(String[] args) {
        //1. Arrays Fill
        Object num[]=new Object[100];
        Arrays.fill(num, new Object()
                {
                    int count =0;
                    @Override
                    public  String toString()
                    {
                        return Integer.toString(++count);
                    }
                }
        );
        System.out.println(Arrays.toString(num));
    }
}
