import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String input = scanner.nextLine();
        int score1 = 0;
        int score2 = 0;
        int totalscore1 = 0;
        int totalscore2 = 0;
        while (!input.equals("End of game")) {
            int card1 = Integer.parseInt(input);
            int card2 = Integer.parseInt(scanner.nextLine());

            if (card1 == card2) {
                int a = Integer.parseInt(scanner.nextLine());
                int b = Integer.parseInt(scanner.nextLine());
                if (a > b) {
                    System.out.println("Number wars!");
                    System.out.printf("%s is winner with %d points", firstName, totalscore1);
                } else {
                    System.out.println("Number wars!");
                    System.out.printf("%s is winner with %d points", secondName, totalscore2);
                }
                break;
            }

             if (card1 > card2) {
                score1 = card1 - card2;
                totalscore1 += score1;
            } else {
                score2 = card2 - card1;
                totalscore2 += score2;
            }

            input = scanner.nextLine();

        }

        if (input.equals("End of game")) {
            System.out.printf("%s has %d points%n", firstName, totalscore1);
            System.out.printf("%s has %d points", secondName, totalscore2);
        }

    }
}
