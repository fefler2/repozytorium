import java.util.Scanner;

public class PulRiklest {

    public static void main(String[] args) {

        /*
        Na zadanie dostałem napisać funkcję, która przyjmuje
        sekundy jako parametr i wypisuje na ekran czas w formacie hh:mm:ss.
        1000 = 00:16:40
        5000 = 01:23:20

         */

        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds - (hours * 3600))/60;
        int second = seconds - (hours*3600 + minutes*60);


        if (hours < 10){
            System.out.println("0"+hours+":"+minutes+":"+second);
        }
        else {
            System.out.println(hours+":"+minutes+":"+second);
        }



    }
}
