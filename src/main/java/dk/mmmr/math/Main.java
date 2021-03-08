package dk.mmmr.math;

import dk.mmmr.math.sequences.Rationals;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        Rationals c = new Rationals(0, 18);
        System.out.println(c.rational(0));


        c.forEach(curr -> {
            long current = (long) curr;
            System.out.println(current + " --- " + c.rational(current));
        });
    }

}
