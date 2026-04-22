package liskovsubstitution;

public class Main {
    public static void main(String[] args) throws Exception {
        OnlineBookDelivery onlineBookDelivery = new AudioBookDelivery();
        OfflineBookDelivery offlineBookDelivery = new HardCoverBookDelivery();

//        offlineBookDelivery.getDeliveryLocation();
        onlineBookDelivery.getSoftwareOptions();
    }
}
