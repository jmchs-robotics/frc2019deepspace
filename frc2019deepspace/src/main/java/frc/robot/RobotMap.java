/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.*;


public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  //Drive Train Subsytstem
  public static WPI_TalonSRX driveTrainMasterRight;
  public static WPI_TalonSRX driveTrainMasterLeft;
  public static DifferentialDrive driveTrainRobotDrive;

 
  public static WPI_TalonSRX driveTrainFollowerLeft1;
  public static WPI_TalonSRX driveTrainFollowerLeft2;
  public static WPI_TalonSRX driveTrainFollowerRight1;
  public static WPI_TalonSRX driveTrainFollowerRight2;

  //Subsystem
  public static Spark cargoSubsystemSpinner;
  public static DoubleSolenoid cargoSubsystemCatapult;

 // public static DoubleSolenoid hatchSubsystemEgg;

  public static Spark endgameSubsystemCricket;

  public static WPI_TalonSRX armSubsystem;
  
  public static DoubleSolenoid wristSubsystem;
}
