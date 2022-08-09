package com.wangyousong.orthogonal.design;

import static com.wangyousong.orthogonal.design.Gender.FEMALE;

public record Human(String name, int age, Gender gender) {

    public static Human student(String name, int age, Gender gender) {
        return new Human(name, age, gender);
    }

    public static Human teacher(String name, int age, Gender gender) {
        return new Human(name, age, gender);
    }

    public boolean female() {
        return gender.equals(FEMALE);
    }
}
