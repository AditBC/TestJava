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
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] list = {1,5,6,7,8,9,12,14,17,28,33,35,36,58,79,80,86,87,92,94,96};
        int b = 28;
        int i = binarySearch(list,b);
        System.out.println("The interger "+b+" is in position "+ (i+1));
    }
    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;
        
        while(high >= low){
        int mid = (low + high) / 2;
        if (key < list[mid])
            high = mid - 1;
        else if(key == list[mid])
            return mid;
        else
            low = mid + 1;
        }
        return -low -1;
    }
}
