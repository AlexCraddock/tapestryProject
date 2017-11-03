package sedbury.pages;

import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.TextField;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 28/08/2017.
 */
public class Cards {

    @InjectComponent("searchCards")
    private TextField search;

    @Property
    private String searchCards;

    
    void onSubmitFromSearchTheCards(){
        System.out.print(1);
    }

    @OnEvent(value = "provideCompletions")
    public List<String> autoComplete(String start)
    {
        return new ArrayList<String>();


    }

}
