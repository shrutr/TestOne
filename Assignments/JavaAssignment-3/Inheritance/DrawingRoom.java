public class DrawingRoom extends Home{


    DrawingRoom(int lightsCount, String roomName){
        super(lightsCount, roomName);
    }

    public void noOfLights() {
        System.out.println("Room name is: " + roomName);
        System.out.println("Number of lights: " + lightsCount);
    }

}
