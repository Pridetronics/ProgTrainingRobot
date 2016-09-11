
package org.usfirst.frc3853.ProgTrainingRobot.commands;

import org.usfirst.frc3853.ProgTrainingRobot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *  In keeping with the command pattern, this command causes the
 *  accelerometer object to sample the accelerometer. Run this in
 *  the autonomous command group in parallel with everything else.
 *  Other commands can then call Robot.g.getG() to get a smoothed
 *  value for G.
 *  Is there a way we can get this into the Scheduler's command
 *  list without loading it up through a command group?
 */
public class WatchAccelerometer extends Command {

  public WatchAccelerometer() {
    requires( Robot.g );

    this.setInterruptible( false );
    this.setRunWhenDisabled( true );
  }

  // Called just before this Command runs the first time
  protected void initialize() {
    // initialized 
    Robot.g.reset();
  }

  // Called repeatedly when this Command is scheduled to run
  protected void execute() {
    Robot.g.readG();
  }

  // Make this return true when this Command no longer needs to run execute()
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  protected void end() {
    // nothing to be done
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  protected void interrupted() {
    // nothing to be done
  }
}
