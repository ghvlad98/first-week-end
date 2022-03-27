package FirstWeekEx3;

import java.util.ArrayList;
import java.util.Map;

public class AziendaSanitaria {
    private Map<Paziente, Medico> paz;
    private ArrayList<Medico> med;

    public void aggPaziente(Paziente p) {
        if (!(paz.containsKey(p))) {
            // paz.put(p);
            String mResp = p.getMedResp();
            if (trovaMedico(mResp) == null) {
                System.out.println("Uknown doctor!");
            } else {
                paz.put(p, trovaMedico(mResp));
            }
        } else {
            System.out.println("Patient already added!");
        }
    }

    private Medico trovaMedico(String mResp) {
        for (Medico m: med) {
            if (m.getName().equals(mResp)) {
                return m;
            }
        }
            return null;
    }

    public ArrayList<Paziente> listaMedico(Medico m) {
        ArrayList<Paziente> assegnatiM = new ArrayList<>();
        for (Paziente p: paz.keySet()) {
            if (paz.get(p) == m) {
                assegnatiM.add(p);
            }
        }
        return assegnatiM;
    }

    public Medico statMedico() {
        Medico maxM = med.get(0);
        int maxN = calcolaPaz(maxM.getName());
        for (int i = 1; i < med.size(); i++) {
            Medico m = med.get(i);
            int n = calcolaPaz(m.getName());
            if (n > maxN) {
                maxM = m;
                maxN = n;
            }
        }
        return maxM;
    }

    private int calcolaPaz(String m) {
        Medico doctor = trovaMedico(m);
        int count = 0;
        for (Paziente p: paz.keySet()) {
            if (paz.get(p).equals(doctor)) {
                count +=1;
            }
        }
        return count;
    }
}
