package com.powernode.javase.hotel;

/**
 * time :2024/4/5 19:14 52
 * ClassName :Hotel
 * Package :com.powernode.javase.hotel
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 酒店
 *
 * @author ScarlettSakura
 * @version 1.0
 * @since 1.0
 */
public class Hotel {

    /**
     * 酒店中所有的房间
     */
    private Room[][] rooms = new Room[6][10];


    public Hotel() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i == 0 || i == 1) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "单人间", false);
                } else if (i == 2 || i == 3) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "标准间", false);
                } else {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "豪华间", false);
                }
            }
        }
    }


    /**
     * 预定房间
     *
     * @param roomNo 房间编号
     */
    public void order(int roomNo) {
        // 101
        // i
        // j
        rooms[roomNo / 100 - 1][roomNo % 100 - 1].setState(false);
    }

    /**
     * 退房
     *
     * @param roomNo 房间编号
     */
    public void exit(int roomNo) {
        rooms[roomNo / 100 - 1][roomNo % 100 - 1].setState(true);
    }

    /**
     * 查询所有房间的状态
     */
    public void display() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j]);
            }
            System.out.println();
        }
    }
}
