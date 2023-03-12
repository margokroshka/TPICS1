package first_laba;
import java.util.Scanner;

public class SecondEx {
    public static void main(String[] args) {
        System.out.println("Введите пароль, пароль должен содержать только цифры, длина пароля не больше 5 символов");
        Scanner scanner = new Scanner(System.in);
        Integer pass=null;
        do {
            String password = scanner.nextLine();
            if (password.length() <= 5) {
                try {
                    System.out.println(Integer.parseInt(password) + " Пароль верный");
                } catch (NumberFormatException e) {
                    System.out.println("Пароль не верный");
                }
            }else {
                System.out.println("Пароль не верный");
            }
        }while (pass==null);
    }
}
