package org.akk.z1_other_concepts.design_patterns.builder_dp;

class MyComputer {
    // Mandatory fields
    private final String CPU;
    private final String RAM;
    // Optional fields
    private final String storage;
    private final String GPU;

    // Private constructor that takes the Builder object as an argument
    private MyComputer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
    }

    // Getters only, making the object immutable after creation
    public String getCPU() { return CPU; }
    public String getRAM() { return RAM; }
    public String getStorage() { return storage; }
    public String getGPU() { return GPU; }

    /// Static nested Builder class
    public static class ComputerBuilder {
        // Mandatory fields (copied from outer class)
        private final String CPU;
        private final String RAM;
        // Optional fields (copied from outer class, with defaults if needed)
        private String storage = "500GB HDD";
        private String GPU = "Basic Integrated";

        // Public constructor for mandatory parameters
        public ComputerBuilder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        // Setter methods for optional parameters, returning the Builder object (method chaining)
        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        // The "build" method that returns the final Computer object
        public MyComputer build() {
            // Optional: add validation logic here before creating the object
            return new MyComputer(this);
        }
    }
}

public class Ex2MyComputerBuilder {
    public static void main(String[] args) {
        // Build a basic computer with mandatory fields
        MyComputer basicComputer = new MyComputer.ComputerBuilder("Intel Core i5", "8GB RAM")
                .build();

        System.out.println("Basic Computer Config: " + basicComputer.getCPU() + ", " + basicComputer.getRAM() + ", " + basicComputer.getStorage());

        // Build a gaming computer using method chaining to set optional fields
        MyComputer gamingComputer = new MyComputer.ComputerBuilder("Intel Core i9", "32GB RAM")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA GeForce RTX 4080")
                .build();

        System.out.println("Gaming Computer Config: " + gamingComputer.getCPU() + ", " + gamingComputer.getRAM() + ", " + gamingComputer.getStorage() + ", " + gamingComputer.getGPU());
    }
}

