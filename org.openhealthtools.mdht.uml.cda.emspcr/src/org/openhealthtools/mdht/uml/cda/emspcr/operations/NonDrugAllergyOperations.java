/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergy;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Non Drug Allergy</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergy#validateNonDrugAllergyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergy#validateNonDrugAllergyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergy#validateNonDrugAllergyCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergy#validateNonDrugAllergyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergy#validateNonDrugAllergyValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergy#validateNonDrugAllergyValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonDrugAllergyOperations extends ClinicalStatementOperations {

	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
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
	protected NonDrugAllergyOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonDrugAllergyTemplateId(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyTemplateId(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.104' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateNonDrugAllergyTemplateId(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyTemplateId(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_NON_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonDrugAllergy The receiving '<em><b>Non Drug Allergy</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNonDrugAllergyTemplateId(NonDrugAllergy nonDrugAllergy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"NonDrugAllergyNonDrugAllergyTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_NON_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NON_DRUG_ALLERGY);
			try {
				VALIDATE_NON_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NON_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NON_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(nonDrugAllergy)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.NON_DRUG_ALLERGY__NON_DRUG_ALLERGY_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("NonDrugAllergyNonDrugAllergyTemplateId"),
						 new Object [] { nonDrugAllergy }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonDrugAllergyMoodCode(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyMoodCode(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateNonDrugAllergyMoodCode(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyMoodCode(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_NON_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonDrugAllergy The receiving '<em><b>Non Drug Allergy</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNonDrugAllergyMoodCode(NonDrugAllergy nonDrugAllergy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"NonDrugAllergyNonDrugAllergyMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_NON_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NON_DRUG_ALLERGY);
			try {
				VALIDATE_NON_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NON_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NON_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(nonDrugAllergy)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.NON_DRUG_ALLERGY__NON_DRUG_ALLERGY_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("NonDrugAllergyNonDrugAllergyMoodCode"),
						 new Object [] { nonDrugAllergy }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonDrugAllergyCodeP(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyCodeP(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_DRUG_ALLERGY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNonDrugAllergyCodeP(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyCodeP(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_NON_DRUG_ALLERGY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonDrugAllergy The receiving '<em><b>Non Drug Allergy</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNonDrugAllergyCodeP(NonDrugAllergy nonDrugAllergy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"NonDrugAllergyNonDrugAllergyCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_NON_DRUG_ALLERGY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NON_DRUG_ALLERGY);
			try {
				VALIDATE_NON_DRUG_ALLERGY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NON_DRUG_ALLERGY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NON_DRUG_ALLERGY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(nonDrugAllergy)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.NON_DRUG_ALLERGY__NON_DRUG_ALLERGY_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("NonDrugAllergyNonDrugAllergyCodeP"),
						 new Object [] { nonDrugAllergy }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyCodeP", passToken);
				}
				passToken.add(nonDrugAllergy);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonDrugAllergyCode(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyCode(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '79151-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateNonDrugAllergyCode(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyCode(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_NON_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonDrugAllergy The receiving '<em><b>Non Drug Allergy</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNonDrugAllergyCode(NonDrugAllergy nonDrugAllergy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(nonDrugAllergy)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"NonDrugAllergyNonDrugAllergyCode","ERROR");
    
  	  
  	  
		if (VALIDATE_NON_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NON_DRUG_ALLERGY);
			try {
				VALIDATE_NON_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NON_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NON_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(nonDrugAllergy)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.NON_DRUG_ALLERGY__NON_DRUG_ALLERGY_CODE,
						 EmspcrPlugin.INSTANCE.getString("NonDrugAllergyNonDrugAllergyCode"),
						 new Object [] { nonDrugAllergy }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonDrugAllergyValue(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyValue(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonDrugAllergyValue(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyValue(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_NON_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonDrugAllergy The receiving '<em><b>Non Drug Allergy</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNonDrugAllergyValue(NonDrugAllergy nonDrugAllergy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"NonDrugAllergyNonDrugAllergyValue","ERROR");
    
  	  
  	  
		if (VALIDATE_NON_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NON_DRUG_ALLERGY);
			try {
				VALIDATE_NON_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NON_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NON_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(nonDrugAllergy)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.NON_DRUG_ALLERGY__NON_DRUG_ALLERGY_VALUE,
						 EmspcrPlugin.INSTANCE.getString("NonDrugAllergyNonDrugAllergyValue"),
						 new Object [] { nonDrugAllergy }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonDrugAllergyValueP(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyValueP(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_DRUG_ALLERGY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonDrugAllergyValueP(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonDrugAllergyValueP(NonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_NON_DRUG_ALLERGY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonDrugAllergy The receiving '<em><b>Non Drug Allergy</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNonDrugAllergyValueP(NonDrugAllergy nonDrugAllergy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"NonDrugAllergyNonDrugAllergyValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_NON_DRUG_ALLERGY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.NON_DRUG_ALLERGY);
			try {
				VALIDATE_NON_DRUG_ALLERGY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NON_DRUG_ALLERGY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NON_DRUG_ALLERGY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(nonDrugAllergy)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.NON_DRUG_ALLERGY__NON_DRUG_ALLERGY_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("NonDrugAllergyNonDrugAllergyValueP"),
						 new Object [] { nonDrugAllergy }));
			}
			 
			return false;
		}
		return true;
	}

} // NonDrugAllergyOperations
