package sedbury.pages.address;

import org.apache.tapestry5.annotations.Property;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 19/09/2017.
 */
public class Testmixin {

    @Property
    String theField;

    List<String> onProvideCompletionsFromTheField() throws IOException {

        HttpURLConnection connection = null;
        File file = null;
        BufferedReader br = null;
        try {
            file =  new File("/Users/alex/cardList.json") ;
            InputStream stream = new FileInputStream(file);
            String input;
            while ((input = br.readLine()) != null){
                System.out.println(input);
            }
        }


        catch (Exception e){
            e.printStackTrace();
        }

        finally {
            file.close();
        }

        




        ArrayList names = new ArrayList();

        names.add("Bob");
        names.add("Bill");
        names.add("Frank");

        return names;
    }
}
