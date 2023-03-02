package frc.robot;

import edu.wpi.first.wpilibj.PneumaticHub;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;

public class Arm {
    PneumaticHub phA;
    private Solenoid armSolenoidA, armSolenoidB;
    public Arm(int extendIdA, int extendIdB) {
        armSolenoidA = new Solenoid(PneumaticsModuleType.REVPH, extendIdA);
        armSolenoidB = new Solenoid(PneumaticsModuleType.REVPH, extendIdB);
    }

    public void extendA() {
        armSolenoidA.set(true);
    }

    public void retractA() {
        armSolenoidA.set(false);
    }

    public void extendB() {
        armSolenoidB.set(true);
    }

    public void retractB() {
        armSolenoidB.set(false);
    }

    public void extendOne() {
        if (armSolenoidA.get() == false) {
            extendA();
        } else if (armSolenoidB.get() == false) {
            extendB();
        }
    }

    public void retractOne() {
        if (armSolenoidA.get() == true) {
            retractA();
        } else if (armSolenoidB.get() == true) {
            retractB();
        }
    }
}
