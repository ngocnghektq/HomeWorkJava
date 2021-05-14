import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Nhập vào số n:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        System.out.println("In ra Các số nguyên tố đầu tiên dùng for: ");

//         cach 1 dung for
        System.out.println("cach 1 dung For");
        for (int i = 2; count <= n; i++) {
            if (CheckSoNT.checksoNT(i)) {
                count++;
                System.out.print(i + "\t");
                if (count == n) break;
            }

        }

        //cach 2 dung while
        int count2 = 1;
        int check = 0;
        System.out.println("Cach 2 dung while");
        while (count2 <= n) {
            if (CheckSoNT.checksoNT(check)) {
                count2++;
                System.out.println("so ng to la " + check + "---- count2 la " + count2);
            }
            check++;

        }
        System.out.println("Cach 3 do while");
        int count3 = 1;
        int check1 = 0;
        do {
            if (CheckSoNT.checksoNT(check1)) {
                System.out.println("so ng to la " + check1);
                count3++;
            }
            check1++;
        } while (count3 <= n);
        System.out.println("tong So nguyen to la: " + n);

        System.out.println("=============================================================");
        //In ra 100 so nguyen to dau tien
        System.out.println("cach 1 dung For in so nguyen to nho hown 100\n");
        for (int i = 2; i <= 100; i++) {
            if (CheckSoNT.checksoNT(i)) {

                System.out.print("Cac so nguyen to nho hon100 " + i + "\n");

            }

        }



    }
}



