package se.liu.ida.gusso811.tddd78.lab2;

/**
 * Created by gurra on 2/11/16.
 */
public class TimeSpan {

    private TimePoint start;
    private TimePoint end;

    public TimeSpan(TimePoint start, TimePoint end) {
        this.start = start;
        this.end = end;
    }

    public TimePoint getStart() {
        return start;
    }

    public TimePoint getEnd() {
        return end;
    }
    public String toString() {
        return start.toString() + "-" + end.toString();
    }
}
