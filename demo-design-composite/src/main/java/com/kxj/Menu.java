package com.kxj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kxj
 * @date 2021/6/11 12:30 上午
 * @desc 使用组合模式，组织层级结构的数据
 */
@Data
@NoArgsConstructor
public class Menu {
    private Integer id;
    private String name;

    public Menu(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    // 组合模式关注点
    private List<Menu> childs = new ArrayList<>();

    // 提供添加层级的方法
    void addChildMenu(Menu menu) {
        childs.add(menu);
    }

    // 层级便利方法

    void printMenu(int i) {
        StringBuilder sb = new StringBuilder();
        int deep = i++;
        for (int j = 0; j < deep; j++) {
            sb.append("\t");
        }
        System.out.println(sb.append(" ").append(name));
        if (childs.size() > 0) {
            for (Menu child : childs) {
                child.printMenu(i);
            }
        }
    }
}
