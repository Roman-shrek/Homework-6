public class Main {
    public static void main(String[] args) {
        // Задание 1
        for (int i = 1; i <= 10; i++) {
            System.out.println("Целое число " + i);
        }
        System.out.println();
        // Задание 2
        for (int a = 10; a >= 1; a--) {
            System.out.println("Целое число " + a);
        }
        System.out.println();
        // Задание 3
        for (int b = 0; b < 17; b = b + 2) {
            System.out.println("Четное чсло " + b);
        }
        System.out.println();
        // Задание 4
        for (int c = 10; c >= -10; c--) {
            System.out.println(c);
        }
        System.out.println();
        // Задача 5
        for (int d = 1904; d <= 2096; d = d + 4) {
            System.out.println(d + " год является високосным");
        }
        System.out.println();
        // Задание 6
        for (int e = 7; e <= 98; e = e + 7) {
            System.out.println(e);
        }
        System.out.println();
        // Задание 7
        for (int f = 1; f <= 512; f = f * 2) {
            System.out.println(f);
        }
        System.out.println();
        // Задание 8
        int cash = 0;
        for (int j = 1; j <= 12; j++) {
            cash = cash + 29000;
            System.out.println("Месяц " + j + " сумма накопления равна " + cash + " рублей");
        }
        System.out.println();
        // Задание 9
        int salary = 29000;
        int deposit = 0;
        for (int g = 1; g <= 12; g++) {
            deposit = deposit + deposit / 100;
            deposit = deposit + salary;
            System.out.println("Месяц " + g + " сумма накопления равна " + deposit + " рублей");
        }
        System.out.println();
        // Задача 10
        int number = 2;
        for (int r = 1; r <= 10; r++) {
            System.out.println("2 * " + r + " = " + number * r);
        }
    }
}