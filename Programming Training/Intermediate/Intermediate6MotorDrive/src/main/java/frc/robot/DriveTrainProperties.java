package frc.robot;

public class DriveTrainProperties {

    public static final Integer LEFT_MOTOR_1_ID = 0;
    public static final Integer LEFT_MOTOR_2_ID = 1;
    public static final Integer LEFT_MOTOR_3_ID = 2;
    public static final Integer RIGHT_MOTOR_1_ID = 3;
    public static final Integer RIGHT_MOTOR_2_ID = 4;
    public static final Integer RIGHT_MOTOR_3_ID = 5;

    public static final Integer LEFT_ENCODER_A = 0;
    public static final Integer LEFT_ENCODER_B = 1;
    public static final Integer RIGHT_ENCODER_A = 2;
    public static final Integer RIGHT_ENCODER_B = 3;

    public static final Integer ENCODER_COUNTS_PER_REVOLUTION = 1440;
    public static final Integer WHEEL_DIAMETER_INCHES = 6;
    public static final Double WHEEL_CIRCUMFERENCE_INCHES = WHEEL_DIAMETER_INCHES * Math.PI;
    public static final Double ENCODER_DISTANCE_PER_PULSE = WHEEL_CIRCUMFERENCE_INCHES / ENCODER_COUNTS_PER_REVOLUTION;

}