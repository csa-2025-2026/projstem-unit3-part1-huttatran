import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int num1 = 10;
    int num2 = 4;
    Rectangle rect1 = new Rectangle(num1, num2);
    Rectangle rect2 = new Rectangle(num2, num1);
    boolean isRotated = (rect1.getLength() == rect2.getWidth() && rect1.getWidth() == rect2.getLength());
    System.out.println(isRotated);
    boolean isCongruent = (isRotated == true || rect1.equals(rect2));
    System.out.println(isCongruent);
    boolean isSimilar = (isCongruent == true || rect2.getLength()/rect1.getLength() == rect2.getWidth()/rect1.getWidth());
    System.out.println(isSimilar);
  }
}
