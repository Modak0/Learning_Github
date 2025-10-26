class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

public class Main {
    public static void checkString(String input) throws NoMatchException {
        if (!input.equals("ECE")) {
            throw new NoMatchException("String does not match 'ECE'");
        }
    }

    public static void main(String[] args) {
        String userInput = "ABC";
        
        try {
            checkString(userInput);
            System.out.println("String matches 'ECE'");
        } catch (NoMatchException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
