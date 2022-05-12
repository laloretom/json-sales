public class Sale {
    int id;
    String first_name;
    String last_name;
    double sales;
    String state;
    String department;

    public Sale(int id, String first_name, String last_name, double sales, String state, String department) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.sales = sales;
        this.state = state;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", sales=" + sales +
                ", state='" + state + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
