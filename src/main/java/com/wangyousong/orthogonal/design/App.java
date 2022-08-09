package com.wangyousong.orthogonal.design;

public class App {

    // 需求1： 存在一个学生的列表，查找一个年龄等于18岁的学生

    public static Student findByAge(Student[] students) {
        for (Student student : students) {
            if (student.age() == 18) {
                return student;
            }
        }
        return null;
    }

}
