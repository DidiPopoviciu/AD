package lab2.Ch1;

public class BoxingMatch {
    private Fighter f1;
    private Fighter f2;

    public BoxingMatch(Fighter f1, Fighter f2){
        this.f1 = f1;
        this.f2 = f2;
    }
    public String fight(){
        String winner = f2.getName();

        while (f1.getHealth() > 0 && f2.getHealth() >0){
            System.out.println(f1.getName() + ".health = " + f1.getHealth());
            System.out.println(f2.getName() + ".health = " + f2.getHealth());
            System.out.println("-----------------");
            f2.decreaseHealth(f1.getDamagePerAttack());
            if (f2.getHealth()>0){
                f1.decreaseHealth(f2.getDamagePerAttack());
            }
            else{
                winner = f1.getName();
            }
        }

        return winner;
    }
}
