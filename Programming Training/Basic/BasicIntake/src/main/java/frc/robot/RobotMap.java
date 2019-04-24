// Defines the package that this class is located in
package frc.robot;

// Defines the class RobotMap
public class RobotMap {
  // This class contains global variables. We can change these variables to make small changes such as changing ids, changing where things are plugged in, variables, and avoid having
  // To sift through your code to find them

  // Public - Variable can be accessed anywhere within the project file
  // Static - Variables can be accessed without instantiating the parent class. I do not have to execute the RobotMap class to access its variables.
  // Integer - Whole number
  // Double - Number that contains at least one decimal

  // DriveTrain Variables
  public static Integer leftMotor1 = 0;
  public static Integer leftMotor2 = 1;
  public static Integer leftMotor3 = 2;
  public static Integer rightMotor1 = 3;
  public static Integer rightMotor2 = 4;
  public static Integer rightMotor3 = 5;

  // Intake Variables
  public static Integer intakeMotor = 0;

  // Controller Variables
  public static Integer controllerPort = 0;
  public static Integer yAxisID = 1;
  public static Integer xAxisID = 5;
  public static Integer intakeForwardButtonID = 5;
  public static Integer intakeReverseButtonID = 6;

  // End of class
}