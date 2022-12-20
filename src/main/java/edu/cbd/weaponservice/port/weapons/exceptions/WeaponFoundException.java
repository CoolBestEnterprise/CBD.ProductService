package edu.cbd.weaponservice.port.weapons.exceptions;

public class WeaponFoundException extends Exception {
    public WeaponFoundException() {
        super();
    }

    public WeaponFoundException(String message) {
        super(message);
    }

    public WeaponFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public WeaponFoundException(Throwable cause) {
        super(cause);
    }
}
