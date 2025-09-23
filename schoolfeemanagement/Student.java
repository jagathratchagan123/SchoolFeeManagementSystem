import java.sql.Date;


public class Student {
    private int studentId;
    private String name;
    private String studentClass; 
    private String section;
    private Date dob;
    private String admissionNo;

    public Student() {}


    public Student(int studentId, String name, String studentClass, String section, Date dob, String admissionNo) {
        this.studentId = studentId;
        this.name = name;
        this.studentClass = studentClass;
        this.section = section;
        this.dob = dob;
        this.admissionNo = admissionNo;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(String admissionNo) {
        this.admissionNo = admissionNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", studentClass='" + studentClass + '\'' +
                ", section='" + section + '\'' +
                ", dob=" + dob +
                ", admissionNo='" + admissionNo + '\'' +
                '}';
    }
}