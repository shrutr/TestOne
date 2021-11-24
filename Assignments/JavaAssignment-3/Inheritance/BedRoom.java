public class BedRoom extends Home {


    BedRoom(int lightsCount) {
        super(lightsCount);
    }

    public void myBedRoom(String roomName) {
        System.out.println("Room name is: " + roomName);
        super.noOfLights();
    }

}
