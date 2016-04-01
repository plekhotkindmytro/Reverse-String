package dmytro;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter a valid string as a parameter.");
            return;
        }

        System.out.println(reverse(args[0]));

    }

    private static String reverse(String input) {
        char[] inputChars = input.toCharArray();
        StringBuilder outputBuilder = new StringBuilder();
        for (int i = inputChars.length - 1; i >= 0; i--) {
            outputBuilder.append(inputChars[i]);
        }
        return outputBuilder.toString();
    }
}
