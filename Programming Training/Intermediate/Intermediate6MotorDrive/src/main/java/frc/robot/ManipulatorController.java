package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class ManipulatorController extends Joystick implements LogitechControllerInterface{

    public ManipulatorController (int port) {
        super(port);
    }

    @Override
    public boolean A_BUTTON() {
        return super.getRawButton(99);
    }

    @Override
    public boolean B_BUTTON() {
        return super.getRawButton(99);
    }

    @Override
    public boolean X_BUTTON() {
        return super.getRawButton(99);
    }

    @Override
    public boolean Y_BUTTON() {
        return super.getRawButton(99);
    }

    @Override
    public boolean LEFTBUMPER_BUTTON() {
        return super.getRawButton(99);
    }

    @Override
    public boolean RIGHTBUMPER_BUTTON() {
        return super.getRawButton(99);
    }

    @Override
    public boolean BACK_BUTTON() {
        return super.getRawButton(99);
    }

    @Override
    public boolean START_BUTTON() {
        return super.getRawButton(99);
    }

    @Override
    public boolean LEFTSTICK_BUTTON() {
        return super.getRawButton(99);
    }

    @Override
    public boolean RIGHTSTICK_BUTTON() {
        return super.getRawButton(99);
    }

    @Override
    public double LEFT_X_AXIS() {
        return super.getRawAxis(99);
    }

    @Override
    public double LEFT_Y_AXIS() {
        return super.getRawAxis(99);
    }

    @Override
    public double RIGHT_X_AXIS() {
        return super.getRawAxis(99);
    }

    @Override
    public double RIGHT_Y_AXIS() {
        return super.getRawAxis(99);
    }

    @Override
    public double LEFT_TRIGGER_AXIS() {
        return super.getRawAxis(99);
    }

    @Override
    public double RIGHT_TRIGGER_AXIS() {
        return super.getRawAxis(99);
    }
}