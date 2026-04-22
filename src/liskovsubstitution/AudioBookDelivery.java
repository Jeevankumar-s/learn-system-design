package liskovsubstitution;

public class AudioBookDelivery extends OnlineBookDelivery {
    @Override
    public void getSoftwareOptions() throws Exception{
        System.out.println("Getting Software for online audio book");
    }
}
