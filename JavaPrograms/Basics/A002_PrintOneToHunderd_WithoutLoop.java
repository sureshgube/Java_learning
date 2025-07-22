package Basics;

public class A002_PrintOneToHunderd_WithoutLoop {
    int i=0;
    public void printall()
    {
        if (i<=100)
        {
            System.out.println(i);
            i++;
            printall();
        }

    }
    public static void main(String[] args) {
        A002_PrintOneToHunderd_WithoutLoop c=new A002_PrintOneToHunderd_WithoutLoop();
        c.printall();
    }
}
