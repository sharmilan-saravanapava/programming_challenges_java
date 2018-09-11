package FactorialCalculator;

public class Factorial {
    public static int factorial(int n){ //return the factorial of a number
        return (n > 1) ? n*factorial(n-1) : 1;
    }
}
