public class Day14 {
    static class Student {
        String name;
        int age;
        int regNo;
        String dept;
        String dob;
        String phone;
        String email;
        String year;
        String bloodGroup;
        String gender;

        // parameterized constructor
        /*Student(String name, int age, int regNo, String dept, String dob, String phone, String email, String year, String bloodGroup, String gender) {
            this.name = name;
            this.age = age;
            this.regNo = regNo;
            this.dept = dept;
            this.dob = dob;
            this.phone = phone;
            this.email = email;
            this.year = year;
            this.bloodGroup = bloodGroup;
            this.gender = gender;
        }
         */
        Student(Builder builder) {
            this.name = builder.name;
            this.age = builder.age;
            this.regNo = builder.regNo;
            this.dept = builder.dept;
            this.dob = builder.dob;
            this.phone = builder.phone;
            this.email = builder.email;
            this.year = builder.year;
            this.bloodGroup = builder.bloodGroup;
            this.gender = builder.gender;
        }
        static class Builder {
            private String name;
            private int age;
            private int regNo;
            private String dept;
            private String dob;
            private String phone;
            private String email;
            private String year;
            private String bloodGroup;
            private String gender;

            public Builder name(String nameValue) {
                this.name = nameValue;
                return this;
            }
            public Builder age(int ageValue) {
                this.age = ageValue;
                return this;
            }
            public Builder regNo(int regNoValue) {
                this.regNo = regNoValue;
                return this;
            }
            public Builder dept(String deptValue) {
                this.dept = deptValue;
                return this;
            }
            public Builder dob(String dobValue) {
                this.dob = dobValue;
                return this;
            }
            public Builder phone(String phoneValue) {
                this.phone = phoneValue;
                return this;
            }
            public Builder email(String emailValue) {
                this.email = emailValue;
                return this;
            }
            public Builder year(String yearValue) {
                this.year = yearValue;
                return this;
            }
            public Builder bloodGroup(String bloodGroupValue) {
                this.bloodGroup = bloodGroupValue;
                return this;
            }
            public Builder gender(String genderValue) {
                this.gender = genderValue;
                return this;
            }
            public Student build() {
                return new Student(this);
            }

        }
    }

    static void main() {
        // Student student = new Student("John",23, 425235, "21-12-5555",);
        Student student = new Student.Builder()
                .name("Aravindh")
                .age(18)
                .regNo(2342343)
                .dept("CSE")
                .dob("1999-12-31")
                .phone("1234567890")
                .email("adam@ghmaiol.com")
                .year("1999")
                .bloodGroup("O+")
                .gender("M")
                .build();
        System.out.println(student.name);
    }

}
