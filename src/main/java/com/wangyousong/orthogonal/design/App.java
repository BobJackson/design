package com.wangyousong.orthogonal.design;

public class App {

    // 需求1： 存在一个学生的列表，查找一个年龄等于18岁的学生

    public static Student findByAge(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].age() == 18) {
                return students[i];
            }
        }
        return null;
    }

}
