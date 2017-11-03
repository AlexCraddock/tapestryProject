package sedbury.entities;


import org.apache.tapestry5.beaneditor.NonVisual;
import org.apache.tapestry5.beaneditor.Validate;


import javax.persistence.Entity;
import sedbury.data.Honorific;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by alex on 06/09/2017.
 */
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  @NonVisual  public Long id;

    public Honorific honorific;

    @Validate("required") public String firstName;

    @Validate("required") public String lastName;

    public String street1;

    public String street2;

    @Validate("required") public String city;

    @Validate("required") public String state;

    @Validate("required") public String zip;

    public String email;

    public String phone;


}
