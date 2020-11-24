public class LargestPrime {
    public static int getLargestPrime(int number) {
        int divisor = number;

        while(number > 0) {

        }
        return -1;
    }
}

/*
1. Write loop to perform operation multiple times
2. Divide number by itself
3. Reduce number by 1
4. Redivide number new number
5. Get remainders
6. If remainder is 0, divide numbers by itself
    6a. Reduce by 1
    6b. Determine if number is prime
7. For the first prime number that comes, return that number
8. Exit loop
 */