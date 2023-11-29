package pairmatching.model.function;

public class Function {
    public FunctionType makeFunctionType(String functionNumber) {
        if (functionNumber.equals("Q")) {
            // 종료
            return FunctionType.QUIT;
        }
        int selection = Integer.parseInt(functionNumber);
        if (selection == 1) {
            // 페어 매칭
            return FunctionType.FAIR_MATCHING;
        }
        if (selection == 2) {
            // 페어 조회
            return FunctionType.SHOW_FAIR;
        }
        if (selection == 3) {
            // 페어 초기화
            return FunctionType.INIT_FAIR;
        }
        throw new IllegalArgumentException("해당되지 않는 선택입니다.");
    }
}
