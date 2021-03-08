package com.kxj;

import com.kxj.entity.Person;
import com.kxj.filter.IFilter;
import com.kxj.filter.impl.BoyFilter;
import com.kxj.filter.impl.GirlFilter;

import java.util.LinkedList;
import java.util.List;

/**
 * @author xiangjin.kong
 * @date 2021/3/8 16:38
 */
public class Test {

    public static void main(String[] args) {
        List<Person> persons = new LinkedList<>();


        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                persons.add(new Person(String.valueOf(i), "男"));
            } else {
                persons.add(new Person(String.valueOf(i), "女"));
            }
        }

        IFilter boyFilter = new BoyFilter();
        List<Person> boys = boyFilter.filter(persons);
        System.out.println(boys);

        IFilter girlFilter = new GirlFilter();
        List<Person> girls = girlFilter.filter(persons);
        System.out.println(girls);
    }
}
