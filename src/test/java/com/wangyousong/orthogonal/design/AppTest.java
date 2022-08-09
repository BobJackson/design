package com.wangyousong.orthogonal.design;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.wangyousong.orthogonal.design.App.find;
import static com.wangyousong.orthogonal.design.Gender.FEMALE;
import static com.wangyousong.orthogonal.design.Gender.MALE;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

class AppTest {

    private final Student[] students = new Student[5];

    @BeforeEach
    void setUp() {
        for (int i = 0; i < 5; i++) {
            students[i] = new Student("horance" + (i == 0 ? "" : String.valueOf(i)),
                    18 + i,
                    i % 2 == 0 ? MALE : FEMALE);
        }
    }

    @Test
    void should_find_student() {
        assertThat(find(students, new AgePredicate(18)), notNullValue());
        assertThat(find(students, new NamePredicate("horance")), notNullValue());
    }
}