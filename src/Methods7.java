// checking for prime (Optimized : i -> value check till root n)
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

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number to check for prime : ");
    int n = sc.nextInt();;
    /*  boolean isPrime = isPrime(n);
    System.out.print(isPrime);  */
    System.out.print(isPrime(n));  // direct print
}