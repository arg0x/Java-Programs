public class Fitbyte {
    private int age;
    private int heartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.heartRate = restingHeartRate;
    }

    public double maximumHeartRate() {
        return 206.3 - (0.711 * age);
    }

    public double targetHeartRate(double percentageOfMaximum) {
        return (maximumHeartRate() - this.heartRate) * percentageOfMaximum + this.heartRate;
    }

}
