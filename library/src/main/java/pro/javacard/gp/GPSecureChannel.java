package pro.javacard.gp;

import java.util.Optional;

public enum GPSecureChannel {
    SCP01(1), SCP02(2), SCP03(3);

    private final int value;
    private int i = 0;

    GPSecureChannel(int value) {
        this.value = value;
    }

    public byte getValue() {
        return (byte) (value & 0xFF);
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public static Optional<GPSecureChannel> valueOf(int i) {
        for (GPSecureChannel v : values())
            if (v.value == i)
                return Optional.of(v);
        return Optional.empty();
    }

    public String toString() {
        return i == 0 ? name() : String.format("%s (i=%02x)", name(), i);
    }
}
