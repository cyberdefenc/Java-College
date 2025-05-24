package Day0003;
// WAP to print all prime numbers from 1 to 100

public class P15_prime_1_100_ {
    public static void main(String[] args) {
         int s=1,e=100;
        System.out.print("Prime numbers from "+s+" to " + e + " are: "+s+" "+(s+1)+" ");

        for ( s = 3; s <= e; s++) {
            boolean isPrime = true;

            for (int j = 2; j * j <= s; j++) // j*j means j<= root(s) 
            {
                if (s % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(s + " ");
            }
        }
        
    }
}
