/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanpbo3;

import java.util.*;

    public class LatihanPBO3 {
        public static void main(String[] args) {
            Set set = new HashSet () ;
            set.add ("Sistem") ;
            set.add ("Teknologi Informasi") ;
            set.add("Bisnis") ;
            set.add ("Digital") ;
            set.add("kewirausahaan") ;
            
            System.out.print("Elemen pada HashSet : ");
            System.out.println(set);
            
            Set sortSet = new TreeSet (set) ;
            System.out.print ("Elemen pada TreeSet : ") ;
            System.out.println(sortSet) ; 
        }
    }
