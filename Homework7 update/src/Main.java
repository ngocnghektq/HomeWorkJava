import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Nhap vao so hang: ");
        int row = scr.nextInt();
        System.out.println("Nhap vao so cot: ");
        int col = scr.nextInt();
        int arrVuong[][] = new int[row][col];
        nhapMang(arrVuong, row, col);
        // Bai2 bai2= new Bai2();
        // bai2.NhapMang1C();
    }

    static void nhapMang(int arr[][], int row, int col) {
//        int row;
//        int col;
//        int arr[][] = new int[row][col];
        Scanner scr = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhap phan tu thu %d%d: ", i, j);
                arr[i][j] = scr.nextInt();
            }

        }
        //in pan tu mang
        inPhanTuMang(arr, row, col);
        //In phan tu tren duong cheo chinh
        //tinh tong
        int tong = 0;
        System.out.println("Cac phan tu tren duong cheo chinh");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + "\t");
                    tong = tong + arr[i][j];
                }
                // System.out.println();
            }

        }
        System.out.println();
        System.out.println("Tong tren duong cheo chinh la: " + tong);
        //Sap xep hang 2 theo chieu tang dan
        //Đoạn này sai chưa hiểu vì sao nó quá index và không sắp xếp từ số 4
        int tem;
        //int i = 1;
        System.out.println("Mang sau khi sap xep hang 2");
//        for (int i = 1;i<2 ;i++ ) {

        for (int j = 0; j < col - 1; j++) {
            for (int m=j+1; m<col; m++) {
                if (arr[1][j] > arr[1][m]) {
                    tem = arr[1][j];
                    arr[1][j] = arr[1][m];
                    arr[1][m] = tem;

                    // System.out.print(arr[i][j] + "\t");

                }
            }

            // System.out.print(arr[i][j] + "\t");

        }
        System.out.println("Mang vua Sắp xếp là:");
        for (int k = 0; k < row; k++) {
            for (int l = 0; l < col; l++) {
                System.out.print(arr[k][l] + "\t");
            }
            System.out.println();
        }

    }

    private static void inPhanTuMang(int[][] arr, int row, int col) {
        System.out.println("Mang vua nhap la:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
//    }
}




