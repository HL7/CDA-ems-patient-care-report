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
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfConditionOrSurgery;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Existence Of History Of Condition Or Surgery</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfConditionOrSurgery#validateExistenceOfHistoryOfConditionOrSurgeryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Condition Or Surgery Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfConditionOrSurgery#validateExistenceOfHistoryOfConditionOrSurgeryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Condition Or Surgery Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfConditionOrSurgery#validateExistenceOfHistoryOfConditionOrSurgeryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Condition Or Surgery Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfConditionOrSurgery#validateExistenceOfHistoryOfConditionOrSurgeryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Condition Or Surgery Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfConditionOrSurgery#validateExistenceOfHistoryOfConditionOrSurgeryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Condition Or Surgery Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExistenceOfHistoryOfConditionOrSurgeryOperations extends ClinicalStatementOperations {
 
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
	protected ExistenceOfHistoryOfConditionOrSurgeryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfHistoryOfConditionOrSurgeryTemplateId(ExistenceOfHistoryOfConditionOrSurgery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Condition Or Surgery Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfHistoryOfConditionOrSurgeryTemplateId(ExistenceOfHistoryOfConditionOrSurgery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.60' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfHistoryOfConditionOrSurgeryTemplateId(ExistenceOfHistoryOfConditionOrSurgery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Condition Or Surgery Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfHistoryOfConditionOrSurgeryTemplateId(ExistenceOfHistoryOfConditionOrSurgery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfHistoryOfConditionOrSurgery The receiving '<em><b>Existence Of History Of Condition Or Surgery</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExistenceOfHistoryOfConditionOrSurgeryTemplateId(ExistenceOfHistoryOfConditionOrSurgery existenceOfHistoryOfConditionOrSurgery, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ExistenceOfHistoryOfConditionOrSurgeryExistenceOfHistoryOfConditionOrSurgeryTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY);
			try {
				VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfHistoryOfConditionOrSurgery)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY__EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfHistoryOfConditionOrSurgeryExistenceOfHistoryOfConditionOrSurgeryTemplateId"),
						 new Object [] { existenceOfHistoryOfConditionOrSurgery }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfHistoryOfConditionOrSurgeryMoodCode(ExistenceOfHistoryOfConditionOrSurgery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Condition Or Surgery Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfHistoryOfConditionOrSurgeryMoodCode(ExistenceOfHistoryOfConditionOrSurgery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfHistoryOfConditionOrSurgeryMoodCode(ExistenceOfHistoryOfConditionOrSurgery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Condition Or Surgery Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfHistoryOfConditionOrSurgeryMoodCode(ExistenceOfHistoryOfConditionOrSurgery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfHistoryOfConditionOrSurgery The receiving '<em><b>Existence Of History Of Condition Or Surgery</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExistenceOfHistoryOfConditionOrSurgeryMoodCode(ExistenceOfHistoryOfConditionOrSurgery existenceOfHistoryOfConditionOrSurgery, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ExistenceOfHistoryOfConditionOrSurgeryExistenceOfHistoryOfConditionOrSurgeryMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY);
			try {
				VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfHistoryOfConditionOrSurgery)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY__EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfHistoryOfConditionOrSurgeryExistenceOfHistoryOfConditionOrSurgeryMoodCode"),
						 new Object [] { existenceOfHistoryOfConditionOrSurgery }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfHistoryOfConditionOrSurgeryCodeP(ExistenceOfHistoryOfConditionOrSurgery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Condition Or Surgery Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfHistoryOfConditionOrSurgeryCodeP(ExistenceOfHistoryOfConditionOrSurgery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfHistoryOfConditionOrSurgeryCodeP(ExistenceOfHistoryOfConditionOrSurgery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Condition Or Surgery Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfHistoryOfConditionOrSurgeryCodeP(ExistenceOfHistoryOfConditionOrSurgery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfHistoryOfConditionOrSurgery The receiving '<em><b>Existence Of History Of Condition Or Surgery</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExistenceOfHistoryOfConditionOrSurgeryCodeP(ExistenceOfHistoryOfConditionOrSurgery existenceOfHistoryOfConditionOrSurgery, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ExistenceOfHistoryOfConditionOrSurgeryExistenceOfHistoryOfConditionOrSurgeryCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY);
			try {
				VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfHistoryOfConditionOrSurgery)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY__EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfHistoryOfConditionOrSurgeryExistenceOfHistoryOfConditionOrSurgeryCodeP"),
						 new Object [] { existenceOfHistoryOfConditionOrSurgery }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfConditionOrSurgeryCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfConditionOrSurgeryCodeP", passToken);
				}
				passToken.add(existenceOfHistoryOfConditionOrSurgery);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfHistoryOfConditionOrSurgeryCode(ExistenceOfHistoryOfConditionOrSurgery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Condition Or Surgery Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfHistoryOfConditionOrSurgeryCode(ExistenceOfHistoryOfConditionOrSurgery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67793-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfHistoryOfConditionOrSurgeryCode(ExistenceOfHistoryOfConditionOrSurgery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Condition Or Surgery Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfHistoryOfConditionOrSurgeryCode(ExistenceOfHistoryOfConditionOrSurgery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfHistoryOfConditionOrSurgery The receiving '<em><b>Existence Of History Of Condition Or Surgery</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExistenceOfHistoryOfConditionOrSurgeryCode(ExistenceOfHistoryOfConditionOrSurgery existenceOfHistoryOfConditionOrSurgery, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfConditionOrSurgeryCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(existenceOfHistoryOfConditionOrSurgery)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ExistenceOfHistoryOfConditionOrSurgeryExistenceOfHistoryOfConditionOrSurgeryCode","ERROR");
    
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY);
			try {
				VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfHistoryOfConditionOrSurgery)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY__EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_CODE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfHistoryOfConditionOrSurgeryExistenceOfHistoryOfConditionOrSurgeryCode"),
						 new Object [] { existenceOfHistoryOfConditionOrSurgery }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfHistoryOfConditionOrSurgeryValue(ExistenceOfHistoryOfConditionOrSurgery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Condition Or Surgery Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfHistoryOfConditionOrSurgeryValue(ExistenceOfHistoryOfConditionOrSurgery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfHistoryOfConditionOrSurgeryValue(ExistenceOfHistoryOfConditionOrSurgery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Condition Or Surgery Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfHistoryOfConditionOrSurgeryValue(ExistenceOfHistoryOfConditionOrSurgery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfHistoryOfConditionOrSurgery The receiving '<em><b>Existence Of History Of Condition Or Surgery</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExistenceOfHistoryOfConditionOrSurgeryValue(ExistenceOfHistoryOfConditionOrSurgery existenceOfHistoryOfConditionOrSurgery, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ExistenceOfHistoryOfConditionOrSurgeryExistenceOfHistoryOfConditionOrSurgeryValue","ERROR");
    
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY);
			try {
				VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfHistoryOfConditionOrSurgery)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY__EXISTENCE_OF_HISTORY_OF_CONDITION_OR_SURGERY_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfHistoryOfConditionOrSurgeryExistenceOfHistoryOfConditionOrSurgeryValue"),
						 new Object [] { existenceOfHistoryOfConditionOrSurgery }));
			}
			 
			return false;
		}
		return true;
	}

} // ExistenceOfHistoryOfConditionOrSurgeryOperations