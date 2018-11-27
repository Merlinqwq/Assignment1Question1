/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caculator;
import java.util.Scanner;

/**
 *
 * @author li-y92
 */
public class Caculator {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1,num2 = 0.0;
        Scanner scanner = new Scanner(System.in);
            System.out.print("enter first num:");
            //enter num1
            num1 = scanner.nextDouble();
            System.out.print("enter second num:");
            num2 = scanner.nextDouble();
            char operator;
            System.out.print("choose operator:");
             operator = scanner.next().charAt(0);
            //choose operator
            
        
        double answer=0.0;
        switch(operator){
        case'+': answer = num1+num2;
        break;
        case'-': answer = num1-num2;
        break;
        case'*': answer = num1*num2;
        break;
        case'/': answer = num1/num2;
        }
        System.out.printf("%f%c%f=%f",num1,operator,num2,answer);
                
        
    }
    
}
