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
import org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Prior Aid Vitals</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals#validatePriorAidVitalsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals#validatePriorAidVitalsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals#validatePriorAidVitalsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals#validatePriorAidVitalsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals#validatePriorAidVitalsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PriorAidVitalsOperations extends ClinicalStatementOperations {
 
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
	protected PriorAidVitalsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorAidVitalsTemplateId(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAidVitalsTemplateId(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIOR_AID_VITALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.29' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorAidVitalsTemplateId(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAidVitalsTemplateId(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PRIOR_AID_VITALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorAidVitals The receiving '<em><b>Prior Aid Vitals</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePriorAidVitalsTemplateId(PriorAidVitals priorAidVitals, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PriorAidVitalsPriorAidVitalsTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_PRIOR_AID_VITALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIOR_AID_VITALS);
			try {
				VALIDATE_PRIOR_AID_VITALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIOR_AID_VITALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIOR_AID_VITALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(priorAidVitals)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PRIOR_AID_VITALS__PRIOR_AID_VITALS_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("PriorAidVitalsPriorAidVitalsTemplateId"),
						 new Object [] { priorAidVitals }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorAidVitalsMoodCode(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAidVitalsMoodCode(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIOR_AID_VITALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorAidVitalsMoodCode(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAidVitalsMoodCode(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PRIOR_AID_VITALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorAidVitals The receiving '<em><b>Prior Aid Vitals</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePriorAidVitalsMoodCode(PriorAidVitals priorAidVitals, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PriorAidVitalsPriorAidVitalsMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_PRIOR_AID_VITALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIOR_AID_VITALS);
			try {
				VALIDATE_PRIOR_AID_VITALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIOR_AID_VITALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIOR_AID_VITALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(priorAidVitals)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PRIOR_AID_VITALS__PRIOR_AID_VITALS_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("PriorAidVitalsPriorAidVitalsMoodCode"),
						 new Object [] { priorAidVitals }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorAidVitalsCodeP(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAidVitalsCodeP(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIOR_AID_VITALS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorAidVitalsCodeP(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAidVitalsCodeP(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PRIOR_AID_VITALS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorAidVitals The receiving '<em><b>Prior Aid Vitals</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePriorAidVitalsCodeP(PriorAidVitals priorAidVitals, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PriorAidVitalsPriorAidVitalsCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_PRIOR_AID_VITALS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIOR_AID_VITALS);
			try {
				VALIDATE_PRIOR_AID_VITALS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIOR_AID_VITALS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIOR_AID_VITALS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(priorAidVitals)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PRIOR_AID_VITALS__PRIOR_AID_VITALS_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("PriorAidVitalsPriorAidVitalsCodeP"),
						 new Object [] { priorAidVitals }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitalsCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitalsCodeP", passToken);
				}
				passToken.add(priorAidVitals);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorAidVitalsCode(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAidVitalsCode(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIOR_AID_VITALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67518-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorAidVitalsCode(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAidVitalsCode(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PRIOR_AID_VITALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorAidVitals The receiving '<em><b>Prior Aid Vitals</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePriorAidVitalsCode(PriorAidVitals priorAidVitals, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitalsCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(priorAidVitals)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PriorAidVitalsPriorAidVitalsCode","ERROR");
    
  	  
  	  
		if (VALIDATE_PRIOR_AID_VITALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIOR_AID_VITALS);
			try {
				VALIDATE_PRIOR_AID_VITALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIOR_AID_VITALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIOR_AID_VITALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(priorAidVitals)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PRIOR_AID_VITALS__PRIOR_AID_VITALS_CODE,
						 EmspcrPlugin.INSTANCE.getString("PriorAidVitalsPriorAidVitalsCode"),
						 new Object [] { priorAidVitals }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePriorAidVitalsValue(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAidVitalsValue(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIOR_AID_VITALS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePriorAidVitalsValue(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prior Aid Vitals Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePriorAidVitalsValue(PriorAidVitals, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PRIOR_AID_VITALS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param priorAidVitals The receiving '<em><b>Prior Aid Vitals</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePriorAidVitalsValue(PriorAidVitals priorAidVitals, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PriorAidVitalsPriorAidVitalsValue","ERROR");
    
  	  
  	  
		if (VALIDATE_PRIOR_AID_VITALS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIOR_AID_VITALS);
			try {
				VALIDATE_PRIOR_AID_VITALS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRIOR_AID_VITALS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRIOR_AID_VITALS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(priorAidVitals)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PRIOR_AID_VITALS__PRIOR_AID_VITALS_VALUE,
						 EmspcrPlugin.INSTANCE.getString("PriorAidVitalsPriorAidVitalsValue"),
						 new Object [] { priorAidVitals }));
			}
			 
			return false;
		}
		return true;
	}

} // PriorAidVitalsOperations