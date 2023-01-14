abstract class fauna {
    // Data
    protected String name;
    protected int age;

    // Constructor
    public fauna() {

    }

    public fauna(String n, int a) {
        name = n;
        age = a;
    }

    // Abstract method
    abstract public void eat();

    // Regular method
    public void sleep() {
        System.out.println("My Pet");
    }
}