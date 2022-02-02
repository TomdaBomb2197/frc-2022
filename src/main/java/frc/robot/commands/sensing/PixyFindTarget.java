// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.sensing;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.sensors.PixyCamera;
import frc.robot.subsystems.Drivetrain;

enum PixyPosition{
    LEFT, 
    CENTER, 
    RIGHT
}

public class PixyFindTarget extends CommandBase {
  public static final class Config {
      public static final int kLeftBound = 140;
      public static final int kRightBound = 180;
      public static final int kFarLeftBound = 0;
      public static final double kSpeed = 0.5;
    }



  // int blockX = pixy.getBiggestBlock().getX();

  // if ( kFarLeftBound < blockX && blockX < kLeftBound ) {

  //   return PixyPosition.LEFT;

  // }
  // else if (blockX > kRightBound) {

  //   return PixyPosition.RIGHT;

  // }
  // else {

  //   return PixyPosition.CENTER;

  // }
  
  private final PixyCamera m_pixy;
  private final Drivetrain m_drive;

  /** Creates a new PixyFindTarget. */
  public PixyFindTarget(PixyCamera pixy, Drivetrain drive) {
    // Use addRequirements() here to declare subsystem dependencies.
    

    addRequirements(pixy, drive);
   


  }

  public PixyPosition getBlockPosition(PixyCamera pixy) {

    
    int blockX = m_pixy.getBiggestBlock().getX();

    if (Config.kFarLeftBound < blockX && blockX < Config.kLeftBound ) {

      return PixyPosition.LEFT;

    }
    else if (blockX > Config.kRightBound) {

      return PixyPosition.RIGHT;

    }
    else {

      return PixyPosition.CENTER;

    }

   }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    m_pixy.getBiggestBlock.getBlockPosition;
     
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
