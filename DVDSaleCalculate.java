/**
 * 렌탈하는 DVD의 할인여부에 따라 요금을 계산해주는 메소드이다.
 * 
 * @author (박채린 , 이와사키메구미 , 마츠바라케이토) 
 * @version (2020.06.11)
 */
public class DVDSaleCalculate
{
    /**
     * @param
     * Date = 구작(대여시작일로부터 6개월이상 경과된 작품) 인지 아닌지 판단한 값
     * (True = 구작일 경우 / False = 구작이 아닐경우)
     * age = 나이값
     * charge = 요금
     * @return = 할인이 적용된 후의 요금
     */
    boolean Date = true;
    int age = 0;
    int charge = 5000;
    
    public int DVDSaleCalculate(boolean Date, int age){
        if (Date == true){
             charge = charge / 2;
        }
        else{
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
