// Primes in range

public static boolean isPrime (int n) {
    boolean isPrime = true;
    // corner cases : special numbers which have different conditions than isPrime
    if (n<2) {
        isPrime = false;
    }
    else {
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n%i==0) {
                isPrime = false;            // all
                break;                      // the
                //return false;             // possible
                // return isPrime;          // ways
            }
        }
    }
    return isPrime;
    // return true;                    # this is also correct
}

/* public static void prime_in_range (int n) {
    for (int i=0; i<=n; i++) {
        if (isPrime(i)) {  // true
            System.out.print(i+"\t");
        }
    }
    System.out.println();
} */

public static void prime_in_range (int n) {
    int count = 0;   // counts printed primes

    for (int i=0; i<=n; i++) {
        if (isPrime(i)) {  // true
            System.out.print(i+"\t");
            count++;

            if (count % 20 == 0) {   // after every 20 primes starts printing on a new line
                System.out.println();
            }
        }
    }
    System.out.println();
}

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number till which to print prime numbers : ");
    int n = sc.nextInt();
    prime_in_range(n);
}