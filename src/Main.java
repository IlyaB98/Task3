public class Main {
    public static void main(String[] args) {
        task5();
    }

    public static void task1() {
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task2() {
        int a = 5;
        int dayInMonth = 31;
        while (a <= dayInMonth) {
            System.out.println("Сегодня пятница, " + a + "-е число. Необходимо подготовить отчет.");
            a += 7;
        }
    }

    public static void task3() {
        int year = 2022;
        int minYear = year - 200;
        int maxYear = year + 100;
        while (minYear <= maxYear) {
            if (minYear % 79 == 0) {
                System.out.println(minYear);
            }
            minYear++;
        }
    }

    public static void task4() {
        for (int a = 1; a <= 30; a++) {

            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println(a + ": ping pong");
            } else if (a % 3 == 0) {
                System.out.println(a + ": ping");
            } else if (a % 5 == 0) {
                System.out.println(a + ": pong");
            } else {
                System.out.println(a + ": ");
            }
        }
    }

    public static void task5() {
        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");
        for (int i = 1; i <= 8; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}