package com.tecspeak.inheritance.organizations;

public class Developer extends  Employee {
    private String language;

    public Developer(int employee_Id, String name , String language,double dailyRate) {
        super(employee_Id, name ,dailyRate);
        this.language = language;
    }

    public  void getlanguage(String language){
        this.language=language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

public String getdetils(){
        return  getEmployee_Id() +" "+ getName()+" "+getLanguage()+" "+getDailyRate();
}

}