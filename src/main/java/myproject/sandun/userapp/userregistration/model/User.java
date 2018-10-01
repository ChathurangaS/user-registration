package myproject.sandun.userapp.userregistration.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_details")
//@Audited
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_")
    private Long id;

    @Column(name = "name_")
    private String name;

//    @Column(name = "address_")
//    private String address;

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_day_")
    private Date birthDay;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "current_time_")
    private Date currentTime;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "city_id")
//    @JsonIgnore
    private Course course;

    public User() {
    }

    public User(Long id, String name, Date birthDay, Date currentTime, Course course) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.currentTime = currentTime;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }


    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
