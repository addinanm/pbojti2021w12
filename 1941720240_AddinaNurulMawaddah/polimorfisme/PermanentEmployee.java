package polimorfisme;

public class PermanentEmployee extends Employee implements Payable{
    private int salary;
    
    public PermanentEmployee(String name,int salary) {
        this.salary = salary;
        this.name = name;
    }
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getPaymentAmount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as permanent employee with salary "+ salary+"\n";
        return info;
    }
}
