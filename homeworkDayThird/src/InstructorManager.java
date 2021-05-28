public class InstructorManager extends UserManager{
    public void addCoursevideos(Instructor instructor){
        System.out.println("Video başarıyla eklendi" );

    }public void addHomework(Instructor instructor){
        System.out.println("Odev başariyla eklendi" );
    }
    public void ShowInstructorInfo(Instructor instructor){



            System.out.println("Eğitmen adi :"+instructor.getFirstName() +" "+instructor.getLastName() );
            System.out.println("eğitmen mail adresi:"+instructor.geteMailAdress() );


    }
}


