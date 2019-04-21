// Defines the package this class is located in
package frc.robot;

// Imports classes required to be used in this class
import edu.wpi.first.wpilibj.Joystick;

// Creates the OI (Operator Input) class
public class OI {

  // Creates a joystick object called controller
  public Joystick controller;

  // Creates OI constructor. When run, this creates an instance of our OI class.
  public OI() {
    // Controller is instantiated with the ID located in RobotMap
    controller  = new Joystick(RobotMap.controllerPort);
  }
 
  // End of class
}