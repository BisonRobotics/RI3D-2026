package frc.robot;

import static edu.wpi.first.units.Units.Amps;

import edu.wpi.first.units.measure.Current;

public class Constants 
{
    public static final int kDriverControllerPort = 0;

    public static final String kCanBusName = "rio";

    public static final class DrivetrainConstants
    {
        public static final int kLeftLeaderPort = 2;
        public static final int kLeftFollowerPort = 3;
        public static final int kRightLeaderPort = 4;
        public static final int kRightFollowerPort = 5;
        public static final double kStickDeadband = 0.1;
    }
}