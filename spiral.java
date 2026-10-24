import java.util.Scanner;
public class spiral{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows in the array: ");
        int rows=sc.nextInt();
        System.out.println("enter the number of columns in the array: ");
        int columns=sc.nextInt();
        if(rows=0||columns=0){
            System.out.println("array indexes cannot be 0");
        }
        int[][] matrix=new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int minr;
        int maxr;
        int maxc;
        int minc;
        int count;
        System.out.println("spiral traversal: ");
        while(rows*columns<count){
            for(int col=cmin; col<=cmax && count<columns*rows; col++){
                System.out.println(arr[minr][col]+" ");
                count++
            }
            rmin++
            for
        }
    }
}