// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc3853.ProgTrainingRobot;

import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveLeftSpeedController;
    public static SpeedController driveRightSpeedController;
    public static RobotDrive driveRobotDrive21;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  public static void init() {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveLeftSpeedController = new Talon(9);
        LiveWindow.addActuator("Drive", "Left Speed Controller", (Talon) driveLeftSpeedController);
        
        driveRightSpeedController = new Talon(8);
        LiveWindow.addActuator("Drive", "Right Speed Controller", (Talon) driveRightSpeedController);
        
        driveRobotDrive21 = new RobotDrive(driveLeftSpeedController, driveRightSpeedController);
        
        driveRobotDrive21.setSafetyEnabled(true);
        driveRobotDrive21.setExpiration(0.1);
        driveRobotDrive21.setSensitivity(0.5);
        driveRobotDrive21.setMaxOutput(1.0);


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
  }
}
