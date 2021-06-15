package com.kxj.filter;

import com.kxj.entity.Person;

import java.util.List;

/**
 * @author xiangjin.kong
 * @date 2021/3/8 16:32
 */

public interface IFilter {

    /**
     * 过滤方法
     * @param persons
     * @return
     */
    public List<Person> filter(List<Person> persons);
}
