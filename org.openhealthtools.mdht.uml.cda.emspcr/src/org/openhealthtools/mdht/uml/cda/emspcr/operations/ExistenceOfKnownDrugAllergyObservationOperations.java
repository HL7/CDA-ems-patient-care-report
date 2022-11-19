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
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownDrugAllergyObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Existence Of Known Drug Allergy Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownDrugAllergyObservation#validateExistenceOfKnownDrugAllergyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Drug Allergy Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownDrugAllergyObservation#validateExistenceOfKnownDrugAllergyObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Drug Allergy Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownDrugAllergyObservation#validateExistenceOfKnownDrugAllergyObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Drug Allergy Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownDrugAllergyObservation#validateExistenceOfKnownDrugAllergyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Drug Allergy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownDrugAllergyObservation#validateExistenceOfKnownDrugAllergyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Drug Allergy Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExistenceOfKnownDrugAllergyObservationOperations extends ClinicalStatementOperations {

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
	protected ExistenceOfKnownDrugAllergyObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfKnownDrugAllergyObservationTemplateId(ExistenceOfKnownDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Drug Allergy Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfKnownDrugAllergyObservationTemplateId(ExistenceOfKnownDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.102' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfKnownDrugAllergyObservationTemplateId(ExistenceOfKnownDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Drug Allergy Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfKnownDrugAllergyObservationTemplateId(ExistenceOfKnownDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfKnownDrugAllergyObservation The receiving '<em><b>Existence Of Known Drug Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExistenceOfKnownDrugAllergyObservationTemplateId(
			ExistenceOfKnownDrugAllergyObservation existenceOfKnownDrugAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ExistenceOfKnownDrugAllergyObservationExistenceOfKnownDrugAllergyObservationTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION);
			try {
				VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfKnownDrugAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION__EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfKnownDrugAllergyObservationExistenceOfKnownDrugAllergyObservationTemplateId"),
						 new Object [] { existenceOfKnownDrugAllergyObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfKnownDrugAllergyObservationMoodCode(ExistenceOfKnownDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Drug Allergy Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfKnownDrugAllergyObservationMoodCode(ExistenceOfKnownDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfKnownDrugAllergyObservationMoodCode(ExistenceOfKnownDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Drug Allergy Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfKnownDrugAllergyObservationMoodCode(ExistenceOfKnownDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfKnownDrugAllergyObservation The receiving '<em><b>Existence Of Known Drug Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExistenceOfKnownDrugAllergyObservationMoodCode(
			ExistenceOfKnownDrugAllergyObservation existenceOfKnownDrugAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ExistenceOfKnownDrugAllergyObservationExistenceOfKnownDrugAllergyObservationMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION);
			try {
				VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfKnownDrugAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION__EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfKnownDrugAllergyObservationExistenceOfKnownDrugAllergyObservationMoodCode"),
						 new Object [] { existenceOfKnownDrugAllergyObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfKnownDrugAllergyObservationCodeP(ExistenceOfKnownDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Drug Allergy Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfKnownDrugAllergyObservationCodeP(ExistenceOfKnownDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfKnownDrugAllergyObservationCodeP(ExistenceOfKnownDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Drug Allergy Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfKnownDrugAllergyObservationCodeP(ExistenceOfKnownDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfKnownDrugAllergyObservation The receiving '<em><b>Existence Of Known Drug Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExistenceOfKnownDrugAllergyObservationCodeP(
			ExistenceOfKnownDrugAllergyObservation existenceOfKnownDrugAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ExistenceOfKnownDrugAllergyObservationExistenceOfKnownDrugAllergyObservationCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION);
			try {
				VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfKnownDrugAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION__EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfKnownDrugAllergyObservationExistenceOfKnownDrugAllergyObservationCodeP"),
						 new Object [] { existenceOfKnownDrugAllergyObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownDrugAllergyObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownDrugAllergyObservationCodeP", passToken);
				}
				passToken.add(existenceOfKnownDrugAllergyObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfKnownDrugAllergyObservationCode(ExistenceOfKnownDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Drug Allergy Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfKnownDrugAllergyObservationCode(ExistenceOfKnownDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67794-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfKnownDrugAllergyObservationCode(ExistenceOfKnownDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Drug Allergy Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfKnownDrugAllergyObservationCode(ExistenceOfKnownDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfKnownDrugAllergyObservation The receiving '<em><b>Existence Of Known Drug Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExistenceOfKnownDrugAllergyObservationCode(
			ExistenceOfKnownDrugAllergyObservation existenceOfKnownDrugAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownDrugAllergyObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(existenceOfKnownDrugAllergyObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ExistenceOfKnownDrugAllergyObservationExistenceOfKnownDrugAllergyObservationCode","ERROR");
    
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION);
			try {
				VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfKnownDrugAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION__EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_CODE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfKnownDrugAllergyObservationExistenceOfKnownDrugAllergyObservationCode"),
						 new Object [] { existenceOfKnownDrugAllergyObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfKnownDrugAllergyObservationValue(ExistenceOfKnownDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Drug Allergy Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfKnownDrugAllergyObservationValue(ExistenceOfKnownDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfKnownDrugAllergyObservationValue(ExistenceOfKnownDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Known Drug Allergy Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfKnownDrugAllergyObservationValue(ExistenceOfKnownDrugAllergyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfKnownDrugAllergyObservation The receiving '<em><b>Existence Of Known Drug Allergy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExistenceOfKnownDrugAllergyObservationValue(
			ExistenceOfKnownDrugAllergyObservation existenceOfKnownDrugAllergyObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ExistenceOfKnownDrugAllergyObservationExistenceOfKnownDrugAllergyObservationValue","ERROR");
    
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION);
			try {
				VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfKnownDrugAllergyObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION__EXISTENCE_OF_KNOWN_DRUG_ALLERGY_OBSERVATION_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfKnownDrugAllergyObservationExistenceOfKnownDrugAllergyObservationValue"),
						 new Object [] { existenceOfKnownDrugAllergyObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // ExistenceOfKnownDrugAllergyObservationOperations
