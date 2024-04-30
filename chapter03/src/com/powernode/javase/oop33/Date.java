package com.powernode.javase.oop33;

/**
 * time :2024/3/25 22:31 12
 * ClassName :Date
 * Package :com.powernode.javase.oop33
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 自定义的日期类
 */
public class Date {
    private int year;
    private int month;
    private int day;

    public Date() {
        this(1970, 1, 1);
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return this.year + "年" + this.month + "月" + this.day + "日";
    }


    @Override
    public boolean equals(Object obj) {
        // d1.equals(d2)
        // this就是d1，obj就是d2
        if(obj == null) return false;
        // 能走到这里，说明obj不是null
        if(this == obj) return true;
        // 程序走到这里，说明两个对象内存地址不同
        if(obj instanceof Date) {
            int year1 = this.year;
            int month1 = this.month;
            int day1 = this.month;
            Date d = (Date)obj;
            int year2 = d.year;
            int month2 = d.month;
            int day2 = d.month;
            if(year1 == year2 && month1 == month2 && day1 == day2) return true;
        }
        return false;
    }
}
