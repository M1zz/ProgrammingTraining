import java.util.Scanner;

public class StringMain {
    public static void main(String args[]) {
        // 문제 : 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
        // 입력 : 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

        // TODO : 문자열 한개를 입력 받는 다
        // TODO : 입력받은 문자열을 아스키 코드로 출력한다.

        System.out.print("Type charator ascii : ");
        Scanner scan = new Scanner(System.in);

        char ascii;
        ascii = scan.next().charAt(0);

        System.out.print(Integer.valueOf(ascii));


    }
}