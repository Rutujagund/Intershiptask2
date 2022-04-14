/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tathastu_Task;
 
class reverse {
    public static void main (String[] args) {
       
        String str= "India", nstr="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println("India");
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i);
        nstr= ch+nstr; 
      }
      System.out.println("Reversed word: "+ nstr);
    }
}