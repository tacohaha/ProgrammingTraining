// Defines the package this class is located in
package frc.robot;

// Imports classes required to be used in this class
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.IntakeForwardCommand;
import frc.robot.commands.IntakeReverseCommand;
import frc.robot.commands.SetSolenoidForwardCommand;
import frc.robot.commands.SetSolenoidOffCommand;
import frc.robot.commands.SetSolenoidReverseCommand;

// Creates the OI (Operator Input) class
public class OI {

  // Creates a joystick object called controller
  public Joystick controller;

  // Creates and instantiates the intakeForwardButton and intake reverse button, which take in which controller those buttons are gonna be on, and use the
  // button ids we used in RobotMap.
  public JoystickButton intakeForwardButton = new JoystickButton(controller, RobotMap.intakeForwardButtonID);
  public JoystickButton intakeReverseButton = new JoystickButton(controller, RobotMap.intakeReverseButtonID);
  public JoystickButton solenoidForwardButton = new JoystickButton(controller, RobotMap.solenoidForwardButtonID);
  public JoystickButton solenoidReverseButton = new JoystickButton(controller, RobotMap.solenoidReverseButtonID);
  public JoystickButton solenoidOffButton = new JoystickButton(controller, RobotMap.solenoidOffButtonID);

  // Creates OI constructor. When run, this creates an instance of our OI class.
  public OI() {
    // Controller is instantiated with the ID located in RobotMap
    controller  = new Joystick(RobotMap.controllerPort);
    // Uses the whileHeld method which executes the commands while the button is held.
    intakeForwardButton.whileHeld(new IntakeForwardCommand());
    intakeReverseButton.whileHeld(new IntakeReverseCommand());
    solenoidForwardButton.whenPressed(new SetSolenoidForwardCommand());
    solenoidReverseButton.whenPressed(new SetSolenoidReverseCommand());
    solenoidOffButton.whenPressed(new SetSolenoidOffCommand());
  }
 
  // End of class
}