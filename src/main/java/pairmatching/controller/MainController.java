package pairmatching.controller;

import pairmatching.model.function.Function;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

import java.util.function.Supplier;

public class MainController {
    private final InputView inputView;
    private final OutputView outputView;

    public MainController(
            final InputView inputView,
            final OutputView outputView
    ) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        String functionNumber = askFunction();
        Function function = new Function();
        function.run(functionNumber);
    }

    private String askFunction() {
        return inputView.askFunction();
    }

    private void showXXX() {

    }

    private <T> T get(Supplier<T> supplier){
        return RetryExceptionHandler.get(supplier);
    }
}
