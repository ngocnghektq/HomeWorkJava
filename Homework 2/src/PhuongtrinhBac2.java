public class PhuongtrinhBac2 {
    void giaiPT(double a, double b, double c) {
        double denTa = (b * b) - (4 * a * c);
        double nghiemkep = -(b / 2 * a);
        double x1 = ((-b) + Math.sqrt(denTa)) / (2 * a);
        double x2 = ((-b) - Math.sqrt(denTa)) / (2 * a);

        System.out.println("Gia tri denta la:" + denTa);
        if (denTa < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (denTa == 0) {
            System.out.println("Phuong trinh co nghiem kep x1=x2=" + nghiemkep);
        } else {
            System.out.println("Phuong trinh co 2 nghiem: X1= " + x1 + " va x2= " + x2);
        }
    }
}
