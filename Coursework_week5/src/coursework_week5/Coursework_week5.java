/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_week5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author leung
 */
public class Coursework_week5 {
    public static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] data = {2, 7, 9, 4, 1, 5, 3, 6, 0, 8};
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println("Inserting :");
        for (int i = 0; i <= 9; i++) {
            System.out.print(data[i] + ", ");
            tree.insert(data[i]);
        }
        System.out.println();
        tree.inorder();
        for (int j = 0; j <= 9; j++) {
            tree.delete(data[j]);
        }
        tree.inorder();

        int[] guess= new int[1999];
        int count = 0;
        int logHigh = 2000;
        int logLow = 0;
        Random rand = new Random();
        int n = rand.nextInt(2000) + 1;
        
        tree.inorder();
        System.out.println(tree.size());
        System.out.println("Guess a number:");
        guess[count] = 1000;
        while(true){
            
            if(guess[count] > n && guess[count] <= 2000){
                System.out.println("number is too high " +guess[count]);
                logHigh = guess[count];
                
            }else if(guess[count] < n && guess[count] >= 1){
                System.out.println("number is too low " +guess[count]);
                logLow = guess[count];
                
            }else if(guess[count] == n){
                System.out.println("hit the right number "+n+" in " +count +" steps");
                break;
            }else{
                System.out.println("Number out of range");
            }
            int current = (logHigh -logLow)/2 +logLow;
            guess[++count] = current;
        }

    }
        
}
