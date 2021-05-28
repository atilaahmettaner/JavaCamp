public class StudentManeger extends UserManager{
   public void signinCourse(Student student){
       System.out.println("kursa başarıyla kayıt olundu." );
    }
    public void ShowStudendInfo(Student student){

           System.out.println("Isim soyisim: " + student.getFirstName()+" "+student.getLastName());
           System.out.println("Mail adresi: "+student.geteMailAdress() );
           System.out.println("Ogrenci id: "+student.getId());


    }
}
