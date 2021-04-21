public class Hero {
    private String name;
    private int age;

    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void presentHero(){
        System.out.println("name: "+this.getName()+ ", age: "+this.getAge());
    }

    public void setAge(int age) {
        this.age = age;
    }
}
