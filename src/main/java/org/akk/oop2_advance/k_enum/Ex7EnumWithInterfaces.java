package org.akk.oop2_advance.k_enum;


interface Operation {
    int calculate(int a, int b);
}


enum Operator implements Operation {
    ADD {
        @Override
        public int calculate(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT {
        @Override
        public int calculate(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY {
        @Override
        public int calculate(int a, int b) {
            return a * b;
        }
    };
}


public class Ex7EnumWithInterfaces {
    public static void main(String[] args) {
        int resultAdd = Operator.ADD.calculate(10, 5);
        System.out.println("Addition: " + resultAdd); // Output: Addition: 15

        int resultSubtract = Operator.SUBTRACT.calculate(10, 5);
        System.out.println("Subtraction: " + resultSubtract); // Output: Subtraction: 5

        int resultMultiply = Operator.MULTIPLY.calculate(10, 5);
        System.out.println("Multiplication: " + resultMultiply); // Output: Multiplication: 50

        // You can also pass enum constants to methods expecting the interface type
        performOperation(Operator.ADD, 20, 10);
    }

    public static void performOperation(Operation op, int x, int y) {
        System.out.println("Result of operation: " + op.calculate(x, y));
    }

}
