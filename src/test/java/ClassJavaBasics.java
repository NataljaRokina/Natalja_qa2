import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassJavaBasics {

    @Test
    /*public void javaBasics() {
        int a = 12;
        Integer b = 13;

        int c = sumDigits(13, 10);
        int d = sumDigits(a, b);

        System.out.println("Sum is" + c);
        System.out.println("Sum is" + b);
        //Assertions.assertEquals(expected, equal, "Sum is not correct!");
    }

    private int sumDigits(int a, int b) {
        return a + b;

*/
    public void javaBasics() {
        int amountNeeds;
        amountNeeds = 10000;//sum for loan
        int amountPayCalc;//calculated sum for loan, using calculator
        amountPayCalc = 10799;
        //int amountInterest;//interest amountPayBank
        int amountPayBank;//amount to pay to bank
        int years;
        years = 30;
        amountPayBank = ((amountNeeds / years) * 10 * 10 + (amountNeeds / years) * 10 * 8 + (amountNeeds / years) * 10 * 6) / 100+amountNeeds;


        System.out.println(amountPayBank);
        System.out.println(amountPayCalc);
        Assertions.assertEquals(amountPayBank, amountPayCalc, "Sum is not correct!");
    }
}
