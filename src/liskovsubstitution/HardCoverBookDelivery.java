package liskovsubstitution;

public class HardCoverBookDelivery extends OfflineBookDelivery {
    @Override
    public void getDeliveryLocation() throws Exception {
        System.out.println("Fetching delivery location for hard cover book");
    }
}
