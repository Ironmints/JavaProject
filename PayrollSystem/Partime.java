import java.util.Date;

public class Partime extends Stuff {
    int Hours_worked_per_week;

    public Partime(){
    }

    public Partime(String last_name, String first_name, String ID_number, char sex, Date birth_date, double hourly_rate, int hours_worked_per_week) {
        super(last_name, first_name, ID_number, sex, birth_date, hourly_rate);
        Hours_worked_per_week = hours_worked_per_week;
    }

    public int getHours_worked_per_week() {
        return Hours_worked_per_week;
    }

    public void setHours_worked_per_week(int hours_worked_per_week) {
        Hours_worked_per_week = hours_worked_per_week;
    }

    @Override
    public double monthlyEarning() {
        return Hours_worked_per_week*Hourly_rate*4;
    }

    @Override
    public String toString() {
        return "Partime{" +
                "last_name='" + last_name + '\n' +
                ", first_name='" + first_name + '\n' +
                ", ID_number='" + ID_number + '\n' +
                ", Birth_date=" + Birth_date +'\n'+
                ", Hours_worked_per_month=" + Hours_worked_per_week*4 + '\n'+
                ", Monthly Salary=" + monthlyEarning();
    }
}
