package first_laba;

import java.util.Random;

public class EightExButNine {
    public static void main(String[] args) {
        Random random = new Random();
        int n= random.nextInt(156)+4;
        System.out.println(n);
        if(n<=25||n>=100){
            System.out.println("Mimo");
       }else {
            System.out.println("Popal");
        }
    }
}
