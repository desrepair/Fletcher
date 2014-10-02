/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fletcher;

/**
 *
 * @author Khetthai
 */
public class Season {
    //Private variables.
    private String seasonName;
    private ClubRoster clubRoster;
    private Attendance attendance;
    
    //Constructor.
    public Season() {
        clubRoster = new ClubRoster();
        attendance = new Attendance();
    }
    
    //Public methods.
    public ClubRoster getClubRoster() {
        return clubRoster;
    }
    
    
}
