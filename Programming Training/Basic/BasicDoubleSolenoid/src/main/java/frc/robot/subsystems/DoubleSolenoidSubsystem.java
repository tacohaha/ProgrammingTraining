package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class DoubleSolenoidSubsystem extends Subsystem {

  private DoubleSolenoid doubleSolenoid;
  private Compressor compressor;

  public DoubleSolenoidSubsystem() {
    doubleSolenoid = new DoubleSolenoid(RobotMap.doubleSolenoidA, RobotMap.doubleSolenoidB);
    compressor = new Compressor();
    compressor.start();
  }

  public void setSolenoidState(DoubleSolenoid.Value state) {
    doubleSolenoid.set(state);
  }

  @Override
  public void initDefaultCommand() {

  }
}