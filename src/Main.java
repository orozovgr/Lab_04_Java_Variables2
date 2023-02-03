public class Main {
    public static void main(String[] args) {
        //intOperandA, intOperandB, intSum, intProduct, intDifference, intQuotient, intModulo

        int intOperandA = 3;
        int intOperandB = 5;

        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;

        intSum = intOperandA + intOperandB;

        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference of " + intOperandB + " is " + intDifference);

        intProduct = intOperandA * intOperandB;

        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intQuotient = intOperandA / intOperandB;
        System.out.println("intquotient is " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("intModulo is " + intOperandA + " and " + intOperandB + " is " + intModulo);

        //doubleOperandA, doubleOperandB, doubleSum, doubleProduct, doubleDifference, doubleQuotient,

        double doubleOperandA = 3;
        double doubleOperandB = 5;

        double doubleSum = 0;
        double doubleProduct = 0;
        double doubleDifference = 0;
        double doubleQuotient = 0;

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("doubleSum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println(" The doubleProduct of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("doubleDifference of" + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("doubleQuotient is " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

    }
}


