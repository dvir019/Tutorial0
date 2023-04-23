class Human {
    String name;
    int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Human(String name) {
        this(name, 20);
    }

    Human() {
        this("Dani");
    }
}


class Test {
    public static void main(String[] args) {
        Human h = new Human();
    }
}
