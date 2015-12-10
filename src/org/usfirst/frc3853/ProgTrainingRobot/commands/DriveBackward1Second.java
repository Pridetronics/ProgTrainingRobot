// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc3853.ProgTrainingRobot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3853.ProgTrainingRobot.Robot;

/**
 *
 */
public class DriveBackward1Second extends Command {

  final private double DRIVE_SPEED = .25;

  public DriveBackward1Second() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    requires(Robot.drive);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    // the setTimeout method is inherited from the Command class
    this.setTimeout(1);
    this.setInterruptible(true);
    this.setRunWhenDisabled(false);
  }

  // Called just before this Command runs the first time
  protected void initialize() {
    Robot.drive.driveBackward(DRIVE_SPEED);
  }

  // Called repeatedly when this Command is scheduled to run
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  protected boolean isFinished() {
    return isTimedOut();
  }

  // Called once after isFinished returns true
  protected void end() {
    Robot.drive.stop();

  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  protected void interrupted() {
    end();
  }
}
