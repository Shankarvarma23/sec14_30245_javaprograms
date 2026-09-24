public class FibonacciSeries {

    // Method to print Fibonacci series up to n terms
    public static void printFibonacci(int n) {
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
      System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        int terms = 10; // Number of terms to print
        printFibonacci(terms);
    }
}