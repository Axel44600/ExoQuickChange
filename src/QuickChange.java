import java.util.ArrayList;
import java.util.List;

public class QuickChange {

    private Integer c1;
    private Long c2;
    private String c3;
    private Double c4;

    public QuickChange() {
    }

    public void afficherCostume(Integer firstCostume) {
        List c = new ArrayList();
            c.add(c1 = firstCostume);
            c.add(c2 = Long.valueOf(c1));
            c.add(c3 = c2.toString());
            c.add(c4 = Double.parseDouble(c3));

            for(int i = 0; i < 4; i++) {
                String type = c.get(i).getClass().getName().toString().substring(10);
                System.out.println("Attention, je suis à présent un "+type+" et ma valeur est "+ c.get(i)+"!");
            }
    }

    public Integer getC1() {
        return c1;
    }

    public void setC1(Integer c1) {
        this.c1 = c1;
    }

    public Long getC2() {
        return c2;
    }

    public void setC2(Long c2) {
        this.c2 = c2;
    }

    public String getC3() {
        return c3;
    }

    public void setC3(String c3) {
        this.c3 = c3;
    }

    public Double getC4() {
        return c4;
    }

    public void setC4(Double c4) {
        this.c4 = c4;
    }
}
