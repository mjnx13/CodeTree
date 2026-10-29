import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        String[] strArr = date.split("-");
        String m = strArr[0], d = strArr[1], y = strArr[2];
        System.out.println(strArr[2] + "." + strArr[0] + "." + strArr[1]);
    }
}