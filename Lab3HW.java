import javax.swing.*;
import java.util.Scanner;

//1
//Write a program to calculate and display area and circumference of circle. Have the user
//input radius of a circle and display area and circumference of a circle. Use dialog boxes
//for input and output.
public class Lab3HW {
    public static void main(String[]args){
         String input;
         double radius;
         double circum,area;
         input= JOptionPane.showInputDialog("Enter Radius: ");
         radius=Integer.parseInt(input);
         area=3.14159*(radius*radius);
         circum=2*3.14159*radius;
         JOptionPane.showMessageDialog(null,"Area of circle: "+area
                 +" Circumference of circle: "+circum);
         circle();
    }
    //2
    //Write a program to calculate and display area and circumference of circle. Have the user
    //input radius of a circle and display area and circumference of a circle. Use System.in &
    //System.out for input and output on MS Dos prompt.

    public static void circle(){
        Scanner user=new Scanner(System.in);
        System.out.print("Enter circle radius: ");
        double radius=user.nextDouble();
        double area=3.14159*(radius*radius);
        double circum=2*3.14159*radius;
        System.out.println("Area of Circle: "+area);
        System.out.println("Circumference of circle: "+circum);
        user.close();


    }
}
