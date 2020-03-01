package se.liu.ida.gusso811.tddd78.lab2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gurra on 2/11/16.
 */
public class Calender {

    private List<Appointment> appointments;

    public Calender() {
        appointments = new ArrayList<>();
    }

    public void show() {
        for (Appointment appointment : appointments) {
            System.out.println(appointment.toString());
        }
        if (appointments.isEmpty()) {
            System.out.println("No appointments");
        }
    }

    public void book(int year, String month, int day,
                     String start, String end, String subject){
        if(year > 2015){
            TimePoint startTime = new TimePoint(start);
            TimePoint endTime = new TimePoint(end);
            int startHour = Integer.parseInt(startTime.getHour());
            int endHour = Integer.parseInt(endTime.getHour());
            int startMinute = Integer.parseInt(startTime.getMinute());
            int endMinute = Integer.parseInt(endTime.getMinute());
            if (0 <= endHour && endHour <= 23 && 0 <= startHour && startHour <= 23 && 0 <= endMinute && endMinute <= 59 && 0 <= startMinute && startMinute <= 59){
                Month mount = new Month(month, Month.getMonthNumber(month), Month.getMonthDays(month));
                if (mount.getNumber() != -1 && mount.getDays() > day){
                    Appointment subjectAppointment = new Appointment(subject, new Date(year,day,mount), new TimeSpan(startTime, endTime));
                    appointments.add(subjectAppointment);

                }
                else{
                    throw new IllegalArgumentException("Invalid month or day");
                }
            }
            else{
                throw new IllegalArgumentException("Invalid start or end time");
            }
        }
        else{
            throw new IllegalArgumentException("Invalid year");
        }
    }


}
