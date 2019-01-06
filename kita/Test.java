import java.io.*;
import java.util.Random;

public class Test{
    private int Yen500 = 0;
    private int Yen100 = 0;
    private int Yen50 = 0;
    private int Yen10 = 0;
    private int Yen5 = 0;
    private int Yen1 = 0;

    //コインの種類に応じて枚数を足す
	public void AddCoins(int coin_kind, int coin_num) {
        switch(coin_kind) {
            case 500:
            this.Yen500 += coin_num;
            break;

            case 100:
            this.Yen100 += coin_num;
            break;

            case 50:
            this.Yen50 += coin_num;
            break;

            case 10:
            this.Yen10 += coin_num;
            break;

            case 5:
            this.Yen5 += coin_num;
            break;

            case 1:
            this.Yen1 += coin_num;
            break;

            default: break;
        }
    }

    //指定したコインの枚数を返す
    public int GetCount(int kind_coin) {
        switch (kind_coin) {
            case 500: return this.Yen500;
            case 100: return this.Yen100;
            case 50: return this.Yen50;
            case 10: return this.Yen10;
            case 5: return this.Yen5;
            case 1: return this.Yen1;
        }
        return 0;
    }

    //コインの総枚数を表示
    public int GetCount() {
        return  this.Yen500 + this.Yen100 + this.Yen50 + this.Yen10 + this.Yen5 + this.Yen1;
    }

    //コインの総額を返す
    public int GetAmount() {
        return (this.Yen500*500)+(this.Yen100*100)+(this.Yen50*50)+(this.Yen10*10)+(this.Yen5*5)+(this.Yen1*1);
    }

    //指定したコインの総額を返す
    public int GetAmount(int coin_kind) {
        switch (coin_kind) {
            case 500: return this.Yen500*500;
            case 100: return this.Yen100*100;
            case 50: return this.Yen50*50;
            case 10: return this.Yen10*10;
            case 5: return this.Yen5*5;
            case 1: return this.Yen1*1;
        }
        return 0;
    }
}

