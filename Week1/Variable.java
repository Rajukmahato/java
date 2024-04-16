public class Variable {
    /* Instance variable
     * Will need object to access this variable 
     * Not shared between the object 
     */
    int InstanceVariable = 100;
    /*Static/ class variable 
     * No need of object , can be called from class 
     * Shared between th objects
     */
    static int staticVariable = 20;


    public static void main(String[] args) {
        /* primitive data type */
        /* Declaration */
        byte byteValue;
        /*Initialization */
        byteValue = 100;

        System.out.println(byteValue);

        /* Declaration and Initialization */
        short shortValue = 200;
        System.out.println(shortValue);
        /* Multiple declaration */
        int intValue1, intValue2;
        intValue1 = 10000;
        intValue2 = 2000;
        System.out.println(intValue1);
        System.out.println(intValue2);
        /* Multiple declaration and initialization */
        long longVal1 = -9000, longVal2 = 9000;
        System.out.println(longVal1);
        System.out.println(longVal2);
        float floatValue = 90.90f; // the latter 'f' is needed
        System.out.println(floatValue);
        double doubleValue = 100.897d; // the letter 'd' is optional
        System.out.println(doubleValue);
        char charValue = 'c' ; // must use single quote'
        System.out.println(charValue);
        boolean booleanValue = false;
        System.out.println(booleanValue);
        /* Illegal actions below */
        // byte byteValue = 100; // we cannot redeclare the variable 
        // byteValue = 200; // instead use reassingnment 
        // boolean boolVal2 = 'false'; // cannot use different type
        // byte byteValue2 = 1000000000; // cannot exceed min and max

        /* Non primitive data type */
        String stingValue = "This is a string value";
        System.out.println(stingValue);
        /* Using class  */
        String stringValue2 = new String ("This string uses class");
        System.out.println(stringValue2);
        /* Object , for this we can use the same public class made */
        Variable VariableObject = new Variable();

        /* Use object from above to acess instance variable */
        System.out.println(VariableObject.InstanceVariable);
        /*Use Class to use static variable  */
        System.out.println(Variable.staticVariable);

        /* Type casting  */
        int intValueType = 100;
        double intValueConvertedToDouble = intValueType;
        System.out.println(intValueConvertedToDouble);
        /* Automatically cast from low datatype to high datatype  */

        /* Explicit Casting  */
        double doubleValueType = 190.8109;
        int doubleValueConvertedToInt = (int) doubleValueType;
        System.out.println(doubleValueConvertedToInt);
        /*Manually specify data type for eg. (int) */
        /* Note this type cast only be done in primitive data type  */
        /* Task
         * Make one double variable called doubleVar1 = 1000.12
         * Explicitly cast the variable info float , floatvar1
         * Explicitly cast the floatVar1 into int, intvar1
         * Make a String variable with "The integer is "
         * Print the String variable and print the int variable in another 
         */
        double variableVar1 = 1000.12;
        float variableVar3 = (float) variableVar1;
        System.out.println(variableVar3);
        

    }
    
}
