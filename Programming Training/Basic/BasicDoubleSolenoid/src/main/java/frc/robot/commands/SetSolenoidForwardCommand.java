package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class SetSolenoidForwardCommand extends Command {
  public SetSolenoidForwardCommand() {
    requires(Robot.doubleSolenoidSubsystem);
  }

  @Override
  protected void initialize() {

  }

  @Override
  protected void execute() {
    Robot.doubleSolenoidSubsystem.setSolenoidState(DoubleSolenoid.Value.kForward);
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