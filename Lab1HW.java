/*. Write java code that print in steps for compiling the java code using console.
The result must be like this:*/

import javax.swing.*;
import java.util.Scanner;

//----1----
public class Lab1HW {
    public static void main(String[] args) {
        System.out.println("How to Compile Java code.");
        System.out.println("1. Write java code using text editor and save the file");
        System.out.println("2. Rename the saved file wit the class name");
        System.out.println("3. ......");
        username();
    }

//----2----
/*. Write a simple java code that read from scanner the username and print it into screen and
show message dialog with the entered username.
*/
    public static void username(){
        Scanner user=new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String UserName=user.next();
        JOptionPane.showMessageDialog(null,"Your Name: "+UserName);
    }

}