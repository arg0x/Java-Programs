public class Timer {

    private ClockHand sec;
    private ClockHand sec100;

    public Timer() {
        this.sec = new ClockHand(60);
        this.sec100 = new ClockHand(100);
    }

    public void advance() {
        this.sec100.advance();

        if (this.sec100.value() == 0) {
            this.sec.advance();
        }
    }

    public String toString() {
        return sec + ":" + sec100;
    }

}
