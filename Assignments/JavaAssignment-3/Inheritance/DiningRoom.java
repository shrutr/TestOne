public class DiningRoom extends Home {


    DiningRoom(int lightsCount) {
        super(lightsCount);
    }

    public void myDiningRoom(String roomName){
        System.out.println("Room name is: " + roomName);
        super.noOfLights();
    }

}