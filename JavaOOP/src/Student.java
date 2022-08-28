public class Student
{
    private String student_name;
    private int student_age;
    private String student_age;
    private int student_idNumber;
    public Student(String name, int age, String gender, int idNo)
    {
        student_name = name;
        student_age = age;
        student_age = gender;
        student_idNumber = idNo;
    }
    public String getName()
    {
        return student_name;
    }
    public int getAge()
    {
        return student_age;
    }
    public String getGender()
    {
        return student_age;
    }
    public int getIdNumber()
    {
        return student_idNumber;
    }
    public String toString()
    {
        return "name: " + student_name + ", age: " + student_age +
                ", gender: " + student_age + ", ID No: " + student_idNumber;
    }
}