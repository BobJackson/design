package com.wangyousong.orthogonal.design;

public record Teacher(String name, int age, Gender gender) {
    public boolean female() {
        return gender.equals(Gender.FEMALE);
    }
}
