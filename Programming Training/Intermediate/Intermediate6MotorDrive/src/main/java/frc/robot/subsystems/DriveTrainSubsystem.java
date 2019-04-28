package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import frc.robot.DriveTrainProperties;

public class DriveTrainSubsystem extends Subsystem {

  private TalonSRX leftMotor1;
  private TalonSRX leftMotor2;
  private TalonSRX leftMotor3;
  private TalonSRX rightMotor1;
  private TalonSRX rightMotor2;
  private TalonSRX rightMotor3;
  
  private Encoder leftEncoder;
  private Encoder rightEncoder;
  
  private Gyro gyro;

  public DriveTrainSubsystem() {
    leftMotor1 = new TalonSRX(DriveTrainProperties.LEFT_MOTOR_1_ID);
    leftMotor2 = new TalonSRX(DriveTrainProperties.LEFT_MOTOR_2_ID);
    leftMotor3 = new TalonSRX(DriveTrainProperties.LEFT_MOTOR_3_ID);
    rightMotor1 = new TalonSRX(DriveTrainProperties.RIGHT_MOTOR_1_ID);
    rightMotor2 = new TalonSRX(DriveTrainProperties.RIGHT_MOTOR_2_ID);
    rightMotor3 = new TalonSRX(DriveTrainProperties.RIGHT_MOTOR_3_ID);
    leftEncoder = new Encoder(DriveTrainProperties.LEFT_ENCODER_A, DriveTrainProperties.LEFT_ENCODER_B, true, EncodingType.k1X);
    rightEncoder = new Encoder(DriveTrainProperties.RIGHT_ENCODER_A, DriveTrainProperties.RIGHT_ENCODER_B, true ,EncodingType.k1X);
    gyro = new ADXRS450_Gyro();
  }

  public void resetGyro() {
    gyro.reset();
  }

  public void calibrateGyro() {
    gyro.calibrate();
  }

  public double getGyroAngle() {
    return gyro.getAngle();
  }

  public double getGyroRate() {
    return gyro.getRate();
  }

  public void resetLeftEncoder() {
    leftEncoder.reset();
  }

  public void resetRightEncoder() {
    rightEncoder.reset();
  }

  public int getLeftEncoderCount() {
    return leftEncoder.get();
  }

  public int getRightEncoderCount() {
    return rightEncoder.get();
  }

  public double getLeftEncoderRate() {
    return leftEncoder.getRate();
  }

  public double getRightEncoderRate() {
    return rightEncoder.getRate();
  }

  public void setDriveNeutralMode(NeutralMode neutralMode) {
    leftMotor1.setNeutralMode(neutralMode);
    leftMotor2.setNeutralMode(neutralMode);
    leftMotor3.setNeutralMode(neutralMode);
    rightMotor1.setNeutralMode(neutralMode);
    rightMotor2.setNeutralMode(neutralMode);
    rightMotor3.setNeutralMode(neutralMode);
  }

  public void setLeftGroupPercentOutput(double percentOutput) {
    leftMotor1.set(ControlMode.PercentOutput, percentOutput);
    leftMotor2.set(ControlMode.PercentOutput, percentOutput);
    leftMotor3.set(ControlMode.PercentOutput, percentOutput);
  }

  public void setRightGroupPercentOutput(double percentOutput) {
    rightMotor1.set(ControlMode.PercentOutput, percentOutput);
    rightMotor2.set(ControlMode.PercentOutput, percentOutput);
    rightMotor3.set(ControlMode.PercentOutput, percentOutput);
  }

  public void tankDrive(double leftValue, double rightValue, double speedModifier) {
    setLeftGroupPercentOutput(leftValue * speedModifier);
    setRightGroupPercentOutput(rightValue * speedModifier);
  }

  public void arcadeDrive(double forwardValue, double turnValue, double speedModifier) {
    setLeftGroupPercentOutput((forwardValue + turnValue) * speedModifier);
    setRightGroupPercentOutput((forwardValue - turnValue) * speedModifier);
  }

  public void stopDrive() {
    setLeftGroupPercentOutput(0);
    setRightGroupPercentOutput(0);
  }

  public String getDriveFirmwareVersions() {
    return "Firmware Versions: " + " Left Motor 1: " + leftMotor1.getFirmwareVersion() + " Left Motor 2: " + leftMotor2.getFirmwareVersion() + " Left Motor 3: " + leftMotor3.getFirmwareVersion() + 
    " Right Motor 1: " + rightMotor1.getFirmwareVersion() + " Right Motor 2: " + rightMotor2.getFirmwareVersion() + " Right Motor 3: " + rightMotor3.getFirmwareVersion();
  }

  @Override
  public void initDefaultCommand() {

  }
}