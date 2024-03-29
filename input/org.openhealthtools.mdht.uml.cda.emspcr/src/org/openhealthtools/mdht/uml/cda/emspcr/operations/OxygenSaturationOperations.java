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
import org.openhealthtools.mdht.uml.cda.emspcr.OxygenSaturation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Oxygen Saturation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OxygenSaturation#validateOxygenSaturationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OxygenSaturation#validateOxygenSaturationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OxygenSaturation#validateOxygenSaturationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OxygenSaturation#validateOxygenSaturationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OxygenSaturation#validateOxygenSaturationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OxygenSaturation#validateOxygenSaturationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OxygenSaturationOperations extends ClinicalStatementOperations {

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
	protected OxygenSaturationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOxygenSaturationTemplateId(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOxygenSaturationTemplateId(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OXYGEN_SATURATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.177' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateOxygenSaturationTemplateId(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOxygenSaturationTemplateId(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_OXYGEN_SATURATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param oxygenSaturation The receiving '<em><b>Oxygen Saturation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOxygenSaturationTemplateId(OxygenSaturation oxygenSaturation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"OxygenSaturationOxygenSaturationTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_OXYGEN_SATURATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.OXYGEN_SATURATION);
			try {
				VALIDATE_OXYGEN_SATURATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_OXYGEN_SATURATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_OXYGEN_SATURATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(oxygenSaturation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.OXYGEN_SATURATION__OXYGEN_SATURATION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("OxygenSaturationOxygenSaturationTemplateId"),
						 new Object [] { oxygenSaturation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOxygenSaturationMoodCode(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOxygenSaturationMoodCode(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OXYGEN_SATURATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateOxygenSaturationMoodCode(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOxygenSaturationMoodCode(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_OXYGEN_SATURATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param oxygenSaturation The receiving '<em><b>Oxygen Saturation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOxygenSaturationMoodCode(OxygenSaturation oxygenSaturation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"OxygenSaturationOxygenSaturationMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_OXYGEN_SATURATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.OXYGEN_SATURATION);
			try {
				VALIDATE_OXYGEN_SATURATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_OXYGEN_SATURATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_OXYGEN_SATURATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(oxygenSaturation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.OXYGEN_SATURATION__OXYGEN_SATURATION_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("OxygenSaturationOxygenSaturationMoodCode"),
						 new Object [] { oxygenSaturation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOxygenSaturationCodeP(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOxygenSaturationCodeP(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OXYGEN_SATURATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOxygenSaturationCodeP(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOxygenSaturationCodeP(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_OXYGEN_SATURATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param oxygenSaturation The receiving '<em><b>Oxygen Saturation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOxygenSaturationCodeP(OxygenSaturation oxygenSaturation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"OxygenSaturationOxygenSaturationCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_OXYGEN_SATURATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.OXYGEN_SATURATION);
			try {
				VALIDATE_OXYGEN_SATURATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_OXYGEN_SATURATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_OXYGEN_SATURATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(oxygenSaturation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.OXYGEN_SATURATION__OXYGEN_SATURATION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("OxygenSaturationOxygenSaturationCodeP"),
						 new Object [] { oxygenSaturation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.OxygenSaturationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.OxygenSaturationCodeP", passToken);
				}
				passToken.add(oxygenSaturation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOxygenSaturationCode(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOxygenSaturationCode(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OXYGEN_SATURATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '2708-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateOxygenSaturationCode(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOxygenSaturationCode(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_OXYGEN_SATURATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param oxygenSaturation The receiving '<em><b>Oxygen Saturation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOxygenSaturationCode(OxygenSaturation oxygenSaturation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.OxygenSaturationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(oxygenSaturation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"OxygenSaturationOxygenSaturationCode","ERROR");
    
  	  
  	  
		if (VALIDATE_OXYGEN_SATURATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.OXYGEN_SATURATION);
			try {
				VALIDATE_OXYGEN_SATURATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_OXYGEN_SATURATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_OXYGEN_SATURATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(oxygenSaturation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.OXYGEN_SATURATION__OXYGEN_SATURATION_CODE,
						 EmspcrPlugin.INSTANCE.getString("OxygenSaturationOxygenSaturationCode"),
						 new Object [] { oxygenSaturation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOxygenSaturationEffectiveTime(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOxygenSaturationEffectiveTime(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OXYGEN_SATURATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOxygenSaturationEffectiveTime(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOxygenSaturationEffectiveTime(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_OXYGEN_SATURATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param oxygenSaturation The receiving '<em><b>Oxygen Saturation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOxygenSaturationEffectiveTime(OxygenSaturation oxygenSaturation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"OxygenSaturationOxygenSaturationEffectiveTime","INFO");
    
  	  
  	  
		if (VALIDATE_OXYGEN_SATURATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.OXYGEN_SATURATION);
			try {
				VALIDATE_OXYGEN_SATURATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_OXYGEN_SATURATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_OXYGEN_SATURATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(oxygenSaturation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.OXYGEN_SATURATION__OXYGEN_SATURATION_EFFECTIVE_TIME,
						 EmspcrPlugin.INSTANCE.getString("OxygenSaturationOxygenSaturationEffectiveTime"),
						 new Object [] { oxygenSaturation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOxygenSaturationValue(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOxygenSaturationValue(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OXYGEN_SATURATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOxygenSaturationValue(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOxygenSaturationValue(OxygenSaturation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_OXYGEN_SATURATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param oxygenSaturation The receiving '<em><b>Oxygen Saturation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOxygenSaturationValue(OxygenSaturation oxygenSaturation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"OxygenSaturationOxygenSaturationValue","ERROR");
    
  	  
  	  
		if (VALIDATE_OXYGEN_SATURATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.OXYGEN_SATURATION);
			try {
				VALIDATE_OXYGEN_SATURATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_OXYGEN_SATURATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_OXYGEN_SATURATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(oxygenSaturation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.OXYGEN_SATURATION__OXYGEN_SATURATION_VALUE,
						 EmspcrPlugin.INSTANCE.getString("OxygenSaturationOxygenSaturationValue"),
						 new Object [] { oxygenSaturation }));
			}
			 
			return false;
		}
		return true;
	}

} // OxygenSaturationOperations
