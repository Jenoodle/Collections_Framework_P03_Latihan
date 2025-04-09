/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mavenproject3;

import java.util.*;

public class MavenProject3 {
    public static void main(String[] args) {
        String[] words = {"saya", "ingin", "lulus", "akan", "berusaha"};
        Set<String> uniques = new HashSet<String>();
        
        Set<String> dups = new HashSet<String>();
        
        for (String a : words)
            if (!uniques.add(a))
                dups.add(a);
        
        //Destructive set-difference
        uniques.removeAll(dups);
        System.out.println("Unique words: " + uniques);
        System.out.println("Duplicate words: " + dups);
    }
}
