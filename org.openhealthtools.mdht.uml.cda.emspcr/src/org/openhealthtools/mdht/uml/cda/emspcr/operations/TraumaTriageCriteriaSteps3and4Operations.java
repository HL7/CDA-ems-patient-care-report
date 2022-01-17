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
import org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps3and4;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Trauma Triage Criteria Steps3and4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps3and4#validateTraumaTriageCriteriaSteps3and4TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps3and4#validateTraumaTriageCriteriaSteps3and4MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps3and4#validateTraumaTriageCriteriaSteps3and4CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps3and4#validateTraumaTriageCriteriaSteps3and4Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps3and4#validateTraumaTriageCriteriaSteps3and4Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps3and4#validateTraumaTriageCriteriaSteps3and4ValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraumaTriageCriteriaSteps3and4Operations extends ClinicalStatementOperations {
 
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
	protected TraumaTriageCriteriaSteps3and4Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTraumaTriageCriteriaSteps3and4TemplateId(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps3and4TemplateId(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.53' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateTraumaTriageCriteriaSteps3and4TemplateId(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps3and4TemplateId(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param traumaTriageCriteriaSteps3and4 The receiving '<em><b>Trauma Triage Criteria Steps3and4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTraumaTriageCriteriaSteps3and4TemplateId(TraumaTriageCriteriaSteps3and4 traumaTriageCriteriaSteps3and4, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"TraumaTriageCriteriaSteps3and4TraumaTriageCriteriaSteps3and4TemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRAUMA_TRIAGE_CRITERIA_STEPS3AND4);
			try {
				VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(traumaTriageCriteriaSteps3and4)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRAUMA_TRIAGE_CRITERIA_STEPS3AND4__TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("TraumaTriageCriteriaSteps3and4TraumaTriageCriteriaSteps3and4TemplateId"),
						 new Object [] { traumaTriageCriteriaSteps3and4 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTraumaTriageCriteriaSteps3and4MoodCode(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps3and4MoodCode(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateTraumaTriageCriteriaSteps3and4MoodCode(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps3and4MoodCode(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param traumaTriageCriteriaSteps3and4 The receiving '<em><b>Trauma Triage Criteria Steps3and4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTraumaTriageCriteriaSteps3and4MoodCode(TraumaTriageCriteriaSteps3and4 traumaTriageCriteriaSteps3and4, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"TraumaTriageCriteriaSteps3and4TraumaTriageCriteriaSteps3and4MoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRAUMA_TRIAGE_CRITERIA_STEPS3AND4);
			try {
				VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(traumaTriageCriteriaSteps3and4)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRAUMA_TRIAGE_CRITERIA_STEPS3AND4__TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("TraumaTriageCriteriaSteps3and4TraumaTriageCriteriaSteps3and4MoodCode"),
						 new Object [] { traumaTriageCriteriaSteps3and4 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTraumaTriageCriteriaSteps3and4CodeP(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps3and4CodeP(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTraumaTriageCriteriaSteps3and4CodeP(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps3and4CodeP(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param traumaTriageCriteriaSteps3and4 The receiving '<em><b>Trauma Triage Criteria Steps3and4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTraumaTriageCriteriaSteps3and4CodeP(TraumaTriageCriteriaSteps3and4 traumaTriageCriteriaSteps3and4, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"TraumaTriageCriteriaSteps3and4TraumaTriageCriteriaSteps3and4CodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRAUMA_TRIAGE_CRITERIA_STEPS3AND4);
			try {
				VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(traumaTriageCriteriaSteps3and4)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRAUMA_TRIAGE_CRITERIA_STEPS3AND4__TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("TraumaTriageCriteriaSteps3and4TraumaTriageCriteriaSteps3and4CodeP"),
						 new Object [] { traumaTriageCriteriaSteps3and4 }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps3and4CodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps3and4CodeP", passToken);
				}
				passToken.add(traumaTriageCriteriaSteps3and4);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTraumaTriageCriteriaSteps3and4Code(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps3and4Code(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67496-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateTraumaTriageCriteriaSteps3and4Code(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps3and4Code(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param traumaTriageCriteriaSteps3and4 The receiving '<em><b>Trauma Triage Criteria Steps3and4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTraumaTriageCriteriaSteps3and4Code(TraumaTriageCriteriaSteps3and4 traumaTriageCriteriaSteps3and4, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.TraumaTriageCriteriaSteps3and4CodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(traumaTriageCriteriaSteps3and4)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"TraumaTriageCriteriaSteps3and4TraumaTriageCriteriaSteps3and4Code","ERROR");
    
  	  
  	  
		if (VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRAUMA_TRIAGE_CRITERIA_STEPS3AND4);
			try {
				VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(traumaTriageCriteriaSteps3and4)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRAUMA_TRIAGE_CRITERIA_STEPS3AND4__TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_CODE,
						 EmspcrPlugin.INSTANCE.getString("TraumaTriageCriteriaSteps3and4TraumaTriageCriteriaSteps3and4Code"),
						 new Object [] { traumaTriageCriteriaSteps3and4 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTraumaTriageCriteriaSteps3and4Value(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps3and4Value(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17348-6' or value.code = 'LA17349-4' or value.code = 'LA17350-2' or value.code = 'LA17352-8' or value.code = 'LA17353-6' or value.code = 'LA17357-7' or value.code = 'LA17360-1' or value.code = 'LA18124-0')))";

	/**
	 * The cached OCL invariant for the '{@link #validateTraumaTriageCriteriaSteps3and4Value(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps3and4Value(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param traumaTriageCriteriaSteps3and4 The receiving '<em><b>Trauma Triage Criteria Steps3and4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTraumaTriageCriteriaSteps3and4Value(TraumaTriageCriteriaSteps3and4 traumaTriageCriteriaSteps3and4, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"TraumaTriageCriteriaSteps3and4TraumaTriageCriteriaSteps3and4Value","ERROR");
    
  	  
  	  
		if (VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRAUMA_TRIAGE_CRITERIA_STEPS3AND4);
			try {
				VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(traumaTriageCriteriaSteps3and4)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRAUMA_TRIAGE_CRITERIA_STEPS3AND4__TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_VALUE,
						 EmspcrPlugin.INSTANCE.getString("TraumaTriageCriteriaSteps3and4TraumaTriageCriteriaSteps3and4Value"),
						 new Object [] { traumaTriageCriteriaSteps3and4 }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTraumaTriageCriteriaSteps3and4ValueP(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps3and4ValueP(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (( not self.value->isEmpty())  and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTraumaTriageCriteriaSteps3and4ValueP(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Triage Criteria Steps3and4 Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTraumaTriageCriteriaSteps3and4ValueP(TraumaTriageCriteriaSteps3and4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param traumaTriageCriteriaSteps3and4 The receiving '<em><b>Trauma Triage Criteria Steps3and4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTraumaTriageCriteriaSteps3and4ValueP(TraumaTriageCriteriaSteps3and4 traumaTriageCriteriaSteps3and4, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"TraumaTriageCriteriaSteps3and4TraumaTriageCriteriaSteps3and4ValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRAUMA_TRIAGE_CRITERIA_STEPS3AND4);
			try {
				VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(traumaTriageCriteriaSteps3and4)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRAUMA_TRIAGE_CRITERIA_STEPS3AND4__TRAUMA_TRIAGE_CRITERIA_STEPS3AND4_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("TraumaTriageCriteriaSteps3and4TraumaTriageCriteriaSteps3and4ValueP"),
						 new Object [] { traumaTriageCriteriaSteps3and4 }));
			}
			 
			return false;
		}
		return true;
	}

} // TraumaTriageCriteriaSteps3and4Operations