package pairmatching.model.result;

import java.util.List;

public class MatchingResult {
    Course course;
    Mission mission;
    List<List<String>> matchingCrews;

    public MatchingResult(Course course, Mission mission, List<List<String>> matchingCrews) {
        this.course = course;
        this.mission = mission;
        this.matchingCrews = matchingCrews;
    }

    public String getMatchingTeam() {
        StringBuilder makeOutput = new StringBuilder();
        for (int i = 0; i < matchingCrews.size(); i++) {
            for (int j = 0; j < matchingCrews.get(i).size(); j++) {
                makeOutput.append(matchingCrews.get(i).get(j));
                if (j != matchingCrews.get(i).size()-1) {
                    makeOutput.append(" : ");
                }
            }
            makeOutput.append("\n");
        }
        return makeOutput.toString();
    }
}
