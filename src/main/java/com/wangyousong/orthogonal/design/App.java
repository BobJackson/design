package com.wangyousong.orthogonal.design;

public class App {

    // 需求1： 存在一个学生的列表，查找一个年龄等于18岁的学生
    // 需求2： 查找一个名字为horance的学生
    // 需求3： 存在一个老师列表，查找第一个女老师

    public static Student find(Iterable<Student> students, StudentPredicate predicate) {
        for (Student student : students) {
            if (predicate.test(student)) {
                return student;
            }
        }
        return null;
    }

    public static Teacher find(Iterable<Teacher> teachers, TeacherPredicate predicate) {
        for (Teacher t : teachers) {
            if (predicate.test(t)) {
                return t;
            }
        }
        return null;
    }

}
