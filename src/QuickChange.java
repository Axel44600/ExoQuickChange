import java.util.ArrayList;
import java.util.List;

public class QuickChange {

    private Long c2;
    private String c3;
    private Double c4;

    public QuickChange() {
    }

    public void afficherCostume(Integer c1) {
        List c = new ArrayList();
            c.add(c1);
            c.add(c2 = Long.valueOf(c1));
            c.add(c3 = c2.toString());
            c.add(c4 = Double.parseDouble(c3));

            for(int i = 0; i < 4; i++) {
                String type = c.get(i).getClass().getName().toString().substring(10);
                System.out.println("Attention, je suis à présent un "+type+" et ma valeur est "+ c.get(i)+"!");
            }
    }
}
