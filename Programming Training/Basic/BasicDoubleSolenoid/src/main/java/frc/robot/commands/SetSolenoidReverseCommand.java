package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class SetSolenoidReverseCommand extends Command {
  public SetSolenoidReverseCommand() {
    requires(Robot.doubleSolenoidSubsystem);
  }

  @Override
  protected void initialize() {

  }

  @Override
  protected void execute() {
    Robot.doubleSolenoidSubsystem.setSolenoidState(DoubleSolenoid.Value.kReverse);
  }

  @Override
  protected boolean isFinished() {
    return isCompleted();
  }

  @Override
  protected void end() {

  }

  @Override
  protected void interrupted() {
  }
}