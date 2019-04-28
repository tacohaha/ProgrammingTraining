// Defines the package in which this class is located
package frc.robot.commands;

// Imports required classes to be used within this class
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

// Defines the class IntakeForwardCommand and inherits the Command classes included in Wpilib.
public class IntakeForwardCommand extends Command {
  // Constructor of IntakeForwardCommand
  // This is where any subsystems used within this class are defined
  // and the scheduler can use that to cancel other instances when needed
  public IntakeForwardCommand() {
    // This class is going to require use of our IntakeSubsystem class.
    // We have to make sure that we access the instance of the IntakeSubsystem that we created in Robot.java, and not create a new subsystem.
    // If we did that, the program would attempt to make two of every single one of our objects, and crash.
    requires(Robot.intakeSubsystem);
  }

    // This function runs once when the command is initialized
  @Override
  protected void initialize() {
  }

  // This function runs repeatedly until isFinished() returns true. In this example, when the button is not being held isFinished will return true.
  @Override
  protected void execute() {
    // This line access the instance of our IntakeSubsystem that we created in Robot.java
    // It uses the setPercentOutput method we created and takes in a value of 1.0 (max percent out forward)
    Robot.intakeSubsystem.setPercentOutput(1.0);
  }

  // When isFinished() returns true, end() is run
  @Override
  protected boolean isFinished() {
    // When the command is done being executed (button not being held down anymore) isCompleted() returns true which makes isFinished() return true
    return isCompleted();
  }

  // end() is run once, and then kills the command.
  @Override
  protected void end() {
    // Uses our stop function in our intakeSubsystem to stop the motor at the end of the command
    Robot.intakeSubsystem.stop();
  }

  // if the command is canceled, interrupted() will run once and then kill the command.
  @Override
  protected void interrupted() {
    // calls end() to avoid having to repeat the code within end() twice
    end();
  }
  // End of class
}