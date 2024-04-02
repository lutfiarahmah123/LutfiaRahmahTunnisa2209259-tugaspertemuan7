/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soalenkap;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Soalenkap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        double a = input.nextDouble();
           System.out.print("Masukkan nilai: ");
        double b = input.nextDouble();
           System.out.print("Masukkan nilai: ");
        double c = input.nextDouble();
           System.out.print("Masukkan nilai: ");
        double d= input.nextDouble();
           System.out.print("Masukkan nilai: ");
        double e = input.nextDouble();
           System.out.print("Masukkan nilai: ");
        double f= input.nextDouble();
         
        LinearEquation nilai = new LinearEquation(a,b,c,d,e,f);
        if (nilai.isolfe()){
             System.out.println("solusi dari nilai x"+nilai.getX()+" dan Y = "+ nilai.getY());
             
        }else {
            System.out.println("tidak memiliki solusi");
        }
    }
    
}
