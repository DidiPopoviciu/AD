package lab4.ch6;

public class Person {
    private String name;
    private String job;
    private String university;
    private boolean drivingLicense;
    private boolean isMarried;

    private Person(PersonBuilder person) {
        this.name = person.name;
        this.job = person.job;
        this.university = person.university;
        this.drivingLicense = person.drivingLicense;
        this.isMarried = person.isMarried;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getUniversity() {
        return university;
    }

    public boolean getDrivingLicense() {
        return drivingLicense;
    }

    public boolean getIsMarried() {
        return isMarried;
    }

    public static final class PersonBuilder {
        private String name;
        private String job;
        private String university;
        private boolean drivingLicense;
        private boolean isMarried;

        public PersonBuilder(String name) {
            this.name = name;
        }

        public PersonBuilder setJob(String job) {
            this.job = job;
            return this;
        }

        public PersonBuilder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public PersonBuilder setDrivingLicense(boolean drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public PersonBuilder setMarried(boolean married) {
            isMarried = married;
            return this;
        }

        public Person buildPerson() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicense=" + drivingLicense +
                ", isMarried=" + isMarried +
                '}';
    }
}
