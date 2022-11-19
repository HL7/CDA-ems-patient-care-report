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
import org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Systolic Blood Pressure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure#validateSystolicBloodPressureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure#validateSystolicBloodPressureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure#validateSystolicBloodPressureCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure#validateSystolicBloodPressureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure#validateSystolicBloodPressureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure#validateSystolicBloodPressureValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure#validateSystolicBloodPressureMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure#validateSystolicBloodPressureMethodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Method Code P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystolicBloodPressureOperations extends ClinicalStatementOperations {

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
	protected SystolicBloodPressureOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSystolicBloodPressureTemplateId(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSystolicBloodPressureTemplateId(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SYSTOLIC_BLOOD_PRESSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.23.1' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateSystolicBloodPressureTemplateId(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSystolicBloodPressureTemplateId(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_SYSTOLIC_BLOOD_PRESSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param systolicBloodPressure The receiving '<em><b>Systolic Blood Pressure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSystolicBloodPressureTemplateId(SystolicBloodPressure systolicBloodPressure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"SystolicBloodPressureSystolicBloodPressureTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_SYSTOLIC_BLOOD_PRESSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SYSTOLIC_BLOOD_PRESSURE);
			try {
				VALIDATE_SYSTOLIC_BLOOD_PRESSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SYSTOLIC_BLOOD_PRESSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SYSTOLIC_BLOOD_PRESSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(systolicBloodPressure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.SYSTOLIC_BLOOD_PRESSURE__SYSTOLIC_BLOOD_PRESSURE_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("SystolicBloodPressureSystolicBloodPressureTemplateId"),
						 new Object [] { systolicBloodPressure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSystolicBloodPressureMoodCode(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSystolicBloodPressureMoodCode(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SYSTOLIC_BLOOD_PRESSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateSystolicBloodPressureMoodCode(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSystolicBloodPressureMoodCode(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_SYSTOLIC_BLOOD_PRESSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param systolicBloodPressure The receiving '<em><b>Systolic Blood Pressure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSystolicBloodPressureMoodCode(SystolicBloodPressure systolicBloodPressure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"SystolicBloodPressureSystolicBloodPressureMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_SYSTOLIC_BLOOD_PRESSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SYSTOLIC_BLOOD_PRESSURE);
			try {
				VALIDATE_SYSTOLIC_BLOOD_PRESSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SYSTOLIC_BLOOD_PRESSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SYSTOLIC_BLOOD_PRESSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(systolicBloodPressure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.SYSTOLIC_BLOOD_PRESSURE__SYSTOLIC_BLOOD_PRESSURE_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("SystolicBloodPressureSystolicBloodPressureMoodCode"),
						 new Object [] { systolicBloodPressure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSystolicBloodPressureCodeP(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSystolicBloodPressureCodeP(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SYSTOLIC_BLOOD_PRESSURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSystolicBloodPressureCodeP(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSystolicBloodPressureCodeP(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_SYSTOLIC_BLOOD_PRESSURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param systolicBloodPressure The receiving '<em><b>Systolic Blood Pressure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSystolicBloodPressureCodeP(SystolicBloodPressure systolicBloodPressure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"SystolicBloodPressureSystolicBloodPressureCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_SYSTOLIC_BLOOD_PRESSURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SYSTOLIC_BLOOD_PRESSURE);
			try {
				VALIDATE_SYSTOLIC_BLOOD_PRESSURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SYSTOLIC_BLOOD_PRESSURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SYSTOLIC_BLOOD_PRESSURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(systolicBloodPressure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.SYSTOLIC_BLOOD_PRESSURE__SYSTOLIC_BLOOD_PRESSURE_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("SystolicBloodPressureSystolicBloodPressureCodeP"),
						 new Object [] { systolicBloodPressure }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressureCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressureCodeP", passToken);
				}
				passToken.add(systolicBloodPressure);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSystolicBloodPressureCode(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSystolicBloodPressureCode(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SYSTOLIC_BLOOD_PRESSURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '8480-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateSystolicBloodPressureCode(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSystolicBloodPressureCode(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_SYSTOLIC_BLOOD_PRESSURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param systolicBloodPressure The receiving '<em><b>Systolic Blood Pressure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSystolicBloodPressureCode(SystolicBloodPressure systolicBloodPressure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressureCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(systolicBloodPressure)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"SystolicBloodPressureSystolicBloodPressureCode","ERROR");
    
  	  
  	  
		if (VALIDATE_SYSTOLIC_BLOOD_PRESSURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SYSTOLIC_BLOOD_PRESSURE);
			try {
				VALIDATE_SYSTOLIC_BLOOD_PRESSURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SYSTOLIC_BLOOD_PRESSURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SYSTOLIC_BLOOD_PRESSURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(systolicBloodPressure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.SYSTOLIC_BLOOD_PRESSURE__SYSTOLIC_BLOOD_PRESSURE_CODE,
						 EmspcrPlugin.INSTANCE.getString("SystolicBloodPressureSystolicBloodPressureCode"),
						 new Object [] { systolicBloodPressure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSystolicBloodPressureEffectiveTime(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSystolicBloodPressureEffectiveTime(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SYSTOLIC_BLOOD_PRESSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSystolicBloodPressureEffectiveTime(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSystolicBloodPressureEffectiveTime(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_SYSTOLIC_BLOOD_PRESSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param systolicBloodPressure The receiving '<em><b>Systolic Blood Pressure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSystolicBloodPressureEffectiveTime(SystolicBloodPressure systolicBloodPressure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"SystolicBloodPressureSystolicBloodPressureEffectiveTime","INFO");
    
  	  
  	  
		if (VALIDATE_SYSTOLIC_BLOOD_PRESSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SYSTOLIC_BLOOD_PRESSURE);
			try {
				VALIDATE_SYSTOLIC_BLOOD_PRESSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SYSTOLIC_BLOOD_PRESSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SYSTOLIC_BLOOD_PRESSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(systolicBloodPressure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.SYSTOLIC_BLOOD_PRESSURE__SYSTOLIC_BLOOD_PRESSURE_EFFECTIVE_TIME,
						 EmspcrPlugin.INSTANCE.getString("SystolicBloodPressureSystolicBloodPressureEffectiveTime"),
						 new Object [] { systolicBloodPressure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSystolicBloodPressureValue(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSystolicBloodPressureValue(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SYSTOLIC_BLOOD_PRESSURE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSystolicBloodPressureValue(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSystolicBloodPressureValue(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_SYSTOLIC_BLOOD_PRESSURE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param systolicBloodPressure The receiving '<em><b>Systolic Blood Pressure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSystolicBloodPressureValue(SystolicBloodPressure systolicBloodPressure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"SystolicBloodPressureSystolicBloodPressureValue","ERROR");
    
  	  
  	  
		if (VALIDATE_SYSTOLIC_BLOOD_PRESSURE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SYSTOLIC_BLOOD_PRESSURE);
			try {
				VALIDATE_SYSTOLIC_BLOOD_PRESSURE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SYSTOLIC_BLOOD_PRESSURE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SYSTOLIC_BLOOD_PRESSURE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(systolicBloodPressure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.SYSTOLIC_BLOOD_PRESSURE__SYSTOLIC_BLOOD_PRESSURE_VALUE,
						 EmspcrPlugin.INSTANCE.getString("SystolicBloodPressureSystolicBloodPressureValue"),
						 new Object [] { systolicBloodPressure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSystolicBloodPressureMethodCode(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSystolicBloodPressureMethodCode(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SYSTOLIC_BLOOD_PRESSURE_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA24013-7' or value.code = 'LA24012-9' or value.code = 'LA25780-0' or value.code = 'LA25782-6' or value.code = 'LA19771-7' or value.code = 'LA25783-4')))";

	/**
	 * The cached OCL invariant for the '{@link #validateSystolicBloodPressureMethodCode(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSystolicBloodPressureMethodCode(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_SYSTOLIC_BLOOD_PRESSURE_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param systolicBloodPressure The receiving '<em><b>Systolic Blood Pressure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSystolicBloodPressureMethodCode(SystolicBloodPressure systolicBloodPressure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"SystolicBloodPressureSystolicBloodPressureMethodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_SYSTOLIC_BLOOD_PRESSURE_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SYSTOLIC_BLOOD_PRESSURE);
			try {
				VALIDATE_SYSTOLIC_BLOOD_PRESSURE_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SYSTOLIC_BLOOD_PRESSURE_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SYSTOLIC_BLOOD_PRESSURE_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(systolicBloodPressure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.SYSTOLIC_BLOOD_PRESSURE__SYSTOLIC_BLOOD_PRESSURE_METHOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("SystolicBloodPressureSystolicBloodPressureMethodCode"),
						 new Object [] { systolicBloodPressure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSystolicBloodPressureMethodCodeP(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Method Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSystolicBloodPressureMethodCodeP(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SYSTOLIC_BLOOD_PRESSURE_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (( not self.methodCode->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateSystolicBloodPressureMethodCodeP(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Systolic Blood Pressure Method Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSystolicBloodPressureMethodCodeP(SystolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_SYSTOLIC_BLOOD_PRESSURE_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param systolicBloodPressure The receiving '<em><b>Systolic Blood Pressure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSystolicBloodPressureMethodCodeP(SystolicBloodPressure systolicBloodPressure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"SystolicBloodPressureSystolicBloodPressureMethodCodeP","INFO");
    
  	  
  	  
		if (VALIDATE_SYSTOLIC_BLOOD_PRESSURE_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SYSTOLIC_BLOOD_PRESSURE);
			try {
				VALIDATE_SYSTOLIC_BLOOD_PRESSURE_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SYSTOLIC_BLOOD_PRESSURE_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SYSTOLIC_BLOOD_PRESSURE_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(systolicBloodPressure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.SYSTOLIC_BLOOD_PRESSURE__SYSTOLIC_BLOOD_PRESSURE_METHOD_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("SystolicBloodPressureSystolicBloodPressureMethodCodeP"),
						 new Object [] { systolicBloodPressure }));
			}
			 
			return false;
		}
		return true;
	}

} // SystolicBloodPressureOperations
