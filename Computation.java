package com.company;
import java.util.Scanner;

public class Computation {
    public static void transpose() {
        int n,m;
        System.out.println("Input number1");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("Input number2");
        Scanner sc2 = new Scanner(System.in);
        m = sc2.nextInt();
        int matr[][]= new int[n][m];
        int result[][] = new int [m][n];

        System.out.print("Matrix");

        for(int i=0;i<n;i++){
//matr[i]= new int[3];
//result[i]= new int[3];

            for(int j=0;j<m;j++){
                Scanner mc = new Scanner(System.in);
                matr[i][j]= mc.nextInt();

            }

        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[i][j]=matr[j][i];
            }
        }

        System.out.print("Result");
        for(int i=0;i<m;i++){
            System.out.println();
            for(int j=0;j<n;j++){
                System.out.print(result[i][j]+" ");
            }
        }

    }

    public static void multiplication_number(){
        int n;
        int m,k;
        System.out.println("Input number1 for matrix");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Input number2 for matrix");
        Scanner sc2 = new Scanner(System.in);
        m = sc2.nextInt();

        int matr[][]= new int[n][m];
        int result[][] = new int [n][m];
        System.out.print("Input number");
        Scanner mc2 = new Scanner(System.in);
        k = mc2.nextInt();
        System.out.println("Matrix");
        for(int i=0;i<n;i++){
//matr[i]= new int[3];
//result[i]= new int[3];

            for(int j=0;j<m;j++){
                Scanner sc3 = new Scanner(System.in);
                matr[i][j]= sc3.nextInt();

            }

        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                result[i][j]=matr[i][j]*k;
            }
        }
        System.out.print("Result");
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<m;j++){
                System.out.print(result[i][j]+" ");
            }
        }
    }

    public static void multiplication_matrix() {
        int n=2, m=2;
        int n2=2, m2=2;

        int matr[][] = new int[n][m];
        int matr2[][] = new int[n2][m2];
        int result[][] = new int[n][m2];

        System.out.print("Input Matrix1");
        for (int i = 0; i < n; i++) {
//matr[i]= new int[n];
//result[i]= new int[n];

            for (int j = 0; j < m; j++) {
                Scanner sc = new Scanner(System.in);
                matr[i][j] = sc.nextInt();

            }

        }

        System.out.print("Input Matrix2");
        for (int i = 0; i < n2; i++) {
//matr2[i]= new int[n2];
//result[i]= new int[n2];

            for (int j = 0; j < m2; j++) {
                Scanner mc = new Scanner(System.in);
                matr2[i][j] = mc.nextInt();

            }

        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m2; k++) {
                    result[i][j] += matr[i][k] * matr2[k][j];
                }
            }
        }
        System.out.println("Result");
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<m2;j++){
                System.out.print(result[i][j]+" ");
            }
        }
    }

    public static void sum_matrix(){
        int n,m;
        int n2,m2;
        System.out.print("Input number1 for first matrix");
        Scanner nsc = new Scanner(System.in);
        n= nsc.nextInt();
        System.out.print("Input number2 for first matrix");
        Scanner msc = new Scanner(System.in);
        m= msc.nextInt();

        System.out.print("Input number1 for second matrix");
        Scanner n2sc = new Scanner(System.in);
        n2= n2sc.nextInt();
        System.out.print("Input number2 for second matrix");
        Scanner m2sc = new Scanner(System.in);
        m2= m2sc.nextInt();

        if (n != n2 && n2!=m2) {
            System.out.print("Matrix is impossible");
            System.exit(0);
        }

        int matr[][]= new int[n][m];
        int matr2[][]= new int[n2][m2];
        int result[][]=new int[n][m] ;

        System.out.print("Matrix1");
        for(int i=0;i<n;i++){
//matr[i]= new int[3];
//result[i]= new int[3];

            for(int j=0;j<m;j++){
                Scanner sc = new Scanner(System.in);
                matr[i][j]= sc.nextInt();

            }

        }
        System.out.print("Matrix2");
        for(int i=0;i<n2;i++){
              //matr[i]= new int[3];
              //result[i]= new int[3];

            for(int j=0;j<m2;j++){
                Scanner sc = new Scanner(System.in);
                matr2[i][j]= sc.nextInt();

            }

        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                result[i][j]=matr[i][j]+matr2[i][j];
            }
        }
        System.out.print("Result");
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<m;j++){
                System.out.print(result[i][j]+" ");
            }
        }
    }
}