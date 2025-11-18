package org.akk.z1_other_concepts.design_patterns.builder_dp;


class Computer {
    private String hdd;
    private String ram;
    private boolean isGraphicsCardEnabled;

    private Computer(ComputerBuilder builder) {
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    }

    public static class ComputerBuilder {
        private String hdd;
        private String ram;
        private boolean isGraphicsCardEnabled = false; // Default

        public ComputerBuilder(String hdd, String ram) {
            this.hdd = hdd;
            this.ram = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            System.out.println("Your are building a gaming PC.....");
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    // Getters for properties...
}

public class Ex1ComputerBuilder {
    public static void main(String[] args) {
       /* Computer gamingPC = new Computer.ComputerBuilder("2TB SSD", "64GB RAM")
                .setGraphicsCardEnabled(true)
                .build();*/

        Computer basicPC = new Computer.ComputerBuilder("500GB HDD", "8GB RAM")
                .build();

    }
}
