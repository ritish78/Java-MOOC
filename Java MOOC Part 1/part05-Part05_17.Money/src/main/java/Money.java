
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    public Money plus(Money addition){
        Money newMoney = new Money(addition.euros()+this.euros,addition.cents+this.cents);
        return newMoney;  
    }
    public boolean lessThan(Money compared){
        Money comparedMoney = (Money) compared;
        if (this.euros<compared.euros){
            return true;
        }else if(this.euros==compared.euros && this.cents<compared.cents){
            return true;
        }
        return false;
    }
    public Money minus(Money decreaser){
        int newcents=0;
        int neweuros=0;
       if (this.cents>=decreaser.cents){
           newcents=this.cents-decreaser.cents;
           neweuros=this.euros-decreaser.euros;
           if (neweuros>=0){
                return new Money(neweuros, newcents);
           }
       }
       newcents=100-decreaser.cents;
       neweuros=this.euros-decreaser.euros-1;
       if (neweuros>=0){
           return new Money(neweuros, newcents);
       }
       return new Money(0,0);
       
    }
        
    

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
