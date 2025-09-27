class FinalVariableDemo {
    final int speedLimit = 90;

    void changeLimit() {
        System.out.println("Speed Limit is: " + speedLimit);
    }

    public static void main(String[] args) {
        FinalVariableDemo obj = new FinalVariableDemo();
        obj.changeLimit();
    }
}
