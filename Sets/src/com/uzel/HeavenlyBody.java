package com.uzel;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final Double orbitalPeriod;
    private final Set<HeavenlyBody> satelites;

    public HeavenlyBody(String name, Double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satelites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satelites.add(moon);
    }

    public Set<HeavenlyBody> getSatelites() {
        return new HashSet<>(this.satelites);
    }
}
