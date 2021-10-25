package com.epam.glava2;

public class Course {
    public static void main(String[] args) {
        doAction(new BaseCourse());
    }

    void method(){}

    static void doAction(Course course) {
        if (course instanceof BaseCourse base) {
// for BaseCourse and FreeCourse
           // BaseCourse base = (BaseCourse)course;
            base.method();
            System.out.println("course instanceof BaseCourse");
        } else if (course instanceof OptionalCourse optional) {
// for OptionalCourse
           // OptionalCourse optional = (OptionalCourse)course;
            optional.method();
            System.out.println("course instanceof OptionalCourse");
        } else {
// for Course or null
            System.out.println("NONE!");
        }
    }
}


class BaseCourse extends Course {/* */}
class FreeCourse extends BaseCourse {/* */}
class OptionalCourse extends Course {/* */}
