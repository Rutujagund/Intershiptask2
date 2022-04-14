/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tathastu_Task;

import java.util.ArrayList;
import java.util.List;
 
// Main class
public class remove {
    // Main driver method
    public static void main(String[] args)
    {
        
        List<Integer> al = new ArrayList<>();
 
        
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
 
        System.out.println(al);
 
        al.remove(1);
 
        al.remove(1);
 
        System.out.println(al);
    }
}
