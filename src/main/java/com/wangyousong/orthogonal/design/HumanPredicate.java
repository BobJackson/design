package com.wangyousong.orthogonal.design;

import java.util.function.Predicate;

public class HumanPredicate {

    public static Predicate<Human> age(Matcher<Integer> m) {
        return s -> m.matches(s.age());
    }

    public static Predicate<Human> name(Matcher<String> m) {
        return s -> m.matches(s.name());
    }
}
