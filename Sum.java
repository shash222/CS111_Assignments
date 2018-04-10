import java.io.*;
public class Sum{
    public static void main(String[] args){
        System.out.println("Enter two numbers:");
        System.out.print("Enter number: ");
        int num1=IO.readInt();
        System.out.println();
        System.out.print("Enter number: ");
        int num2=IO.readInt();
        int total=num1+num2;
        IO.outputIntAnswer(total);
    }
}