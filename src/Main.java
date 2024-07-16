import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int a = 0; // ko có giá trị khởi tạo
        // toán tử ++, --
        // a++ vs ++a : biểu thuc sẽ tra về giá trị sau khi tăng là : ++a , ngược la tra vè trước khi tăng
        int ex1 =  a++ +10; // 10
        // a = 1
        int ex2 = ++a +10; //12
        System.out.println(ex1);
        System.out.println(ex2);
        // byte -> short -> int -> long > float-> double
        double ex3 = ex1; // nới rộng , implicit casting , ép kieu ngầm định
        long ex4 = (long) ex3; // thu hep ,explicit casting , ép kiểu tuong minh


        // Nhập xuật dữ liệu
        // nhập dữ lieu : lớp Scanner
        Scanner scanner = new Scanner(System.in);
        // next_ , nextLine
        // nuốt dòng khi nhập số sang chuỗi
        // sử dụng ép kiểu bằng lớp Wrapper
        // sử dụng InputMethod


        // xuât dữ liêu
        System.out.println("in trên 1 hàng và xuống hàng ở cuối");
        System.out.print("in trên hàng nhưng ko xuống hàng");
        System.out.println("heloo");
        System.out.printf("hello %-10.1f | %5d | %-20s |",1.2,100,"nam ok");
        // kí tự tham số : %d ,%f , %s , %c
        // in theo ịnh dạng nhưng ko xuống hàng
        // hiển thị với màu sắc trong màn console (sử dụng icon Window + .)
        System.out.println("\u001B[31mRed text");
        System.out.println("\u001B[32mGreen text");
        System.out.println("\u001B[33mYellow text");
        System.out.println("\u001B[34mBlue text");
        System.out.println("\u001B[35mPurple text");
        System.out.println("\u001B[36mCyan text 😢🤦‍♂️🤦‍♀️🤦‍♀️😜🤞✌️🤷‍♂️😁👍🙌😒😍😊😂🤣❤️⚛️♾️◀️🔼");
        System.out.println("\u001B[37mWhite text😊😂😂😂🤣🤣❤️🐛");

        Config.printRed("hehe hoho"); //
        System.out.println("bshhchdvcvvdvcdvhcvdh");









    }
}