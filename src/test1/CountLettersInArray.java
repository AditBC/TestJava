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
public class CountLettersInArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] chars = createArray();
        
        System.out.println("The lowercase letters are:");
        displayArrays(chars);
        int[] counts = countLetters(chars);
        System.out.println();
        System.out.println("The Occurences of each letter are:");
        displayCounts(counts);
    }
    public static char[] createArray(){
        char[] chars = new char[100];
        
        for(int i = 0; i < chars.length; i++){
            chars[i] = getRandomLowerCaseLetter();
        }
        return chars;
    }
    public static void displayArrays(char[] chars){
        for(int i = 0; i < chars.length; i++){
            if((i + 1) % 20 == 0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i] + " ");
        }
    }
    public static int[] countLetters(char[] chars){
        int[] counts = new int[26];
        
        for(int i = 0; i <chars.length; i++){
            counts[chars[i] - 'a']++;
        }
        return counts;
    }
    public static void displayCounts(int[] counts){
        for(int i = 0; i < counts.length; i++){
            if((i + 1) % 10 == 0)
                System.out.println(counts[i] + " " + (char)(i + 'a'));
            else
                System.out.print(counts[i]+ " " + (char)(i + 'a') + " ");
        }
    }
    public static char getRandomCharacter(){
        return getRandomCharacter('\u0000','\uFFFF');
    }
    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a','z');
    }

    private static char getRandomCharacter(char c, char c0) {
         return (char)(c + Math.random() * (c0 - c + 1));
    }
}
