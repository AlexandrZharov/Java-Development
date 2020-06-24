package module2.patterns;

import java.time.LocalDate;

/**
 * Student POJO class
 *
 * @author Aleksandr Zharov
 * @version 1
 *
 * Copyright (c) Aleksandr Zharov KHNEU
 *
 * Programming patterns. Factory, Builder.
 *
 * Develop for your class
 *
 * 3. Create a class Student  - 25 fields.
 *
 * 4.  Create a builder for the class Student
 */
public class Student {

    private String studentIDNumber;
    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate birthday;

    private int age;
    private int height;
    private double weight;
    private String gender;
    private String formOfStudy;

    private boolean isStudentBudget; //true if student gets a free education or false if not
    private boolean getsAScholarship; //true if student gets a scholarship or false if not
    private String department;
    private String specialty;
    private String groupNumber;

    private int course;
    private boolean isGroupLeader;
    private boolean isBeneficiary;
    private String beneficiaryCategory;
    private String phoneNumber; //contact phone number

    private String eMail;
    private String parentFirstName;
    private String parentLastName;
    private String parentPatronymic;
    private String parentPhoneNumber;

    public String getStudentIDNumber() {
        return studentIDNumber;
    }

    public void setStudentIDNumber(String studentIDNumber) {
        this.studentIDNumber = studentIDNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFormOfStudy() {
        return formOfStudy;
    }

    public void setFormOfStudy(String formOfStudy) {
        this.formOfStudy = formOfStudy;
    }

    public boolean isStudentBudget() {
        return isStudentBudget;
    }

    public void setStudentBudget(boolean studentBudget) {
        isStudentBudget = studentBudget;
    }

    public boolean isGetsAScholarship() {
        return getsAScholarship;
    }

    public void setGetsAScholarship(boolean getsAScholarship) {
        this.getsAScholarship = getsAScholarship;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public boolean isGroupLeader() {
        return isGroupLeader;
    }

    public void setGroupLeader(boolean groupLeader) {
        isGroupLeader = groupLeader;
    }

    public boolean isBeneficiary() {
        return isBeneficiary;
    }

    public void setBeneficiary(boolean beneficiary) {
        isBeneficiary = beneficiary;
    }

    public String getBeneficiaryCategory() {
        return beneficiaryCategory;
    }

    public void setBeneficiaryCategory(String beneficiaryCategory) {
        this.beneficiaryCategory = beneficiaryCategory;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getParentFirstName() {
        return parentFirstName;
    }

    public void setParentFirstName(String parentFirstName) {
        this.parentFirstName = parentFirstName;
    }

    public String getParentLastName() {
        return parentLastName;
    }

    public void setParentLastName(String parentLastName) {
        this.parentLastName = parentLastName;
    }

    public String getParentPatronymic() {
        return parentPatronymic;
    }

    public void setParentPatronymic(String parentPatronymic) {
        this.parentPatronymic = parentPatronymic;
    }

    public String getParentPhoneNumber() {
        return parentPhoneNumber;
    }

    public void setParentPhoneNumber(String parentPhoneNumber) {
        this.parentPhoneNumber = parentPhoneNumber;
    }

    public class StudentBuilder {
        private Student studentToBuild;

        public StudentBuilder setStudentIDNumber(String studentIDNumber) {
            this.studentToBuild.setStudentIDNumber(studentIDNumber);
            return this;
        }

        public StudentBuilder setFirstName(String firstName) {
            this.studentToBuild.setFirstName(firstName);
            return this;
        }

        public StudentBuilder setLastName(String lastName) {
            this.studentToBuild.setLastName(lastName);
            return this;
        }

        public StudentBuilder setPatronymic(String patronymic) {
            this.studentToBuild.setPatronymic(patronymic);
            return this;
        }

        public StudentBuilder setBirthday(LocalDate birthday) {
            this.studentToBuild.setBirthday(birthday);
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.studentToBuild.setAge(age);
            return this;
        }

        public StudentBuilder setHeight(int height) {
            this.studentToBuild.setHeight(height);
            return this;
        }

        public StudentBuilder setWeight(double weight) {
            this.studentToBuild.setWeight(weight);
            return this;
        }

        public StudentBuilder setGender(String gender) {
            this.studentToBuild.setGender(gender);
            return this;
        }

        public StudentBuilder setFormOfStudy(String formOfStudy) {
            this.studentToBuild.setFormOfStudy(formOfStudy);
            return this;
        }

        public StudentBuilder setIsStudentBudget(boolean isStudentBudget) {
            this.studentToBuild.setStudentBudget(isStudentBudget);
            return this;
        }

        public StudentBuilder setGetsAScholarship(boolean getsAScholarship) {
            this.studentToBuild.setGetsAScholarship(getsAScholarship);
            return this;
        }

        public StudentBuilder setDepartment(String department) {
            this.studentToBuild.setDepartment(department);
            return this;
        }

        public StudentBuilder setSpecialty(String specialty) {
            this.studentToBuild.setSpecialty(specialty);
            return this;
        }

        public StudentBuilder setGroupNumber(String groupNumber) {
            this.studentToBuild.setGroupNumber(groupNumber);
            return this;
        }

        public StudentBuilder setCourse(int course) {
            this.studentToBuild.setCourse(course);
            return this;
        }

        public StudentBuilder setIsGroupLeader(boolean isGroupLeader) {
            this.studentToBuild.setGroupLeader(isGroupLeader);
            return this;
        }

        public StudentBuilder setIsBeneficiary(boolean isBeneficiary) {
            this.studentToBuild.setBeneficiary(isBeneficiary);
            return this;
        }

        public StudentBuilder setBeneficiaryCategory(String beneficiaryCategory) {
            this.studentToBuild.setBeneficiaryCategory(beneficiaryCategory);
            return this;
        }

        public StudentBuilder setPhoneNumber(String phoneNumber) {
            this.studentToBuild.setPhoneNumber(phoneNumber);
            return this;
        }

        public StudentBuilder seteMail(String eMail) {
            this.studentToBuild.seteMail(eMail);
            return this;
        }

        public StudentBuilder setParentFirstName(String parentFirstName) {
            this.studentToBuild.setParentFirstName(parentFirstName);
            return this;
        }

        public StudentBuilder setParentLastName(String parentLastName) {
            this.studentToBuild.setParentLastName(parentLastName);
            return this;
        }

        public StudentBuilder setParentPatronymic(String parentPatronymic) {
            this.studentToBuild.setParentPatronymic(parentPatronymic);
            return this;
        }

        public StudentBuilder setParentPhoneNumber(String parentPhoneNumber) {
            this.studentToBuild.setParentPhoneNumber(parentPhoneNumber);
            return this;
        }

        public StudentBuilder similarTo(Student student) {
            this.studentToBuild.setStudentIDNumber(student.getStudentIDNumber());
            this.studentToBuild.setFirstName(student.getFirstName());
            this.studentToBuild.setLastName(student.getLastName());
            this.studentToBuild.setPatronymic(student.getPatronymic());
            this.studentToBuild.setBirthday(student.getBirthday());
            this.studentToBuild.setAge(student.getAge());
            this.studentToBuild.setHeight(student.getHeight());
            this.studentToBuild.setWeight(student.getWeight());
            this.studentToBuild.setGender(student.getGender());
            this.studentToBuild.setFormOfStudy(student.getFormOfStudy());
            this.studentToBuild.setStudentBudget(student.isStudentBudget());
            this.studentToBuild.setGetsAScholarship(student.isGetsAScholarship());
            this.studentToBuild.setDepartment(student.getDepartment());
            this.studentToBuild.setSpecialty(student.getSpecialty());
            this.studentToBuild.setGroupNumber(student.getGroupNumber());
            this.studentToBuild.setCourse(student.getCourse());
            this.studentToBuild.setGroupLeader(student.isGroupLeader());
            this.studentToBuild.setBeneficiary(student.isBeneficiary());
            this.studentToBuild.setBeneficiaryCategory(student.getBeneficiaryCategory());
            this.studentToBuild.setPhoneNumber(student.getPhoneNumber());
            this.studentToBuild.seteMail(student.geteMail());
            this.studentToBuild.setParentFirstName(student.getParentFirstName());
            this.studentToBuild.setParentLastName(student.getParentLastName());
            this.studentToBuild.setParentPatronymic(student.getParentPatronymic());
            this.studentToBuild.setParentPhoneNumber(student.getParentPhoneNumber());
            this.studentToBuild.setParentPhoneNumber(student.getParentPhoneNumber());
            return this;
        }

        public Student createStudent() {
            return studentToBuild;
        }
    }
}
