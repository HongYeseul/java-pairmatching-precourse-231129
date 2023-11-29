package pairmatching.model.crew;

import pairmatching.model.result.Course;

import java.util.List;

public class Crew {
    private Course course;
    private java.lang.String name;

    public Crew(Course course, java.lang.String name) {
        this.course = course;
        this.name = name;
    }

    public java.lang.String CourseAndName() {
        return course.name() + " 코스 " + name;
    }

    public List<Crew> makeFrontCrew() {
//        return FileInput.makeFrontMember();
        return null;
    }
}
