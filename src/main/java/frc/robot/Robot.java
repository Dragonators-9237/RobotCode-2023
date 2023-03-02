// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;

public class Robot extends TimedRobot {
    private Drivetrain drivetrain;
    private XboxController driver;
    private XboxController operator;

    private Arm arm;
    private Claw claw;

    /**
     * This function is run when the robot is first started up and should be used for any
     * initialization code.
     */
    @Override
    public void robotInit() {
        drivetrain = new Drivetrain(0, 1, 2, 3);
        arm = new Arm(0, 1);
        claw = new Claw(2);

        driver = new XboxController(0);
        operator = new XboxController(1);
    }

    @Override
    public void teleopInit() {
        //
    }

    /** This function is called periodically during operator control. */
    @Override
    public void teleopPeriodic() {
        drivetrain.drive(driver.getLeftY(), driver.getRightY());

        if (operator.getAButton()) {
            arm.extendOne();
        }

        if (operator.getBButton()) {
            arm.retractOne();
        }

        if (operator.getRightBumper()) {
            claw.close();
        } else {
            claw.open();
        }
    }

}
