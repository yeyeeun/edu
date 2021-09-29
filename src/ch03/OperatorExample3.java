package ch03;

public class OperatorExample3 {
    public static void main(String[] agrs){
        int n1 = 10;
        int n2 = 10;
        int n3 = 20;
        int n4 = 20;

        boolean result1 = n1 >= n2;
        boolean result2 = n3 > n4;

        // 하나라도 false이면 flase (and)
        System.out.println(result1 && result2);
        // 하나라도 true이면 true (or)
        System.out.println(result1 || result2);

    }
}
