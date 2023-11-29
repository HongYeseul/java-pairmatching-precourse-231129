package pairmatching.model.result;

import java.util.List;

public class MatchingResult {
    Course course;
    Mission mission;
    List<String> matchingCrews;

    public MatchingResult(Course course, Mission mission, List<String> matchingCrews) {
        this.course = course;
        this.mission = mission;
        this.matchingCrews = matchingCrews;
    }
}
