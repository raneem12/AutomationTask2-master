import javax.xml.bind.annotation.*;
import java.util.ArrayList;

import static sun.plugin.javascript.navig.JSType.URL;

/**
 * Created by rzzayed on 6/21/17.
 */
@XmlRootElement(name = "test-case")
@XmlAccessorType(XmlAccessType.FIELD)
public class TestCase
{
    @XmlElementRef
    private ArrayList<Item> items ;



    @XmlAttribute(name = "name")
    private String name;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }


}
