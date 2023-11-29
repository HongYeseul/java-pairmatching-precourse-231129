package pairmatching.controller;

import pairmatching.model.crew.FileInput;
import pairmatching.model.function.FairMatching;
import pairmatching.model.function.Function;
import pairmatching.model.function.FunctionType;
import pairmatching.model.result.MatchingResult;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;
import pairmatching.view.Printer;

import java.util.List;
import java.util.function.Supplier;

public class MainController {
    private final InputView inputView;
    private final OutputView outputView;
    MatchingResult matchingResult;

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

        while (!functionType.equals(FunctionType.QUIT)) {
            if (functionType.equals(FunctionType.FAIR_MATCHING)) {
                boolean retryFlag = true;
                if (matchingResult != null) {
                    retryFlag = askRetry();
                }
                if (retryFlag) {
                    matchingResult = runFairMatching(frontendCrew, backendCrew);
                    showMatchingTeam(matchingResult);
                }
            }
            if (functionType.equals(FunctionType.SHOW_FAIR)) {
                showHistory(matchingResult);
            }
            if (functionType.equals(FunctionType.INIT_FAIR)) {
                matchingResult = null;
            }
            functionNumber = askFunction();
            functionType = function.makeFunctionType(functionNumber);
        }

    }

    private boolean askRetry() {
        while (true) {
            try {
                String yesOrNo = inputView.askRetry();
                if (yesOrNo.equals("네")) {
                    return true;
                }
                if (yesOrNo.equals("아니오")) {
                    return false;
                }
                throw new IllegalArgumentException("잘못된 입력입니다.");
            } catch (IllegalArgumentException e) {
                Printer.printErrorMessage(e.getMessage());
            }
        }
    }

    private MatchingResult runFairMatching(List<String> frontendCrew, List<String> backendCrew) {
        while (true) {
            try {
                String courseAndMission = inputView.askCourseAndMission();
                return FairMatching.run(courseAndMission, frontendCrew, backendCrew);
            } catch (IllegalArgumentException e) {
                Printer.printErrorMessage(e.getMessage());
            }
        }
    }

    private void showHistory(MatchingResult matchingResult) {
        while (true) {
            try {
                if (matchingResult == null) {
                    throw new IllegalArgumentException("[ERROR] 매칭 이력이 없습니다.");
                }
                showMatchingTeam(matchingResult);
                break;
            } catch (IllegalArgumentException e) {
                Printer.printErrorMessage(e.getMessage());
            }
        }
    }

    private void showMatchingTeam(MatchingResult makedTeam) {
        outputView.showMatchingTeam(makedTeam.getMatchingTeam());
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
