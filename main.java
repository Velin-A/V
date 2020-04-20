import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        calculatingRectangle();
        daysinthemonths();
        crazyCheeter();
    }

    public static void calculatingRectangle() {
        System.out.println("Calculator for rectangles parameter and area");

        Scanner Height = new Scanner(System.in);
        System.out.println("Enter height: ");
        int height = Height.nextInt();

        Scanner Width = new Scanner(System.in);
        System.out.println("Enter width: ");
        int width = Width.nextInt();

        int parameter = (2 * width) + (2 * height);
        int countenance = width * height;
        System.out.println("The parameter of the rectangle is " + parameter + " , " +
                "and its area is " + countenance);
    }

    public static void daysinthemonths() {
            Scanner month = new Scanner(System.in);
            System.out.println("Enter the number of the month you want to check: ");
            int monthNumber = month.nextInt();

            if (monthNumber == 1) {
                System.out.println("January has 31 days");
            } else if (monthNumber == 2) {
                System.out.println("February has 28 days");
            } else if (monthNumber == 3) {
                System.out.println("March has 31 days");
            } else if (monthNumber == 4) {
                System.out.println("April has 30 days");
            } else if (monthNumber == 5) {
                System.out.println("May has 31 days");
            } else if (monthNumber == 6) {
                System.out.println("June has 30 days");
            } else if (monthNumber == 7) {
                System.out.println("July has 31 days");
            } else if (monthNumber == 8) {
                System.out.println("August has 31 days");
            } else if (monthNumber == 9) {
                System.out.println("September has 30 days");
            } else if (monthNumber == 10) {
                System.out.println("October has 31 days");
            } else if (monthNumber == 11) {
                System.out.println("November has 30 days");
            } else if (monthNumber == 12) {
                System.out.println("December has 31 days");
            } else
                System.out.println("There are only twelve months and are numbered form 1 to 12");
    }

    public static void crazyCheeter() {
        int floor = 9;
        String neighbor = "Default";
        switch (floor) {
            case 9:
                System.out.println("Етаж " + floor);
                floor--;
            case 8:
                neighbor = " Здравей Мими";
                System.out.println("Етаж " + floor + ": " + neighbor);
                floor--;
            case 7:
                neighbor = " Как си Пепи";
                System.out.println("Етаж " + floor + ": " + neighbor);
                floor--;
            case 6:
                neighbor = " Здрасти Ваня";
                System.out.println("Етаж " + floor + ": " + neighbor);
                floor--;
            case 5:
                neighbor = " Добро утро Хриси";
                System.out.println("Етаж " + floor + ": " + neighbor);
                floor--;
            case 4:
                neighbor = " Пoсле ще ти звънна Стел";
                System.out.println("Етаж " + floor + ": " + neighbor);
                floor--;
            case 3:
                neighbor = " Хей Маги";
                System.out.println("Етаж " + floor + ": " + neighbor);
                floor--;
            case 2:
                neighbor = " Вчера ти писах Дени";
                System.out.println("Етаж " + floor + ": " + neighbor);
                floor--;
            case 1:
                neighbor = " О, здравей Лен...";
                System.out.println("Етаж " + floor + ": " + neighbor);
                floor--;
            case 0:
                neighbor = "Ауч";
                System.out.println(neighbor);
                break;
        }
    }
}
