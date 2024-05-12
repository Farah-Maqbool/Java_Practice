//Write a program in java which asks your age and class Roll Number by using the Scanner class.
//Also Display both age and class Roll Number.
import java.util.Scanner;
public class Lab2HW {
    public static void main(String[]args){
        //1
        Scanner user=new Scanner(System.in);
        System.out.print("Enter your Roll number: ");
        String rollno=user.next();
        System.out.print("Enter your Age: ");
        int age=user.nextInt();
        System.out.println("Roll number: "+rollno);
        System.out.println("Age: "+age);
        sum();
    }
    //2
    //Write a program in java using scanner class which gets two numbers as input and displays their sum
    public static void sum(){
        Scanner user=new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1=user.nextInt();
        System.out.print("Enter Number 2: ");
        int num2=user.nextInt();
        System.out.println("Result (Sum of tow number): "+(num1+num2));
    }
}
