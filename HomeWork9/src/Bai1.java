import java.util.Scanner;

public class Bai1 {
    public void conTainString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi A: ");
        String chuoiA = scanner.nextLine();
        System.out.println("Nhập chuỗi B: ");
        String chuoiB = scanner.nextLine();
        System.out.println("Nội dung A là:" + chuoiA);
        System.out.println("Nội dung B là:" +chuoiB);
        if (chuoiA.contains(chuoiB)){
            System.out.println("Nội dung A chứa nội dung B");
        } else  if (chuoiB.contains(chuoiA)){
            System.out.println("Nội Dung B chứa nội dung A");
        }

        else
            System.out.println("Nội dung A không chứa nội dung B và ngược lại");
    }

}
