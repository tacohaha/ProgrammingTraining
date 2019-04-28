package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class SolenoidToggleCommand extends Command {
  public SolenoidToggleCommand() {
    requires(Robot.solenoidSubsystem);
  }

  @Override
  protected void initialize() {

  }

  @Override
  protected void execute() {
    Robot.solenoidSubsystem.setSolenoidState(true);
  }

  @Override
  protected boolean isFinished() {
    return isCompleted();
  }

  @Override
  protected void end() {
    Robot.solenoidSubsystem.setSolenoidState(false);
  }

  @Override
  protected void interrupted() {
    end();
  }
}