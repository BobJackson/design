package com.wangyousong.orthogonal.design;

import java.util.function.Predicate;

public final class StudentPredicate {

    private StudentPredicate() {
    }

    public static Predicate<Student> age(Matcher<Integer> m) {
        return s -> m.matches(s.age());
    }

    public static Predicate<Student> name(String name) {
        return s -> s.name().equals(name);
    }

}
