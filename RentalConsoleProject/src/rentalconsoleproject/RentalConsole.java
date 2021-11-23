/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsoleproject;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author jadin
 */
public class RentalConsole {
    static Map<String, List<String>> dataMember = new HashMap<String, List<String>>();
    static int waktuPinjam;
    
    static void MemberRental() {
        List<String> member1 = new ArrayList<String>();
        member1.add("Mr.X");
        member1.add("Silver");
        
        List<String> member2 = new ArrayList<String>();
        member2.add("Mr.Y");
        member2.add("Gold");
        
        List<String> member3 = new ArrayList<String>();
        member3.add("Mr.Z");
        member3.add("Platinum");
        
        dataMember.put("M001", member1);
        dataMember.put("M002", member2);
        dataMember.put("M003", member3);
    }
    
    
    static void cariMember(String idMember) {       
         
        if(dataMember.containsKey(idMember)) {
            
            for(Map.Entry<String, List<String>> entry : dataMember.entrySet()) {
                if(entry.getKey().equals(idMember)) {
                    
                String key = entry.getKey();
                List<String> values = entry.getValue();
                
                System.out.println("\nID Member                        : " + key);
                System.out.println("Nama Member                      : " + values.get(0));
                System.out.println("Jenis Member                     : " + values.get(1));
                
                }
            }
        } else {
                System.out.println("Bukan Member");
        }
    }
    
    static String JenisMember(String idMember) {
        
        String jenisMember = null;
        if(dataMember.containsKey(idMember)) {
            for(Map.Entry<String, List<String>> entry : dataMember.entrySet()) {
                if(entry.getKey().equals(idMember)) {
                    
                List<String> values = entry.getValue();               
                jenisMember = values.get(1);
                }
            }
        }
        return jenisMember;
    }
    
    static int totalHari(int tanggalPinjam, int bulanPinjam, int tahunPinjam, int hariKembali, int bulanKembali, int tahunKembali) {
        
        if(tahunKembali >= tahunPinjam) {
            if(bulanKembali >= bulanPinjam) {
                
                    LocalDateTime rent = LocalDateTime.of(tahunPinjam, bulanPinjam, tanggalPinjam, 23, 59, 59);
                    LocalDateTime returned = LocalDateTime.of(tahunKembali, bulanKembali, hariKembali, 23, 59, 59);

                    Duration duration = Duration.between(rent, returned);
        
                    waktuPinjam = (int) duration.toDays();
                 
            } else {
                System.out.println("Tanggal kembali tidak valid, silakan ulangi program");
            }
        } else {
            System.out.println("Tanggal kembali tidak valid, silakan ulangi program");
        }
        
        return waktuPinjam;
    }
}
