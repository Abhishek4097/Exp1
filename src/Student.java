import java.util.Scanner;
// how to creare Array of non primitive data types
class Student
{
    int rollno;
    String name;
    int marks;
    public Student(int rollno,String name, int marks)
    {
        this.name = name;
        this.marks = marks;
        this.rollno= rollno;
    }
}
class NonPrimitiveTypeArray {
    public static void main(String[] args) {
        Student arr[] = new Student[5];

        // initializing the array with Student object
        Scanner s = new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= new Student(s.nextInt(),s.next(),s.nextInt()); // object creation
        }

        // traverse/print all the objects value stored in array
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i].rollno + "\t" + arr[i].name+ "\t"+ arr[i].marks);
        }
    }
}
