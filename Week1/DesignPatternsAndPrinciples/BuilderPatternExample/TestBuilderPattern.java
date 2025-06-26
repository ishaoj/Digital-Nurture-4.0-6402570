
public class TestBuilderPattern {
    public static void main(String[] args) {
        // Basic configuration
        Computer basicPC = new Computer.Builder()
            .setCPU("Intel i5")
            .setRAM("8GB")
            .setStorage("256GB SSD")
            .build();

        System.out.println("Basic PC: " + basicPC);

        // Gaming configuration
        Computer gamingPC = new Computer.Builder()
            .setCPU("AMD Ryzen 9")
            .setRAM("32GB")
            .setStorage("1TB NVMe")
            .setGPU("NVIDIA RTX 4090")
            .setMotherboard("ASUS ROG STRIX")
            .build();

        System.out.println("Gaming PC: " + gamingPC);

        // Office configuration
        Computer officePC = new Computer.Builder()
            .setCPU("Intel i3")
            .setRAM("4GB")
            .setStorage("500GB HDD")
            .build();

        System.out.println("Office PC: " + officePC);
    }
}
