
package com.mycompany.week8_skeletoncode_lab;


public class Problem01 {
    
public static long getSumOfPrimes(int n){
   long sum = 0; for (int i = 2; i <= n; i++) < //
    int i;
if (isPrime(i)) {
sum += i; 
}
return sum; 

private static boolean isPrime (int n) {
if (n <= 1) {
return false;
}
for (int i = 2; i <= Math.sqrt (n);
i++) {
if (n & i == 0) {
return false;
}
}
return true; // n is prime
}
}

//Time complexity would be O(n2(n)) 
//and the space complexity would be O(1)

// Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time
