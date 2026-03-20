void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of lines : ");
    int n = sc.nextInt();
    for (int line=1; line<=n; line++) {
        for (int star=1; star<=(n-line+1); star++) {
            System.out.print("*");
        }
        System.out.println();
    }
}