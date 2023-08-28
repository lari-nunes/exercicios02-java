import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for(int x=0; x<n; x++){
            for(int i=0; i<n; i++){
                mat[x][i] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for(int x=0; x<n; x++){
            System.out.println(mat[x][x] + " ");
        }
        System.out.println();

        int count = 0;
        for(int x=0; x<n; x++){
            for(int i=0; i<n; i++){
                if(mat[x][i] < 0){
                    count++;
                }
            }
        }

        System.out.println("Negative numbers = " + count);

        sc.close();
    }
}