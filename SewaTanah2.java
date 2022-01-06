/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sewatanah2;

/**
 *
 * @author andre
 */
public class SewaTanah2 {

        public double sewa (double luas, double trfpermtr){
            double HargaSewa;
            
            HargaSewa = luas * trfpermtr;
            return HargaSewa;
                    
        }
   
        public static void main(String[] args){
            double hrgsw;
            SewaTanah2 st = new  SewaTanah2();
            hrgsw = st.sewa(1000, 2000000);
            System.out.println(hrgsw);
        }
    }
   
