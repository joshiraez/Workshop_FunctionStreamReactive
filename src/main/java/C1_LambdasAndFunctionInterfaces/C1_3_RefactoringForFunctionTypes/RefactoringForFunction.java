package C1_LambdasAndFunctionInterfaces.C1_3_RefactoringForFunctionTypes;

import java.util.function.UnaryOperator;

public class RefactoringForFunction {

    /**
     * One of the cool tricks passing functions around allows us is to abstract ourselves of inner method logic
     * and abstract to common functions
     */

    public static int getDifficultNumberToCompute() {
        return 11; //Gotta change the number
    }

    public static int operationPow(int number) {
        return number*number;
    }

    public static int operationPlus2(int number) {
        return number + 2;
    }

    //Previously, you could only do this.One function for each different logic.
    public static void complexFlowWithPow() {
        int the_number = getDifficultNumberToCompute();
        int operated = operationPow(the_number);
        System.out.println(operated);
    }

    public static void complexFlowWithPlus2() {
        int the_number = getDifficultNumberToCompute();
        int operated = operationPlus2(the_number);
        System.out.println(operated);
    }

    //Now you could abstract yourself, pass the operation, and keep the common parts DRY
    public static void complexFlowWithOperation(UnaryOperator<Integer> operation) {
        int the_number = getDifficultNumberToCompute();
        int operated = operation.apply(the_number);
        System.out.println(operated);
    }

    public static void main(String[] args) {
        complexFlowWithPow();
        complexFlowWithOperation(RefactoringForFunction::operationPow);

        complexFlowWithPlus2();
        complexFlowWithOperation(RefactoringForFunction::operationPlus2);
    }
}
