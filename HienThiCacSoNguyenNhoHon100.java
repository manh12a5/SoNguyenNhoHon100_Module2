import java.util.Scanner;

public class HienThiCacSoNguyenNhoHon100 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập số: ");
        int number = scanner.nextInt();

        if ( number < 2) {
            System.out.println("Error");
        } else {
            for (int i = 2; i < 100; i++) {
                System.out.println(i);
            }
        }



    }
}
