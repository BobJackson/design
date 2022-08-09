package com.wangyousong.orthogonal.design;

import java.util.function.Predicate;

public class AgePredicate implements StudentPredicate, Predicate<Student> {
    private final int age;

    public AgePredicate(int age) {
        this.age = age;
    }

    @Override
    public boolean test(Student s) {
        return age == s.age();
    }
}
