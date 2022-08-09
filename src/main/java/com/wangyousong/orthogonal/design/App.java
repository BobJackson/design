package com.wangyousong.orthogonal.design;

public class App {

    // 需求1： 存在一个学生的列表，查找一个年龄等于18岁的学生
    // 需求2： 查找一个名字为horance的学生

    public static Student find(Iterable<Student> students, StudentPredicate predicate) {
        for (Student student : students) {
            if (predicate.test(student)) {
                return student;
            }
        }
        return null;
    }

}
