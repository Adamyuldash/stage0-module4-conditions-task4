package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {


        int num1;
        int greatestNumber = first > second ? first : second;
        greatestNumber = greatestNumber > third ? greatestNumber : third;

        System.out.println(greatestNumber);
    }
}
