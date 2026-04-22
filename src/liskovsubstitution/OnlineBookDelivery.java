package liskovsubstitution;

public class OnlineBookDelivery extends BookDelivery{
    public void getSoftwareOptions() throws Exception {
        System.out.println("Fetching Software for offline Book Delivery");
    }
}
