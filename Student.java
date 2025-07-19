class Test {
    public static void main(String[] args) {
        String s = new String("harsh");
        Student s1 = new Student("harsh", 101);
        System.out.println(s1.name + " --- " + s1.rollno);
    }
}

class Student {
    String name;
    int rollno;

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
}
