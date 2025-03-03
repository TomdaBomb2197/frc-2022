// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.driving;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class TurnWithNavX extends CommandBase {
  public static final class Config {
    //nothing here :(
  }

  private Drivetrain m_drivetrain;

  public TurnWithNavX(Drivetrain drive) {

    m_drivetrain = drive;

  }

  /** Creates a new TurnWithNavX. */
  public TurnWithNavX() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_drivetrain);
  }


  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
