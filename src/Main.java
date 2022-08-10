import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задание 1
        int currentNum = 0;
        while (currentNum < 10) {
            System.out.print(++currentNum + " ");
        }
        System.out.println();
        for (; currentNum > 0; currentNum --) {
            System.out.print(currentNum + " ");
        }

        //Задани2
        int firstFriday = 5;
        for (int currentFriday = firstFriday; currentFriday <=31; currentFriday += 7) {
            System.out.println("Сегодня пятница, " + currentFriday + " -e число. Необходимо подготовить отчет ");
                    }

        //Задание3
        int currentYear = LocalDate.now().getYear();
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = start; year <= end; year ++) {
            if (year % 79 == 0) {
                System.out.println(year);

            }

        }

        }


    }
