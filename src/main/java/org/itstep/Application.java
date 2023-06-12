package org.itstep;

import org.apache.tomcat.jni.Address;
import org.itstep.one_to_one_uni.Passport;
import org.itstep.one_to_one_uni.PassportRepository;
import org.itstep.one_to_one_uni.Person;
import org.itstep.one_to_one_uni.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private PassportRepository passportRepository;

    @Autowired
    private PersonRepository personRepository;


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        passportRepository.findAll().stream().forEach(
                passport -> System.out.println(passport)
        );
        personRepository.findAll().stream().forEach(
                pers -> System.out.println(pers)
        );
        Person person = personRepository.findById(1L).orElse(null);
        personRepository.delete(person);
        passportRepository.findAll().stream().forEach(
                passport -> System.out.println(passport)
        );
        personRepository.findAll().stream().forEach(
                pers -> System.out.println(pers)
        );

        /*
        Passport passport = new Passport();
        passport.setCountry("RU");
        Person person2 = new Person();
        person2.setPassport(passport);

        personRepository.save(person2);

        personRepository.findAll().stream().forEach(
                pers -> System.out.println(pers)
        );
    */
    }
}

/*
cmd
netstat -ano | findstr 8080
taskkill /F /PID 3388
 */
