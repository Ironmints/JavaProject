import java.util.*;

public abstract class Employee implements EmployeeInfo {
    String last_name;
    String first_name;
    String ID_number;
    char sex;
    Date Birth_date;

    Employee (){
    }

    public Employee(String last_name, String first_name, String ID_number, char sex, Date birth_date) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.ID_number = ID_number;
        this.sex = sex;
        Birth_date = birth_date;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "last_name='" + last_name + '\n' +
                ", first_name='" + first_name + '\n' +
                ", ID_number='" + ID_number + '\n' +
                ", sex=" + sex +
                ", Birth_date=" + Birth_date;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getID_number() {
        return ID_number;
    }

    public void setID_number(String ID_number) {
        this.ID_number = ID_number;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Date getBirth_date() {
        return Birth_date;
    }

    public void setBirth_date(Date birth_date) {
        Birth_date = birth_date;
    }

    public abstract double monthlyEarning();
}
