package pairmatching.model.function;

import pairmatching.model.crew.Crew;
import pairmatching.model.crew.FileInput;

import java.util.List;

public class Function {
    List<Crew> frontendCrew;
    List<Crew> backendCrew;
    public void run(String functionNumber) {
        if (functionNumber.equals("Q")) {
            // 종료
            return;
        }

        FileInput fileInput = new FileInput();
        int selection = Integer.parseInt(functionNumber);
        frontendCrew = fileInput.makeFrontMember();
        for (int i = 0; i < frontendCrew.size(); i++) {
            System.out.println(frontendCrew.get(i).CourseAndName());
        }
        if (selection == 1) {
            // 페어매칭`
        }
        if (selection == 2) {
            // 페어 조회
        }
        if (selection == 3) {
            // 페어 초기
        }
    }
}
