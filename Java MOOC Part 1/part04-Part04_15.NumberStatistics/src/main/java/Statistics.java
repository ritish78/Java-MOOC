
public class Statistics {
    private int count;
    private int sum;
    public Statistics(){
        
    }
    public void addNumber(int number){
       this.sum+=number;
       count++;
    }
    public int getCount(){
        return this.count;
    }
    public int sum(){
        return this.sum;
    }
    public double average(){
        
        return (1.0*sum()/getCount());
    }
    public void resetSum(){
        this.sum=0;
    }
    
}
