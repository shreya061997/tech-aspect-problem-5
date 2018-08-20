package ExamplePackage;
public class UserBean {
private String emailid;
private String password;
public boolean valid;
public String getPassword() {
return password;
}
public void setPassword(String newPassword) {
password = newPassword;
}
public String getemailid() {
return emailid;
}
public void setemailid(String newemailid) {
emailid = newemailid;
}
public boolean isValid() {
return valid;
}
public void setValid(boolean newValid) {
valid = newValid;
}
}
