public  static int factorial (int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
        fact = fact * i;
    }
    return fact;    // factorial of n
}
// Binomial Coefficient Calculation
public static int binCoeff (int n, int r) {
    int n_fact = factorial(n);
    int r_fact = factorial(r);
    int n_r_fact = factorial(n-r);
    int binCoeff = n_fact/(r_fact*n_r_fact);
    return binCoeff;
}

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n : ");
    int n = sc.nextInt();
    System.out.print("Enter the value of r : ");
    int r = sc.nextInt();
    int binCoeff = binCoeff(n, r);
    System.out.print("The binomial coefficient of C("+n+", "+r+") is : "+binCoeff);

}