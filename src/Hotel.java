public class Hotel {
    private String name;
    private Room[][] rooms;

    public Room[][] getRooms() {
        return rooms;
    }

    public void booking(int i) {
        rooms[i / 100 - 1][i % 100 - 1].booking();
    }

    public void exiting(int i) {
        rooms[i / 100 - 1][i % 100 - 1].exiting();
    }

    public Hotel() {
        rooms = new Room[5][10];
        for (int i = 0 ;i < rooms.length ;i++){
            for(int j = 0;j < rooms[i].length ;j++){
                rooms[i][j] = new Room(i,j);
            }
        }
    }
}
