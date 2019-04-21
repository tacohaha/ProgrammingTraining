// Defines the package where this class is located
package frc.robot;

// Imports required classes this class needs to run
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.subsystems.DriveTrainSubsystem;

// Creates a class named Robot, which extends into the included TimedRobot class in Wpilib.
// This class makes everything run in this class (including the scheduler) run once every 20ms (default)
// This can be sped up or slowed down, but that is only recommended for advanced users.
public class Robot extends TimedRobot {

  // Creates our classes to be made into an instance
  public static OI oi;
  public static DriveTrainSubsystem driveTrainSubsystem;

  // executed once when the robot is started
  @Override
  public void robotInit() {
    // As soon as the robot is started, OI and DriveTrainSubsystem instances are created and added to the scheduler.
    oi = new OI();
    driveTrainSubsystem = new DriveTrainSubsystem();
  }

  // executed every 20ms when the robot is enabled.
  @Override
  public void robotPeriodic() {

  }

  // executed once when the robot is disabled.
  @Override
  public void disabledInit() {
  }

  // executed every 20ms when the robot is disabled.
  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  // executed once at the start of autonomous.
  @Override
  public void autonomousInit() {

  }

  // executed every 20ms during the autonomous op mode.
  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  // executed once at the start of teleop.
  @Override
  public void teleopInit() {

  }

  // executed every 20ms during teleop.
  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  // executed every 20ms during testOp.
  @Override
  public void testPeriodic() {

  }
  // End of class
}