package frc.robot.commands;

import static frc.robot.Constants.ClimbConstants.kClimbLowerLimit;
import static frc.robot.Constants.ClimbConstants.kClimbUpperLimit;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ClimbSubsystem;

public class ClimbCommand extends Command{
    ClimbSubsystem m_ClimbSubsystem;
    double m_speed;

    public ClimbCommand(ClimbSubsystem climbSubsystem, double speed) {
        m_ClimbSubsystem = climbSubsystem;
        m_speed = speed;

        addRequirements(climbSubsystem);
    }

    @Override
    public void initialize() {
    }

    // Stop climb on command end
    @Override
    public void end(boolean interrupted) {
        m_ClimbSubsystem.Stop();
    }

    // Execute climb with encoder limits
    @Override
    public void execute() {
        double pos = m_ClimbSubsystem.getPosition();

        if (m_speed > 0.0 &&
            pos >= kClimbUpperLimit) {
            m_ClimbSubsystem.SetSpeed(0.0);
            return;
        }

        if (m_speed < 0.0 &&
            pos <= kClimbLowerLimit) {
            m_ClimbSubsystem.SetSpeed(0.0);
            return;
        }

        m_ClimbSubsystem.SetSpeed(m_speed);
    }

    // Never finishes on its own
    @Override
    public boolean isFinished() {
        return super.isFinished();
    }
}