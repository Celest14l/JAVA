// Calculator.java

class Calculator {
    //addition
    int addition() {
        int[] num;
        UserInput u1 = new UserInput();
        num = u1.userInput();
        int sum = num[0] + num[1];
        return sum;
    }

    //subtraction
    int subtraction() {
        int[] num;
        UserInput u1 = new UserInput();
        num = u1.userInput();
        int difference = num[0] - num[1];
        return difference;
    }

    //multiplication
    int multiplication() {
        int[] num;
        UserInput u1 = new UserInput();
        num = u1.userInput();
        int product = num[0] * num[1];
        return product;
    }

    //division
    double division() {
        int[] num;
        UserInput u1 = new UserInput();
        num = u1.userInput();
        if (num[1] == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        double quotient = (double) num[0] / num[1];
        return quotient;
    }
}

