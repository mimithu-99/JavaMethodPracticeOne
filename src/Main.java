public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int num1 = 25;
        int num2 = 15;
        Main obj = new Main();
        int result = obj.addNumber(num1 ,num2);
        System.out.println("Sum is: " + result);
    }
    public int addNumber(int a, int b){
        int sum = a + b;
        return sum;
    }
}