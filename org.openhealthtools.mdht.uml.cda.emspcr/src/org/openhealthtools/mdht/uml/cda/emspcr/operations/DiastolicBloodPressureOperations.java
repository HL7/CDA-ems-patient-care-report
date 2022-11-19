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

import org.openhealthtools.mdht.uml.cda.emspcr.DiastolicBloodPressure;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Diastolic Blood Pressure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DiastolicBloodPressure#validateDiastolicBloodPressureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DiastolicBloodPressure#validateDiastolicBloodPressureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DiastolicBloodPressure#validateDiastolicBloodPressureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DiastolicBloodPressure#validateDiastolicBloodPressureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DiastolicBloodPressure#validateDiastolicBloodPressureValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DiastolicBloodPressure#validateDiastolicBloodPressureMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DiastolicBloodPressure#validateDiastolicBloodPressureMethodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Method Code P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiastolicBloodPressureOperations extends ClinicalStatementOperations {

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
	protected DiastolicBloodPressureOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiastolicBloodPressureTemplateId(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiastolicBloodPressureTemplateId(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIASTOLIC_BLOOD_PRESSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.144' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateDiastolicBloodPressureTemplateId(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiastolicBloodPressureTemplateId(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DIASTOLIC_BLOOD_PRESSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diastolicBloodPressure The receiving '<em><b>Diastolic Blood Pressure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDiastolicBloodPressureTemplateId(DiastolicBloodPressure diastolicBloodPressure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DiastolicBloodPressureDiastolicBloodPressureTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_DIASTOLIC_BLOOD_PRESSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DIASTOLIC_BLOOD_PRESSURE);
			try {
				VALIDATE_DIASTOLIC_BLOOD_PRESSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DIASTOLIC_BLOOD_PRESSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DIASTOLIC_BLOOD_PRESSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(diastolicBloodPressure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DIASTOLIC_BLOOD_PRESSURE__DIASTOLIC_BLOOD_PRESSURE_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("DiastolicBloodPressureDiastolicBloodPressureTemplateId"),
						 new Object [] { diastolicBloodPressure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiastolicBloodPressureMoodCode(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiastolicBloodPressureMoodCode(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIASTOLIC_BLOOD_PRESSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateDiastolicBloodPressureMoodCode(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiastolicBloodPressureMoodCode(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DIASTOLIC_BLOOD_PRESSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diastolicBloodPressure The receiving '<em><b>Diastolic Blood Pressure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDiastolicBloodPressureMoodCode(DiastolicBloodPressure diastolicBloodPressure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DiastolicBloodPressureDiastolicBloodPressureMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_DIASTOLIC_BLOOD_PRESSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DIASTOLIC_BLOOD_PRESSURE);
			try {
				VALIDATE_DIASTOLIC_BLOOD_PRESSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DIASTOLIC_BLOOD_PRESSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DIASTOLIC_BLOOD_PRESSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(diastolicBloodPressure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DIASTOLIC_BLOOD_PRESSURE__DIASTOLIC_BLOOD_PRESSURE_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("DiastolicBloodPressureDiastolicBloodPressureMoodCode"),
						 new Object [] { diastolicBloodPressure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiastolicBloodPressureCode(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiastolicBloodPressureCode(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIASTOLIC_BLOOD_PRESSURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '8462-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateDiastolicBloodPressureCode(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiastolicBloodPressureCode(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DIASTOLIC_BLOOD_PRESSURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diastolicBloodPressure The receiving '<em><b>Diastolic Blood Pressure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDiastolicBloodPressureCode(DiastolicBloodPressure diastolicBloodPressure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DiastolicBloodPressureDiastolicBloodPressureCode","ERROR");
    
  	  
  	  
		if (VALIDATE_DIASTOLIC_BLOOD_PRESSURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DIASTOLIC_BLOOD_PRESSURE);
			try {
				VALIDATE_DIASTOLIC_BLOOD_PRESSURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DIASTOLIC_BLOOD_PRESSURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DIASTOLIC_BLOOD_PRESSURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(diastolicBloodPressure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DIASTOLIC_BLOOD_PRESSURE__DIASTOLIC_BLOOD_PRESSURE_CODE,
						 EmspcrPlugin.INSTANCE.getString("DiastolicBloodPressureDiastolicBloodPressureCode"),
						 new Object [] { diastolicBloodPressure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiastolicBloodPressureEffectiveTime(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiastolicBloodPressureEffectiveTime(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIASTOLIC_BLOOD_PRESSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDiastolicBloodPressureEffectiveTime(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiastolicBloodPressureEffectiveTime(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DIASTOLIC_BLOOD_PRESSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diastolicBloodPressure The receiving '<em><b>Diastolic Blood Pressure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDiastolicBloodPressureEffectiveTime(DiastolicBloodPressure diastolicBloodPressure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DiastolicBloodPressureDiastolicBloodPressureEffectiveTime","INFO");
    
  	  
  	  
		if (VALIDATE_DIASTOLIC_BLOOD_PRESSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DIASTOLIC_BLOOD_PRESSURE);
			try {
				VALIDATE_DIASTOLIC_BLOOD_PRESSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DIASTOLIC_BLOOD_PRESSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DIASTOLIC_BLOOD_PRESSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(diastolicBloodPressure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DIASTOLIC_BLOOD_PRESSURE__DIASTOLIC_BLOOD_PRESSURE_EFFECTIVE_TIME,
						 EmspcrPlugin.INSTANCE.getString("DiastolicBloodPressureDiastolicBloodPressureEffectiveTime"),
						 new Object [] { diastolicBloodPressure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiastolicBloodPressureValue(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiastolicBloodPressureValue(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIASTOLIC_BLOOD_PRESSURE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiastolicBloodPressureValue(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiastolicBloodPressureValue(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DIASTOLIC_BLOOD_PRESSURE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diastolicBloodPressure The receiving '<em><b>Diastolic Blood Pressure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDiastolicBloodPressureValue(DiastolicBloodPressure diastolicBloodPressure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DiastolicBloodPressureDiastolicBloodPressureValue","ERROR");
    
  	  
  	  
		if (VALIDATE_DIASTOLIC_BLOOD_PRESSURE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DIASTOLIC_BLOOD_PRESSURE);
			try {
				VALIDATE_DIASTOLIC_BLOOD_PRESSURE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DIASTOLIC_BLOOD_PRESSURE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DIASTOLIC_BLOOD_PRESSURE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(diastolicBloodPressure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DIASTOLIC_BLOOD_PRESSURE__DIASTOLIC_BLOOD_PRESSURE_VALUE,
						 EmspcrPlugin.INSTANCE.getString("DiastolicBloodPressureDiastolicBloodPressureValue"),
						 new Object [] { diastolicBloodPressure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiastolicBloodPressureMethodCode(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiastolicBloodPressureMethodCode(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIASTOLIC_BLOOD_PRESSURE_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->size() = 1 and self.methodCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA24013-7' or value.code = 'LA24012-9' or value.code = 'LA25780-0' or value.code = 'LA25782-6' or value.code = 'LA19771-7' or value.code = 'LA25783-4')))";

	/**
	 * The cached OCL invariant for the '{@link #validateDiastolicBloodPressureMethodCode(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiastolicBloodPressureMethodCode(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DIASTOLIC_BLOOD_PRESSURE_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diastolicBloodPressure The receiving '<em><b>Diastolic Blood Pressure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDiastolicBloodPressureMethodCode(DiastolicBloodPressure diastolicBloodPressure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DiastolicBloodPressureDiastolicBloodPressureMethodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_DIASTOLIC_BLOOD_PRESSURE_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DIASTOLIC_BLOOD_PRESSURE);
			try {
				VALIDATE_DIASTOLIC_BLOOD_PRESSURE_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DIASTOLIC_BLOOD_PRESSURE_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DIASTOLIC_BLOOD_PRESSURE_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(diastolicBloodPressure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DIASTOLIC_BLOOD_PRESSURE__DIASTOLIC_BLOOD_PRESSURE_METHOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("DiastolicBloodPressureDiastolicBloodPressureMethodCode"),
						 new Object [] { diastolicBloodPressure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiastolicBloodPressureMethodCodeP(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Method Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiastolicBloodPressureMethodCodeP(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIASTOLIC_BLOOD_PRESSURE_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->size() =  1)";

	/**
	 * The cached OCL invariant for the '{@link #validateDiastolicBloodPressureMethodCodeP(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Method Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiastolicBloodPressureMethodCodeP(DiastolicBloodPressure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DIASTOLIC_BLOOD_PRESSURE_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diastolicBloodPressure The receiving '<em><b>Diastolic Blood Pressure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDiastolicBloodPressureMethodCodeP(DiastolicBloodPressure diastolicBloodPressure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DiastolicBloodPressureDiastolicBloodPressureMethodCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_DIASTOLIC_BLOOD_PRESSURE_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DIASTOLIC_BLOOD_PRESSURE);
			try {
				VALIDATE_DIASTOLIC_BLOOD_PRESSURE_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DIASTOLIC_BLOOD_PRESSURE_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DIASTOLIC_BLOOD_PRESSURE_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(diastolicBloodPressure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DIASTOLIC_BLOOD_PRESSURE__DIASTOLIC_BLOOD_PRESSURE_METHOD_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("DiastolicBloodPressureDiastolicBloodPressureMethodCodeP"),
						 new Object [] { diastolicBloodPressure }));
			}
			 
			return false;
		}
		return true;
	}

} // DiastolicBloodPressureOperations
