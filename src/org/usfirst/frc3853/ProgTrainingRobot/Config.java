package org.usfirst.frc3853.ProgTrainingRobot;

public class Config {
  // constants to configure drive encoders
  public static double DRIVE_ENCODER_TICKS_PER_REVOLUTION = 90;
  public static double DRIVE_WHEEL_DIAMETER = 4;
  public static double DRIVE_TRACK = 15;
  public static double DRIVE_ENCODER_DISTANCE_PER_TICK = Math.PI * DRIVE_WHEEL_DIAMETER / DRIVE_ENCODER_TICKS_PER_REVOLUTION;
  public static double DRIVE_ENCODER_DISTANCE_PER_DEGREE = Math.PI * DRIVE_TRACK / 360;
  
  // enum and variable to switch drive from arcade to tank
  public enum DriveType{
    ARCADE,
    TANK
  }
  
  //default to arcade drive
  public DriveType driveType = DriveType.ARCADE; 

}
