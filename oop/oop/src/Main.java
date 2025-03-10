public class Main {
    public static String checkName(Human h) {
        return h.getName();
    }

    public static int birthday(Human h) {
        h.setAge(h.getAge() + 1);
        return h.getAge();
    }

    public static void main(String[] args) {
        Human Luca = new Human();
        System.out.println(checkName(Luca));
    }
}
