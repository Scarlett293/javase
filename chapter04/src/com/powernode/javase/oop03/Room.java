package com.powernode.javase.oop03;

/**
 * time :2024/4/5 18:10 38
 * ClassName :Room
 * Package :com.powernode.javase.oop03
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**'
 * 房间类
 */
public class Room {
    private int roomNo;
    private String type;
    private boolean state;

    public Room(int roomNo, String type, boolean state) {
        this.roomNo = roomNo;
        this.type = type;
        this.state = state;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
