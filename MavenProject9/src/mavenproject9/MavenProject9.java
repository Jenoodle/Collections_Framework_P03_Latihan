/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mavenproject9;

import java.util.*;
public class MavenProject9 {
public static void main(String[] args) {
ArrayList arrayList = new ArrayList();
arrayList.add("1");
arrayList.add("4");
arrayList.add("2");
arrayList.add("5");
arrayList.add("3");

Vector v = new Vector();
v.add("A");
v.add("B");
v.add("D");
v.add("E");
v.add("F");
v.add("G");
v.add("H");
System.out.println("Before copy, Vector Contains : " + v);
Collections.copy(v,arrayList);
System.out.println("After Copy, Vector Contains : " + v);
}
}