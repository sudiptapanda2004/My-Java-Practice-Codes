// hollow star-rectangle, using the concepts of Matrix

public static void hollow_rectangle (int totRows, int totColumns) {
    // outer loop - rows
    for (int i=1; i<=totRows; i++) {
        // inner loop - columns
        for (int j=1; j<=totColumns; j++) {
            // matrix cell (i,j)
            if (i==1 || i==totRows || j==1 || j==totColumns) {  // boundary cell condition for rows and columns
                    System.out.print("*");
                }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows : ");
    int totRows = sc.nextInt();
    System.out.print("Enter the number of columns : ");
    int totColumns = sc.nextInt();
    hollow_rectangle(totRows,totColumns);
}