import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Hao on 2016-06-04.
 */
public class NeighbourhoodAdapter {
    private ArrayList nhList = new ArrayList();

    public void load() throws IOException {
        InputStream inputStream = getClass().getResourceAsStream("neighbourhood-names.json");
        String jsonString = IOUtils.toString(inputStream, Charset.forName("UTF-8"));
        JSONArray nhJsonObjectArray = new JSONObject(jsonString).getJSONArray("features");

        for (int i = 0; i < nhJsonObjectArray.length(); i++) {
            nhList.add(new Neighbourhood(nhJsonObjectArray.getJSONObject(i)));
        }
    }

    public String toString()
    {
        String out = new String();
        Iterator<Neighbourhood> ghIterator = this.nhList.iterator();
        while (ghIterator.hasNext()) {
            out += ghIterator.next() + "\n";
        }

        return out;
    }
}
