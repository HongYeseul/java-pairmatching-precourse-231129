package pairmatching.view;

public class Printer {
    final static String ERROR_TAG = "[ERROR] ";

    private Printer(){}

    public static void printMessage(String message){
        System.out.println(message);
    }

    private void printNewLine(){
        System.out.print(System.lineSeparator());
    }

    public static void printUsingFormat(String format, Object... args){
        System.out.printf(format, args);
        System.out.println();
    }

    public static void printErrorMessage(String errorMessage) {
        printMessage(ERROR_TAG + errorMessage);
    }
}