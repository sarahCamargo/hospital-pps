package ifsc.pps.hospital;

public class HospitalController {

    private static Hospital hospitalInstance;

    private HospitalController() {}

    public static Hospital getInstance() {
        if (hospitalInstance == null) {
            hospitalInstance = new Hospital();
        }
        return hospitalInstance;
    }
}
