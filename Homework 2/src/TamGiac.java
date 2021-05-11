public class TamGiac {
    void kiemtraTG(double a, double b, double c) {


        if ((a + b > c) && (a + c > b) && (c + b > a)) {
            System.out.println("Day la hinh tam giac");
        } else
            System.out.println("Day khong phai la hinh tam giac");
    }
}
