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
}