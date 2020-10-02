/*
 * Auston Timmerman
 * Lab#1
 * 
 */
package lab1;

import java.util.Scanner;
public class Lab1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = 0;
        int a = 1 + (int) (Math.random()* 99);
        int guess = 0;
        
        System.out.println("i am thinking of a number between 1 and 100");
        
        while(guess !=a) {
            guess = console.nextInt();
            count++;
            if(guess >a){
                System.out.println("Too High")
            }  else if(guess < a){
                System.out.println("Too low");
            }
            }
        System.out.println("Congratulations. You guessed the number in " + count + " tries");
    }
    
}
