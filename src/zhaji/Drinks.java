package zhaji;

import java.time.LocalDate;

public abstract class Drinks {
    protected String name;            //名称
    protected double cost;            //成本
    protected LocalDate produce;      //生产日期
    protected int QualityGuarantee;   //保质期

    public Drinks(String name, double cost, LocalDate produce, int qualityGuarantee) {
        this.name = name;
        this.cost = cost;
        this.produce = produce;
        QualityGuarantee = qualityGuarantee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public LocalDate getProduce() {
        return produce;
    }

    public void setProduce(LocalDate produce) {
        this.produce = produce;
    }

    public int getQualityGuarantee() {
        return QualityGuarantee;
    }

    public void setQualityGuarantee(int qualityGuarantee) {
        QualityGuarantee = qualityGuarantee;
    }

    public abstract boolean  judgeOverdue();

    @Override
    public abstract String toString();
}
