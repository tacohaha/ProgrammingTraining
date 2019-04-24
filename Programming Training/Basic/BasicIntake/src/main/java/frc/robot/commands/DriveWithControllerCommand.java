// Defines the package in which this class is located
package frc.robot.commands;

// Imports required classes to be used within this class
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

// Defines the class DriveWithControllerCommand and inherits the Command classes included in Wpilib.
public class DriveWithControllerCommand extends Command {
  // Constructor of DriveWithControllerCommand
  // This is where any subsystems used within this class are defined
  // and the scheduler can use that to cancel other instances when needed
  public DriveWithControllerCommand() {
    // This class is going to require use of our DriveTrainSubsystem class.
    // We have to make sure that we access the instance of the DriveTrainSubsystem that we created in Robot.java, and not create a new subsystem.
    // If we did that, the program would attempt to make two of every single one of our objects, and crash.
    requires(Robot.driveTrainSubsystem);
  }

  // This function runs once when the command is initialized
  @Override
  protected void initialize() {
  }

  // This function runs repeatedly until isFinished() returns true. Since isFinished() is always going to return false, this command will always run.
  @Override
  protected void execute() {
    // This line access the instance of our drivetrainsubsystem that we created in Robot.java
    // It then executes the arcadeDrive() method in our DriveTrainSubsystem class.
    // This method takes in three double (decimal) values a forward, a turn, and a speed modifier value
    // The forward value retrieves the current value of the yAxisID of the controller object in our OI class instance.
    // The turn value retrieves the current value of the xAxisID of the controller object in our OI class instance.
    // The speed modifier is placed at 0.75 to allow for fast control but slow enough so the driver doesnt damage anything.
    Robot.driveTrainSubsystem.arcadeDrive(Robot.oi.controller.getRawAxis(RobotMap.yAxisID), Robot.oi.controller.getRawAxis(RobotMap.xAxisID), 0.75);
  }

  // When isFinished() returns true, end() is run
  @Override
  protected boolean isFinished() {
    return false;
  }

  // end() is run once, and then kills the command.
  @Override
  protected void end() {
  }

  // if the command is canceled, interrupted() will run once and then kill the command.
  @Override
  protected void interrupted() {
  }
  // End of class
}