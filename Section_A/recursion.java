public class recursion {
    public static void main(String[] args) {
        // Saves the string that would be reversed
        String myStr = "emosewA si avaJ";
        //create Method and pass and input parameter string
        String reversed = reverseString(myStr);
        
        System.out.println("The reversed string is: " + reversed);
        printFibonacciSeries(10);
    }

    //Method take string parameter and check string is empty or not
    public static String reverseString(String myStr){
        if (myStr.isEmpty()){
            System.out.println("String in now Empty");
            return myStr;
        }
        //Calling Function Recursively
        System.out.println("String to be passed in Recursive Function: "+myStr.substring(1));
        return reverseString(myStr.substring(1)) + myStr.charAt(0);
    }

    public static void printFibonacciSeries(int maxNumber)  {
        // Set it to the number of elements you want in the Fibonacci Series
        int previousNumber = 0;
        int nextNumber = 1;
        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
        for (int i = 1; i <= maxNumber; ++i){
            System.out.print(previousNumber+" ");
            // On each iteration, we are assigning second number
            // to the first number and assigning the sum of last two
            // numbers to the second number
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
        System.out.println();
    } 

}