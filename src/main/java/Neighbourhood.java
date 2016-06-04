import org.json.JSONObject;

public class Neighbourhood {
    private String name;
    public Neighbourhood(JSONObject jsonObj)
    {
        this.name = jsonObj.getJSONObject("properties").getString("TextString");
    }

    public String toString()
    {
        return this.name;
    }
}
