import java.util.Date;

public abstract class Stuff extends Employee {
    double Hourly_rate;

    public Stuff(){
    }

    public Stuff(String last_name, String first_name, String ID_number, char sex, Date birth_date, double hourly_rate) {
        super(last_name, first_name, ID_number, sex, birth_date);
        Hourly_rate = hourly_rate;
    }

    public double getHourly_rate() {
        return Hourly_rate;
    }

    public void setHourly_rate(double hourly_rate) {
        Hourly_rate = hourly_rate;
    }

    @Override
    public double monthlyEarning() {
        return 0;
    }

    @Override
    public String toString() {
        return "Stuff{" +
                "last_name='" + last_name + '\n' +
                ", first_name='" + first_name + '\n' +
                ", ID_number='" + ID_number + '\n' +
                ", sex=" + sex +
                ", Birth_date=" + Birth_date +
                ", Hourly_rate=" + Hourly_rate;
    }
}
