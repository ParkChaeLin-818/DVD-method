/**
 * 여기에 DVDSaleCalculate 클래스 설명을 작성하십시오.
 * 
 * @author (박채린 , 이와사키메구미 , 마츠바라케이토) 
 * @version (2020.06.11)
 */
public class DVDSaleCalculate
{
    boolean Date = true;
    int age = 0;
    int charge = 5000;
    
    public int DVDSaleCalculate(boolean Date, int age){
        if (Date == true){
             charge = charge / 2;
        }
        else if (Date == false){
            if(age < 19){
                charge = charge / 10 * 9;
           }
           else if(age > 64){
               charge = charge / 5 * 4;
           }
           else{
               charge = charge;
            }
        }
        
        
        return charge;
    }
}
