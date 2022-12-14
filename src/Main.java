import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Integer[] numeric = {1,2,3,4,5,6,7,8,9,0};
        String[] alphabetic = {"een","twee","drie","vier","vijf","zes","zeven","acht","negen","nul"};
        Transelator translator = new Transelator(alphabetic,numeric);
        boolean play = true;
        String ongeldig = "ongeldige invoer";
        Scanner scanner = new Scanner(System.in);
        while(play){
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            String input = scanner.nextLine().toLowerCase();
            if(input.equals("x")){
                play = false;
            } else if (input.equalsIgnoreCase("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                int number = scanner.nextInt();
                scanner.nextLine();
                // waarom moet dit worden toegevoegd?
                if(number < 10){
                    String result = translator.translate(number);
                    System.out.println("De vertaling van " + number + " is " + result);
                } else {
                    System.out.println(ongeldig);
                }
            } else {
                System.out.println(ongeldig);
            }
        }

        System.out.println("programma afgesloten");
    }
}

// Huiswerk om na te kijken