package pairmatching.model.function;

public enum FunctionType {
    FAIR_MATCHING(1, "페어매칭"),
    SHOW_FAIR(2, "페어조회"),
    INIT_FAIR(3, "페어초기화"),
    QUIT(0, "종료");

    private Integer functionNumber;
    private String functionName;

    FunctionType(Integer number, String name){
        this.functionNumber = number;
        this.functionName = name;
    }
}
