/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.pkg2;

import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r = new Scanner(System.in);
        
        int numero;
        int dec;
        int uni;
        String textu="";
        String textu2="";
        System.out.println("ingrese numero de dos digitos: ");
        numero= r.nextInt();
        
        dec=numero/10;
        uni=numero%10;
        
        if((numero>10) && (numero<16)){
            switch(numero){
                case 11: System.out.println("Once"); break;
                case 12: System.out.println("Doce"); break;
                case 13: System.out.println("Trece"); break;
                case 14: System.out.println("Catorce"); break;
                case 15: System.out.println("Quince"); break;
            }
        }else{
            switch(dec){
                case 1: textu2="Diez"; break;
                case 2: textu2="Veinte"; break;
                case 3: textu2="Treinta"; break;
                case 4: textu2="Cuarenta"; break;
                case 5: textu2="Cincuenta"; break;
                case 6: textu2="Sesenta"; break;
                case 7: textu2="Setenta"; break;
                case 8: textu2="Ochenta"; break;
                case 9: textu2="Noventa"; break;    
            }
            
            if(uni!=0){
                switch(uni){
                    case 1: textu="Uno"; break;
                    case 2: textu="Dos"; break;
                    case 3: textu="Tres"; break;
                    case 4: textu="Cuatro"; break;
                    case 5: textu="Cinco"; break;
                    case 6: textu="Seis"; break;
                    case 7: textu="Siete"; break;
                    case 8: textu="Ocho"; break;
                    case 9: textu="Nueve"; break;
                }  
                if(dec>2 && dec<10){
                System.out.println(textu2+" y "+textu);
            }else{
                System.out.println(textu2+""+textu);
            }
            }else{
                System.out.println(textu2);
            }
            
            
   
        }
        //System.out.println("====================");
        //System.out.println(textu2+" "+textu);
        
    }
    
}
