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

import org.openhealthtools.mdht.uml.cda.emspcr.BodyTemperature;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Body Temperature</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BodyTemperature#validateBodyTemperatureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Temperature Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BodyTemperature#validateBodyTemperatureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Temperature Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BodyTemperature#validateBodyTemperatureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Temperature Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BodyTemperature#validateBodyTemperatureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Temperature Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BodyTemperature#validateBodyTemperatureValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Temperature Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BodyTemperatureOperations extends ClinicalStatementOperations {

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
	protected BodyTemperatureOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBodyTemperatureTemplateId(BodyTemperature, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Temperature Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBodyTemperatureTemplateId(BodyTemperature, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BODY_TEMPERATURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.176' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateBodyTemperatureTemplateId(BodyTemperature, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Temperature Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBodyTemperatureTemplateId(BodyTemperature, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_BODY_TEMPERATURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param bodyTemperature The receiving '<em><b>Body Temperature</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBodyTemperatureTemplateId(BodyTemperature bodyTemperature,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"BodyTemperatureBodyTemperatureTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_BODY_TEMPERATURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BODY_TEMPERATURE);
			try {
				VALIDATE_BODY_TEMPERATURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_BODY_TEMPERATURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_BODY_TEMPERATURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(bodyTemperature)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.BODY_TEMPERATURE__BODY_TEMPERATURE_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("BodyTemperatureBodyTemperatureTemplateId"),
						 new Object [] { bodyTemperature }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBodyTemperatureMoodCode(BodyTemperature, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Temperature Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBodyTemperatureMoodCode(BodyTemperature, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BODY_TEMPERATURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateBodyTemperatureMoodCode(BodyTemperature, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Temperature Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBodyTemperatureMoodCode(BodyTemperature, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_BODY_TEMPERATURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param bodyTemperature The receiving '<em><b>Body Temperature</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBodyTemperatureMoodCode(BodyTemperature bodyTemperature, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"BodyTemperatureBodyTemperatureMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_BODY_TEMPERATURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BODY_TEMPERATURE);
			try {
				VALIDATE_BODY_TEMPERATURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_BODY_TEMPERATURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_BODY_TEMPERATURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(bodyTemperature)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.BODY_TEMPERATURE__BODY_TEMPERATURE_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("BodyTemperatureBodyTemperatureMoodCode"),
						 new Object [] { bodyTemperature }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBodyTemperatureCode(BodyTemperature, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Temperature Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBodyTemperatureCode(BodyTemperature, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BODY_TEMPERATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '8310-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateBodyTemperatureCode(BodyTemperature, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Temperature Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBodyTemperatureCode(BodyTemperature, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_BODY_TEMPERATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param bodyTemperature The receiving '<em><b>Body Temperature</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBodyTemperatureCode(BodyTemperature bodyTemperature, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"BodyTemperatureBodyTemperatureCode","ERROR");
    
  	  
  	  
		if (VALIDATE_BODY_TEMPERATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BODY_TEMPERATURE);
			try {
				VALIDATE_BODY_TEMPERATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_BODY_TEMPERATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_BODY_TEMPERATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(bodyTemperature)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.BODY_TEMPERATURE__BODY_TEMPERATURE_CODE,
						 EmspcrPlugin.INSTANCE.getString("BodyTemperatureBodyTemperatureCode"),
						 new Object [] { bodyTemperature }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBodyTemperatureEffectiveTime(BodyTemperature, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Temperature Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBodyTemperatureEffectiveTime(BodyTemperature, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BODY_TEMPERATURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateBodyTemperatureEffectiveTime(BodyTemperature, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Temperature Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBodyTemperatureEffectiveTime(BodyTemperature, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_BODY_TEMPERATURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param bodyTemperature The receiving '<em><b>Body Temperature</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBodyTemperatureEffectiveTime(BodyTemperature bodyTemperature,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"BodyTemperatureBodyTemperatureEffectiveTime","INFO");
    
  	  
  	  
		if (VALIDATE_BODY_TEMPERATURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BODY_TEMPERATURE);
			try {
				VALIDATE_BODY_TEMPERATURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_BODY_TEMPERATURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_BODY_TEMPERATURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(bodyTemperature)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.BODY_TEMPERATURE__BODY_TEMPERATURE_EFFECTIVE_TIME,
						 EmspcrPlugin.INSTANCE.getString("BodyTemperatureBodyTemperatureEffectiveTime"),
						 new Object [] { bodyTemperature }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBodyTemperatureValue(BodyTemperature, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Temperature Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBodyTemperatureValue(BodyTemperature, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BODY_TEMPERATURE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

	/**
	 * The cached OCL invariant for the '{@link #validateBodyTemperatureValue(BodyTemperature, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Temperature Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBodyTemperatureValue(BodyTemperature, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_BODY_TEMPERATURE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param bodyTemperature The receiving '<em><b>Body Temperature</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateBodyTemperatureValue(BodyTemperature bodyTemperature, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"BodyTemperatureBodyTemperatureValue","ERROR");
    
  	  
  	  
		if (VALIDATE_BODY_TEMPERATURE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.BODY_TEMPERATURE);
			try {
				VALIDATE_BODY_TEMPERATURE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_BODY_TEMPERATURE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_BODY_TEMPERATURE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(bodyTemperature)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.BODY_TEMPERATURE__BODY_TEMPERATURE_VALUE,
						 EmspcrPlugin.INSTANCE.getString("BodyTemperatureBodyTemperatureValue"),
						 new Object [] { bodyTemperature }));
			}
			 
			return false;
		}
		return true;
	}

} // BodyTemperatureOperations
