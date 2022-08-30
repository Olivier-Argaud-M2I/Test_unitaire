package models;


public class DataModel {

    private Integer operation;
    private Double a;
    private Double b;

    public Integer getOperation() {
        return operation;
    }

    public void setOperation(Integer operation) {
        this.operation = operation;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public DataModel() {
    }

    public DataModel(Integer operation, Double a, Double b) {
        this.operation = operation;
        this.a = a;
        this.b = b;
    }
}
