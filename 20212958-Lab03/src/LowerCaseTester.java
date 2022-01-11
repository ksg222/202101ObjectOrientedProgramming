
public class LowerCaseTester {

  public static void main(String[] args) {
    String testString = "This is a Test";
    String testLowerOne = testString.toLowerCase();

    System.out.println(testLowerOne);

    String bigTestString = testLowerOne.toUpperCase();
    System.out.println(bigTestString);
  }

}
