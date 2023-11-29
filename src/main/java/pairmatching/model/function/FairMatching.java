package pairmatching.model.function;

import camp.nextstep.edu.missionutils.Randoms;
import pairmatching.model.result.Course;
import pairmatching.model.result.MatchingResult;
import pairmatching.model.result.Mission;

import java.util.ArrayList;
import java.util.List;

public class FairMatching {
    public static MatchingResult run(String courseAndMission, List<String> frontendCrew, List<String> backendCrew) {
        String[] input = courseAndMission.split(", ");
        List<List<String>> makedTeam = new ArrayList<>();

        if (Course.BACKEND.getName().equals(input[0])) {
            makedTeam = makeRandomTeam(backendCrew);
            return new MatchingResult(Course.BACKEND, Mission.findByName(input[3]), makedTeam);
        }

        if (Course.FRONTEND.getName().equals(input[0])) {
            makedTeam = makeRandomTeam(frontendCrew);
            return new MatchingResult(Course.FRONTEND, Mission.findByName(input[3]), makedTeam);
        }
        throw new IllegalArgumentException("잘못된 입력입니다.");
    }

    private static List<List<String>> makeRandomTeam(List<String> crews) {
        List<String> shuffledCrew = Randoms.shuffle(crews);
        List<List<String>> makedTeam = new ArrayList<>();

        int index = 0;
        for (int i = 0; i < shuffledCrew.size() / 2; i++) {
            List<String> joinTeam = new ArrayList<>();
            if ((shuffledCrew.size() / 2 -1) == i && shuffledCrew.size() % 2 == 1) {
                joinTeam.add(shuffledCrew.get(index++));
            }
            joinTeam.add(shuffledCrew.get(index++));
            joinTeam.add(shuffledCrew.get(index++));
            makedTeam.add(joinTeam);
        }
        return makedTeam;
    }

}
