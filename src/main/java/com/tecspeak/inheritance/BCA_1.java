package com.tecspeak.inheritance;

public class BCA_1  extends Student{
    String subject[]={"Digital Marketing","R Programming","Python","RDBMS","Operation System"};

    public BCA_1(String name, int rollno, ) {
        super(name, rollno);

        String[] subject1 = this.subject;

    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

}
