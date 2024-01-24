package BoxGame;

import BoxGame.Fighter;

public class Match {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;
    double randomNumber;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){
        if (isCheck()){
            if (this.f1.whoStarts()^this.f2.whoStarts()){
                if (this.f1.whoStarts()){
                    System.out.println(this.f1.name + " is first!");

                    this.f2.health = this.f1.hit(this.f2);
                    this.f1.health = this.f2.hit(this.f1);

                } else {
                    System.out.println(this.f2.name + " is first!");
                    this.f1.health = this.f2.hit(this.f1);

                    this.f2.health = this.f1.hit(this.f2);

                }

            }
            System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
            System.out.println(this.f2.name + " Sağlık: " + this.f2.health);

            while(this.f1.health >0 && this.f2.health >0){

                System.out.println("=====NEW ROUND=====");

                        this.f2.health = this.f1.hit(this.f2);

                        if (isWin()){
                            break;
                        }
                        this.f1.health = this.f2.hit(this.f1);
                        if (isWin()){
                            break;
                        }
                        this.f1.health = this.f2.hit(this.f1);

                        if (isWin()){
                            break;
                        }
                        this.f2.health = this.f1.hit(this.f2);
                        if (isWin()){
                            break;
                        }

                System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık: " + this.f2.health);

            }

        } else {
            System.out.println("Athletes' weights do not match");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) && (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight);
    }

    boolean isWin(){
        if(this.f1.health ==0) {
            System.out.println("Winner is " + this.f2.name);
            return true;
        }
        if (this.f2.health ==0) {
            System.out.println("Winner is " + this.f1.name);
            return true;
        }
        return false;
    }
}
