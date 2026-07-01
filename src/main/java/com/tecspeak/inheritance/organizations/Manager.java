package com.tecspeak.inheritance.organizations;

public class Manager extends Employee {
  private int teamSize;

    public Manager(int team_Size,int employee_Id, String name,double dailyRate) {
        super(employee_Id, name,dailyRate);
      this .teamSize=team_Size;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize){
        this.teamSize=teamSize;
    }
    public String getDetails(){
        return  getEmployee_Id()+" "+getName()+ " Team Size:"+getTeamSize()+" "+getDailyRate();
    }
    }

