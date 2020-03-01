package se.liu.ida.gusso811.tddd78.lab2;

/**
 * Created by gurra on 2/11/16.
 */
public class Appointment {

    private String subject;
    private Date date;
    private TimeSpan timeSpan;

    public Appointment(String subject, Date date, TimeSpan timeSpan) {
        this.subject = subject;
        this.date = date;
        this.timeSpan = timeSpan;
    }

    public String getSubject() {
        return subject;
    }

    public Date getDate() {
        return date;
    }

    public TimeSpan getTimeSpan() {
        return timeSpan;
    }

    @Override
    public String toString() {
        return "Appointment: " + subject + ", " + date.toString() + timeSpan.toString();

    }
}


