package com.wangyousong.orthogonal.design;

import static com.wangyousong.orthogonal.design.Gender.FEMALE;

public record Student(String name, int age, Gender gender) {

    public boolean female() {
        return gender.equals(FEMALE);
    }
}

