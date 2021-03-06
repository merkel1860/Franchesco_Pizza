package core.model;

public class Person {
    private String fname;
    private String lname;
    private String gender;
    private int yob;

    public Person() {
    }

    public Person(String fname, String lname,
                  String gender, int yob) {
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.yob = yob;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }
}
