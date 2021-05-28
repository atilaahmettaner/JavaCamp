public class Main {

    public static void main(String[] args) {
        String[] courses1 = {"(C# ve Angular kursu)"," (React  ve JAVA kursu)","(Proglamlamaya başlangıç kursu)"};
        String[] courses2 ={"(JavaScript Kursu)","(Kotlin ile Mobil uygulama geliştirme kursu)"};

        Student student1 =new Student();
        student1.setId(1);
        student1.setFirstName("Kaan");
        student1.setLastName("Özkan");
        student1.setEMailailAdress("kaan455@gmail.com");
        student1.setPassword("kaan1235");
        student1.setCompletionRate(15);

        Student student2 =new Student();
        student2.setId(2);
        student2.setFirstName("Mert");
        student2.setLastName("Ocak");
        student2.setEMailailAdress("ocakkmert46@gmail.com");
        student2.setPassword("ocakocak785");
        student2.setCompletionRate(68);


        Instructor instructor1 =new Instructor();
        instructor1.setPassword("demirog1989");
        instructor1.setFirstName("Engin Demiroğ");
        instructor1.setEMailailAdress("engindemirogmaster1@gmail.com");
        instructor1.setId(5);
        instructor1.setAdminPassword("admin456");
        instructor1.setCourseName(courses1[1]);

        Instructor instructor2 =new Instructor();
        instructor2.setId(5);
        instructor2.setFirstName("Mustafa Murat");
        instructor2.setLastName("Coskun");
        instructor2.setEMailailAdress("murat566coskun1@gmail.com");
        instructor2.setPassword("muratcoskun78");
        instructor2.setAdminPassword("admin456");
        instructor1.setCourseName(courses2[1]);

        InstructorManager instructorManager =new InstructorManager();
        StudentManeger studentManeger =new StudentManeger();
        UserManager userManager =new UserManager();


        User[] users ={student1,student2,instructor1,instructor2 };
        studentManeger.ShowStudendInfo(student1);
        studentManeger.ShowStudendInfo(student2);
        studentManeger.signinCourse(student1);

        instructorManager.ShowInstructorInfo(instructor1);
        instructorManager.addCoursevideos(instructor1);
        instructorManager.addHomework(instructor1);
        instructorManager.ShowInstructorInfo(instructor2);
        instructorManager.addCoursevideos(instructor2);


        instructorManager.addHomework(instructor2);
        instructorManager.ShowInstructorInfo(instructor2);

        }

    }

