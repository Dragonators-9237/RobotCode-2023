package frc.robot;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;

public class Claw {
    private Solenoid clawSolenoid;

    public Claw(int clawId) {
        clawSolenoid = new Solenoid(PneumaticsModuleType.REVPH, clawId);
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

    public void toggle() {
        clawSolenoid.set(!clawSolenoid.get());
    }
}
