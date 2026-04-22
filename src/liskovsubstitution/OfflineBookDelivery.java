package liskovsubstitution;

public class OfflineBookDelivery extends BookDelivery {
    public void getDeliveryLocation() throws Exception {
        System.out.println("Fetching Location for Offline Book Delivery");
    }
}
