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
public class PracticeDay implements Comparable<PracticeDay>{
    //Private variables.
    private DateTime date;
    private ArrayList<ClubMember> attendants;
    
    //Constructor.
    public PracticeDay() {
        date = new DateTime();
        attendants = new ArrayList<>();
    }
    
    public PracticeDay(DateTime day) {
        date = day;
        attendants = new ArrayList<>();
    }
    
    //Public methods.
    public DateTime getPracticeDate() {
        return date;
    }
    
    public ArrayList<ClubMember> getAttendance() {
        return (ArrayList<ClubMember>) attendants.clone();
    }
    
    public void addAttendant(ClubMember toAdd) {
        attendants.add(toAdd);
    }
    
    public void removeAttendant(ClubMember toRemove) {
        attendants.remove(toRemove);
    }

    @Override
    public int compareTo(PracticeDay toCompare) {
        return date.compareTo(toCompare.getPracticeDate());
    }
}
