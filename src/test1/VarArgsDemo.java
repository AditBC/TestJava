/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author will
 */
public class VarArgsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printMax(34, 3, 4, 3, 7, 29, 89.5);
        printMax(new double[]{1,2,3});
    }
    public static void printMax(double... numbers){
        if(numbers.length == 0){
            System.out.println("No arguments passed");
        }
        double result = numbers[0]; 
        
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > result)
                result = numbers[i];
        }
        System.out.println("The max value is " + result);

    }
    
}
