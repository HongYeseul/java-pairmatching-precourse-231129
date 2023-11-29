package pairmatching.model.function;

import camp.nextstep.edu.missionutils.Randoms;
import pairmatching.model.result.Course;

import java.util.ArrayList;
import java.util.List;

public class FairMatching {
    public static List<List<String>> run(String courseAndMission, List<String> frontendCrew, List<String> backendCrew) {
        String[] input = courseAndMission.split(", ");

        List<List<String>> makedTeam = new ArrayList<>();

        if (Course.BACKEND.name().equals(input[0])) {
            List<String> shuffledCrew = Randoms.shuffle(backendCrew);

            int index = 0;
            for (int i = 0; i < shuffledCrew.size() / 2; i++) {
                List<String> joinTeam = new ArrayList<>();
                if ((shuffledCrew.size() / 2 -1) == i && shuffledCrew.size() % 2 == 1) {
                    joinTeam.add(shuffledCrew.get(index++));
                    joinTeam.add(shuffledCrew.get(index++));
                    joinTeam.add(shuffledCrew.get(index++));
                    break;
                }
                joinTeam.add(shuffledCrew.get(index++));
                joinTeam.add(shuffledCrew.get(index++));
                makedTeam.add(joinTeam);
            }
        }
        return makedTeam;
    }

}
