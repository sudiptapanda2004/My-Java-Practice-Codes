public static int product (int a, int b) {
    int prod = a*b;
    return prod;
}


void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of a : ");
    int a = sc.nextInt();
    System.out.print("Enter the value of b : ");
    int b = sc.nextInt();
    int prod = product(a, b);
    System.out.println("The product is : "+prod);
}