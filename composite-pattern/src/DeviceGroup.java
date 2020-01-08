import java.util.ArrayList;
import java.util.List;

public class DeviceGroup implements Device {
  private List<Device> devices = new ArrayList<>();

  @Override
  public void turnOn() {
    for(Device device : devices) {
      device.turnOn();
    }
  }

  @Override
  public void turnOff() {
    for(Device device : devices) {
      device.turnOff();
    }
  }

  public void addDevice(Device device) {
    devices.add(device);
  }

  public void removeDevice(Device device) {
    devices.remove(device);
  }
}
