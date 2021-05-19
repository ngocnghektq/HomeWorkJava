import java.util.Scanner;

public class Main {
    // set bo qua va dem
    static final int BOQUA = 0;
    static final int DEM = 1;

    static int demTu(String str) {
        // mặc định state = bo qua
        int state = BOQUA;
        int count = 0, i = 0;

        while (i < str.length()) {
            // nếu gặp các ký tự k phải chữ, thì set = bỏ qua
            if (str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t')
                state = BOQUA;

// nếu ký tự tieps k phải dấu cách và trạng thái là bỏ qua, thì set lại trạng thái = đếm để cho vào count

            else if (state == BOQUA) {
                state = DEM;
                count++;
            }
            // tăng biến i để duyệt ký tự tiếp
            ++i;
        }
        return count;
    }

    public static void main(String[] args) {
        //Bai tap 5 và 14
        String str = "You only live once, but if you do it right, once is enough";
        String kyTu = "o";
        int count = 0;
        int index = str.indexOf(kyTu);
        while (index > 0) {
            System.out.println("Vi tri index cua ky tu o " + index);
            index = str.indexOf(kyTu, index + 1);
            count++;

        }
        System.out.println("Count cua ky tu o la " + count);


        //Bai 8
        System.out.println("Bài 8 đếm số từ");
        System.out.println("Nhập vào một chuỗi:");
        Scanner scn = new Scanner(System.in);
        String strChuoi = scn.nextLine();
        strChuoi = strChuoi.trim();

        System.out.println("tong so tu la: " + demTu(strChuoi));


    }
}
