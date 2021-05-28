import java.util.Scanner;
public class Bai2 {

    public void checkTrung() {
        //Loại bỏ các ký tự giống nhau trong 1 chuỗi aabbccd => abcd
        String chuoiTrung = "";
        String chuoiKTrung = "";
        int i, j, temp = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập chuỗi ký tự: ");
        chuoiTrung = scan.nextLine();
        int length = chuoiTrung.length();
        Boolean[] arrCheck = new Boolean[length];
        char[] arrChar = new char[length];
        for (i = 0; i < length; i++) {
            arrCheck[i] = false;
        }
        for (i = 0; i < length - 1; i++) {
            for (j = i + 1; j < length; j++) {
                if (chuoiTrung.charAt(i) == chuoiTrung.charAt(j)) {
                    arrCheck[j] = true;
                }
            }
        }
        for (i = 0; i < length; i++) {
            if (!arrCheck[i]) {
                chuoiKTrung = chuoiKTrung.concat(String.valueOf(chuoiTrung.charAt(i)));
            }
        }
        System.out.printf("Chuỗi sau khi đã loại bỏ ký tự trùng: %s", chuoiKTrung);
        System.out.println();
    }
}