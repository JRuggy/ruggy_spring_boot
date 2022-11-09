package ruggy.com.first.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable{
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
}
