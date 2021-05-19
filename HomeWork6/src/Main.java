import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        System.out.println("Nhap vao phan tu cua mang: ");
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Nhap phan tu thu i %d\n", i);
            array[i] = scn.nextInt();
        }
        //in phan tu cua mang
        System.out.print("Mang vua nhap la:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        //tim phan tu lon nhat va index cua no
        int index = 0;
        int indexSecond = 0;
        int maxValue = 0;
        int secondMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {

                maxValue = array[i];
                index = i;
                //continue;
            } else if ((secondMax < array[i]) && (array[i] != maxValue)) {
                secondMax = array[i];
                indexSecond = i;
            }


        }
        System.out.printf("Phan tu max nhat trong mang la  %d \n", maxValue);
        System.out.printf("Vi tri index cua phan tu max trong mang la %d \n", index);
        System.out.printf("Phan tu max thu 2 trong mang la  %d \n", secondMax);
        System.out.printf("vi tri index  cua phan tu max thu 2 trong mang la %d \n", indexSecond);


        //tim phan tu nho nhat trong mang
        int index1 = 0;
        int minValue = array[0];
        for (int j = 0; j < array.length; j++) {
            if (minValue > array[j]) {
                minValue = array[j];
                index1 = j;
            }


        }
        System.out.printf("Phan tu min trong mang la %d \n", minValue);
        System.out.printf("Index cua phan tu min trong mang la %d\n", index1);


        //Bai 2
//        System.out.println("Bai tap so 1");
//        int m;
//        System.out.println("Nhap vao so phan tu cua mang");
//        Scanner scan1 = new Scanner(System.in);
//        m = scan1.nextInt();
//        String strArray[] = new String[m];
//        for (int j = 0; j < strArray.length; j++) {
//            System.out.println("Nhap phan tu thu:" + j + ":");
//            strArray[j] = scan1.next();
//        }
//        //In phan tu cua mang
//        System.out.println("phan tu cua mang la:" + Arrays.toString(strArray));


    }
}




