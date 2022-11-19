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
import org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps1and2;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Trauma Triage Criteria Steps1and2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps1and2#validateTraumaTriageCriteriaSteps1and2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps1and2#validateTraumaTriageCriteriaSteps1and2MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps1and2#validateTraumaTriageCriteriaSteps1and2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps1and2#validateTraumaTriageCriteriaSteps1and2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps1and2#validateTraumaTriageCriteriaSteps1and2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps1and2#validateTraumaTriageCriteriaSteps1and2ValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraumaTriageCriteriaSteps1and2Operations extends ClinicalStatementOperations {

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
	protected TraumaTriageCriteriaSteps1and2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTraumaTriageCriteriaSteps1and2TemplateId(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps1and2TemplateId(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.52' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateTraumaTriageCriteriaSteps1and2TemplateId(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps1and2TemplateId(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param traumaTriageCriteriaSteps1and2 The receiving '<em><b>Trauma Triage Criteria Steps1and2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTraumaTriageCriteriaSteps1and2TemplateId(
			TraumaTriageCriteriaSteps1and2 traumaTriageCriteriaSteps1and2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"TraumaTriageCriteriaSteps1and2TraumaTriageCriteriaSteps1and2TemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRAUMA_TRIAGE_CRITERIA_STEPS1AND2);
			try {
				VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(traumaTriageCriteriaSteps1and2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRAUMA_TRIAGE_CRITERIA_STEPS1AND2__TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("TraumaTriageCriteriaSteps1and2TraumaTriageCriteriaSteps1and2TemplateId"),
						 new Object [] { traumaTriageCriteriaSteps1and2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTraumaTriageCriteriaSteps1and2MoodCode(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps1and2MoodCode(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateTraumaTriageCriteriaSteps1and2MoodCode(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps1and2MoodCode(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param traumaTriageCriteriaSteps1and2 The receiving '<em><b>Trauma Triage Criteria Steps1and2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTraumaTriageCriteriaSteps1and2MoodCode(
			TraumaTriageCriteriaSteps1and2 traumaTriageCriteriaSteps1and2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"TraumaTriageCriteriaSteps1and2TraumaTriageCriteriaSteps1and2MoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRAUMA_TRIAGE_CRITERIA_STEPS1AND2);
			try {
				VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(traumaTriageCriteriaSteps1and2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRAUMA_TRIAGE_CRITERIA_STEPS1AND2__TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("TraumaTriageCriteriaSteps1and2TraumaTriageCriteriaSteps1and2MoodCode"),
						 new Object [] { traumaTriageCriteriaSteps1and2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTraumaTriageCriteriaSteps1and2CodeP(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps1and2CodeP(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTraumaTriageCriteriaSteps1and2CodeP(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps1and2CodeP(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param traumaTriageCriteriaSteps1and2 The receiving '<em><b>Trauma Triage Criteria Steps1and2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTraumaTriageCriteriaSteps1and2CodeP(
			TraumaTriageCriteriaSteps1and2 traumaTriageCriteriaSteps1and2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"TraumaTriageCriteriaSteps1and2TraumaTriageCriteriaSteps1and2CodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRAUMA_TRIAGE_CRITERIA_STEPS1AND2);
			try {
				VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(traumaTriageCriteriaSteps1and2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRAUMA_TRIAGE_CRITERIA_STEPS1AND2__TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("TraumaTriageCriteriaSteps1and2TraumaTriageCriteriaSteps1and2CodeP"),
						 new Object [] { traumaTriageCriteriaSteps1and2 }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps1and2CodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps1and2CodeP", passToken);
				}
				passToken.add(traumaTriageCriteriaSteps1and2);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTraumaTriageCriteriaSteps1and2Code(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps1and2Code(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67495-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateTraumaTriageCriteriaSteps1and2Code(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps1and2Code(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param traumaTriageCriteriaSteps1and2 The receiving '<em><b>Trauma Triage Criteria Steps1and2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTraumaTriageCriteriaSteps1and2Code(
			TraumaTriageCriteriaSteps1and2 traumaTriageCriteriaSteps1and2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps1and2CodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(traumaTriageCriteriaSteps1and2)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"TraumaTriageCriteriaSteps1and2TraumaTriageCriteriaSteps1and2Code","ERROR");
    
  	  
  	  
		if (VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRAUMA_TRIAGE_CRITERIA_STEPS1AND2);
			try {
				VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(traumaTriageCriteriaSteps1and2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRAUMA_TRIAGE_CRITERIA_STEPS1AND2__TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_CODE,
						 EmspcrPlugin.INSTANCE.getString("TraumaTriageCriteriaSteps1and2TraumaTriageCriteriaSteps1and2Code"),
						 new Object [] { traumaTriageCriteriaSteps1and2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTraumaTriageCriteriaSteps1and2Value(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps1and2Value(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA23844-6' or value.code = 'LA17338-7' or value.code = 'LA17339-5' or value.code = 'LA17340-3' or value.code = 'LA17341-1' or value.code = 'LA17342-9' or value.code = 'LA17343-7' or value.code = 'LA17344-5' or value.code = 'LA17345-2' or value.code = 'LA17346-0' or value.code = 'LA17347-8')))";

	/**
	 * The cached OCL invariant for the '{@link #validateTraumaTriageCriteriaSteps1and2Value(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps1and2Value(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param traumaTriageCriteriaSteps1and2 The receiving '<em><b>Trauma Triage Criteria Steps1and2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTraumaTriageCriteriaSteps1and2Value(
			TraumaTriageCriteriaSteps1and2 traumaTriageCriteriaSteps1and2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"TraumaTriageCriteriaSteps1and2TraumaTriageCriteriaSteps1and2Value","ERROR");
    
  	  
  	  
		if (VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRAUMA_TRIAGE_CRITERIA_STEPS1AND2);
			try {
				VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(traumaTriageCriteriaSteps1and2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRAUMA_TRIAGE_CRITERIA_STEPS1AND2__TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_VALUE,
						 EmspcrPlugin.INSTANCE.getString("TraumaTriageCriteriaSteps1and2TraumaTriageCriteriaSteps1and2Value"),
						 new Object [] { traumaTriageCriteriaSteps1and2 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTraumaTriageCriteriaSteps1and2ValueP(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps1and2ValueP(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (( not self.value->isEmpty())  and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTraumaTriageCriteriaSteps1and2ValueP(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps1and2 Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps1and2ValueP(TraumaTriageCriteriaSteps1and2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param traumaTriageCriteriaSteps1and2 The receiving '<em><b>Trauma Triage Criteria Steps1and2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTraumaTriageCriteriaSteps1and2ValueP(
			TraumaTriageCriteriaSteps1and2 traumaTriageCriteriaSteps1and2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"TraumaTriageCriteriaSteps1and2TraumaTriageCriteriaSteps1and2ValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRAUMA_TRIAGE_CRITERIA_STEPS1AND2);
			try {
				VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(traumaTriageCriteriaSteps1and2)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRAUMA_TRIAGE_CRITERIA_STEPS1AND2__TRAUMA_TRIAGE_CRITERIA_STEPS1AND2_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("TraumaTriageCriteriaSteps1and2TraumaTriageCriteriaSteps1and2ValueP"),
						 new Object [] { traumaTriageCriteriaSteps1and2 }));
			}
			 
			return false;
		}
		return true;
	}

} // TraumaTriageCriteriaSteps1and2Operations
