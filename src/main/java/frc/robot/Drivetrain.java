package frc.robot;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;

public class Drivetrain {
    PWMSparkMax leftMotor1;
    PWMSparkMax leftMotor2;
    PWMSparkMax rightMotor1;
    PWMSparkMax rightMotor2;

    DifferentialDrive drive;

    public Drivetrain(int leftMotor1Channel, int leftMotor2Channel, int rightMotor1Channel, int rightMotor2Channel) {
        leftMotor1 = new PWMSparkMax(leftMotor1Channel);
        leftMotor2 = new PWMSparkMax(leftMotor2Channel);
        rightMotor1 = new PWMSparkMax(rightMotor1Channel);
        rightMotor2 = new PWMSparkMax(rightMotor2Channel);

        drive = new DifferentialDrive(leftMotor1, rightMotor1);
    }

    public void drive(double leftSpeed, double rightSpeed) {
        drive.tankDrive(leftSpeed, rightSpeed);
    }
}
