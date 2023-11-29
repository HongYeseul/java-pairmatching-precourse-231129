package pairmatching.model.crew;

import java.util.List;

public class Crew {
    private Course course;
    private String name;

    public Crew(Course course, String name) {
        this.course = course;
        this.name = name;
    }

    public String CourseAndName() {
        return course.name() + " 코스 " + name;
    }

    public List<Crew> makeFrontCrew() {
//        return FileInput.makeFrontMember();
        return null;
    }
}
