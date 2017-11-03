package sedbury.pages;


import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;
import sedbury.entities.Address;

import java.util.List;

/**
 * Start page of application mine.
 */
public class Index
{

    @Inject
    private Session session; public List<Address> getAddresses() { return session.createCriteria(Address.class).list(); }

}
