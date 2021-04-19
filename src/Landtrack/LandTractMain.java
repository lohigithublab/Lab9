
package Landtrack;

import java.util.Scanner;

public class LandTractMain 
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1st LandTract Length");
        double length1 = scanner.nextDouble();
        System.out.println("Please enter 1st LandTract Width");
        double width1 = scanner.nextDouble();
        
        System.out.println("Please enter 2nd LandTract Length");
        double length2 = scanner.nextDouble();
        System.out.println("Please enter 2nd LandTract Width");
        double width2 = scanner.nextDouble();
        
        LandTract LandTract1 = new LandTract(length1, width1);
        LandTract LandTract2 = new LandTract(length2, width2);
        
        System.out.println("Length: " + LandTract1.getLength() + " - Width: " + LandTract1.getWidth());
        System.out.println("Area: " + LandTract1.getArea());
        
        System.out.println("Length: " + LandTract2.getLength() + " - Width: " + LandTract2.getWidth());
        System.out.println("Area: " + LandTract2.getArea());
        
        if(LandTract1.toString().equals(LandTract2.toString()))
        {
            System.out.println("Both areas are equal");
        }
        else{
            System.out.println("Both areas are not equal");
        }
        
    }
}


