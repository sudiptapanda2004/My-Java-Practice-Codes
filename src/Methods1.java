public static void printHelloWorld() {
    System.out.println("Hello World");
    System.out.println("Hello World");
    System.out.println("Hello World");
    // return ;   # since returnType is void, return statement is not required
}

public static void /* here */ calculateSum(int num1, int num2) {      // here we can also take (int a, int b)
    int sum = num1 + num2;
    System.out.println("The sum is : " + sum);
    //  return sum;    if the statement format of below is used and returnType should be int (where mentioned)
}


void main() {
    // printHelloWorld();  // this is the function call / method call

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    calculateSum(a, b);     // precede by below statement -> int sum = calculateSum(a, b);
                            // System.out.println("The sum is : " + sum);  # we can also write this statement here
}