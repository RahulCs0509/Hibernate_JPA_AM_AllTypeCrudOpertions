package org.one_to_many_uni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class FtachBranchByHospitalid {
	public static void main(String[] args) {
		EntityManager em=Persistence.createEntityManagerFactory("rai").createEntityManager();
		Hospital h=em.find(Hospital.class, 1);
		if(h!=null) {
			List<Branchs> b=h.getBranch();
			for(Branchs b1:b) {
				System.out.println(b);
			}
		}
	}

}
