package com.noprayerfightcaveguide;

import lombok.Getter;

import java.awt.Point;
import java.util.Collections;
import java.util.List;

public class FightCaveWave {
    @Getter
    private final List<Point> coords;

    @Getter
    private final List<String> currentWaveMessages;

    @Getter
    private final List<String> nextWaveMessages;

    @Getter
    private final List<KillTarget> killOrder;

    private final boolean requiresLogout;
    private final boolean requiresAutoRetaliate;

    private FightCaveWave(Builder builder) {
        this.coords = builder.coords;
        this.currentWaveMessages = builder.currentWaveMessages != null ? builder.currentWaveMessages : Collections.emptyList();
        this.nextWaveMessages = builder.nextWaveMessages != null ? builder.nextWaveMessages : Collections.emptyList();
        this.requiresLogout = builder.requiresLogout;
        this.requiresAutoRetaliate = builder.requiresAutoRetaliate;
        this.killOrder = builder.killOrder != null ? builder.killOrder : Collections.emptyList(); // initialize
    }

    public boolean requiresLogout() { return requiresLogout; }
    public boolean requiresAutoRetaliate() { return requiresAutoRetaliate; }

    public static class Builder {
        private final List<Point> coords;
        private List<String> currentWaveMessages;
        private List<String> nextWaveMessages;
        private boolean requiresLogout = false;
        private boolean requiresAutoRetaliate = false;
        private List<KillTarget> killOrder;

        public Builder(List<Point> coords) {
            this.coords = coords;
        }

        public Builder currentWaveMessages(List<String> currentWaveMessages) {
            this.currentWaveMessages = currentWaveMessages;
            return this;
        }

        public Builder nextWaveMessages(List<String> nextWaveMessages) {
            this.nextWaveMessages = nextWaveMessages;
            return this;
        }

        public Builder requiresLogout() {
            this.requiresLogout = true;
            return this;
        }

        public Builder requiresAutoRetaliate() {
            this.requiresAutoRetaliate = true;
            return this;
        }

        public Builder killOrder(List<KillTarget> killOrder) {
            this.killOrder = killOrder;
            return this;
        }

        public FightCaveWave build() {
            return new FightCaveWave(this);
        }
    }
}

