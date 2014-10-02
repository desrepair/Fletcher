/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fletcher;

import org.joda.time.DateTime;

/**
 *
 * @author Khetthai
 */
public class ClubMember implements Comparable<ClubMember>{
    //Private variables.
    String uni;
    private String firstName;
    private String lastName;
    private DateTime dateOfBirth;
    private char gender;
    private int classStanding;
    
    private boolean executive;
    
    private String email;
    private String phone;
    
    //Constructors.
    public ClubMember() {
        uni = "";
        firstName = "";
        lastName = "";
        dateOfBirth = new DateTime();
        gender = 'm';
        classStanding = 1;
        executive = false;
        email = "";
        phone = "";
    }
    
    public ClubMember(String u, String fn, String ln, DateTime dob, char g, int c,
            boolean e, String em, String p) {
        uni = u;
        firstName = fn;
        lastName = ln;
        dateOfBirth = dob;
        gender = g;
        classStanding = c;
        executive = e;
        email = em;
        phone = p;
        
    }
    
    //Get methods.
    public String getUni() {return uni;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public DateTime getDOB() {return dateOfBirth;}
    public char getGender() {return gender;}
    public int getClassStanding() {return classStanding;}
    public boolean isExecutive() {return executive;}
    public String getEmail() {return email;}
    public String getPhone() {return phone;}
    
    //Set methods.
    public void setUni(String u) {uni = u;}
    public void setFirstName(String name) {firstName = name;}
    public void setLastName(String name) {lastName = name;}
    public void setDOB(DateTime dob) {dateOfBirth = dob;}
    public void setGender(char g) {if (g == 'm' || g == 'f') {gender = g;}}
    public void setClassStanding(int standing) {classStanding = standing;}
    public void setExecutive(boolean exec) {executive = exec;}
    public void setEmail(String e) {email = e;}
    public void setPhone(String num) {phone = num;}

    @Override
    public int compareTo(ClubMember toCompare) {
        return (firstName + lastName).compareTo(toCompare.getFirstName() + toCompare.getLastName());
    }
}
