package first_laba;

public class SixEx {
    public static void main(String[] args) {
        int n0=1;
        int n1=1;
        int n2;
        System.out.print(n0+" "+n1+" ");
        for (int i=2; i < 11; i++ ) {
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
    }
}
