public static void swap(int a, int b) {
    // swapping using 3rd variable
    int temp = a;
    a = b;
    b = temp;

    System.out.println("a = " +a);
    System.out.println("b = " +b);
}



void main() {
    /*   int a = 5;
    int b = 10;

    // swapping using 3rd variable
    int temp = a;
    a = b;
    b = temp;

    System.out.println("a = " +a);    # Here 'call by value' will happen in Java
    System.out.println("b = " +b);
}   */

    int a = 5;
    int b = 10;
    swap(a, b);

}