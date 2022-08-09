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

    // 需求2： 查找一个名字为horance的学生

    public static Student findByName(Student[] students) {
        for (Student student : students) {
            if (student.name().equals("horance")) {
                return student;
            }
        }
        return null;
    }

}
