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

import org.openhealthtools.mdht.uml.cda.emspcr.DispatchReason;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Dispatch Reason</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchReason#validateDispatchReasonTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchReason#validateDispatchReasonMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchReason#validateDispatchReasonCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchReason#validateDispatchReasonCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchReason#validateDispatchReasonValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchReason#validateDispatchReasonValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DispatchReasonOperations extends ClinicalStatementOperations {

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
	protected DispatchReasonOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispatchReasonTemplateId(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchReasonTemplateId(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPATCH_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.74' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateDispatchReasonTemplateId(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchReasonTemplateId(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DISPATCH_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispatchReason The receiving '<em><b>Dispatch Reason</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDispatchReasonTemplateId(DispatchReason dispatchReason, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DispatchReasonDispatchReasonTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_DISPATCH_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_REASON);
			try {
				VALIDATE_DISPATCH_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DISPATCH_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DISPATCH_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dispatchReason)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPATCH_REASON__DISPATCH_REASON_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("DispatchReasonDispatchReasonTemplateId"),
						 new Object [] { dispatchReason }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispatchReasonMoodCode(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchReasonMoodCode(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPATCH_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateDispatchReasonMoodCode(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchReasonMoodCode(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DISPATCH_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispatchReason The receiving '<em><b>Dispatch Reason</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDispatchReasonMoodCode(DispatchReason dispatchReason, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DispatchReasonDispatchReasonMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_DISPATCH_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_REASON);
			try {
				VALIDATE_DISPATCH_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DISPATCH_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DISPATCH_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dispatchReason)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPATCH_REASON__DISPATCH_REASON_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("DispatchReasonDispatchReasonMoodCode"),
						 new Object [] { dispatchReason }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispatchReasonCodeP(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchReasonCodeP(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPATCH_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDispatchReasonCodeP(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchReasonCodeP(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DISPATCH_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispatchReason The receiving '<em><b>Dispatch Reason</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDispatchReasonCodeP(DispatchReason dispatchReason, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DispatchReasonDispatchReasonCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_DISPATCH_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_REASON);
			try {
				VALIDATE_DISPATCH_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DISPATCH_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DISPATCH_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dispatchReason)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPATCH_REASON__DISPATCH_REASON_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("DispatchReasonDispatchReasonCodeP"),
						 new Object [] { dispatchReason }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.DispatchReasonCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.DispatchReasonCodeP", passToken);
				}
				passToken.add(dispatchReason);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispatchReasonCode(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchReasonCode(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPATCH_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67570-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateDispatchReasonCode(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchReasonCode(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DISPATCH_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispatchReason The receiving '<em><b>Dispatch Reason</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDispatchReasonCode(DispatchReason dispatchReason, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.DispatchReasonCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(dispatchReason)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DispatchReasonDispatchReasonCode","ERROR");
    
  	  
  	  
		if (VALIDATE_DISPATCH_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_REASON);
			try {
				VALIDATE_DISPATCH_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DISPATCH_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DISPATCH_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dispatchReason)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPATCH_REASON__DISPATCH_REASON_CODE,
						 EmspcrPlugin.INSTANCE.getString("DispatchReasonDispatchReasonCode"),
						 new Object [] { dispatchReason }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispatchReasonValue(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchReasonValue(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPATCH_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA23843-8' or value.code = 'LA15903-0' or value.code = 'LA17117-5' or value.code = 'LA17118-3' or value.code = 'LA17119-1' or value.code = 'LA17120-9' or value.code = 'LA17121-7' or value.code = 'LA17122-5' or value.code = 'LA17123-3' or value.code = 'LA17124-1' or value.code = 'LA17125-8' or value.code = 'LA17126-6' or value.code = 'LA17127-4' or value.code = 'LA17128-2' or value.code = 'LA17129-0' or value.code = 'LA17131-6' or value.code = 'LA17132-4' or value.code = 'LA17133-2' or value.code = 'LA17134-0' or value.code = 'LA17135-7' or value.code = 'LA17136-5' or value.code = 'LA17137-3' or value.code = 'LA17138-1' or value.code = 'LA17140-7' or value.code = 'LA17141-5' or value.code = 'LA17142-3' or value.code = 'LA17143-1' or value.code = 'LA17144-9' or value.code = 'LA17145-6' or value.code = 'LA17146-4' or value.code = 'LA17147-2' or value.code = 'LA17148-0' or value.code = 'LA17149-8' or value.code = 'LA17150-6' or value.code = 'LA18093-7' or value.code = 'LA18209-9' or value.code = 'LA18210-7' or value.code = 'LA18211-5' or value.code = 'LA9553-4' or value.code = 'LA9555-9' or value.code = 'LA17130-8' or value.code = 'LA23800-8' or value.code = 'LA17392-4' or value.code = 'LA18716-3' or value.code = 'LA15098-9' or value.code = 'LA15099-7')))";

	/**
	 * The cached OCL invariant for the '{@link #validateDispatchReasonValue(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchReasonValue(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DISPATCH_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispatchReason The receiving '<em><b>Dispatch Reason</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDispatchReasonValue(DispatchReason dispatchReason, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DispatchReasonDispatchReasonValue","ERROR");
    
  	  
  	  
		if (VALIDATE_DISPATCH_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_REASON);
			try {
				VALIDATE_DISPATCH_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DISPATCH_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DISPATCH_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dispatchReason)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPATCH_REASON__DISPATCH_REASON_VALUE,
						 EmspcrPlugin.INSTANCE.getString("DispatchReasonDispatchReasonValue"),
						 new Object [] { dispatchReason }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispatchReasonValueP(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchReasonValueP(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPATCH_REASON_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDispatchReasonValueP(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Reason Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchReasonValueP(DispatchReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DISPATCH_REASON_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispatchReason The receiving '<em><b>Dispatch Reason</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDispatchReasonValueP(DispatchReason dispatchReason, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DispatchReasonDispatchReasonValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_DISPATCH_REASON_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_REASON);
			try {
				VALIDATE_DISPATCH_REASON_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DISPATCH_REASON_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DISPATCH_REASON_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dispatchReason)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DISPATCH_REASON__DISPATCH_REASON_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("DispatchReasonDispatchReasonValueP"),
						 new Object [] { dispatchReason }));
			}
			 
			return false;
		}
		return true;
	}

} // DispatchReasonOperations
