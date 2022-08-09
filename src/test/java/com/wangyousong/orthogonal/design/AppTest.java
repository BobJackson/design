package com.wangyousong.orthogonal.design;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.wangyousong.orthogonal.design.App.find;
import static com.wangyousong.orthogonal.design.Gender.FEMALE;
import static com.wangyousong.orthogonal.design.Gender.MALE;
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
    void should_find_student() {
        assertThat(find(students, s -> s.age() == 18), notNullValue());
        assertThat(find(students, s -> s.name().equals("horance")), notNullValue());
    }

    @Test
    void should_find_teacher() {
        assertThat(find(teachers, Teacher::female), notNullValue());
    }
}