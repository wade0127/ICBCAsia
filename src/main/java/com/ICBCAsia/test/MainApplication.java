package com.ICBCAsia.test;

import com.ICBCAsia.test.bean.FoodStuff;

public class MainApplication {
    public static void main(String[] args) {

        // 异常测试
//        double exception1 = new FoodStuff("name").priceMethod();
        // 张三吃了套餐1 + 1个牛肉饼
        double zhangsanPrice = new FoodStuff("comboOne",1).priceMethod() + new FoodStuff("beefPatties",1).priceMethod();
        System.out.println("张三吃了套餐1+1个牛肉饼的总价为："+zhangsanPrice);
        // 李四吃了一碗中碗的肥肠面+2杯奶茶
        double lisiPrice = new FoodStuff("sausageNoodles", "mid",1).priceMethod() + new FoodStuff("milkTea",2).priceMethod();
        System.out.println("李四吃了一碗中碗的肥肠面+2杯奶茶的总价为："+lisiPrice);
    }
}