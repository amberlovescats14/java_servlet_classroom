package models;


public class AhoyBean {

    // columns
    private long emp_no;
    private String first_name;
    private String last_name;


    // both types of constructors
    public AhoyBean() {
    }

    public AhoyBean(long emp_no, String first_name, String last_name) {
        this.emp_no = emp_no;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    //getters and setters
    public long getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(long emp_no) {
        this.emp_no = emp_no;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
