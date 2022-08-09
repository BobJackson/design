package com.wangyousong.orthogonal.design;

public class AgePredicate implements StudentPredicate {
    private final int age;

    public AgePredicate(int age) {
        this.age = age;
    }

    @Override
    public boolean test(Student s) {
        return age == s.age();
    }
}
