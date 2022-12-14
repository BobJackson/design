package com.wangyousong.orthogonal.design;

import java.util.Optional;
import java.util.function.Predicate;

public class App {

    // 需求1： 存在一个学生的列表，查找一个年龄等于18岁的学生
    // 需求2： 查找一个名字为horance的学生
    // 需求3： 存在一个老师列表，查找第一个女老师
    // 需求4： 查找年龄不等于18岁的女生

    public static <E> Optional<E> find(Iterable<? extends E> list, Predicate<? super E> predicate) {
        for (E e : list) {
            if (predicate.test(e)) {
                return Optional.of(e);
            }
        }
        return Optional.empty();
    }

}
