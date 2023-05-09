package Zadanie2;

import java.util.List;

public class House {

    private List<Room> roomList;
    private static int roomCount= 0;

    public House(List<Room> roomList) {
        this.roomList= roomList;
    }

    public void addRoom(Room room) {
        roomList.add(room);
        roomCount++;
    }
    public void addRooms(List<Room> roomList) {
        this.roomList.addAll(roomList);
        roomCount =+ roomList.size();
    }

    public static int getRoomCount() {
        return roomCount;
    }
}
