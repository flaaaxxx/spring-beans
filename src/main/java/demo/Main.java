package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.AnnotatedArrayType;

public class Main {

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

       ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("MBBS");
//        System.out.println(doctor);

//        Doctor doctor2 = context.getBean(Doctor.class);
//        System.out.println(doctor2);
//        System.out.println(doctor.getQualification());

//        Nurse nurse = (Nurse) context.getBean("nurse");
//        nurse.assist();
//
//        doctor.setNurse(nurse);
//        doctor.getNurse().assist();

    }

}
