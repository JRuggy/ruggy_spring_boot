package ruggy.com.first.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable{
    /*
     * 
     * 
     */
    public static final long serialVersionUID = 1L; 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;    
    private String firstname;    
    private String lastname;    
    private String email;    

    public User(){
        // TODO Auto-generated constructor stub
    }

    //This is for id 
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    //This is for first name 
    public String getFistName(){
        return firstname;
    }

    public void setFirstName(String firstname){
        this.firstname = firstname;
    }

    //This is for last name 
    public String getLastName(){
        return lastname;
    }

    public void setLastName(String lastname){
        this.lastname = lastname;
    }

    //This is for email
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
