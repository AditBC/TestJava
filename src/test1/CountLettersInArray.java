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
        
    }
    public static char[] createArray(){
        char[] chars = new char[100];
        
        for(int i = 0; i < chars.length; i++){
            chars[i] = getRandomLowerCaseLetter();
        }
        return chars;
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
