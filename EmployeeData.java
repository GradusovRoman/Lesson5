package geekbrains.lesson5_homework_oop;

public class EmployeeData {
    private String name;
    private String post;
    private String email ;
    private String phoneNumber;
    private int wage;
    private int age;

    EmployeeData (String name,String post,String email,String phoneNumber,int wage,int age){
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber=phoneNumber;
        this.wage=wage;
        this.age = age;
        }

    int GetAge() {
        return age;
    }

    void  Show() {
       System.out.println(name + "\n-"+
               "post: "+post + "\n-"+
               "email: " +email + "\n-"+
               "phoneNumber: "+phoneNumber + "\n-"+
               "wage: "+wage + "\n-"+
               "age: "+age);
       System.out.println();

    }
    }