/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplobucles;

import java.util.Scanner;

/**
 *
 * @author DANIELCASTELAO\vmontestovar
 */
public class Metodos {
  public int num;
  Scanner sc= new Scanner(System.in);
  
    public int pedirDoWhile(){
        System.out.println("pedir numero");
        num=sc.nextInt();
        return num;
        
    }
    public void verDoWhile(){
        do{
        num=pedirDoWhile();
        if(num!=0)
            System.out.println(num);
        }while (num !=0);
    }
}
