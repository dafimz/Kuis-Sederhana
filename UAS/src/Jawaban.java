
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dafimz
 */
public class Jawaban implements Serializable {
    String jawaban1, jawaban2, jawaban3, jawaban4, jawaban5;
//            , jawaban6, jawaban7, jawaban8;
    
    Jawaban(String a, String b, String c, String d, String e){
        this.jawaban1=a;
        this.jawaban2=b;
        this.jawaban3=c;
        this.jawaban4=d;
        this.jawaban5=e;
//        this.jawaban6=f;
//        this.jawaban7=g;
//        this.jawaban8=h;
    }
    
}
