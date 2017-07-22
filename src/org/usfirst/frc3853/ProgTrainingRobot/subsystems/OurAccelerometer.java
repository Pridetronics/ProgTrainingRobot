/*
 * OurAccelerometer hardware subsystem
 * not created by RobotBuilder
 */
package org.usfirst.frc3853.ProgTrainingRobot.subsystems;

import java.util.Arrays;

import org.usfirst.frc3853.ProgTrainingRobot.Config;
import org.usfirst.frc3853.ProgTrainingRobot.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Abstract the accelerometer a little bit. One method to keep an
 * array of the last ten readings, and another to average and return
 * on demand. Easy to switch between built-in and external hardware.
 * Defaukt command constantly samples G, runs all the time.
 */
public class OurAccelerometer extends Subsystem {

  // instantiate the built-in accelerometer
  private BuiltInAccelerometer g;

  // keep track of the last few readings to average
  private double[] samples;

  // next array index to update
  private int nextSample;

  public OurAccelerometer() {
    g = new BuiltInAccelerometer();
    nextSample = 0;

    samples = new double[Config.G_SAMPLES];

    this.reset();
  }

  public void reset() {
    // assume the robot is starting on flat ground,
    // initialize sample array to -1
    Arrays.fill( samples, -1 );
  }

  public void readG() {
    // grab the current G reading, shove into array
    // increment destination array index
    samples[nextSample++] = g.getZ();
    if ( nextSample == Config.G_SAMPLES )
      nextSample = 0;
  }

  public double getG() {
    // return the average of the last Config.G_SAMPLES readings
    double avg = 0.0;
    for ( int i = 0; i < Config.G_SAMPLES; i++ ) {
      avg += samples[i];
    }
    avg = avg / Config.G_SAMPLES;
    
    // only update dashboard when G is recalculated
    SmartDashboard.putNumber("G", avg);

    return avg;
  }

  public boolean weAreLevel() {
    if ( (Math.abs( -1.0 - getG() )) > Config.G_SLOP )
      return false;
    return true;
  }

  public boolean weAreToast() {
    if ( (Math.abs( -1.0 - getG() )) < Config.G_ON_EDGE )
      return false;
    return true;
  }

  public void initDefaultCommand() {
    // this should run all the time. It is uninterruptable.
    // Then commands and other subsystems can get the data
    // through Robot.g
    setDefaultCommand(new WatchAccelerometer());
  }
}
