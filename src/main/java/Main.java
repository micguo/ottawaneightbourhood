
public class Main
{
    public static void main(String[] args) {
        NeighbourhoodAdapter neighbourhoodAdapterObj = new NeighbourhoodAdapter();
        try {
            neighbourhoodAdapterObj.load();
            System.out.print(neighbourhoodAdapterObj);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
