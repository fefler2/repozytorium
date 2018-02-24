import java.util.Scanner;

class ZadZJavy {

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

        String clock = "";

        if (hours < 10){
            clock = "0" + hours+":";
        }
        else {
            clock = ""+hours+":";
        }
        if (minutes < 10){
            clock += "0"+minutes+":";
        }
        else {
            clock += minutes+":";
        }

        if (second < 10){
            clock += "0"+second+":";
        }
        else {
            clock += second+":";
        }

        System.out.println(clock);

    }
}
