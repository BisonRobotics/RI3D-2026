package frc.robot;

public class Constants {
    public static final int kDriverControllerPort = 0;

    public static final class DrivetrainConstants {
        public static final int kLeftLeaderPort = 2;
        public static final int kLeftFollowerPort = 3;
        public static final int kRightLeaderPort = 4;
        public static final int kRightFollowerPort = 5;
        public static final double kStickDeadband = 0.1;
    }

    public static final class ClimbConstants {
        public static final int kClimbLeaderPort = 11;
        public static final int kClimbFollowerPort = 12;

        // Current limits
        public static final int kClimbStatorCurrentLimit = 120;
        public static final int kClimbSupplyCurrentLimit = 60;

        // climb motor run speed
        public static final double kClimbSpeed = .1;

        // motor soft limits
        public static final int kClimbUpperLimit = 0;
        public static final int kClimbLowerLimit = 0;
    }

    public static final class IntakeConstants {
        // Port Constants
        public static final int kIntakeRotationLeaderPort = 0;
        public static final int kIntakeRotationFollowerPort = 0;
        public static final int kIntakeWheelPort = 0;
        public static final int kIntakeRotationEncoderChannelA = 0;
        public static final int kIntakeRotationEncoderChannelB = 0;

        // Motor Configuration Constants
        public static final int kSupplyCurrentLimit = 60;
        public static final int kIntakeRotationStatorCurrentLimit = 120;
        public static final int kIntakeRotationWheelStatorCurrentLimit = 120;

        // Encoder Positions
        public static final int kEncoderHomePosition = 0;
        public static final int kEncoderOutPosition = 0;

        // Speed Constants
        public static final double kRotationSpeed = 0.5;
        public static final double kWheelSpeed = 0.5;
    }
}