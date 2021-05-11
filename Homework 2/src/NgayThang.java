public class NgayThang {
    void thang(int thang) {
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang: " + thang + " co 31 ngay");
                break;
            case 2:
                System.out.println("Thang: " + thang + " co 28 ngay hoac 29 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang: " + thang + " co 30 ngay");
                break;
            default:
                System.out.println("Thang khong ton tai");
                break;


        }
    }

    void cachIfElse(int month) {
        if (month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) {
            System.out.println("Thang: " + month + " co 31 ngay");
        } else if (month == 2) {
            System.out.println("Thang: " + month + " co 28 hoac 29 ngay");
        } else if (month == 4 | month == 6 | month == 9 | month == 11) {
            System.out.println("Thang: " + month + " co 30 ngay");
        } else {
            System.out.println("Thang khong ton tai");
        }
    }
}
