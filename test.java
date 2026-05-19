public class test {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");

        int sum = add(5, 7);
        System.out.println("5 + 7 = " + sum);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
