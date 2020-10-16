package geekbrains.lesson5_homework_oop;

public class EmployeeData {
    public String name;
    public String post;
    public String email ;
    public String phoneNumber;
    public int wage;
    public int age;

    public EmployeeData (String name,String post,String email,String phoneNumber,int wage,int age){
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber=phoneNumber;
        this.wage=wage;
        this.age = age;
        }

    public int GetAge() {
        return age;
    }

    public void  Show() {
       System.out.println(name + "\n-"+
               "post: "+post + "\n-"+
               "email: " +email + "\n-"+
               "phoneNumber: "+phoneNumber + "\n-"+
               "wage: "+wage + "\n-"+
               "age: "+age);
       System.out.println();

    }
    }