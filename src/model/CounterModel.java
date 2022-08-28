package model;

public class CounterModel{
    private int value;
    public CounterModel(){
        this.value=0;
    }
    public int getValue(){
        return this.value;
    }
    public void setValue(int value){
        this.value=value;
    }
    public void up_Value(){
        this.value++;
    }
    public void down_Value(){
        this.value--;
    }
    public void reset(){
        this.setValue(0);
    }
}