package Basics;

public class A004_PrintHelloWorld_WithoutSemicolon {

    //print hello without semicolon
    public static void main(String[] args) {
        if (System.out.printf("Helloworld" + "\n")==null)
        {

        }
        if (System.out.append("Helloworld"+ "\n")==null)
        {

        }
        if (System.out.append("Helloworld"+ "\n").equals(null))
        {

        }
        for(int i=0;i<1; System.out.print("Helloworld"))
        {
            i++;
        }
    }
}
