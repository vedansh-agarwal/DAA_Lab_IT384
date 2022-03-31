import java.util.Scanner;
public class DAA_Lab03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows in matrix 1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter no. of columns in matrix 1: ");
        int c1 = sc.nextInt();
        int r2 = c1;
        System.out.print("Enter no. of columns in matrix 2: ");
        int c2 = sc.nextInt();
        int matrix1[][] = new int[r1][c1];
        int matrix2[][] = new int[r2][c2];
        int temp;

        System.out.println("\nEnter "+(r1*c1)+" elements for matrix 1 below:");
        for(int i = 0; i < r1; i++)
            for(int j = 0; j < c1; j++)
                matrix1[i][j] = sc.nextInt();
        System.out.println("\nEnter "+(r2*c2)+" elements for matrix 2 below:");
        for(int i = 0; i < r2; i++)
            for(int j = 0; j < c2; j++)
                matrix2[i][j] = sc.nextInt();

        System.out.println("\nMultiplication of two matrix:");
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                temp = 0;
                for (int k = 0; k < c1; k++)
                    temp += matrix1[i][k] * matrix2[k][j];
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}

