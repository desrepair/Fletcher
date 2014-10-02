/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fletcher;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Khetthai
 */
public class ClubRoster {
    //Data structure.
    private ArrayList<ClubMember> roster;
    
    //Constructor.
    public ClubRoster() {
        roster = new ArrayList<>();
    }
    
    //Public methods.
    public int getRosterSize() {
        return roster.size();
    }
    
    public void addMember(ClubMember toAdd) {
        roster.add(toAdd);
        Collections.sort(roster);
    }
    
    public void removeMember(ClubMember toRemove) {
        roster.remove(toRemove);
        Collections.sort(roster);
    }
    
    public ClubMember getMemberByUni(String uni) {
        for (ClubMember element : roster) {
            if (element.getUni().equals(uni)) {
                return element;
            }
        }
        return null;
    }
    
    public ArrayList<ClubMember> getMembersByFirstName(String fn) {
        ArrayList<ClubMember> results = new ArrayList<>();
        for (ClubMember element : roster) {
            if (element.getFirstName().startsWith(fn)) {
                results.add(element);
            }
        }
        return results;
    }
    
    public ArrayList<ClubMember> getMembersByLastName(String ln) {
        ArrayList<ClubMember> results = new ArrayList<>();
        for (ClubMember element : roster) {
            if (element.getLastName().startsWith(ln)) {
                results.add(element);
            }
        }
        return results;
    }
    
    public ArrayList<ClubMember> getMembersByGender(char g) {
        ArrayList<ClubMember> results = new ArrayList<>();
        for (ClubMember element : roster) {
            if (element.getGender() == g) {
                results.add(element);
            }
        }
        return results;
    }
    
    public ArrayList<ClubMember> getMembersByClass(int standing) {
        ArrayList<ClubMember> results = new ArrayList<>();
        for (ClubMember element : roster) {
            if (element.getClassStanding() == standing) {
                results.add(element);
            }
        }
        return results;
    }
    
    public ArrayList<ClubMember> getEBoard() {
        ArrayList<ClubMember> results = new ArrayList<>();
        for (ClubMember element : roster) {
            if (element.isExecutive()) {
                results.add(element);
            }
        }
        return results;
    }
}
