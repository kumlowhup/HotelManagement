public class MyHotel {

    public static void main(String[] args) {
        Room[][] hotel = new Room[5][10];
        for (int i = 0 ;i < hotel.length ;i++){
            for(int j = 0;j < hotel[i].length ;j++){
                hotel[i][j] = new Room(i,j);
            }
        }
        printRooms(hotel);


    }


    public static void printRooms(Object hotel[][]){
        for (int i = 0 ;i < hotel.length ;i++){
            for(int j = 0;j < hotel[i].length ;j++){
                System.out.print(hotel[i][j]);
            }
            System.out.println();
        }
    }

}


class Room{
    int number;
    String attribute;

    //true表示空房，否则为有客

    boolean isFree = true;

    public Room(int i,int j) {
        this.number = ( i + 1 ) * 100 + j + 1;
        switch (i){
            case 0 :attribute = "钟点房";break;
            case 1 :attribute = "普通单人房";break;
            case 2 :attribute = "普通双人房";break;
            case 3 :attribute = "情侣套房";break;
            case 4 :attribute = "总统套房";break;
            default:
                throw new IllegalStateException("房间信息错误\n" + "Unexpected value: " + i);
        }
    }


    @Override
    public String toString() {
        String isVacant = "客 " ;

        if(isFree) isVacant = "空 " ;

        return  attribute + number + " " + isVacant;
    }

    //改变房间空房/有客的状态
    public void setFree() {
        isFree = !isFree;
    }
}