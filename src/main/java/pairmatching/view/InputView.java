package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String readLine(){
        return Console.readLine();
    }

//    public void close(){
//        Console.close();
//    }

    public Integer readVisitDate() {
//        String datePlan = readLine();
//        checkNumericInput(datePlan);
//        return Integer.parseInt(datePlan);
        return null;
    }

    public String readMenuAndCount() {
//        String orderPlan = readLine();
//        checkOrderFormatInput(orderPlan);
//        return new OrderMenuInputDTO(orderPlan);
        return null;
    }

    public String askFunction() {
        Printer.printMessage("기능을 선택하세요.");
        Printer.printMessage("1. 페어 매칭");
        Printer.printMessage("2. 페어 조회");
        Printer.printMessage("3. 페어 초기화");
        Printer.printMessage("Q. 종료");
        return readLine();
    }

    public String askCourseAndMission() {
        String message = "#############################################\n" +
                "과정: 백엔드 | 프론트엔드\n" +
                "미션:\n" +
                "  - 레벨1: 자동차경주 | 로또 | 숫자야구게임\n" +
                "  - 레벨2: 장바구니 | 결제 | 지하철노선도\n" +
                "  - 레벨3: \n" +
                "  - 레벨4: 성능개선 | 배포\n" +
                "  - 레벨5: \n" +
                "############################################\n" +
                "과정, 레벨, 미션을 선택하세요.\n" +
                "ex) 백엔드, 레벨1, 자동차경주";
        Printer.printMessage(message);
        return readLine();
    }

    public String askRetry() {
        String message =  "매칭 정보가 있습니다. 다시 매칭하시겠습니까?\n" +
                "네 | 아니오";
        Printer.printMessage(message);
        return readLine();
    }
}