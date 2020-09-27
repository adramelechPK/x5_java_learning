public class LogКонсоль extends LogFactory{
    private final String OUTPUT = "ConsoleLogger –Log into console: ";
    @Override
    public void logWrite(String message) {
        message = "{" + message + "}";
        System.out.println(OUTPUT + message);
    }
}
