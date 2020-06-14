package com.designpatterns.factory.pizzas;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;

/**
 * @author wll
 * @data 2020/06/08
 */
@Getter
@ToString
abstract public class Pizza {

    /**
     * 名称
     */
    String name;
    /**
     * 面团
     */
    String dough;
    /**
     * 酱
     */
    String sauce;

    /**
     * 浇头
     */
    ArrayList<String> toppings = new ArrayList<String>();

    /**
     * 准备
     */
    public void prepare() {
        System.out.println("Preparing " + name);
    }

    /**
     * 烤
     */
    public void bake() {
        System.out.println("Baking " + name);
    }

    /**
     * 切
     */
    public void cut() {
        System.out.println("Cutting " + name);
    }

    /**
     * 装
     */
    public void box() {
        System.out.println("Boxing " + name);
    }

}
