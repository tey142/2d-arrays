import java.util.Scanner;
public class matrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //prompt user to enter number of rows
        System.out.println("enter the number of rows in the matrix: ");
        int rows=sc.nextInt();
        //prompt user to enter number of columns
        System.out.println("enter the number of columns in the matrix: ");
        int columns=sc.nextInt();
        //create 2d array
        int arr[][]=new int[rows][columns];
        //prompt user to enter elements in 2d array
        System.out.println("enter the elements of the array: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<rows; i++){
            for(j=0; j<columns; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}