public class Human {
    private String name;
    private int age;
    private boolean healthy;

    public Human() {
        age = 0;
        healthy = true;
    }

    public Human (String name, int age, boolean healthy){
        this.name = name;
        this.age = age;
        this.healthy = healthy;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setHealt(boolean healthy){
        this.healthy = healthy;
    }

    public boolean getHealt(){
        return healthy;
    }

    public int add(int a, int b){
        return a + b;
        }

    public int getInt(String a){
        if (a.equalsIgnoreCase("one"))
            return 1;
        else if (a.equalsIgnoreCase("two"))
            return 2;
        else if (a.equalsIgnoreCase("three"))
            return 3;
        else if (a.equalsIgnoreCase("four"))
            return 4;
        else if (a.equalsIgnoreCase("five"))
            return 5;
        else if (a.equalsIgnoreCase("six"))
            return 6;
        else if (a.equalsIgnoreCase("seven"))
            return 7;
        else if (a.equalsIgnoreCase("eight"))
            return 8;
        else if (a.equalsIgnoreCase("nine"))
            return 9;
        else if (a.equalsIgnoreCase("ten"))
            return 10;
        else
            return 0;
    }

    public int add(String a, String b){
        return getInt(a) + getInt(b);
    }

    public void printVariables(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Healthy: " + healthy);
    }

}