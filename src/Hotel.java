public class Hotel {
    private String name;
    private Room[][] rooms;


    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

    public Hotel() {
        Room[][] rooms = new Room[5][10];
        for (int i = 0 ;i < rooms.length ;i++){
            for(int j = 0;j < rooms[i].length ;j++){
                rooms[i][j] = new Room(i,j);
            }
        }
    }
}
