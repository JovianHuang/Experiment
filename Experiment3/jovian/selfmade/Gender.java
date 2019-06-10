package jovian.selfmade;

import java.lang.String;

public class Gender {
  private String gender = "";

  public Gender(String genderStr) {
    setGender(genderStr);
  }

  public void setGender(String genderStr) {
    genderStr = genderStr.toUpperCase();
    if (genderStr.equals("MALE")) {
      this.gender = "Male";
    } else if (genderStr.equals("FEMALE")) {
      this.gender = "Female";
    } else {
      this.gender = "Unknown";
    }
  }

  public String gender() {
    return this.gender;
  }
}
