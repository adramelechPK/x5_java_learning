public class LogФайл extends LogFactory{
    private final String OUTPUT = "FileLogger –Log into file: ";
    @Override
    public void logWrite(String message) {
        message = "{" + message + "}";
        System.out.println(OUTPUT + message);
    }
}
