import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input word: ");
        String input = scan.nextLine();
        WordChecker search = new WordChecker(text);
        boolean result = search.hasWord(input);
        System.out.println(result);
    }
}
