package zhaji;

import java.time.LocalDate;

public class Juice extends Drinks {
    public Juice(String name, double cost, LocalDate produce) {
        super(name, cost, produce, 2);
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
        return "Juice{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", produce=" + produce +
                ", QualityGuarantee=" + QualityGuarantee +
                '}';
    }
}
