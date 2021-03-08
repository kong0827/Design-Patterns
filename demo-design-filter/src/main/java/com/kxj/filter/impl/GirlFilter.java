package com.kxj.filter.impl;

import com.kxj.entity.Person;
import com.kxj.filter.IFilter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xiangjin.kong
 * @date 2021/3/8 16:36
 */
public class GirlFilter implements IFilter {
    /**
     * 过滤女生
     * @param persons
     * @return
     */
    @Override
    public List<Person> filter(List<Person> persons) {
        return persons.stream().filter(person -> person.getGender().equals("女")).collect(Collectors.toList());
    }
}
