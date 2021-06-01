package kodlamaio.hrms.entities.concretes;

import lombok.Data;
import javax.persistence.*;


@Entity
@Table(name="users")
@Data
public class User {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private int id;

    @Column(name = "e_posta")
    private String eMail;

    @Column(name = "password")
    private String password;

public User(){

}

}
