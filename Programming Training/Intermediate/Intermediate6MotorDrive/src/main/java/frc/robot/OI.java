package frc.robot;

public class OI {

    public DriverController driverController;
    public ManipulatorController manipulatorController;

    public OI() {
        driverController = new DriverController(0);
        manipulatorController = new ManipulatorController(1);
    }

}