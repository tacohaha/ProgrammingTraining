package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class SolenoidSubsystem extends Subsystem {

  private Solenoid solenoid;
  private Compressor compressor;

  public SolenoidSubsystem() {
    solenoid = new Solenoid(RobotMap.solenoidPort);
    compressor = new Compressor();
    compressor.start();
  }

  public void setSolenoidState(boolean state) {
    solenoid.set(state);
  }

  public boolean getSolenoidState() {
    return solenoid.get();
  }

  @Override
  public void initDefaultCommand() {

  }
}