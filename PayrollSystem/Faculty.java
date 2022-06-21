import java.util.Date;

public abstract class Faculty extends Employee {
    Level level;

    enum Level {
        AS, // Assistant professor
        AO, // Associate professor
        FU  // Professor
    }

    Education education;

    public Faculty() {
    }

    public Faculty(String last_name, String first_name, String ID_number, char sex, Date birth_date, Level level, Education education) {
        super(last_name, first_name, ID_number, sex, birth_date);
        this.level = level;
        this.education = education;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    @Override
    public double monthlyEarning() {
        if (level == Level.AS) {
            return EmployeeInfo.FACULTY_MONTHLY_SALARY;
        } else if (level == Level.AO) {
            return (1.5 * EmployeeInfo.FACULTY_MONTHLY_SALARY);
        } else if (level == Level.FU) {
            return (2 * EmployeeInfo.FACULTY_MONTHLY_SALARY);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "last_name='" + last_name + '\n' +
                ", first_name='" + first_name + '\n' +
                ", ID_number='" + ID_number + '\n' +
                ", Birth_date=" + Birth_date;
        //If........
    }
}
