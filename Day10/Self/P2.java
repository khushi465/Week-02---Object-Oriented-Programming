
class Device {

    String status;
    int deviceID;

    public Device(String status, int deviceID) {
        this.status = status;
        this.deviceID = deviceID;
    }

    void displayStatus() {
        System.out.println("Device Status: " + status);
        System.out.println("Device ID: " + deviceID);
    }

}

class Thermostat extends Device {

    int temperatureSetting;

    Thermostat(String status, int deviceID, int temperatureSetting) {
        super(status, deviceID);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature setting: " + temperatureSetting);
    }

}

class Main1 {

    public static void main(String[] args) {
        Thermostat t = new Thermostat("Working", 111, 25);
        t.displayStatus();
    }
}
