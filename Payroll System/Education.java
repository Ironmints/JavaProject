public class Education {
    String Degree;
    String Major;
    int Research;

    public Education(){
    }

    public Education(String degree, String major, int research) {
        Degree = degree;
        Major = major;
        Research = research;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String degree) {
        Degree = degree;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public int getResearch() {
        return Research;
    }

    public void setResearch(int research) {
        Research = research;
    }
}
