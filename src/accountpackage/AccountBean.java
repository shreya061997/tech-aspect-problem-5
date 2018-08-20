package accountpackage;
public class AccountBean {
private int Age;
private int Year;
private String Branch;
private String firstName;
private String lastName;
private int Semester;
private int Score;
public boolean valid;
public int getAge() {
return Age;
}
public void setAge(int newAge) {
Age = newAge;
}

public int getSemester() {
return Semester;
}
public void setSemester(int newSemester) {
Semester = newSemester;
}
public int getYear() {
return Year;
}
public void setYear(int newYear) {
Year = newYear;
}
public int getScore() {
return Score;
}
public void setScore(int newScore) {
Score = newScore;
}

public String getFirstName() {
return firstName;
}
public void setFirstName(String newFirstName) {
firstName = newFirstName;
}
public String getLastName() {
return lastName;
}
public void setLastName(String newLastName) {
lastName = newLastName;
}
public String getBranch() {
return Branch;
}
public void setBranch(String newBranch) {
 Branch= newBranch;
}
public boolean isValid() {
return valid;
}
public void setValid(boolean newValid) {
valid = newValid;
}
}
