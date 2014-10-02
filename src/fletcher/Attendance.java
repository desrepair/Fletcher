/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fletcher;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author Khetthai
 */
public class Attendance {
    //Private variables.
    private ArrayList<PracticeDay> attendance;
    
    //Constructor.
    public Attendance() {
        attendance = new ArrayList<>();
    }
    
    //Public methods.
    public ArrayList<DateTime> getPracticeDates() {
        ArrayList<DateTime> result = new ArrayList<>();
        for (PracticeDay element : attendance) {
            result.add(element.getPracticeDate());
        }
        return result;
    }
    
    public PracticeDay newPractice(DateTime day) {
        PracticeDay newDay = new PracticeDay(day);
        attendance.add(newDay);
        return newDay;
    }
    
    public boolean removePractice(DateTime day) {
        PracticeDay toRemove = null;
        for (PracticeDay element : attendance) {
            if (element.getPracticeDate().equals(day)) {
                toRemove = element;
            }
        }
        if (toRemove != null) {
            attendance.remove(toRemove);
            return true;
        }
        return false;
    }
    
    public PracticeDay getPractice(DateTime day) {
        for (PracticeDay practice : attendance) {
            if (practice.getPracticeDate().equals(day)) {
                return practice;
            }
        }
        return null;
    }
    
    public ArrayList<PracticeDay> getAllPractices() {
        return attendance;
    }
}
