package sedbury.pages.address;


import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import sedbury.entities.Address;
import sedbury.pages.Index;
import org.hibernate.Session;
import javax.inject.Inject;

/**
 * Created by alex on 06/09/2017.
 */
public class CreateAddress {

    @Property
    private Address address;

    @Inject
    private Session session;

    @InjectPage
    private Index index;

    @CommitAfter
    Object onSuccess() {
        session.persist(address);
        return index;
    }
}
