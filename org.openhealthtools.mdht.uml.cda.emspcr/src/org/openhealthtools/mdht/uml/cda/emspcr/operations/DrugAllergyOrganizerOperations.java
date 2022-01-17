/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.OrganizerOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Drug Allergy Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyOrganizer#validateDrugAllergyOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyOrganizer#validateDrugAllergyOrganizerComponent4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Organizer Component4</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyOrganizer#validateDrugAllergyOrganizerComponent42(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Organizer Component42</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DrugAllergyOrganizerOperations extends OrganizerOperations {
 
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrugAllergyOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDrugAllergyOrganizerTemplateId(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugAllergyOrganizerTemplateId(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.183' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateDrugAllergyOrganizerTemplateId(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugAllergyOrganizerTemplateId(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param drugAllergyOrganizer The receiving '<em><b>Drug Allergy Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDrugAllergyOrganizerTemplateId(DrugAllergyOrganizer drugAllergyOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DrugAllergyOrganizerDrugAllergyOrganizerTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DRUG_ALLERGY_ORGANIZER);
			try {
				VALIDATE_DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(drugAllergyOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DRUG_ALLERGY_ORGANIZER__DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("DrugAllergyOrganizerDrugAllergyOrganizerTemplateId"),
						 new Object [] { drugAllergyOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDrugAllergyOrganizerComponent4(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Organizer Component4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugAllergyOrganizerComponent4(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DRUG_ALLERGY_ORGANIZER_COMPONENT4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateDrugAllergyOrganizerComponent4(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Organizer Component4</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugAllergyOrganizerComponent4(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DRUG_ALLERGY_ORGANIZER_COMPONENT4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param drugAllergyOrganizer The receiving '<em><b>Drug Allergy Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDrugAllergyOrganizerComponent4(DrugAllergyOrganizer drugAllergyOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DrugAllergyOrganizerDrugAllergyOrganizerComponent4","ERROR");
    
  	  
  	  
		if (VALIDATE_DRUG_ALLERGY_ORGANIZER_COMPONENT4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DRUG_ALLERGY_ORGANIZER);
			try {
				VALIDATE_DRUG_ALLERGY_ORGANIZER_COMPONENT4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DRUG_ALLERGY_ORGANIZER_COMPONENT4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DRUG_ALLERGY_ORGANIZER_COMPONENT4__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(drugAllergyOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DRUG_ALLERGY_ORGANIZER__DRUG_ALLERGY_ORGANIZER_COMPONENT4,
						 EmspcrPlugin.INSTANCE.getString("DrugAllergyOrganizerDrugAllergyOrganizerComponent4"),
						 new Object [] { drugAllergyOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDrugAllergyOrganizerComponent42(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Organizer Component42</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugAllergyOrganizerComponent42(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DRUG_ALLERGY_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateDrugAllergyOrganizerComponent42(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Organizer Component42</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDrugAllergyOrganizerComponent42(DrugAllergyOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DRUG_ALLERGY_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param drugAllergyOrganizer The receiving '<em><b>Drug Allergy Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDrugAllergyOrganizerComponent42(DrugAllergyOrganizer drugAllergyOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DrugAllergyOrganizerDrugAllergyOrganizerComponent42","ERROR");
    
  	  
  	  
		if (VALIDATE_DRUG_ALLERGY_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DRUG_ALLERGY_ORGANIZER);
			try {
				VALIDATE_DRUG_ALLERGY_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DRUG_ALLERGY_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DRUG_ALLERGY_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(drugAllergyOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DRUG_ALLERGY_ORGANIZER__DRUG_ALLERGY_ORGANIZER_COMPONENT42,
						 EmspcrPlugin.INSTANCE.getString("DrugAllergyOrganizerDrugAllergyOrganizerComponent42"),
						 new Object [] { drugAllergyOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

} // DrugAllergyOrganizerOperations