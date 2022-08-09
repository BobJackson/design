package com.wangyousong.orthogonal.design;

import java.util.function.Predicate;

public class NamePredicate implements StudentPredicate, Predicate<Student> {
    private final String name;

    public NamePredicate(String name) {
        this.name = name;
    }

    @Override
    public boolean test(Student s) {
        return s.name().equals(name);
    }
}
