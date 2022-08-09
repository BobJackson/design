package com.wangyousong.orthogonal.design;

public class NamePredicate implements StudentPredicate {
    private final String name;

    public NamePredicate(String name) {
        this.name = name;
    }

    @Override
    public boolean test(Student s) {
        return s.name().equals(name);
    }
}
