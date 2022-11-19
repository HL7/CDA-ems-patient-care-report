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
import org.openhealthtools.mdht.uml.cda.emspcr.ReasonProcedureNotAttemptedObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reason Procedure Not Attempted Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonProcedureNotAttemptedObservation#validateReasonProcedureNotAttemptedObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonProcedureNotAttemptedObservation#validateReasonProcedureNotAttemptedObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonProcedureNotAttemptedObservation#validateReasonProcedureNotAttemptedObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonProcedureNotAttemptedObservation#validateReasonProcedureNotAttemptedObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonProcedureNotAttemptedObservation#validateReasonProcedureNotAttemptedObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonProcedureNotAttemptedObservation#validateReasonProcedureNotAttemptedObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReasonProcedureNotAttemptedObservationOperations extends ClinicalStatementOperations {

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
	protected ReasonProcedureNotAttemptedObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonProcedureNotAttemptedObservationTemplateId(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonProcedureNotAttemptedObservationTemplateId(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.137' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonProcedureNotAttemptedObservationTemplateId(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonProcedureNotAttemptedObservationTemplateId(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonProcedureNotAttemptedObservation The receiving '<em><b>Reason Procedure Not Attempted Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReasonProcedureNotAttemptedObservationTemplateId(
			ReasonProcedureNotAttemptedObservation reasonProcedureNotAttemptedObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ReasonProcedureNotAttemptedObservationReasonProcedureNotAttemptedObservationTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION);
			try {
				VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reasonProcedureNotAttemptedObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION__REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ReasonProcedureNotAttemptedObservationReasonProcedureNotAttemptedObservationTemplateId"),
						 new Object [] { reasonProcedureNotAttemptedObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonProcedureNotAttemptedObservationMoodCode(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonProcedureNotAttemptedObservationMoodCode(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonProcedureNotAttemptedObservationMoodCode(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonProcedureNotAttemptedObservationMoodCode(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonProcedureNotAttemptedObservation The receiving '<em><b>Reason Procedure Not Attempted Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReasonProcedureNotAttemptedObservationMoodCode(
			ReasonProcedureNotAttemptedObservation reasonProcedureNotAttemptedObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ReasonProcedureNotAttemptedObservationReasonProcedureNotAttemptedObservationMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION);
			try {
				VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reasonProcedureNotAttemptedObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION__REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ReasonProcedureNotAttemptedObservationReasonProcedureNotAttemptedObservationMoodCode"),
						 new Object [] { reasonProcedureNotAttemptedObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonProcedureNotAttemptedObservationCodeP(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonProcedureNotAttemptedObservationCodeP(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonProcedureNotAttemptedObservationCodeP(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonProcedureNotAttemptedObservationCodeP(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonProcedureNotAttemptedObservation The receiving '<em><b>Reason Procedure Not Attempted Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReasonProcedureNotAttemptedObservationCodeP(
			ReasonProcedureNotAttemptedObservation reasonProcedureNotAttemptedObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ReasonProcedureNotAttemptedObservationReasonProcedureNotAttemptedObservationCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION);
			try {
				VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reasonProcedureNotAttemptedObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION__REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ReasonProcedureNotAttemptedObservationReasonProcedureNotAttemptedObservationCodeP"),
						 new Object [] { reasonProcedureNotAttemptedObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ReasonProcedureNotAttemptedObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ReasonProcedureNotAttemptedObservationCodeP", passToken);
				}
				passToken.add(reasonProcedureNotAttemptedObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonProcedureNotAttemptedObservationCode(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonProcedureNotAttemptedObservationCode(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '72112-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonProcedureNotAttemptedObservationCode(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonProcedureNotAttemptedObservationCode(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonProcedureNotAttemptedObservation The receiving '<em><b>Reason Procedure Not Attempted Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReasonProcedureNotAttemptedObservationCode(
			ReasonProcedureNotAttemptedObservation reasonProcedureNotAttemptedObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.ReasonProcedureNotAttemptedObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(reasonProcedureNotAttemptedObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ReasonProcedureNotAttemptedObservationReasonProcedureNotAttemptedObservationCode","ERROR");
    
  	  
  	  
		if (VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION);
			try {
				VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reasonProcedureNotAttemptedObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION__REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_CODE,
						 EmspcrPlugin.INSTANCE.getString("ReasonProcedureNotAttemptedObservationReasonProcedureNotAttemptedObservationCode"),
						 new Object [] { reasonProcedureNotAttemptedObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonProcedureNotAttemptedObservationValue(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonProcedureNotAttemptedObservationValue(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA15185-4' or value.code = 'LA18925-0' or value.code = 'LA4216-3' or value.code = 'LA4389-8' or value.code = 'LA17063-1' or value.code = 'LA17064-9' or value.code = 'LA17065-6')))";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonProcedureNotAttemptedObservationValue(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonProcedureNotAttemptedObservationValue(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonProcedureNotAttemptedObservation The receiving '<em><b>Reason Procedure Not Attempted Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReasonProcedureNotAttemptedObservationValue(
			ReasonProcedureNotAttemptedObservation reasonProcedureNotAttemptedObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ReasonProcedureNotAttemptedObservationReasonProcedureNotAttemptedObservationValue","ERROR");
    
  	  
  	  
		if (VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION);
			try {
				VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reasonProcedureNotAttemptedObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION__REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ReasonProcedureNotAttemptedObservationReasonProcedureNotAttemptedObservationValue"),
						 new Object [] { reasonProcedureNotAttemptedObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonProcedureNotAttemptedObservationValueP(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonProcedureNotAttemptedObservationValueP(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonProcedureNotAttemptedObservationValueP(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonProcedureNotAttemptedObservationValueP(ReasonProcedureNotAttemptedObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonProcedureNotAttemptedObservation The receiving '<em><b>Reason Procedure Not Attempted Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReasonProcedureNotAttemptedObservationValueP(
			ReasonProcedureNotAttemptedObservation reasonProcedureNotAttemptedObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ReasonProcedureNotAttemptedObservationReasonProcedureNotAttemptedObservationValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION);
			try {
				VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(reasonProcedureNotAttemptedObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION__REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("ReasonProcedureNotAttemptedObservationReasonProcedureNotAttemptedObservationValueP"),
						 new Object [] { reasonProcedureNotAttemptedObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // ReasonProcedureNotAttemptedObservationOperations
