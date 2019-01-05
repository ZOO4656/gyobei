import java.io.*;
import java.util.Random;

public class Test{
    private int Yen500 = 0;
    private int Yen100 = 0;
    private int Yen50 = 0;
    private int Yen10 = 0;
    private int Yen5 = 0;
    private int Yen1 = 0;

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

            default:
                break;
        }
    }
    public int GetCount(int coin_kind) {
        switch(coin_kind) {
            case 500: return this.Yen500;

            case 100: return this.Yen100;

            case 50: return  this.Yen50;

            case 10: return  this.Yen10;

            case 5: return   this.Yen5;

            case 1: return   this.Yen1;

            default: return 0;
        }
    }
    public int GetAmount() {
        return (this.Yen500*500)+(this.Yen100*100)+(this.Yen50*50)+(this.Yen10*10)+(this.Yen5*5)+(this.Yen1*1);
    }
}
