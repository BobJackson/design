package com.wangyousong.orthogonal.design;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.wangyousong.orthogonal.design.App.find;
import static com.wangyousong.orthogonal.design.Gender.FEMALE;
import static com.wangyousong.orthogonal.design.Gender.MALE;
import static com.wangyousong.orthogonal.design.Matcher.eq;
import static com.wangyousong.orthogonal.design.Matcher.ne;
import static com.wangyousong.orthogonal.design.StudentPredicate.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

class AppTest {

    private final Iterable<Student> students = IntStream.range(0, 5)
            .mapToObj(AppTest::createStudent)
            .collect(Collectors.toList());

    private static Student createStudent(int i) {
        return new Student("horance" + (i == 0 ? "" : String.valueOf(i)),
                18 + i,
                i % 2 == 0 ? MALE : FEMALE);
    }

    private final Iterable<Teacher> teachers = IntStream.range(0, 5)
            .mapToObj(AppTest::createTeacher)
            .collect(Collectors.toList());

    private static Teacher createTeacher(int i) {
        return new Teacher("horance" + (i == 0 ? "" : String.valueOf(i)),
                18 + i,
                i % 2 == 0 ? MALE : FEMALE);
    }

    @Test
    void should_find_student_age_is_18() {
        assertThat(find(students, age(eq(18))), notNullValue());
    }

    @Test
    void should_find_student_name_is_horance() {
        assertThat(find(students, name("horance")), notNullValue());
    }

    @Test
    void should_find_teacher() {
        assertThat(find(teachers, Teacher::female), notNullValue());
    }

    @Test
    void should_find_age_not_18_student() {
        assertThat(find(students, age(ne(18))), notNullValue());
    }

    @Test
    void should_find_age_not_18_female_student() {
        assertThat(find(students, age(ne(18)).and(Student::female)), notNullValue());
    }

}