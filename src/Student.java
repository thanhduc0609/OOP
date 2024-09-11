class Student{
    string name;
    float gpa;

    void InputStudent() {
        java.util.Scanner scanner = new java.util.Scanner(system.in);
        name = scanner.nextLine();
        gpa = scanner.nextFloat();
    } scanner.close();

    void OutputStudent() {
        system.out.println("Ten: "+ name + ", GPA: "+gpa);
    }
}

