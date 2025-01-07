public class UncommonBug {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        int z = x / y; // This will throw an ArithmeticException
        System.out.println(z);
    }
}