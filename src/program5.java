import java.util.Scanner;

public class program5 {
    public static void main (String args[]){
        String[] mastt = new String[] {"пики","терфы","бубны","червы"};
        String[] dostoins = new String[]{"шестерка", "семерка", "восьмерка", "девятка", "десятка", "валет", "дама", "король", "туз"};
        Scanner in = new Scanner(System.in);
        System.out.println("введите номер масти от 1 до 4");
        int mast = in.nextInt();
        while(mast < 0 || mast > 4){
            System.out.println("Введены неверные числа");
            System.out.println("введите номер масти от 1 до 4");
            mast = in.nextInt();
        }
        System.out.println(mastt[mast-1]);
        System.out.println("введите номер достоинства от 6 до 14");
        int dost = in.nextInt();
        while(dost < 6 || dost > 14){
            System.out.println("Введены неверные числа");
            System.out.println("введите номер достоинства от 6 до 14");
            dost = in.nextInt();

        }
        System.out.println(dostoins[dost-6]);
        System.out.printf(mastt[mast-1]);
    System.out.printf(" " + dostoins[dost-6]);
    }
}
