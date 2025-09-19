package org.akk.design_patterns.builder_dp;


class Computer {
    // Required parameters
    private String HDD;
    private String RAM;

    // Optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    // Private constructor, only accessible by the Builder
    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    // Getters for all fields
    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    /// Builder Class
    public static class ComputerBuilder {
        // Required parameters (mirrors Product)
        private String HDD;
        private String RAM;

        // Optional parameters (mirrors Product)
        private boolean isGraphicsCardEnabled = false; // Default value
        private boolean isBluetoothEnabled = false;   // Default value

        // Constructor for required parameters
        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }

        // Setter for optional parameters (returns Builder for chaining)
        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        // Builds and returns the Computer object
        public Computer build() {
            return new Computer(this);
        }
    }
}


public class BuilderDesignPatternEx1 {
    public static void main(String[] args) {
        // Using the builder to create a Computer object
        Computer gamingComputer = new Computer.ComputerBuilder("1TB SSD", "16GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        Computer basicComputer = new Computer.ComputerBuilder("500GB HDD", "8GB")
                .build(); // No optional features enabled


        ///  GET
        System.out.println("Gaming Computer: HDD: "
                + gamingComputer.getHDD()
                + " RAM: " + gamingComputer.getRAM()
                + " GraphicsCardEnabled: " + gamingComputer.isGraphicsCardEnabled()
                + " BluetoothEnabled: " + gamingComputer.isBluetoothEnabled());

        System.out.println("Gaming Computer: HDD: "
                + basicComputer.getHDD()
                + " RAM: " + basicComputer.getRAM()
                + " GraphicsCardEnabled: " + basicComputer.isGraphicsCardEnabled()
                + " BluetoothEnabled: " + basicComputer.isBluetoothEnabled());
    }
}
