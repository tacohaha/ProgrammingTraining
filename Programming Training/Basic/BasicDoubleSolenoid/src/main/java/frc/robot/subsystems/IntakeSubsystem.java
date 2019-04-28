// Defines the package this class is located in
package frc.robot.subsystems;

// Imports required classes used within this class
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

// Defines the IntakeSubsystem class and inherits the properties of the built in Subsystem class built into Wpilib
// The Subsystem is accessed by commands and those commands are handled by the scheduler
public class IntakeSubsystem extends Subsystem {

  // Private limits the access of the VictorSPX object to within this class
  // Creates 1 VictorSPX object OUTSIDE of the constructor, This allows it to be accessed within other functions and methods in the class.
  private VictorSPX intakeMotor;

  // This is a constructor, This is what is executed when an IntakeSubsystem object is created
  public IntakeSubsystem() {
    // Instantiates the VictorSPX object using the integer value (CAN ID) within the RobotMap class we created.
    intakeMotor = new VictorSPX(RobotMap.intakeMotor);
  }

  // Creates the method setPercentOutput, which allows us to set the percent output of the VictorSPX outside of the subsytem, for use in other commands.
  // This method takes in a double (decimal) value and passes it through to the VictorSPX object 
  public void setPercentOutput(double percentOutput) {
    intakeMotor.set(ControlMode.PercentOutput, percentOutput);
  }

  // Creates the function stop() which sets the percent output of the VictorSPX to zero, stopping it.
  public void stop() {
    intakeMotor.set(ControlMode.PercentOutput, 0);
  }

  @Override
  public void initDefaultCommand() {

  }
  // End of class
}