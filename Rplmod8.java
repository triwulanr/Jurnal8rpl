/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rplmod8;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Rplmod8 {
    
   public static void main(String[] args) {
    int ab;
    int ac = 1;
    int input;
    boolean a = false;
    Scanner in = new Scanner(System.in);
    
    System.out.println("input");
    ab = in.nextInt();
    
    System.out.println(" ");
    
    ac =ab - ac;
    ab = ab + ac;
    
    System.out.println(ab + " ");
   System.out.println();    
  }
}
