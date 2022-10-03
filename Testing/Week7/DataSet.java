package Week7;

public class DataSet {
    private double sum;
    private double max;
    private int count;

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void add(double x){
        sum += x;
        if(count == 0 || x > max){
            max = x;
        }
        count++;
    }

    public double getAverage(){
        if(count == 0){
            return 0;
        }else{
            return sum / count;
        }
    }

    public double getMaximum(){
        return max;
    }

}
