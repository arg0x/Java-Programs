public class Bird {
    private String birdName;
    private String birdNameInLatin;
    private int observation;

    public Bird(String birdName, String birdNameInLatin) {
        this.birdName = birdName;
        this.birdNameInLatin = birdNameInLatin;
        this.observation = 0;
    }

    public String getBirdName() {
        return birdName;
    }

    public String getBirdNameInLatin() {
        return birdNameInLatin;
    }

    public int getObservations() {
        return observation;
    }

    public void addObervation() {
        this.observation = this.observation + 1;
    }

    public String toString() {
        return getBirdName() + " (" + getBirdNameInLatin() + "): " + getObservations() + " observations";
    }
}
