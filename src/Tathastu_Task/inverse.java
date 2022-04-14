/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tathastu_Task;

public class inverse  {
 
    // Function that returns true if
    // the array is mirror-inverse
    static boolean isMirrorInverse(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
 
            // If condition fails for any element
            if (arr[arr[i]] != i)
                return false;
        }
 
        // Given array is mirror-inverse
        return true;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int arr[] = {3,4,2,0,1};
        if (isMirrorInverse(arr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

