void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value to check for prime : ");
    int n = sc.nextInt();
    if (n<=1) {
        System.out.println(n+" is neither prime nor composite");
    }
    else {
        boolean isPrime = true;
    for (int i=2; i<=Math.sqrt(n); i++) {  // root n method is the correct way, to check very large numbers sometimes
        // for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {           // n is a multiple of i (n is not-equal to 1 or i)
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

}