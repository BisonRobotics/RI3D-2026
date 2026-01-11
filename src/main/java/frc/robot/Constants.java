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

        public static final double kS = 0.25; // Add 0.25 V output to overcome static friction
        public static final double kV = 0.12; // A velocity target of 1 rps results in 0.12 V output
        public static final double kA = 0.01; // An acceleration of 1 rps/s requires 0.01 V output
        public static final double kP = 4.8; // A position error of 2.5 rotations results in 12 V output
        public static final double kI = 0; // no output for integrated erro
        public static final double kD = 0.1; // A velocity error of 1 rps results in 0.1 V output

        public static final int velocity = 1;
        public static final int acceleration = 2;
    }
}