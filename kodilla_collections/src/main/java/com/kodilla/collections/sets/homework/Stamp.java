package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampSize;
    private boolean isStamped;

    public Stamp( String stampName, double stampSize, boolean isStamped) {
        this.stampName = stampName;
        this.stampSize = stampSize;
        this.isStamped = isStamped;
    }
    public String getStampName() {
        return stampName;
    }
    public double getStampSize() {
        return stampSize;
    }
    public boolean isStamped() {
        if (true)
            return isStamped;
        else
            return false;

    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampSize=" + stampSize +
                ", isStamped=" + isStamped +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampSize, stampSize) == 0 && isStamped == stamp.isStamped && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampSize, isStamped);
    }
}
