package myproject.sandun.userapp.userregistration.model;

import javax.persistence.*;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_")
    private Long id;

    @Column(name = "subject_name_")
    private String subjectName;

    @Column(name = "subject_desc_")
    private String subjectDescription;

    public Subject() {
    }

    public Subject(Long id) {
        this.id = id;
    }

    public Subject(Long id, String subjectName, String subjectDescription) {
        this.id = id;
        this.subjectName = subjectName;
        this.subjectDescription = subjectDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectDescription() {
        return subjectDescription;
    }

    public void setSubjectDescription(String subjectDescription) {
        this.subjectDescription = subjectDescription;
    }
}
