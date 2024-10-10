public class Banking {
    public static void main(String[] args) {
        if (args.length > 0) {
            String command = args[0];
            switch (command) {
                case "savings":
                    savings();
                    break;
                case "loans":
                    loans();
                    break;
                case "creditcard":
                    creditCard();
                    break;
                default:
                    System.out.println("Unknown command. Please use savings, loans, or creditcard.");
                    break;
            }
        } else {
            System.out.println("No command provided. Please use savings, loans, or creditcard.");
        }
    }

    private static void savings() {
        System.out.println("Welcome to the savings section");
    }

    private static void loans() {
        System.out.println("Welcome to the loans section");
    }

    private static void creditCard() {
        System.out.println("Welcome to the credit card section");
    }
}
