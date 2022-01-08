/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectGUI_BMI;

/**
 *
 * @author Dzikry Alfian
 */
public class BeratBadanIdeal {
    
    private double tb,bb,tot;
    private String info;
    
    //menggunakan getter and setter agar lebih cepat dalam  kodingannya
    public double getTot() {
        return tot = this.bb/(this.tb * this.tb);
    }

    public String getInfo() {
        return info;
    }

    public void setTb(double tb) {
        this.tb = tb / 100;
    }

    public void setBb(double bb) {
        this.bb = bb;
    }
    
    
    void hasilInfo(){
        //menghitung body mass index
        if(getTot() < 18.5) {
            this.info = "Berat badan anda kekurangan(kurus)";
        }else if (getTot() < 24.9){
            this.info = "Berat badan anda normal(ideal)";
        }else if (getTot() < 29.9){
            this.info = "Berat badan anda kelebihan(gendut)";
        }else if (getTot() > 30.0){
            this.info = "Anda Obsitas";
        }
    }        
            
}

/*cara menghitung berat badan idealnya

BMI  = BB / (TB*TB)
NOTE : Notasi tinggi badan dalam satuan M
 Dengan Kriteria :
1. JIKA BMI < 18.5      = Kekurangan berat badan 
2. JIKA BMI 18.5 - 24.9 = Normal(ideal)
3. JIKA BMI 25.0 - 29.9 = Kelebihan berat badan
4. JIKA BMI > 30.0      = Obesitas

*/