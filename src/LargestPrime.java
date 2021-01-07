public class LargestPrime {
    public static int getLargestPrime(int number) {
        int maxPrime = -1;

        if(number == 0 || number == 1 || number < 0) {
            System.out.println(-1);
            return -1;
        }

        while(number % 2 == 0) {
            System.out.println("The largest prime is 2");
            return 2;
        }

        for(int i = 2; i <= Math.sqrt(number); i+=2) {
          while(number % i == 0) {
              maxPrime = i;
              number /= i;
          }
        }

        if (number > 2) {
            maxPrime = number;
            System.out.println("The largest prime is " + maxPrime);
            return maxPrime;
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