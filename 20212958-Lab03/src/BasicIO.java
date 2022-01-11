import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// An exploration of basic input and output.
class BasicIO {

  // Reads and processes string input.
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = stdin.nextLine();

    System.out.print("Enter your age: ");
    int years = stdin.nextInt();

    System.out.print("Enter your height: ");
    int height = stdin.nextInt();

    // System.out.println("your name is " + name);
    // System.out.println("your living day is " + years * 360);
    // System.out.println("your height is " + height);

    SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
    Date time = new Date();

    String currentDate = format.format(time);

    // print all at once.
    System.out.printf("%s 현재 %s(%d)의 키는 %d cm 입니다.", currentDate, name, years, height);
  } // method main

} // class BASIC_IO
