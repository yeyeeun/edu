package ch03;

public class OperatorExample {
    public static void main(String[] agrs){
        int n1 = 10;
        int n2 = 3;
        int result =n1+n2;
        System.out.println(n1 + " + " + n2 + " = " + result);
        System.out.printf("%s + %s = %d\n",n1,n2,result);

        result = n1 + -n2;
        System.out.printf("%s + -%s = %d\n",n1,n2,result);

        boolean result2 = n1 > n2;
        System.out.printf("%s > %s = %b\n",n1,n2,result2);
        System.out.printf("%d < %d = %b\n",n1,n2,n1 < n2);
        System.out.println();
        System.out.printf("%d >= %d = %b\n",n1,n2,n1 >= n2);
        System.out.printf("%d <= %d = %b\n",n1,n2,n1 <= n2);
        System.out.println();
        System.out.printf("%d == %d = %b\n",n1,n2,n1 == n2);
        System.out.printf("%d != %d = %b\n",n1,n2,n1 != n2);
    }
}
