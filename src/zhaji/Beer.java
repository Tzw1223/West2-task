package zhaji;

import java.time.LocalDate;

public class Beer extends Drinks {
    protected float AlcoholDegree;    //酒精度数

    public Beer(String name, double cost, LocalDate produce, float alcoholDegree) {
        super(name, cost, produce, 30);
        AlcoholDegree = alcoholDegree;
    }

    public float getAlcoholDegree() {
        return AlcoholDegree;
    }

    public void setAlcoholDegree(float alcoholDegree) {
        AlcoholDegree = alcoholDegree;
    }


    @Override
    public boolean judgeOverdue() {
        LocalDate now = LocalDate.now();
        LocalDate plusDays = produce.plusDays(getQualityGuarantee());
        if(plusDays.isBefore(now))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "AlcoholDegree=" + AlcoholDegree +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", produce=" + produce +
                ", QualityGuarantee=" + QualityGuarantee +
                '}';
    }
}
