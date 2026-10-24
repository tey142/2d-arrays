import java.util.Scanner;
public class mm{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount of rows: ");
        int rows=sc.nextInt();
        System.out.println("enter the amount of columns: ");
        int columns=sc.nextInt();
        int[][] arr=new int[rows][columns];
        System.out.println("enter the numbers in the first row: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                arr[i][j]=(i+1)*(j+1);
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
