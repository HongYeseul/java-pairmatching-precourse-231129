package pairmatching.controller;

import pairmatching.view.Printer;

import java.util.function.Supplier;

public class RetryExceptionHandler {
    private RetryExceptionHandler(){}

    public static <T> T get(Supplier<T> supplier){
        while(true) {
            try{
                return supplier.get();
            } catch (IllegalArgumentException e){
                Printer.printErrorMessage(e.getMessage());
            } finally {
                Printer.printMessage(""); // 왜 필요하지?
            }
        }
    }

    public static void run(Runnable runnable){
        while(true) {
            try{
                runnable.run();
                return;
            } catch (IllegalArgumentException e){
                Printer.printErrorMessage(e.getMessage());
            } finally {
                Printer.printMessage("");
            }
        }
    }
}
