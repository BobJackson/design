package com.wangyousong.orthogonal.design;

public class App {

    public static Student findByAge(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].age() == 18) {
                return students[i];
            }
        }
        return null;
    }

}
