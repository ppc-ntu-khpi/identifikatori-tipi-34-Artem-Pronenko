package test;
import domain.Exercise;

/**
 * Test class to test the functionality of tne main class
 * @author Artem Pronenko
 */

public class TestResult {

    public static void main(String[] args) {

        int R=458632;
        System.out.println("Число "+R+" в двійковій, у восьмеричній та в шістнадцятиричній системі числення: "+Exercise.Calculate(R));
           
    }
}
