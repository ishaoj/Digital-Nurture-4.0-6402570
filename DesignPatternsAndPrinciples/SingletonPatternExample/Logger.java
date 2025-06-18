public class Logger {

    //Create a private static instance of the same class
    private static Logger instance;

    //Make the constructor private so that new instances cannot be created from outside
    private Logger() {
        System.out.println("Logger Initialized.");
    }

    //Provide a public static method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();  // Create instance if it doesn't exist
        }
        return instance;
    }

    // Logging functionality for demo
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
