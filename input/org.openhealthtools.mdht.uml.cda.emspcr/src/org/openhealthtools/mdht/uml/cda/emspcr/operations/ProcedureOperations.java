/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

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
import org.openhealthtools.mdht.uml.cda.emspcr.Procedure;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureAbandonedProcedureRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Abandoned Procedure Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedurePriorRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureNumberOfAttemptsRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureSuccessfulRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Successful Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureComplicationsRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedurePatientResponseRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Patient Response Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedurePerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureAirwayConfirmationRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Airway Confirmation Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureReasonProcedureNotAttemptedRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Reason Procedure Not Attempted Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureApproachSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Approach Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureDeviceParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Device Participation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureOperations extends ClinicalStatementOperations {

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
	protected ProcedureOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureAbandonedProcedureRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Abandoned Procedure Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAbandonedProcedureRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureAbandonedProcedureRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Abandoned Procedure Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAbandonedProcedureRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureAbandonedProcedureRelationship(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ProcedureProcedureAbandonedProcedureRelationship","INFO");
    
  	  
  	  
		if (VALIDATE_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE__PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("ProcedureProcedureAbandonedProcedureRelationship"),
						 new Object [] { procedure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedurePriorRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePriorRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_PRIOR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedurePriorRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePriorRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_PRIOR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedurePriorRelationship(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ProcedureProcedurePriorRelationship","INFO");
    
  	  
  	  
		if (VALIDATE_PROCEDURE_PRIOR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_PROCEDURE_PRIOR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_PRIOR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_PRIOR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE__PROCEDURE_PRIOR_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("ProcedureProcedurePriorRelationship"),
						 new Object [] { procedure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNumberOfAttemptsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNumberOfAttemptsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNumberOfAttemptsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNumberOfAttemptsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureNumberOfAttemptsRelationship(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ProcedureProcedureNumberOfAttemptsRelationship","INFO");
    
  	  
  	  
		if (VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE__PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("ProcedureProcedureNumberOfAttemptsRelationship"),
						 new Object [] { procedure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureSuccessfulRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Successful Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureSuccessfulRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_SUCCESSFUL_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureSuccessfulRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Successful Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureSuccessfulRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_SUCCESSFUL_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureSuccessfulRelationship(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ProcedureProcedureSuccessfulRelationship","WARNING");
    
  	  
  	  
		if (VALIDATE_PROCEDURE_SUCCESSFUL_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_PROCEDURE_SUCCESSFUL_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_SUCCESSFUL_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_SUCCESSFUL_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE__PROCEDURE_SUCCESSFUL_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("ProcedureProcedureSuccessfulRelationship"),
						 new Object [] { procedure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureComplicationsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureComplicationsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_COMPLICATIONS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureComplicationsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureComplicationsRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_COMPLICATIONS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureComplicationsRelationship(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ProcedureProcedureComplicationsRelationship","INFO");
    
  	  
  	  
		if (VALIDATE_PROCEDURE_COMPLICATIONS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_PROCEDURE_COMPLICATIONS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_COMPLICATIONS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_COMPLICATIONS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE__PROCEDURE_COMPLICATIONS_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("ProcedureProcedureComplicationsRelationship"),
						 new Object [] { procedure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedurePatientResponseRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Patient Response Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePatientResponseRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedurePatientResponseRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Patient Response Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePatientResponseRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedurePatientResponseRelationship(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ProcedureProcedurePatientResponseRelationship","WARNING");
    
  	  
  	  
		if (VALIDATE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE__PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("ProcedureProcedurePatientResponseRelationship"),
						 new Object [] { procedure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedurePerformer(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePerformer(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedurePerformer(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePerformer(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedurePerformer(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ProcedureProcedurePerformer","WARNING");
    
  	  
  	  
		if (VALIDATE_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE__PROCEDURE_PERFORMER,
						 EmspcrPlugin.INSTANCE.getString("ProcedureProcedurePerformer"),
						 new Object [] { procedure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureAirwayConfirmationRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Airway Confirmation Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAirwayConfirmationRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureAirwayConfirmationRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Airway Confirmation Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureAirwayConfirmationRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureAirwayConfirmationRelationship(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ProcedureProcedureAirwayConfirmationRelationship","INFO");
    
  	  
  	  
		if (VALIDATE_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE__PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("ProcedureProcedureAirwayConfirmationRelationship"),
						 new Object [] { procedure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureReasonProcedureNotAttemptedRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Reason Procedure Not Attempted Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureReasonProcedureNotAttemptedRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_REASON_PROCEDURE_NOT_ATTEMPTED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureReasonProcedureNotAttemptedRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Reason Procedure Not Attempted Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureReasonProcedureNotAttemptedRelationship(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_REASON_PROCEDURE_NOT_ATTEMPTED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureReasonProcedureNotAttemptedRelationship(Procedure procedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ProcedureProcedureReasonProcedureNotAttemptedRelationship","INFO");
    
  	  
  	  
		if (VALIDATE_PROCEDURE_REASON_PROCEDURE_NOT_ATTEMPTED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_PROCEDURE_REASON_PROCEDURE_NOT_ATTEMPTED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_REASON_PROCEDURE_NOT_ATTEMPTED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_REASON_PROCEDURE_NOT_ATTEMPTED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE__PROCEDURE_REASON_PROCEDURE_NOT_ATTEMPTED_RELATIONSHIP,
						 EmspcrPlugin.INSTANCE.getString("ProcedureProcedureReasonProcedureNotAttemptedRelationship"),
						 new Object [] { procedure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureTemplateId(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureTemplateId(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.181' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureTemplateId(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureTemplateId(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureTemplateId(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ProcedureProcedureTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE__PROCEDURE_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ProcedureProcedureTemplateId"),
						 new Object [] { procedure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureCode(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ProcedureProcedureCode","ERROR");
    
  	  
  	  
		if (VALIDATE_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE__PROCEDURE_CODE,
						 EmspcrPlugin.INSTANCE.getString("ProcedureProcedureCode"),
						 new Object [] { procedure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureCodeP(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ProcedureProcedureCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_PROCEDURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_PROCEDURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE__PROCEDURE_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ProcedureProcedureCodeP"),
						 new Object [] { procedure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureNegationInd(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNegationInd(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureNegationInd(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureNegationInd(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureNegationInd(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ProcedureProcedureNegationInd","INFO");
    
  	  
  	  
		if (VALIDATE_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE__PROCEDURE_NEGATION_IND,
						 EmspcrPlugin.INSTANCE.getString("ProcedureProcedureNegationInd"),
						 new Object [] { procedure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureStatusCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureStatusCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureStatusCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureStatusCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureStatusCode(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ProcedureProcedureStatusCode","INFO");
    
  	  
  	  
		if (VALIDATE_PROCEDURE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_PROCEDURE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE__PROCEDURE_STATUS_CODE,
						 EmspcrPlugin.INSTANCE.getString("ProcedureProcedureStatusCode"),
						 new Object [] { procedure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureEffectiveTime(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEffectiveTime(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureEffectiveTime(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureEffectiveTime(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureEffectiveTime(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ProcedureProcedureEffectiveTime","ERROR");
    
  	  
  	  
		if (VALIDATE_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE__PROCEDURE_EFFECTIVE_TIME,
						 EmspcrPlugin.INSTANCE.getString("ProcedureProcedureEffectiveTime"),
						 new Object [] { procedure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureApproachSiteCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Approach Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureApproachSiteCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.approachSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA18757-7' or value.code = 'LA18758-5' or value.code = 'LA18790-8' or value.code = 'LA18791-6' or value.code = 'LA18792-4' or value.code = 'LA18793-2' or value.code = 'LA18794-0' or value.code = 'LA18795-7' or value.code = 'LA18796-5' or value.code = 'LA18797-3' or value.code = 'LA18798-1' or value.code = 'LA18799-9' or value.code = 'LA18800-5' or value.code = 'LA18801-3' or value.code = 'LA18802-1' or value.code = 'LA18803-9' or value.code = 'LA18804-7' or value.code = 'LA18805-4' or value.code = 'LA18806-2' or value.code = 'LA18807-0' or value.code = 'LA18808-8' or value.code = 'LA18809-6' or value.code = 'LA18810-4' or value.code = 'LA18811-2' or value.code = 'LA18812-0' or value.code = 'LA18813-8' or value.code = 'LA18814-6' or value.code = 'LA18815-3' or value.code = 'LA18816-1' or value.code = 'LA18817-9' or value.code = 'LA18818-7' or value.code = 'LA18112-5' or value.code = 'LA18113-3' or value.code = 'LA24415-4' or value.code = 'LA24416-2' or value.code = 'LA24417-0' or value.code = 'LA24418-8' or value.code = 'LA24419-6' or value.code = 'LA24420-4' or value.code = 'LA18765-0' or value.code = 'LA18766-8')))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureApproachSiteCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Approach Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureApproachSiteCode(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureApproachSiteCode(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ProcedureProcedureApproachSiteCode","ERROR");
    
  	  
  	  
		if (VALIDATE_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE__PROCEDURE_APPROACH_SITE_CODE,
						 EmspcrPlugin.INSTANCE.getString("ProcedureProcedureApproachSiteCode"),
						 new Object [] { procedure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureApproachSiteCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Approach Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureApproachSiteCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (( not self.approachSiteCode->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureApproachSiteCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Approach Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureApproachSiteCodeP(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureApproachSiteCodeP(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ProcedureProcedureApproachSiteCodeP","INFO");
    
  	  
  	  
		if (VALIDATE_PROCEDURE_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_PROCEDURE_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE__PROCEDURE_APPROACH_SITE_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ProcedureProcedureApproachSiteCodeP"),
						 new Object [] { procedure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureDeviceParticipation(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Device Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureDeviceParticipation(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_DEVICE_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureDeviceParticipation(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Device Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureDeviceParticipation(Procedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_DEVICE_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedure The receiving '<em><b>Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProcedureDeviceParticipation(Procedure procedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ProcedureProcedureDeviceParticipation","INFO");
    
  	  
  	  
		if (VALIDATE_PROCEDURE_DEVICE_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURE);
			try {
				VALIDATE_PROCEDURE_DEVICE_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_DEVICE_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_DEVICE_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURE__PROCEDURE_DEVICE_PARTICIPATION,
						 EmspcrPlugin.INSTANCE.getString("ProcedureProcedureDeviceParticipation"),
						 new Object [] { procedure }));
			}
			 
			return false;
		}
		return true;
	}

} // ProcedureOperations
