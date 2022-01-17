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
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeQualifier;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Response Mode Qualifier</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeQualifier#validateResponseModeQualifierTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode Qualifier Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeQualifier#validateResponseModeQualifierClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode Qualifier Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeQualifier#validateResponseModeQualifierCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode Qualifier Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeQualifier#validateResponseModeQualifierCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode Qualifier Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeQualifier#validateResponseModeQualifierMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode Qualifier Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeQualifier#validateResponseModeQualifierValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode Qualifier Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeQualifier#validateResponseModeQualifierValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode Qualifier Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseModeQualifierOperations extends ClinicalStatementOperations {
 
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
	protected ResponseModeQualifierOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseModeQualifierTemplateId(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode Qualifier Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeQualifierTemplateId(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_MODE_QUALIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.191' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseModeQualifierTemplateId(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode Qualifier Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeQualifierTemplateId(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_MODE_QUALIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseModeQualifier The receiving '<em><b>Response Mode Qualifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResponseModeQualifierTemplateId(ResponseModeQualifier responseModeQualifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ResponseModeQualifierResponseModeQualifierTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_RESPONSE_MODE_QUALIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_MODE_QUALIFIER);
			try {
				VALIDATE_RESPONSE_MODE_QUALIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_MODE_QUALIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_MODE_QUALIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseModeQualifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_MODE_QUALIFIER__RESPONSE_MODE_QUALIFIER_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ResponseModeQualifierResponseModeQualifierTemplateId"),
						 new Object [] { responseModeQualifier }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseModeQualifierClassCode(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode Qualifier Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeQualifierClassCode(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_MODE_QUALIFIER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseModeQualifierClassCode(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode Qualifier Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeQualifierClassCode(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_MODE_QUALIFIER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseModeQualifier The receiving '<em><b>Response Mode Qualifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResponseModeQualifierClassCode(ResponseModeQualifier responseModeQualifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ResponseModeQualifierResponseModeQualifierClassCode","ERROR");
    
  	  
  	  
		if (VALIDATE_RESPONSE_MODE_QUALIFIER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_MODE_QUALIFIER);
			try {
				VALIDATE_RESPONSE_MODE_QUALIFIER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_MODE_QUALIFIER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_MODE_QUALIFIER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseModeQualifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_MODE_QUALIFIER__RESPONSE_MODE_QUALIFIER_CLASS_CODE,
						 EmspcrPlugin.INSTANCE.getString("ResponseModeQualifierResponseModeQualifierClassCode"),
						 new Object [] { responseModeQualifier }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseModeQualifierCodeP(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode Qualifier Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeQualifierCodeP(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_MODE_QUALIFIER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseModeQualifierCodeP(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode Qualifier Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeQualifierCodeP(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_MODE_QUALIFIER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseModeQualifier The receiving '<em><b>Response Mode Qualifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResponseModeQualifierCodeP(ResponseModeQualifier responseModeQualifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ResponseModeQualifierResponseModeQualifierCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_RESPONSE_MODE_QUALIFIER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_MODE_QUALIFIER);
			try {
				VALIDATE_RESPONSE_MODE_QUALIFIER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_MODE_QUALIFIER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_MODE_QUALIFIER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseModeQualifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_MODE_QUALIFIER__RESPONSE_MODE_QUALIFIER_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ResponseModeQualifierResponseModeQualifierCodeP"),
						 new Object [] { responseModeQualifier }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeQualifierCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeQualifierCodeP", passToken);
				}
				passToken.add(responseModeQualifier);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseModeQualifierCode(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode Qualifier Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeQualifierCode(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_MODE_QUALIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '77157-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseModeQualifierCode(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode Qualifier Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeQualifierCode(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_MODE_QUALIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseModeQualifier The receiving '<em><b>Response Mode Qualifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResponseModeQualifierCode(ResponseModeQualifier responseModeQualifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeQualifierCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(responseModeQualifier)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ResponseModeQualifierResponseModeQualifierCode","ERROR");
    
  	  
  	  
		if (VALIDATE_RESPONSE_MODE_QUALIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_MODE_QUALIFIER);
			try {
				VALIDATE_RESPONSE_MODE_QUALIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_MODE_QUALIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_MODE_QUALIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseModeQualifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_MODE_QUALIFIER__RESPONSE_MODE_QUALIFIER_CODE,
						 EmspcrPlugin.INSTANCE.getString("ResponseModeQualifierResponseModeQualifierCode"),
						 new Object [] { responseModeQualifier }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseModeQualifierMoodCode(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode Qualifier Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeQualifierMoodCode(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_MODE_QUALIFIER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseModeQualifierMoodCode(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode Qualifier Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeQualifierMoodCode(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_MODE_QUALIFIER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseModeQualifier The receiving '<em><b>Response Mode Qualifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResponseModeQualifierMoodCode(ResponseModeQualifier responseModeQualifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ResponseModeQualifierResponseModeQualifierMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_RESPONSE_MODE_QUALIFIER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_MODE_QUALIFIER);
			try {
				VALIDATE_RESPONSE_MODE_QUALIFIER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_MODE_QUALIFIER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_MODE_QUALIFIER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseModeQualifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_MODE_QUALIFIER__RESPONSE_MODE_QUALIFIER_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ResponseModeQualifierResponseModeQualifierMoodCode"),
						 new Object [] { responseModeQualifier }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseModeQualifierValue(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode Qualifier Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeQualifierValue(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_MODE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA22798-5' or value.code = 'LA22799-3' or value.code = 'LA22800-9' or value.code = 'LA22801-7' or value.code = 'LA22802-5' or value.code = 'LA22803-3' or value.code = 'LA22804-1' or value.code = 'LA22805-8' or value.code = 'LA22806-6' or value.code = 'LA22807-4' or value.code = 'LA22869-4' or value.code = 'LA22866-0')))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseModeQualifierValue(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode Qualifier Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeQualifierValue(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_MODE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseModeQualifier The receiving '<em><b>Response Mode Qualifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResponseModeQualifierValue(ResponseModeQualifier responseModeQualifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ResponseModeQualifierResponseModeQualifierValue","ERROR");
    
  	  
  	  
		if (VALIDATE_RESPONSE_MODE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_MODE_QUALIFIER);
			try {
				VALIDATE_RESPONSE_MODE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_MODE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_MODE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseModeQualifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_MODE_QUALIFIER__RESPONSE_MODE_QUALIFIER_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ResponseModeQualifierResponseModeQualifierValue"),
						 new Object [] { responseModeQualifier }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseModeQualifierValueP(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode Qualifier Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeQualifierValueP(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_MODE_QUALIFIER_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (( not self.value->isEmpty())  and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseModeQualifierValueP(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode Qualifier Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeQualifierValueP(ResponseModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_MODE_QUALIFIER_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseModeQualifier The receiving '<em><b>Response Mode Qualifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResponseModeQualifierValueP(ResponseModeQualifier responseModeQualifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ResponseModeQualifierResponseModeQualifierValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_RESPONSE_MODE_QUALIFIER_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_MODE_QUALIFIER);
			try {
				VALIDATE_RESPONSE_MODE_QUALIFIER_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_MODE_QUALIFIER_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_MODE_QUALIFIER_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseModeQualifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_MODE_QUALIFIER__RESPONSE_MODE_QUALIFIER_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("ResponseModeQualifierResponseModeQualifierValueP"),
						 new Object [] { responseModeQualifier }));
			}
			 
			return false;
		}
		return true;
	}

} // ResponseModeQualifierOperations