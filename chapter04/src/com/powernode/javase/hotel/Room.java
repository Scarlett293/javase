package com.powernode.javase.hotel;

/**
 * time :2024/4/5 19:10 46
 * ClassName :Room
 * Package :com.powernode.javase.hotel
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 酒店的房间
 *
 * @author ScarlettSakura
 * @version 1.0
 * @since 1.0
 */
public class Room {
    /**
     * 房间编号
     * 101................110
     * 201.....
     * ...
     * ...
     * 601................610
     */
    private int roomNo;

    /**
     * 单人间、标准间、豪华间
     */
    private String type;
    /**
     * true表示占用、false表示空闲
     */
    private boolean state;


    public Room() {
    }

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

    @Override
    public String toString() {
        return "[" + this.roomNo + "," + this.type + "," + (this.state ? "占用" : "空闲") + "]";
    }
}
