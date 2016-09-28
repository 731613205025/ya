/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ra;

/**
 *
 * @author Student
 */
public class Ra {

    /**
     * @param args the command line arguments
     */
    public static int main(String[] args) {
        // TODO code application logic here
           int i = 0;
    int num = 0;
    boolean isNeg = false;

    //Check for negative sign; if it's there, set the isNeg flag
    if (str.charAt(0) == '-') {
        isNeg = true;
        i = 1;
    }

    //Process each character of the string;
    while( i < str.length()) {
        num *= 10;
        num += str.charAt(i++) - '0'; //Minus the ASCII code of '0' to get the value of the charAt(i++).
    }

    if (isNeg)
        num = -num;
    return num;
}
    }

