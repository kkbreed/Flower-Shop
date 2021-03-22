/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershop;

/**
 *
 * @author user
 */
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class FlowerShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Prompt the user for the total price of the order and the number of flower arrangements ordered.  
        //Compute the tax which is 7% of the total order price.  Compute the total shipping charge which is $3 per arrangement.  
        //Output the tax amount, shipping charge, and total price of the order after tax and shipping.
    Scanner scnr = new Scanner(System.in);
    int numFlowers;
    int costOfFlowers;  //I didn't know the cost for flower, so I used 10.
    int costShipping = 3;
    double tax;
    
     System.out.println("How many flower arrangements do you want? ");
     numFlowers = (int) scnr.nextDouble();
     System.out.println("");
     System.out.println("You chose " + numFlowers + " total flower arrangements");
     System.out.println("");
     System.out.print("What is the cost of the flower arrangements? ");
    costOfFlowers = (int) scnr.nextDouble();
    
    costShipping = numFlowers * 3; //shipping cost is 3 dollars
    double totalCost = (costShipping * costOfFlowers);  //Cost of shipping = 3, cost of flowers is 10
    tax = totalCost * .07;  //The sales tax
    
        
    
        System.out.println("");  //this is a blank space
        System.out.println("Total shipping charge: $" + costShipping);
        System.out.println("Total tax: $" + tax);
       //System.out.println("Total cost of the flower arrangements: $" + totalCost + tax);
        System.out.println("Total cost of the flower arrangements with shipping and tax: ");
       System.out.printf("%.2f", tax + totalCost);
        System.out.println("");
    

    
    }
    
}
