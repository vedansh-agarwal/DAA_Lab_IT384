import java.util.Scanner;

public class DAA_Lab01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of nodes: ");
        int nodes = sc.nextInt();
        int temp, min, i, j, cost = 0;

        System.out.println("Enter Matrix Input for graph:");
        for(i = 0; i < nodes; i++)
        {
            for(j = 0, min = Integer.MAX_VALUE; j < nodes; j++)
            {
                temp = sc.nextInt();
                if(temp != -1 && j > i && temp < min)
                    min = temp;
            }
            if(i < nodes - 1)
                cost += min;
        }
        System.out.print("Minimum Spanning Tree Cost: "+cost);
    }
}
