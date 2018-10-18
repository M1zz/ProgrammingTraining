package TDD;

import java.util.Scanner;

public class StringToAscii {
    // 문제 : 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
    // 입력 : 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
    private char ascii;

    // TODO : 문자열 한개를 입력 받는 다
    // TODO : 입력받은 문자열을 아스키 코드로 출력한다.
    public void asciiConvertor(){
        System.out.print("Type charator ascii : ");
        Scanner scan = new Scanner(System.in);

        ascii = scan.next().charAt(0);

        System.out.print(Integer.valueOf(ascii));
    }





    private String name;
    private int age;
    private float tall;

    public StringToAscii() {
        this.name = "Hyunho";
    }

    public StringToAscii(String name) {
        this.name = name;
    }

    public StringToAscii(String name, int age){
        this.name = name;
        this.age = age;
    }

    public StringToAscii(String name, float tall){
        this.name = name;
        this.tall = tall;
    }

    public StringToAscii(String name, int age, float tall){
        this.name = name;
        this.age = age;
        this.tall = tall;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public float getTall(){
        return tall;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTall(float tall) {
        this.tall = tall;
    }

    public void printInfo(){
        System.out.println("name: " + name + ", age: " + String.valueOf(age) + ", tall:" + String.valueOf(tall));
    }

}
