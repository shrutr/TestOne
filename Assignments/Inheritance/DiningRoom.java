public class DiningRoom extends Home {

    DiningRoom(int lightsCount, String roomName){
        super(lightsCount, roomName);
    }


    public void noOfLights(){
        System.out.println("Room name is: " + roomName);
        System.out.println("Number of Lights: " + lightsCount);
    }

}