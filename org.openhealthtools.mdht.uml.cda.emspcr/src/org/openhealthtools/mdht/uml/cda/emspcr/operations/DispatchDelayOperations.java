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

import org.openhealthtools.mdht.uml.cda.emspcr.DispatchDelay;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Dispatch Delay</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchDelay#validateDispatchDelayTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchDelay#validateDispatchDelayMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchDelay#validateDispatchDelayCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchDelay#validateDispatchDelayCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchDelay#validateDispatchDelayValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchDelay#validateDispatchDelayValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DispatchDelayOperations extends ClinicalStatementOperations {
 
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
	protected DispatchDelayOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispatchDelayTemplateId(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchDelayTemplateId(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPATCH_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.153' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateDispatchDelayTemplateId(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchDelayTemplateId(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DISPATCH_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispatchDelay The receiving '<em><b>Dispatch Delay</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDispatchDelayTemplateId(DispatchDelay dispatchDelay, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DispatchDelayDispatchDelayTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_DISPATCH_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_DELAY);
			try {
				VALIDATE_DISPATCH_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DISPATCH_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DISPATCH_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dispatchDelay)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPATCH_DELAY__DISPATCH_DELAY_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("DispatchDelayDispatchDelayTemplateId"),
						 new Object [] { dispatchDelay }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispatchDelayMoodCode(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchDelayMoodCode(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPATCH_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateDispatchDelayMoodCode(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchDelayMoodCode(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DISPATCH_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispatchDelay The receiving '<em><b>Dispatch Delay</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDispatchDelayMoodCode(DispatchDelay dispatchDelay, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DispatchDelayDispatchDelayMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_DISPATCH_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_DELAY);
			try {
				VALIDATE_DISPATCH_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DISPATCH_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DISPATCH_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dispatchDelay)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPATCH_DELAY__DISPATCH_DELAY_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("DispatchDelayDispatchDelayMoodCode"),
						 new Object [] { dispatchDelay }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispatchDelayCodeP(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchDelayCodeP(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPATCH_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDispatchDelayCodeP(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchDelayCodeP(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DISPATCH_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispatchDelay The receiving '<em><b>Dispatch Delay</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDispatchDelayCodeP(DispatchDelay dispatchDelay, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DispatchDelayDispatchDelayCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_DISPATCH_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_DELAY);
			try {
				VALIDATE_DISPATCH_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DISPATCH_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DISPATCH_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dispatchDelay)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPATCH_DELAY__DISPATCH_DELAY_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("DispatchDelayDispatchDelayCodeP"),
						 new Object [] { dispatchDelay }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.DispatchDelayCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.DispatchDelayCodeP", passToken);
				}
				passToken.add(dispatchDelay);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispatchDelayCode(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchDelayCode(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPATCH_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67480-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateDispatchDelayCode(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchDelayCode(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DISPATCH_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispatchDelay The receiving '<em><b>Dispatch Delay</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDispatchDelayCode(DispatchDelay dispatchDelay, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.DispatchDelayCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(dispatchDelay)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DispatchDelayDispatchDelayCode","ERROR");
    
  	  
  	  
		if (VALIDATE_DISPATCH_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_DELAY);
			try {
				VALIDATE_DISPATCH_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DISPATCH_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DISPATCH_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dispatchDelay)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPATCH_DELAY__DISPATCH_DELAY_CODE,
						 EmspcrPlugin.INSTANCE.getString("DispatchDelayDispatchDelayCode"),
						 new Object [] { dispatchDelay }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispatchDelayValue(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchDelayValue(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPATCH_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17059-9' or value.code = 'LA17183-7' or value.code = 'LA17579-6' or value.code = 'LA17580-4' or value.code = 'LA17581-2' or value.code = 'LA17582-0' or value.code = 'LA17584-6' or value.code = 'LA18081-2' or value.code = 'LA7540-3' or value.code = 'NewLA-2208019' or value.code = 'NewLA-2208021' or value.code = 'NewLA-2208023')))";

	/**
	 * The cached OCL invariant for the '{@link #validateDispatchDelayValue(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchDelayValue(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DISPATCH_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispatchDelay The receiving '<em><b>Dispatch Delay</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDispatchDelayValue(DispatchDelay dispatchDelay, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DispatchDelayDispatchDelayValue","ERROR");
    
  	  
  	  
		if (VALIDATE_DISPATCH_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_DELAY);
			try {
				VALIDATE_DISPATCH_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DISPATCH_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DISPATCH_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dispatchDelay)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPATCH_DELAY__DISPATCH_DELAY_VALUE,
						 EmspcrPlugin.INSTANCE.getString("DispatchDelayDispatchDelayValue"),
						 new Object [] { dispatchDelay }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispatchDelayValueP(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchDelayValueP(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPATCH_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (( not self.value->isEmpty())  and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDispatchDelayValueP(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchDelayValueP(DispatchDelay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_DISPATCH_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispatchDelay The receiving '<em><b>Dispatch Delay</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDispatchDelayValueP(DispatchDelay dispatchDelay, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DispatchDelayDispatchDelayValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_DISPATCH_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_DELAY);
			try {
				VALIDATE_DISPATCH_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DISPATCH_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DISPATCH_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dispatchDelay)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPATCH_DELAY__DISPATCH_DELAY_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("DispatchDelayDispatchDelayValueP"),
						 new Object [] { dispatchDelay }));
			}
			 
			return false;
		}
		return true;
	}

} // DispatchDelayOperations