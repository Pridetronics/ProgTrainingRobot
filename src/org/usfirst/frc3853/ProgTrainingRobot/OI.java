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

import org.usfirst.frc3853.ProgTrainingRobot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
  public JoystickButton buttonY;
  public JoystickButton buttonA;
  public JoystickButton buttonX;
  public JoystickButton buttonB;
  public JoystickButton transferControlButton;
  public Joystick masterGamePad;
  public Joystick slaveGamePad;

  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  public OI() {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

    slaveGamePad = new Joystick( 1 );

    masterGamePad = new Joystick( 0 );

    transferControlButton = new JoystickButton( masterGamePad, 6 );
    transferControlButton.whileHeld( new DriveTeleop() );
    buttonB = new JoystickButton( masterGamePad, 2 );
    buttonB.whenPressed( new TurnRightDegrees( .55, 90 ) );
    buttonX = new JoystickButton( masterGamePad, 3 );
    buttonX.whenPressed( new TurnLeftDegrees( .55, 90 ) );
    buttonA = new JoystickButton( masterGamePad, 1 );
    buttonA.whenPressed( new DriveBackwardsDistance( .6, 12 ) );
    buttonY = new JoystickButton( masterGamePad, 4 );
    buttonY.whenPressed( new DriveForwardDistance( .6, 12 ) );

    // SmartDashboard Buttons
    SmartDashboard.putData( "Autonomous Command", new AutonomousCommand() );
    SmartDashboard.putData( "DriveTeleop", new DriveTeleop() );
    SmartDashboard.putData( "DriveForward1Second", new DriveForward1Second() );
    SmartDashboard.putData( "DriveBackward1Second", new DriveBackward1Second() );
    SmartDashboard.putData( "DriveForwardDistance: 1foot@60%", new DriveForwardDistance( .6, 12 ) );
    SmartDashboard.putData( "DriveBackwardsDistance: 1foot@60%", new DriveBackwardsDistance( .6, 12 ) );
    SmartDashboard.putData( "TurnRightDegrees: 90@55%", new TurnRightDegrees( .55, 90 ) );
    SmartDashboard.putData( "TurnLeftDegrees: 90@45%", new TurnLeftDegrees( .45, 90 ) );
    SmartDashboard.putData( "DriveMaster", new DriveMaster() );

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
  }

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
  public Joystick getMasterGamePad() {
    return masterGamePad;
  }

  public Joystick getSlaveGamePad() {
    return slaveGamePad;
  }

  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
