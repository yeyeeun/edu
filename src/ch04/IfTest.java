package ch04;

public class IfTest {
    public static void main(String[] args){
        int score = 94;

        if(score >= 90){
            if(score >= 97){
                System.out.println("A+");
            }else if(score <= 93){
                System.out.println("A-");
            }else{
                System.out.println("A");
            }
        }else if(score >= 80){
            if(score >= 87){
                System.out.println("A+");
            }else if(score <= 83){
                System.out.println("A-");
            }else{
                System.out.println("A");
            }
        }else if(score >= 70){
            if(score >= 77){
                System.out.println("A+");
            }else if(score <= 73){
                System.out.println("A-");
            }else{
                System.out.println("A");
            }
        }else{
            System.out.println("D");
        }

    }
}
