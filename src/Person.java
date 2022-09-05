public class Person {
    private String name;
    private int age;
    private boolean married;

    public Person() {
    }

    public String getName() {
        return String.format("Persoana cu numele %s", name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return String.format(" are %d de ani", age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String isMarried() {
        if (married == true) {
            return " este casatorit/a ";
        } else {
            return " nu este casatorit/a ";
        }
    }

    public void setIsMarried(boolean married) {
        this.married = married;
    }
}

