package Serialization;

public class SimpleSerialization {

    public void personSerialization(Person person) {

        if (person.getAge() > 65) {
            person.setPosition("Retiree");
        } else if (person.getAge() > 23 && person.getAge() <= 65) {
            person.setPosition("Worker");
        } else if (person.getAge() > 18 && person.getAge() <= 23) {
            person.setPosition("Student");
        } else if (person.getAge() > 7 && person.getAge() <= 18) {
            person.setPosition("Schoolboy");
        } else if (person.getAge() > 3 && person.getAge() <= 7) {
            person.setPosition("Kindergartner");
        } else if (person.getAge() >= 0 && person.getAge() <= 3) {
            person.setPosition("Child");
        }
    }

}
