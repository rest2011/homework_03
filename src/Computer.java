public class Computer {
    private final String processor;
    private final int ram;

    private Computer(Builder builder) {
        this.processor = builder.processor;
        this.ram = builder.ram;
    }

    public static class Builder {
        private String processor;
        private int ram;

        public Builder setProcessor(String processor) { this.processor = processor; return this; }
        public Builder setRam(int ram) { this.ram = ram; return this; }
        public Computer build() { return new Computer(this); }
    }

    @Override
    public String toString() { return "Computer [CPU=" + processor + ", RAM=" + ram + "GB]"; }
}
