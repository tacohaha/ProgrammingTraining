package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.NeutralMode;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ArcadeDriveCommand extends Command {

  public ArcadeDriveCommand() {
    requires(Robot.driveTrainSubsystem);
  }

  @Override
  protected void initialize() {
    Robot.driveTrainSubsystem.setDriveNeutralMode(NeutralMode.Coast);
    Robot.driveTrainSubsystem.resetGyro();
    Robot.driveTrainSubsystem.resetLeftEncoder();
    Robot.driveTrainSubsystem.resetRightEncoder();
  }

  @Override
  protected void execute() {
    Robot.driveTrainSubsystem.arcadeDrive(Robot.oi.driverController.LEFT_Y_AXIS(), Robot.oi.driverController.RIGHT_X_AXIS(), 0.85);
  }

  @Override
  protected boolean isFinished() {
    return isCompleted();
  }

  @Override
  protected void end() {
    Robot.driveTrainSubsystem.stopDrive();
  }

  @Override
  protected void interrupted() {
    end();
  }
}