package java_open_elective_assignments;

class Student implements Cloneable {
    String name;
    int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    // 1. Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // same object
        if (obj == null || getClass() != obj.getClass()) return false;
        Student s = (Student) obj;
        return roll == s.roll && name.equals(s.name);
    }

    // 2. Override hashCode()
    @Override
    public int hashCode() {
        return name.hashCode() + roll;
    }

    // 3. clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // shallow copy
    }

    // 4. finalize()
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Student object is being garbage collected.");
    }
}

public class ObjectMethodsDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Alice", 101);
        Student s3 = (Student) s1.clone();

        // equals()
        System.out.println("s1 equals s2? " + s1.equals(s2));  // true

        // hashCode()
        System.out.println("s1 hashCode: " + s1.hashCode());
        System.out.println("s2 hashCode: " + s2.hashCode());

        // getClass()
        System.out.println("s1 is of class: " + s1.getClass().getName());

        // clone()
        System.out.println("s3 (cloned from s1): " + s3.name + ", " + s3.roll);

        // finalize() (we force GC to trigger it, but it's not guaranteed)
        s1 = null;
        s2 = null;
        s3 = null;
        System.gc(); // suggest JVM to run garbage collector
    }
}

