public class DrawingRoom extends Home {


    DrawingRoom(int lightsCount) {
        super(lightsCount);
    }

    public void myDrawingRoom(String roomName) {
        System.out.println("Room name is: " + roomName);
        super.noOfLights();
    }

}
