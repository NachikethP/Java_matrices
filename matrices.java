import java.util.Scanner;

public class matrices {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[][] arr1 = new int[3][3];
        int[][] arr2= new int[3][3];
        int[][] sum=new int[3][3];
        int[][] product=new int[3][3];
        
        System.out.println("Enter the elements of first matrix:");
        for(int i =0; i<3;i++){
            for(int j = 0; j<3 ; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }


        System.out.println("Enter the elements of the second matrix:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("MATRIX 1:");
        for(int i =0; i<3;i++){
            for(int j = 0; j<3 ; j++){
                System.out.print(arr1[i][j]+" ");
            }System.out.println();
        }
        System.out.println("MATRIX 2:");
        for(int i =0; i<3;i++){
            for(int j = 0; j<3 ; j++){
                System.out.print(arr2[i][j]+" ");
            }System.out.println();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               sum[i][j]= 0;
            }
        }

        System.out.println("Sum of matrix 1 and Matrix 2:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum[i][j]= arr1[i][j]+arr2[i][j];
                System.out.print(sum[i][j]+" ");
            }System.out.println();
        }
        System.out.println("The product of matrix 1 and Matrix 2 are:");
        for(int i =0; i<3;i++){
            for(int j = 0; j<3 ; j++){
                product[i][j]= 0;
                for(int k=0;k<3;k++){
                    product[i][j]+=arr1[i][k]*arr2[k][j];
                }
                System.out.print(product[i][j]+" ");
            }System.out.println();
        }


    }
}
