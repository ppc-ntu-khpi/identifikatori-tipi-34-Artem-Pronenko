/**
 * Main class for working with numbers
 * @author Artem Pronenko
 */
public class Exercise {

    /**
     * Method that transletes a decimal number to binary, octal and heximal system nmber
     * @param R integer with whitch action will be performed
     * @return string
     */
    public static String Calculate(int R){
        String a, b, c;
        a = Integer.toBinaryString((int) R);
        b = Integer.toOctalString((int) R) ;
        c = Integer.toHexString((int) R);
        
        return (String)(a+", "+b+", "+c) ;
    }
}
