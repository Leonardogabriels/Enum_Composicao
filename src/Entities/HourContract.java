package Entities;

import java.util.Date;

public class HourContract {
    private Date data;
    private Double valuePerHour;
    private Integer Hours;
    
    public HourContract() {
    }
    public HourContract(Date data, Double valuePerHour, Integer hours) {
        this.data = data;
        this.valuePerHour = valuePerHour;
        Hours = hours;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Double getValuePerHour() {
        return valuePerHour;
    }
    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }
    public Integer getHours() {
        return Hours;
    }
    public void setHours(Integer hours) {
        Hours = hours;
    }
    
    
}
    