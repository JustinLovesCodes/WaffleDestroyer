package frc.robot;

import com.ctre.phoenix6.CANBus;

public final class Ports {
    // CAN Buses
    public static final CANBus kRoboRioCANBus = new CANBus("rio");
    public static final CANBus kCANivoreCANBus = new CANBus("main");

    // Talon FX IDs
    public static final int kIntakePivot = 7;
    public static final int kIntakeRollers = 8;
    public static final int kFloor = 11;
    public static final int kFeeder = 12;
    public static final int kShooterLeft = 0;
    public static final int kShooterMiddle = 13;
    public static final int kShooterRight = 14;
    public static final int kHanger = 15;

    // PWM Ports
    public static final int kHoodLeftServo = 4;
    public static final int kHoodRightServo = 3;
}
