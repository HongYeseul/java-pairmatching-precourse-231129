package pairmatching.controller;

import pairmatching.model.crew.FileInput;
import pairmatching.model.function.FairMatching;
import pairmatching.model.function.Function;
import pairmatching.model.function.FunctionType;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

import java.util.List;
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
        FunctionType functionType = function.makeFunctionType(functionNumber);

        FileInput fileInput = new FileInput();

        List<String> frontendCrew = fileInput.makeFrontCrew();
        List<String> backendCrew = fileInput.makeBackendCrew();

        if (functionType.equals(FunctionType.FAIR_MATCHING)) {
            String courseAndMission = inputView.askCourseAndMission();
            List<List<String>> makedTeam = FairMatching.run(courseAndMission, frontendCrew, backendCrew);
            showMatchingTeam(makedTeam);
        }
    }

    private void showMatchingTeam(List<List<String>> makedTeam) {
        StringBuilder makeOutput = new StringBuilder();
        for (int i = 0; i < makedTeam.size(); i++) {
            for (int j = 0; j < makedTeam.get(i).size(); j++) {
                makeOutput.append(makedTeam.get(i).get(j));
                if (j != makedTeam.get(i).size()-1) {
                    makeOutput.append(" : ");
                }
            }
            makeOutput.append("\n");
        }
        outputView.showMatchingTeam(makeOutput.toString());
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
