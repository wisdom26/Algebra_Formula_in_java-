import java.util.Scanner;

public class AlgebraicFormulas {

    public static int squareSum(int a, int b) {
        return (a * a) + (b * b) + 2 * a * b;
    }

    public static int squareDifference(int a, int b) {
        return (a * a) + (b * b) - 2 * a * b;
    }

    public static int productDifference(int a, int b) {
        return (a + b) * (a - b);
    }

    public static int sumSquares(int a, int b) {
        return (a * a) + (b * b);
    }

    public static int sumCubes(int a, int b) {
        return (a + b) * ((a * a) - a * b + (b * b));
    }

    public static int differenceCubes(int a, int b) {
        return (a - b) * ((a * a) + a * b + (b * b));
    }

    public static int doubleSumSquares(int a, int b) {
        return 2 * ((a * a) + (b * b));
    }

    public static int squareSumDifference(int a, int b) {
        return (a + b) * (a + b) - (a - b) * (a - b);
    }

    public static int fourthPowerSum(int a, int b) {
        return (a * a * a * a) + (b * b * b * b);
    }

    public static int cubeDifference(int a, int b) {
        return (a * a * a) - (b * b * b);
    }

    public static int sumFourthPowers(int a, int b) {
        return (a * a + b * b) * (a * a + b * b);
    }

    public static int squareTripleSum(int a, int b, int c) {
        return (a * a) + (b * b) + (c * c) + 2 * a * b + 2 * b * c + 2 * c * a;
    }

    public static int squareTripleDifference(int a, int b, int c) {
        return (a * a) + (b * b) + (c * c) + 2 * a * b - 2 * b * c - 2 * c * a;
    }

    public static int cubeTripleSum(int a, int b, int c) {
        return (a * a * a) + (b * b * b) + (c * c * c) - 3 * a * b * c;
    }

    public static int sumCubesSpecial(int a, int b, int c) {
        if (a + b + c == 0) {
            return 3 * a * b * c;
        } else {
            throw new IllegalArgumentException("a + b + c must be zero");
        }
    }

    public static int octupleProduct(int a, int b) {
        return (a * a * a * a * a * a * a * a) - 8 * (a * a * a * a * a * a) * (b * b) + 28 * (a * a * a * a) * (b * b * b * b) - 56 * (a * a) * (b * b * b * b * b * b) + (b * b * b * b * b * b * b * b);
    }

    public static void main(String[] args) {
        try (Scanner x = new Scanner(System.in)) {
            System.out.print("Enter the a:");
            int a = x.nextInt();
            System.out.print("Enter the b:");
            int b = x.nextInt();
            System.out.print("Enter the c:");
            int c = x.nextInt();

            System.out.println("Square Sum: " + squareSum(a, b));
            System.out.println("Square Difference: " + squareDifference(a, b));
            System.out.println("Product Difference: " + productDifference(a, b));
            System.out.println("Sum of Squares: " + sumSquares(a, b));
            System.out.println("Sum of Cubes: " + sumCubes(a, b));
            System.out.println("Difference of Cubes: " + differenceCubes(a, b));
            System.out.println("Double Sum of Squares: " + doubleSumSquares(a, b));
            System.out.println("Square Sum Difference: " + squareSumDifference(a, b));
            System.out.println("Fourth Power Sum: " + fourthPowerSum(a, b));
            System.out.println("Cube Difference: " + cubeDifference(a, b));
            System.out.println("Sum of Fourth Powers: " + sumFourthPowers(a, b));
            System.out.println("Square Triple Sum: " + squareTripleSum(a, b, c));
            System.out.println("Square Triple Difference: " + squareTripleDifference(a, b, c));
            System.out.println("Cube Triple Sum: " + cubeTripleSum(a, b, c));

            try {
                System.out.println("Sum Cubes Special: " + sumCubesSpecial(a, b, -3));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Octuple Product: " + octupleProduct(a, b));
        }
    }
}
