import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        String[] strArr = date.split("\\.");
        String y = strArr[0], m = strArr[1], d = strArr[2];
        System.out.println(strArr[1] + "-" + strArr[2] + "-" + strArr[0]);
    }
}