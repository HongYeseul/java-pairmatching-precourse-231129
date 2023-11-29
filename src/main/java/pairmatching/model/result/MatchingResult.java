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
}
