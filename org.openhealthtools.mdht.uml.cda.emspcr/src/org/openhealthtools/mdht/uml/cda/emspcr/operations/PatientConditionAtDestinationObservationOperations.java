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
import org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Condition At Destination Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservation#validatePatientConditionAtDestinationObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservation#validatePatientConditionAtDestinationObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservation#validatePatientConditionAtDestinationObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservation#validatePatientConditionAtDestinationObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservation#validatePatientConditionAtDestinationObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservation#validatePatientConditionAtDestinationObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientConditionAtDestinationObservationOperations extends ClinicalStatementOperations {
 
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
	protected PatientConditionAtDestinationObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientConditionAtDestinationObservationTemplateId(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionAtDestinationObservationTemplateId(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.37' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientConditionAtDestinationObservationTemplateId(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionAtDestinationObservationTemplateId(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientConditionAtDestinationObservation The receiving '<em><b>Patient Condition At Destination Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePatientConditionAtDestinationObservationTemplateId(PatientConditionAtDestinationObservation patientConditionAtDestinationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PatientConditionAtDestinationObservationPatientConditionAtDestinationObservationTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CONDITION_AT_DESTINATION_OBSERVATION);
			try {
				VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(patientConditionAtDestinationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PATIENT_CONDITION_AT_DESTINATION_OBSERVATION__PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("PatientConditionAtDestinationObservationPatientConditionAtDestinationObservationTemplateId"),
						 new Object [] { patientConditionAtDestinationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientConditionAtDestinationObservationMoodCode(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionAtDestinationObservationMoodCode(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientConditionAtDestinationObservationMoodCode(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionAtDestinationObservationMoodCode(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientConditionAtDestinationObservation The receiving '<em><b>Patient Condition At Destination Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePatientConditionAtDestinationObservationMoodCode(PatientConditionAtDestinationObservation patientConditionAtDestinationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PatientConditionAtDestinationObservationPatientConditionAtDestinationObservationMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CONDITION_AT_DESTINATION_OBSERVATION);
			try {
				VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(patientConditionAtDestinationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PATIENT_CONDITION_AT_DESTINATION_OBSERVATION__PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("PatientConditionAtDestinationObservationPatientConditionAtDestinationObservationMoodCode"),
						 new Object [] { patientConditionAtDestinationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientConditionAtDestinationObservationCodeP(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionAtDestinationObservationCodeP(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientConditionAtDestinationObservationCodeP(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionAtDestinationObservationCodeP(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientConditionAtDestinationObservation The receiving '<em><b>Patient Condition At Destination Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePatientConditionAtDestinationObservationCodeP(PatientConditionAtDestinationObservation patientConditionAtDestinationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PatientConditionAtDestinationObservationPatientConditionAtDestinationObservationCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CONDITION_AT_DESTINATION_OBSERVATION);
			try {
				VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(patientConditionAtDestinationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PATIENT_CONDITION_AT_DESTINATION_OBSERVATION__PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("PatientConditionAtDestinationObservationPatientConditionAtDestinationObservationCodeP"),
						 new Object [] { patientConditionAtDestinationObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservationCodeP", passToken);
				}
				passToken.add(patientConditionAtDestinationObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientConditionAtDestinationObservationCode(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionAtDestinationObservationCode(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '77941-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientConditionAtDestinationObservationCode(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionAtDestinationObservationCode(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientConditionAtDestinationObservation The receiving '<em><b>Patient Condition At Destination Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePatientConditionAtDestinationObservationCode(PatientConditionAtDestinationObservation patientConditionAtDestinationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(patientConditionAtDestinationObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PatientConditionAtDestinationObservationPatientConditionAtDestinationObservationCode","ERROR");
    
  	  
  	  
		if (VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CONDITION_AT_DESTINATION_OBSERVATION);
			try {
				VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(patientConditionAtDestinationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PATIENT_CONDITION_AT_DESTINATION_OBSERVATION__PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_CODE,
						 EmspcrPlugin.INSTANCE.getString("PatientConditionAtDestinationObservationPatientConditionAtDestinationObservationCode"),
						 new Object [] { patientConditionAtDestinationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientConditionAtDestinationObservationValue(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionAtDestinationObservationValue(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17696-8' or value.code = 'LA17695-0' or value.code = 'LA17694-3' or value.code = 'LA17697-6' or value.code = 'NewLA-4219011')))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientConditionAtDestinationObservationValue(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionAtDestinationObservationValue(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientConditionAtDestinationObservation The receiving '<em><b>Patient Condition At Destination Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePatientConditionAtDestinationObservationValue(PatientConditionAtDestinationObservation patientConditionAtDestinationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PatientConditionAtDestinationObservationPatientConditionAtDestinationObservationValue","ERROR");
    
  	  
  	  
		if (VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CONDITION_AT_DESTINATION_OBSERVATION);
			try {
				VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(patientConditionAtDestinationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PATIENT_CONDITION_AT_DESTINATION_OBSERVATION__PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_VALUE,
						 EmspcrPlugin.INSTANCE.getString("PatientConditionAtDestinationObservationPatientConditionAtDestinationObservationValue"),
						 new Object [] { patientConditionAtDestinationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientConditionAtDestinationObservationValueP(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionAtDestinationObservationValueP(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientConditionAtDestinationObservationValueP(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition At Destination Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientConditionAtDestinationObservationValueP(PatientConditionAtDestinationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param patientConditionAtDestinationObservation The receiving '<em><b>Patient Condition At Destination Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePatientConditionAtDestinationObservationValueP(PatientConditionAtDestinationObservation patientConditionAtDestinationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PatientConditionAtDestinationObservationPatientConditionAtDestinationObservationValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PATIENT_CONDITION_AT_DESTINATION_OBSERVATION);
			try {
				VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(patientConditionAtDestinationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PATIENT_CONDITION_AT_DESTINATION_OBSERVATION__PATIENT_CONDITION_AT_DESTINATION_OBSERVATION_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("PatientConditionAtDestinationObservationPatientConditionAtDestinationObservationValueP"),
						 new Object [] { patientConditionAtDestinationObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // PatientConditionAtDestinationObservationOperations