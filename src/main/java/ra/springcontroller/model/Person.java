package ra.springcontroller.model;

public class Person {
    private String name;
    private String age;
    private String des;

    public Person() {
    }

    public Person(String name, String age, String des) {
        this.name = name;
        this.age = age;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
