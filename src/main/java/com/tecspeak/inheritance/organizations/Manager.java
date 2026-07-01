package com.tecspeak.inheritance.organizations;

public class Manager extends Employee {
  private int teamSize;
   String dept;



    public Manager(int team_Size,int employee_Id, String name, double salary) {
        super(employee_Id, name, salary);
      this .teamSize=team_Size;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize){
        this.teamSize=teamSize;
    }
    public String getDetails(){
        return  getEmployee_Id()+" "+getName()+" "+getSalary()+" Team Size:"+getTeamSize();
    }


}
