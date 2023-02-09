package frc.robot;

import edu.wpi.first.wpilibj.PneumaticHub;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;

public class Claw {

    private Solenoid clawSolenoid;
    public Claw(int id) {
         clawSolenoid = new Solenoid(PneumaticsModuleType.REVPH, id);
    }

    public void close() {
        clawSolenoid.set(true);
    }

    public void open() {
        clawSolenoid.set(false);
    }

    public void set(boolean on) {
        clawSolenoid.set(on);
    }
}
