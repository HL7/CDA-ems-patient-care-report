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
import org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Prearrival Activation Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation#validatePrearrivalActivationObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation#validatePrearrivalActivationObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation#validatePrearrivalActivationObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation#validatePrearrivalActivationObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation#validatePrearrivalActivationObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation#validatePrearrivalActivationObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation#validatePrearrivalActivationObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrearrivalActivationObservationOperations extends ClinicalStatementOperations {
 
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
	protected PrearrivalActivationObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrearrivalActivationObservationTemplateId(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrearrivalActivationObservationTemplateId(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.36' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrearrivalActivationObservationTemplateId(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrearrivalActivationObservationTemplateId(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param prearrivalActivationObservation The receiving '<em><b>Prearrival Activation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrearrivalActivationObservationTemplateId(PrearrivalActivationObservation prearrivalActivationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PrearrivalActivationObservationPrearrivalActivationObservationTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PREARRIVAL_ACTIVATION_OBSERVATION);
			try {
				VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(prearrivalActivationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PREARRIVAL_ACTIVATION_OBSERVATION__PREARRIVAL_ACTIVATION_OBSERVATION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("PrearrivalActivationObservationPrearrivalActivationObservationTemplateId"),
						 new Object [] { prearrivalActivationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrearrivalActivationObservationMoodCode(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrearrivalActivationObservationMoodCode(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrearrivalActivationObservationMoodCode(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrearrivalActivationObservationMoodCode(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param prearrivalActivationObservation The receiving '<em><b>Prearrival Activation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrearrivalActivationObservationMoodCode(PrearrivalActivationObservation prearrivalActivationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PrearrivalActivationObservationPrearrivalActivationObservationMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PREARRIVAL_ACTIVATION_OBSERVATION);
			try {
				VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(prearrivalActivationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PREARRIVAL_ACTIVATION_OBSERVATION__PREARRIVAL_ACTIVATION_OBSERVATION_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("PrearrivalActivationObservationPrearrivalActivationObservationMoodCode"),
						 new Object [] { prearrivalActivationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrearrivalActivationObservationCodeP(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrearrivalActivationObservationCodeP(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePrearrivalActivationObservationCodeP(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrearrivalActivationObservationCodeP(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param prearrivalActivationObservation The receiving '<em><b>Prearrival Activation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrearrivalActivationObservationCodeP(PrearrivalActivationObservation prearrivalActivationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PrearrivalActivationObservationPrearrivalActivationObservationCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PREARRIVAL_ACTIVATION_OBSERVATION);
			try {
				VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(prearrivalActivationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PREARRIVAL_ACTIVATION_OBSERVATION__PREARRIVAL_ACTIVATION_OBSERVATION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("PrearrivalActivationObservationPrearrivalActivationObservationCodeP"),
						 new Object [] { prearrivalActivationObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservationCodeP", passToken);
				}
				passToken.add(prearrivalActivationObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrearrivalActivationObservationCode(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrearrivalActivationObservationCode(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '69462-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrearrivalActivationObservationCode(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrearrivalActivationObservationCode(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param prearrivalActivationObservation The receiving '<em><b>Prearrival Activation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrearrivalActivationObservationCode(PrearrivalActivationObservation prearrivalActivationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(prearrivalActivationObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PrearrivalActivationObservationPrearrivalActivationObservationCode","ERROR");
    
  	  
  	  
		if (VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PREARRIVAL_ACTIVATION_OBSERVATION);
			try {
				VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(prearrivalActivationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PREARRIVAL_ACTIVATION_OBSERVATION__PREARRIVAL_ACTIVATION_OBSERVATION_CODE,
						 EmspcrPlugin.INSTANCE.getString("PrearrivalActivationObservationPrearrivalActivationObservationCode"),
						 new Object [] { prearrivalActivationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrearrivalActivationObservationEffectiveTime(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrearrivalActivationObservationEffectiveTime(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePrearrivalActivationObservationEffectiveTime(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrearrivalActivationObservationEffectiveTime(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param prearrivalActivationObservation The receiving '<em><b>Prearrival Activation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrearrivalActivationObservationEffectiveTime(PrearrivalActivationObservation prearrivalActivationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PrearrivalActivationObservationPrearrivalActivationObservationEffectiveTime","ERROR");
    
  	  
  	  
		if (VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PREARRIVAL_ACTIVATION_OBSERVATION);
			try {
				VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(prearrivalActivationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PREARRIVAL_ACTIVATION_OBSERVATION__PREARRIVAL_ACTIVATION_OBSERVATION_EFFECTIVE_TIME,
						 EmspcrPlugin.INSTANCE.getString("PrearrivalActivationObservationPrearrivalActivationObservationEffectiveTime"),
						 new Object [] { prearrivalActivationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrearrivalActivationObservationValue(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrearrivalActivationObservationValue(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA18117-4' or value.code = 'LA18118-2' or value.code = 'LA18119-0' or value.code = 'LA18120-8' or value.code = 'LA18121-6' or value.code = 'LA18122-4' or value.code = 'LA18123-2' or value.code = 'LA32-8' or value.code = 'NewLA-4224019NewCode')))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrearrivalActivationObservationValue(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrearrivalActivationObservationValue(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param prearrivalActivationObservation The receiving '<em><b>Prearrival Activation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrearrivalActivationObservationValue(PrearrivalActivationObservation prearrivalActivationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PrearrivalActivationObservationPrearrivalActivationObservationValue","ERROR");
    
  	  
  	  
		if (VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PREARRIVAL_ACTIVATION_OBSERVATION);
			try {
				VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(prearrivalActivationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PREARRIVAL_ACTIVATION_OBSERVATION__PREARRIVAL_ACTIVATION_OBSERVATION_VALUE,
						 EmspcrPlugin.INSTANCE.getString("PrearrivalActivationObservationPrearrivalActivationObservationValue"),
						 new Object [] { prearrivalActivationObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrearrivalActivationObservationValueP(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrearrivalActivationObservationValueP(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrearrivalActivationObservationValueP(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrearrivalActivationObservationValueP(PrearrivalActivationObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param prearrivalActivationObservation The receiving '<em><b>Prearrival Activation Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePrearrivalActivationObservationValueP(PrearrivalActivationObservation prearrivalActivationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PrearrivalActivationObservationPrearrivalActivationObservationValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PREARRIVAL_ACTIVATION_OBSERVATION);
			try {
				VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(prearrivalActivationObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PREARRIVAL_ACTIVATION_OBSERVATION__PREARRIVAL_ACTIVATION_OBSERVATION_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("PrearrivalActivationObservationPrearrivalActivationObservationValueP"),
						 new Object [] { prearrivalActivationObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // PrearrivalActivationObservationOperations