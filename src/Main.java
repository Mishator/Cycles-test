public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        for (int i = 0; i < 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int salary = 65535;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + " Итого " + total);
        }
        System.out.println(total);
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int salary = 65535;
        int total = 0;
        for ( ; total < 1_000_000; ) {
            total = total + total/100;
            total = total + salary;
            System.out.println(total);
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        int salary = 65535;
        int total = 0;
        while (total < 1_000_000) {
            total = total + total/100;
            total = total + salary;
            System.out.println(total);
        }
        System.out.println();
    }
    }