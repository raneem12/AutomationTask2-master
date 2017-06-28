package com.atypon.automationframework.drivers;

public enum DriversInfo {
    CHROME {
        @Override
        public String toString() {
            return "CHROME";
        }
    }, FIREFOX {
        @Override
        public String toString() {
            return "FIREFOX";
        }
    }, OPERA {
        @Override
        public String toString() {
            return "OPERA";
        }
    }
}
