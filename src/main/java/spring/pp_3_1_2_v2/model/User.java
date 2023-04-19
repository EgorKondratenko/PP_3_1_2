package spring.pp_3_1_2_v2.model;

import jakarta.persistence.*;



@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "email")
    private String email;
    @Column(name = "car")
    private String car;


    public User() {}

    public User(String name
            , String lastName, Integer age, String email, String car) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.car = car;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) { this.age = age; }

    public Integer getAge() { return age; }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCar(String car) { this.car = car; }

    public String getCar() { return car; }

}
