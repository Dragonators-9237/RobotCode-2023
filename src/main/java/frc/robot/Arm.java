package frc.robot;

import edu.wpi.first.wpilibj.PneumaticHub;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;

public class Arm {
    PneumaticHub phA;
    private Solenoid armSolenoid;
    public Arm(int id) {
        armSolenoid = new Solenoid(PneumaticsModuleType.REVPH, id);
    }

    public void raise() {
        armSolenoid.set(true);
    }

    public void lower() {
        armSolenoid.set(false);
    }

    public void set(boolean on) {
        armSolenoid.set(on);
    }
}


