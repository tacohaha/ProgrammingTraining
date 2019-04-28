package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.commands.ArcadeDriveCommand;
import frc.robot.subsystems.DriveTrainSubsystem;

public class Robot extends TimedRobot {

  public static DriveTrainSubsystem driveTrainSubsystem;
  public static OI oi;
  public static ArcadeDriveCommand arcadeDriveCommand;

  @Override
  public void robotInit() {
    driveTrainSubsystem = new DriveTrainSubsystem();
    oi = new OI();
  }

  @Override
  public void robotPeriodic() {

  }

  @Override
  public void disabledInit() {

  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void autonomousInit() {

  }

  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
    arcadeDriveCommand = new ArcadeDriveCommand();
  }

  @Override
  public void teleopPeriodic() {
    arcadeDriveCommand.start();
    Scheduler.getInstance().run();
  }

  @Override
  public void testPeriodic() {

  }
}