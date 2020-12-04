package nunez_350;


public class SimpleCalculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        return a / b;
    }
   public long factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
       }

    }

    public double SquareRoot(double i) {
        double n;
        double sqRt = i / 2;
        do {
            n = sqRt;
            sqRt = (n + (i / n)) / 2;
        } while ((n - sqRt) != 0);
        return sqRt;

    }

    public static final void main(String[] args) {
        System.out.println("Hey there CIS350.");
    }
}

