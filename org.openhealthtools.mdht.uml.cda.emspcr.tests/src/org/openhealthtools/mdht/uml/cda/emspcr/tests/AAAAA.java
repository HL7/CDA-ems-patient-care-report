package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import static org.junit.Assert.*;

import java.io.FileInputStream;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.Entry;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.util.CDADiagnostic;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.ValidationResult;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

public class AAAAA {

	@Test
	public void test() {
		
		EmspcrPackage.eINSTANCE.getPatientCareReport();
		
		
//	CDAUtil.load(null);
	//samples/sample.xml
	StringBuffer sb = new StringBuffer();
	String path = "samples/";
	ConsolPackage.eINSTANCE.eClass();
	ValidationResult result = new ValidationResult();
	try {
		ClinicalDocument cd = CDAUtil.load((new FileInputStream(path + "sample" + ".xml")), result);
		for (Diagnostic dq : result.getErrorDiagnostics()) {
			CDADiagnostic cdaDiagnosticq = new CDADiagnostic(dq);
			sb.append(
				"ERROR|" + cdaDiagnosticq.getMessage() + "|" + cdaDiagnosticq.getPath() + "|" +
						cdaDiagnosticq.getCode() + "|" + cdaDiagnosticq.getSource());
			sb.append("\n");
		}

//		for (Section section : cd.getAllSections()) {
//			System.out.println(section);
//
//			for (Entry entry : section.getEntries()) {
//				System.out.println(entry);
//
//				System.out.println(entry.getOrganizer());
//
//				System.out.println(entry.getObservation());
//			}
//
//		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println(sb);
	
	}

}
