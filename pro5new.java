import java.util.*;

public class pro5new {

    public static void print(int mat[][]) {
        int i, j;
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] add(int mat[][], int mat2[][]) {
        int resultmat[][] = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                resultmat[i][j] = mat[i][j] + mat2[i][j];
            }
        }
        return resultmat;
    }

    public static int[][] sub(int mat[][], int mat2[][]) {
        int resultmat[][] = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                resultmat[i][j] = mat[i][j] - mat2[i][j];
            }
        }
        return resultmat;
    }

    public static int[][] mul(int mat[][], int mat2[][]) {
        int resultmat[][] = new int[mat.length][mat2[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                for (int k = 0; k < mat[i].length; k++) {
                    resultmat[i][j] =resultmat[i][j]+mat[i][k] * mat2[k][j];
                }

            }
        }
        return resultmat;
    }

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Enter First matrix Row and Column:");

        int row = sn.nextInt();
        int col = sn.nextInt();

        System.out.println("Enter second matrix Row and Column:");

        int row1 = sn.nextInt();
        int col1 = sn.nextInt();

        int firstmat[][] = new int[row][col];
        int secondmat[][] = new int[row1][col1];
        int resultmatrix[][] = new int[row][col];
        int x = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                firstmat[i][j] = x;

                x++;

            }
        }
        x = 1;
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                secondmat[i][j] = x;
                x++;

            }
        }

        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Print Both Matrix");

        System.out.println("Enter your choice");
        int choice = sn.nextInt();
 
        switch (choice) {
            case 1:
                if (col == col1 && row == row1) {
                    resultmatrix = add(firstmat, secondmat);
                    print(resultmatrix);
                    

                } else {
                    System.err.println("Addition is not possible:");
                }

                break;
            case 2:
                if (col == col1 && row == row1) {
                    resultmatrix = sub(firstmat, secondmat);
                    print(resultmatrix);

                } else {
                    System.err.println("Substraction is not possible:");
                }
                break;

            case 3:
                if (col ==row1) {
                    resultmatrix = mul(firstmat, secondmat);
                    print(resultmatrix);

                } else {
                    System.err.println("Multiplication is not possible:");
                }

                break;
            case 4:
                  System.out.println("First Matrix");
             
                  print(firstmat);
                  System.out.println();
                  System.out.println("Second Matrix");
            
                  print(secondmat);
                break;
            
            default:
                break;
        }
    }

 
}
