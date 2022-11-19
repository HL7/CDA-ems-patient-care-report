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
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownNonDrugAllergy;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Existence Of Known Non Drug Allergy</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownNonDrugAllergy#validateExistenceOfKnownNonDrugAllergyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Non Drug Allergy Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownNonDrugAllergy#validateExistenceOfKnownNonDrugAllergyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Non Drug Allergy Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownNonDrugAllergy#validateExistenceOfKnownNonDrugAllergyCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Non Drug Allergy Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownNonDrugAllergy#validateExistenceOfKnownNonDrugAllergyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Non Drug Allergy Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownNonDrugAllergy#validateExistenceOfKnownNonDrugAllergyValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Non Drug Allergy Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExistenceOfKnownNonDrugAllergyOperations extends ClinicalStatementOperations {

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
	protected ExistenceOfKnownNonDrugAllergyOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfKnownNonDrugAllergyTemplateId(ExistenceOfKnownNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Non Drug Allergy Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfKnownNonDrugAllergyTemplateId(ExistenceOfKnownNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.103' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfKnownNonDrugAllergyTemplateId(ExistenceOfKnownNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Non Drug Allergy Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfKnownNonDrugAllergyTemplateId(ExistenceOfKnownNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfKnownNonDrugAllergy The receiving '<em><b>Existence Of Known Non Drug Allergy</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExistenceOfKnownNonDrugAllergyTemplateId(
			ExistenceOfKnownNonDrugAllergy existenceOfKnownNonDrugAllergy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ExistenceOfKnownNonDrugAllergyExistenceOfKnownNonDrugAllergyTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY);
			try {
				VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfKnownNonDrugAllergy)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY__EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfKnownNonDrugAllergyExistenceOfKnownNonDrugAllergyTemplateId"),
						 new Object [] { existenceOfKnownNonDrugAllergy }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfKnownNonDrugAllergyMoodCode(ExistenceOfKnownNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Non Drug Allergy Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfKnownNonDrugAllergyMoodCode(ExistenceOfKnownNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfKnownNonDrugAllergyMoodCode(ExistenceOfKnownNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Non Drug Allergy Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfKnownNonDrugAllergyMoodCode(ExistenceOfKnownNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfKnownNonDrugAllergy The receiving '<em><b>Existence Of Known Non Drug Allergy</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExistenceOfKnownNonDrugAllergyMoodCode(
			ExistenceOfKnownNonDrugAllergy existenceOfKnownNonDrugAllergy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ExistenceOfKnownNonDrugAllergyExistenceOfKnownNonDrugAllergyMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY);
			try {
				VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfKnownNonDrugAllergy)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY__EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfKnownNonDrugAllergyExistenceOfKnownNonDrugAllergyMoodCode"),
						 new Object [] { existenceOfKnownNonDrugAllergy }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfKnownNonDrugAllergyCodeP(ExistenceOfKnownNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Non Drug Allergy Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfKnownNonDrugAllergyCodeP(ExistenceOfKnownNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfKnownNonDrugAllergyCodeP(ExistenceOfKnownNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Non Drug Allergy Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfKnownNonDrugAllergyCodeP(ExistenceOfKnownNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfKnownNonDrugAllergy The receiving '<em><b>Existence Of Known Non Drug Allergy</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExistenceOfKnownNonDrugAllergyCodeP(
			ExistenceOfKnownNonDrugAllergy existenceOfKnownNonDrugAllergy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ExistenceOfKnownNonDrugAllergyExistenceOfKnownNonDrugAllergyCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY);
			try {
				VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfKnownNonDrugAllergy)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY__EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfKnownNonDrugAllergyExistenceOfKnownNonDrugAllergyCodeP"),
						 new Object [] { existenceOfKnownNonDrugAllergy }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownNonDrugAllergyCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownNonDrugAllergyCodeP", passToken);
				}
				passToken.add(existenceOfKnownNonDrugAllergy);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfKnownNonDrugAllergyCode(ExistenceOfKnownNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Non Drug Allergy Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfKnownNonDrugAllergyCode(ExistenceOfKnownNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '69747-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfKnownNonDrugAllergyCode(ExistenceOfKnownNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Non Drug Allergy Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfKnownNonDrugAllergyCode(ExistenceOfKnownNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfKnownNonDrugAllergy The receiving '<em><b>Existence Of Known Non Drug Allergy</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExistenceOfKnownNonDrugAllergyCode(
			ExistenceOfKnownNonDrugAllergy existenceOfKnownNonDrugAllergy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownNonDrugAllergyCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(existenceOfKnownNonDrugAllergy)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ExistenceOfKnownNonDrugAllergyExistenceOfKnownNonDrugAllergyCode","ERROR");
    
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY);
			try {
				VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfKnownNonDrugAllergy)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY__EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_CODE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfKnownNonDrugAllergyExistenceOfKnownNonDrugAllergyCode"),
						 new Object [] { existenceOfKnownNonDrugAllergy }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfKnownNonDrugAllergyValue(ExistenceOfKnownNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Non Drug Allergy Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfKnownNonDrugAllergyValue(ExistenceOfKnownNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfKnownNonDrugAllergyValue(ExistenceOfKnownNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Non Drug Allergy Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfKnownNonDrugAllergyValue(ExistenceOfKnownNonDrugAllergy, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfKnownNonDrugAllergy The receiving '<em><b>Existence Of Known Non Drug Allergy</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExistenceOfKnownNonDrugAllergyValue(
			ExistenceOfKnownNonDrugAllergy existenceOfKnownNonDrugAllergy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ExistenceOfKnownNonDrugAllergyExistenceOfKnownNonDrugAllergyValue","ERROR");
    
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY);
			try {
				VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfKnownNonDrugAllergy)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY__EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfKnownNonDrugAllergyExistenceOfKnownNonDrugAllergyValue"),
						 new Object [] { existenceOfKnownNonDrugAllergy }));
			}
			 
			return false;
		}
		return true;
	}

} // ExistenceOfKnownNonDrugAllergyOperations
