package com.powernode.javase.oop03;

/**
 * time :2024/4/5 18:10 46
 * ClassName :Hotel
 * Package :com.powernode.javase.oop03
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 酒店类
 */
public class Hotel {

    /**
     * 房间数组
     */
    private Room[][] list;


    // 构造方法，输入该酒店的拥有的楼层和房间号，自动生成对应的房间类

    /**
     * 构造方法，输入酒店的层数和房间数，自动生成酒店房间
     * @param line 层数
     * @param column 房间数
     */
    public Hotel(int line, int column) {
        this.list = new Room[line][column];
        String type = "单人间";
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= column; j++) {
                if(i > 2) type = "标准间";
                if(i > 4) type = "豪华间";
                this.list[i-1][j-1] = new Room(i * 100 + j, type, true);
            }
        }
    }

    /**
     * 预定房间
     * @param roomNo 房间号
     */
    public void order(int roomNo) {
        int line = roomNo / 100 - 1;
        int column = roomNo % 100 - 1;
        this.list[line][column].setState(false);
    }

    /**
     * 退房
     * @param roomNo 房间号
     */
    public void exit(int roomNo) {
        int line = roomNo / 100 - 1;
        int column = roomNo % 100 - 1;
        this.list[line][column].setState(true);
    }

    /**
     * 查询所有房间
     */
    public void display() {
        for (int i = 0; i < this.list.length; i++) {
            for (int j = 0; j < this.list[i].length; j++) {
                System.out.print("[" + this.list[i][j].getRoomNo() + "," + this.list[i][j].getType() + "," + (this.list[i][j].isState() ? "空闲" : "占用") + "]");
            }
            System.out.println();
        }
    }
}
