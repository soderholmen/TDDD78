package se.liu.ida.gusso811.tddd78.lab2;

/**
 * Created by gurra on 2/10/16.
 */
public class TimePoint {

    private String time;
    private String hour;
    private String minute;

    public TimePoint(String time) {
        this.time = time;
        String[] parts = time.split(":");
        this.hour = parts[0];
        this.minute = parts[1];
    }



    public String getHour() {

        return hour;
    }

    public String getMinute() {

        return minute;
    }

    @Override
    public String toString() {
        return time;
    }
}
