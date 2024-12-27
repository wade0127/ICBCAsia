package com.ICBCAsia.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: ICBCAsia
 * @BelongsPackage: com.ICBCAsia.test.bean
 * @Author: wade
 * @CreateTime: 2024-12-27  19:35
 * @Description: 食物基类
 * @Version: 1.0
 */
public class FoodStuff {
    private String name;
    private int amount;
    private String size;
    private double discount;

    public FoodStuff(String name) {
        this.name = name;
    }

    public FoodStuff(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public FoodStuff(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public FoodStuff(String name, String size,int amount) {
        this.name = name;
        this.size = size;
        this.amount = amount;
    }

    public FoodStuff(String name, int amount, String size, double discount) {
        this.name = name;
        this.amount = amount;
        this.size = size;
        this.discount = discount;
    }

    // 食品价格
    int price;
    // 牛肉面价格map
    Map<String, Integer> beefNoodlesMap = new HashMap<String, Integer>() {{
        put("large", 18);
        put("mid", 16);
        put("small", 14);
    }};
    // 肥肠面价格map
    Map<String, Integer> sausageNoodlesMap = new HashMap<String, Integer>() {{
        put("large", 20);
        put("mid", 18);
        put("small", 16);
    }};

    // 计算食品价格
    public double priceMethod() {
        switch (this.name) {
            case "beefNoodles":
                this.price = this.beefNoodlesMap.get(this.size) * this.amount;
                break;
            case "sausageNoodles":
                this.price = this.sausageNoodlesMap.get(this.size) * this.amount;
                break;
            case "beefPatties":
                this.price = 10 * this.amount;
                break;
            case "milkTea":
                this.price = 12 * this.amount;
                break;
            case "comboOne":
                this.price = 38 * this.amount;
                break;
            case "comboTwo":
                this.price = 40 * this.amount;
                break;
            default:
                throw new Error("No Food Name:"+this.name+" Found ! Please Select Again !");
        }
        return this.price;
    }
}
