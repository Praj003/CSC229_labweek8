
package com.mycompany.week8_skeletoncode_lab;

//Prajwol Shrestha

public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i<n; i++){
            if (arr[i]==x) {
                return i;
            }
        }
        return -1;
    }
}
//looping through array to find value until it cannot and return 
// Best time complexity is O(1) and worst is O(n)
// Todo 01: - complete the implementation of linear search and test your code  
// - prvoide asymptotic analysis of the developed solution
