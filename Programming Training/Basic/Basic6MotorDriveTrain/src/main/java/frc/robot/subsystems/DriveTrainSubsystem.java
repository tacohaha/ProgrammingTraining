// Defines the package this class is located in
package frc.robot.subsystems;

// Imports required classes used within this class
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DriveWithControllerCommand;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

// Defines the DriveTrainSubsystem class and inherits the properties of the built in Subsystem class built into Wpilib
// The Subsystem is accessed by commands and those commands are handled by the scheduler
public class DriveTrainSubsystem extends Subsystem {

  // Private limits the access of the TalonSRX objects to within this class
  // Creates 6 TalonSRX objects OUTSIDE of the constructor, This allows them to be accessed within other functions and methods in the class.
  private TalonSRX leftMotor1;
  private TalonSRX leftMotor2;
  private TalonSRX leftMotor3;
  private TalonSRX rightMotor1;
  private TalonSRX rightMotor2;
  private TalonSRX rightMotor3;

  // This is a constructor, This is what is executed when a DriveTrainSubsystem object is created
  public DriveTrainSubsystem() {
    // Instantiates the TalonSRX objects using the integer values (CAN IDs) within the RobotMap class we created.
    leftMotor1 = new TalonSRX(RobotMap.leftMotor1);
    leftMotor2 = new TalonSRX(RobotMap.leftMotor2);
    leftMotor3 = new TalonSRX(RobotMap.leftMotor3);
    rightMotor1 = new TalonSRX(RobotMap.rightMotor1);
    rightMotor2 = new TalonSRX(RobotMap.rightMotor2);
    rightMotor3 = new TalonSRX(RobotMap.rightMotor3);
  }

  // Creating the method tankDrive. This method takes in a left value, a right value, and a speed modifier.
  // The left side of the robot is driven off the left value, and the right side is drivin by the right value
  // Both of these values are multiplied by a speed modifier.
  // The percent output of a motor has a range of -1 (Full reverse) to +1 (Full forward), the speed modifier changes the left or right value to lower the overall speed
  // Ex. if speed modifier was 0.50 even at maximum throttle, the drive train could not exceed 50% max speed.
  public void tankDrive(Double leftValue, Double rightValue, Double speedModifier) {
    leftMotor1.set(ControlMode.PercentOutput, leftValue * speedModifier);
    leftMotor2.set(ControlMode.PercentOutput, leftValue * speedModifier);
    leftMotor3.set(ControlMode.PercentOutput, leftValue * speedModifier);
    rightMotor1.set(ControlMode.PercentOutput, rightValue * speedModifier);
    rightMotor2.set(ControlMode.PercentOutput, rightValue * speedModifier);
    rightMotor3.set(ControlMode.PercentOutput, rightValue * speedModifier);
  }

  // Creating the method arcadeDrive. This method takes in a forward value, a turn value, and a speed modifier.
  // The left side of the robot is driven off the forwardValue - turnValue
  // The right side of the robot is driven off the forwardValue + turnValue
  // Ex. You are holding one joystick forward, giving you a value of + 0.75, you are holding the other joystick to the right, giving you a value of -0.25
  // the left side is driven 0.75 - (-0.25) which equals 1.0
  // the right side is driven 0.75 + (-0.25) which equals 0.5
  // In this scenario, the robot executes a right turn because the left side accelerates faster than the right side.
  public void arcadeDrive(Double forwardValue, Double turnValue, Double speedModifier) {
    leftMotor1.set(ControlMode.PercentOutput, (forwardValue - turnValue) * speedModifier);
    leftMotor2.set(ControlMode.PercentOutput, (forwardValue - turnValue) * speedModifier);
    leftMotor3.set(ControlMode.PercentOutput, (forwardValue - turnValue) * speedModifier);
    rightMotor1.set(ControlMode.PercentOutput, (forwardValue + turnValue) * speedModifier);
    rightMotor2.set(ControlMode.PercentOutput, (forwardValue + turnValue) * speedModifier);
    rightMotor3.set(ControlMode.PercentOutput, (forwardValue + turnValue) * speedModifier);
  }

  // Overrides the inherited initDefaultCommand() function to accept our code
  @Override
  public void initDefaultCommand() {
    // When the DriveTrainSubsystem class is instantiated, the code in this function is executed
    // This means that our DriveWithControllerCommand is added to the scheduler, so when autonomous or teleop starts, it will allow us to drive.
    setDefaultCommand(new DriveWithControllerCommand());
  }
  // End of class
}