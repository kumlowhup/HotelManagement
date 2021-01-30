import java.util.Objects;
import java.util.Scanner;

public class MyHotel {

    public static void main(String[] args) {

        Hotel hotel = new Hotel();
        //System.out.println(hotel);
        Scanner s = new Scanner(System.in);
        System.out.println("欢迎使用酒店系统");
        while(true){
            System.out.println("酒店管理如下： ");
            printRooms(hotel.getRooms());
            System.out.print("请输入管理业务序号：");
            int i  = s.nextInt();
            switch (i){
                //订房
                case 0 :{
                    System.out.println("请输入订房的房间号码：");
                    hotel.booking(s.nextInt());
                } break;

                //退房
                case 1:{
                    System.out.println("请输入退房的房间号码：");
                    hotel.exiting(s.nextInt());
                } break;
                case 2:{
                    System.out.println("酒店系统已退出！");
                    return;
                }
                default:
                    throw new IllegalStateException("输入错误，数字: " + i);
            }

        }

    }


    public static void printRooms(Object[][] hotel){
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

    boolean status = true;

    public Room(int i,int j) {
        this.number = ( i + 1 ) * 100 + j + 1;
        switch (i){
            case 0 :attribute = "钟点房   ";break;
            case 1 :attribute = "普通单人房";break;
            case 2 :attribute = "普通双人房";break;
            case 3 :attribute = "情侣套房  ";break;
            case 4 :attribute = "总统套房  ";break;
            default:
                throw new IllegalStateException("房间信息错误！\nUnexpected value: " + i);
        }
    }


    @Override
    public String toString() {

        return  '['+attribute + number + " " + ( status ? "空]" : "客]" );

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return number == room.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    //改变房间空房/有客的状态
    public void booking() {
        status = false;
        System.out.println("房间" + this + "已经订房");
    }

    public void exiting(){
        status = true;
        System.out.println("房间" + this + "已经退房");
    }
}