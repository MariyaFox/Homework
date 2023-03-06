package taskone;

public class PersonWithBuilder {
    public static final class Person {
        private final String firstName;
        private final String lastName;
        private final String middleName;
        private final String country;
        private final String address;
        private final String phone;
        private final int age;
        private final String gender;

        public static class Builder {
            private final String firstName;
            private final String lastName;
            public String country;
            public String address;
            public String phone;
            public int age;
            public String gender;
            private String middleName = "";


            public Builder(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            public Builder middleName(String middleName) {
                this.middleName = middleName;
                return this;
            }


            public Person build() {
                return new Person(this);
            }
        }

        private Person(Builder builder) {
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.middleName = builder.middleName;
            this.country = builder.country;
            this.address = builder.address;
            this.phone = builder.phone;
            this.age = builder.age;
            this.gender = builder.gender;

        }
    }
}
