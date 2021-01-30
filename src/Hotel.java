public class Hotel {
    private String name = "Java大酒店";
    private Room[][] rooms;

    public Room[][] getRooms() {
        return rooms;
    }

    public void booking(int i) {

        Room thisroom = rooms[i / 100 - 1][i % 100 - 1];
        if(!thisroom.status){
            System.out.println("订房失败，" + thisroom + "已经被占用！");
            return;
        }
        thisroom.booking();
    }

    public void exiting(int i) {

        Room thisroom = rooms[i / 100 - 1][i % 100 - 1];
        if(thisroom.status){
            System.out.println(thisroom + "已经是空房！");
            return;
        }
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
