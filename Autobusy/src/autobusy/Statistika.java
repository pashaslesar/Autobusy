package autobusy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Statistika {
    private ArrayList<Spoj> spoje;
    private String jmeno;

    public Statistika() {
        this.spoje = new ArrayList<>();
    }

    public void pridejSpoj (Spoj spoj){
        spoje.add(spoj);
    }
    
    public void vypisSpoje() {
        for (Spoj s : spoje) {
            System.out.println(s);
        }
        System.out.println();
    }
    
    public void najdiNejrychlejsiSpoj() {
        Spoj nejrychlejsi = spoje.get(0);
        
        for (Spoj s : spoje) {
            if (s.casJizdyMinuty() <= nejrychlejsi.casJizdyMinuty()) {
                nejrychlejsi = s;
            } 
        }
        System.out.println("Nejrychlejsim spojem je spoj <" + nejrychlejsi.getId() + "> s dobou jizdy " + nejrychlejsi.casJizdyMinuty() + ".");
        System.out.println();
    }
    
    public void vypisSpojeOdCasu(Cas cas) {
        for (Spoj s : spoje) {
            if (s.getCasVyjezdu().prevedNaMinuty() == cas.prevedNaMinuty()) {
                System.out.println(s);
            }
        }
        System.out.println();
    }
    
    public void ulozSpojeDoSouboru(String jmenoSouboru) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(jmenoSouboru))) {
            writer.println(jmeno);
            for (Spoj s : spoje) {
                writer.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void nactiSpoje(String jmenoSouboru) {
        try (BufferedReader reader = new BufferedReader(new FileReader(jmenoSouboru))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
