import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, ans, x;
        double D, x1, x2, B;
        String Fn = "введите первое число";
        String Sn = "введите второе число";
        String Tn = "введите третье число";
        System.out.println("Какое действие вы хотите сделать?");
        System.out.println("1-сложение 2-вычитание 3-умножение 4-деление 5-вычислить кв. уравнение");
        System.out.println("выберите цифру данного действия");
        x =scanner.nextInt();
        if (x==1) {
            System.out.println(Fn);
            a = scanner.nextInt();
            System.out.println(Sn);
            b = scanner.nextInt();
            ans = (a+b);
            System.out.println("ответ:" + " " + ans);
        }
        else if (x==2) {
            System.out.println(Fn);
            a = scanner.nextInt();
            System.out.println(Sn);
            b = scanner.nextInt();
            ans = (a-b);
            System.out.println("ответ:" + " " + ans);
        }
        else if (x==3) {
            System.out.println(Fn);
            a = scanner.nextInt();
            System.out.println(Sn);
            b = scanner.nextInt();
            ans = (a*b);
            System.out.println("ответ:" + " " + ans);
        }
        else if (x==4) {
            System.out.println(Fn);
            a = scanner.nextInt();
            System.out.println(Sn);
            b = scanner.nextInt();
            ans = (a/b);
            System.out.println("ответ:" + " " + ans);
        }
        else if (x==5) {
            System.out.println(Fn);
            a = scanner.nextInt();
            System.out.println(Sn);
            B = scanner.nextInt();
            System.out.println(Tn);
            c = scanner.nextInt();
            D = Math.sqrt(B*B-4*a*c);
            if (D>0) {
                x1 = (-B + D) / (a * 2);
                x2 = (-B - D) / (a * 2);
                System.out.println("x1 =" + " " + x1);
                System.out.println("x2 =" + " " + x2);
            }
            else if (D==0) {
                x1 = (-B) / (a * 2);
                System.out.println("x =" + " " + x1);
            }
            else
                System.out.println("ну тут корней нет, это матеша");
        }
        else {
            System.out.println("ну ты конь конечно, тебе же сказано от 1 до 5...");
            System.out.println("теперь перезапускай программу, клоун");
        }
    }
}
