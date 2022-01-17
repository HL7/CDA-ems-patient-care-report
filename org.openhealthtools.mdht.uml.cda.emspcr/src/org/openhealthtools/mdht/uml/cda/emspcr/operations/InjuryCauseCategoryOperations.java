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
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategory;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Injury Cause Category</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategory#validateInjuryCauseCategoryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategory#validateInjuryCauseCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategory#validateInjuryCauseCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategory#validateInjuryCauseCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategory#validateInjuryCauseCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategory#validateInjuryCauseCategoryValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InjuryCauseCategoryOperations extends ClinicalStatementOperations {
 
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
	protected InjuryCauseCategoryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryCauseCategoryTemplateId(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryCauseCategoryTemplateId(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_CAUSE_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.50' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryCauseCategoryTemplateId(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryCauseCategoryTemplateId(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_INJURY_CAUSE_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryCauseCategory The receiving '<em><b>Injury Cause Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryCauseCategoryTemplateId(InjuryCauseCategory injuryCauseCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"InjuryCauseCategoryInjuryCauseCategoryTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_INJURY_CAUSE_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_CAUSE_CATEGORY);
			try {
				VALIDATE_INJURY_CAUSE_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_INJURY_CAUSE_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_INJURY_CAUSE_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(injuryCauseCategory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_CAUSE_CATEGORY__INJURY_CAUSE_CATEGORY_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("InjuryCauseCategoryInjuryCauseCategoryTemplateId"),
						 new Object [] { injuryCauseCategory }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryCauseCategoryMoodCode(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryCauseCategoryMoodCode(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_CAUSE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryCauseCategoryMoodCode(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryCauseCategoryMoodCode(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_INJURY_CAUSE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryCauseCategory The receiving '<em><b>Injury Cause Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryCauseCategoryMoodCode(InjuryCauseCategory injuryCauseCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"InjuryCauseCategoryInjuryCauseCategoryMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_INJURY_CAUSE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_CAUSE_CATEGORY);
			try {
				VALIDATE_INJURY_CAUSE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_INJURY_CAUSE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_INJURY_CAUSE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(injuryCauseCategory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_CAUSE_CATEGORY__INJURY_CAUSE_CATEGORY_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("InjuryCauseCategoryInjuryCauseCategoryMoodCode"),
						 new Object [] { injuryCauseCategory }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryCauseCategoryCodeP(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryCauseCategoryCodeP(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_CAUSE_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryCauseCategoryCodeP(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryCauseCategoryCodeP(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_INJURY_CAUSE_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryCauseCategory The receiving '<em><b>Injury Cause Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryCauseCategoryCodeP(InjuryCauseCategory injuryCauseCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"InjuryCauseCategoryInjuryCauseCategoryCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_INJURY_CAUSE_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_CAUSE_CATEGORY);
			try {
				VALIDATE_INJURY_CAUSE_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_INJURY_CAUSE_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_INJURY_CAUSE_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(injuryCauseCategory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_CAUSE_CATEGORY__INJURY_CAUSE_CATEGORY_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("InjuryCauseCategoryInjuryCauseCategoryCodeP"),
						 new Object [] { injuryCauseCategory }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategoryCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategoryCodeP", passToken);
				}
				passToken.add(injuryCauseCategory);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryCauseCategoryCode(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryCauseCategoryCode(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_CAUSE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '69543-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryCauseCategoryCode(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryCauseCategoryCode(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_INJURY_CAUSE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryCauseCategory The receiving '<em><b>Injury Cause Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryCauseCategoryCode(InjuryCauseCategory injuryCauseCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategoryCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(injuryCauseCategory)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"InjuryCauseCategoryInjuryCauseCategoryCode","ERROR");
    
  	  
  	  
		if (VALIDATE_INJURY_CAUSE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_CAUSE_CATEGORY);
			try {
				VALIDATE_INJURY_CAUSE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_INJURY_CAUSE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_INJURY_CAUSE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(injuryCauseCategory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_CAUSE_CATEGORY__INJURY_CAUSE_CATEGORY_CODE,
						 EmspcrPlugin.INSTANCE.getString("InjuryCauseCategoryInjuryCauseCategoryCode"),
						 new Object [] { injuryCauseCategory }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryCauseCategoryValue(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryCauseCategoryValue(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_CAUSE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.90'))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryCauseCategoryValue(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryCauseCategoryValue(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_INJURY_CAUSE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryCauseCategory The receiving '<em><b>Injury Cause Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryCauseCategoryValue(InjuryCauseCategory injuryCauseCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"InjuryCauseCategoryInjuryCauseCategoryValue","ERROR");
    
  	  
  	  
		if (VALIDATE_INJURY_CAUSE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_CAUSE_CATEGORY);
			try {
				VALIDATE_INJURY_CAUSE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_INJURY_CAUSE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_INJURY_CAUSE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(injuryCauseCategory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_CAUSE_CATEGORY__INJURY_CAUSE_CATEGORY_VALUE,
						 EmspcrPlugin.INSTANCE.getString("InjuryCauseCategoryInjuryCauseCategoryValue"),
						 new Object [] { injuryCauseCategory }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInjuryCauseCategoryValueP(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryCauseCategoryValueP(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INJURY_CAUSE_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (( not self.value->isEmpty())  and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInjuryCauseCategoryValueP(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInjuryCauseCategoryValueP(InjuryCauseCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_INJURY_CAUSE_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param injuryCauseCategory The receiving '<em><b>Injury Cause Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInjuryCauseCategoryValueP(InjuryCauseCategory injuryCauseCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"InjuryCauseCategoryInjuryCauseCategoryValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_INJURY_CAUSE_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.INJURY_CAUSE_CATEGORY);
			try {
				VALIDATE_INJURY_CAUSE_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_INJURY_CAUSE_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_INJURY_CAUSE_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(injuryCauseCategory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.INJURY_CAUSE_CATEGORY__INJURY_CAUSE_CATEGORY_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("InjuryCauseCategoryInjuryCauseCategoryValueP"),
						 new Object [] { injuryCauseCategory }));
			}
			 
			return false;
		}
		return true;
	}

} // InjuryCauseCategoryOperations