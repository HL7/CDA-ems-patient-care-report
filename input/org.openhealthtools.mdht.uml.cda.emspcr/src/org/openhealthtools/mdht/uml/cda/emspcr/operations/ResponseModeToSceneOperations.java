/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeQualifier;
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Response Mode To Scene</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene#validateResponseModeToSceneTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene#validateResponseModeToSceneMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene#validateResponseModeToSceneCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene#validateResponseModeToSceneCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene#validateResponseModeToSceneValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene#validateResponseModeToSceneValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene#validateResponseModeToSceneResponseModeQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Response Mode Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene#getResponseModeQualifier() <em>Get Response Mode Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseModeToSceneOperations extends ClinicalStatementOperations {

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
	protected ResponseModeToSceneOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseModeToSceneTemplateId(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneTemplateId(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_MODE_TO_SCENE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.182' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseModeToSceneTemplateId(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneTemplateId(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_MODE_TO_SCENE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseModeToScene The receiving '<em><b>Response Mode To Scene</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseModeToSceneTemplateId(ResponseModeToScene responseModeToScene,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ResponseModeToSceneResponseModeToSceneTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_RESPONSE_MODE_TO_SCENE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_MODE_TO_SCENE);
			try {
				VALIDATE_RESPONSE_MODE_TO_SCENE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_MODE_TO_SCENE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_MODE_TO_SCENE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseModeToScene)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_MODE_TO_SCENE__RESPONSE_MODE_TO_SCENE_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ResponseModeToSceneResponseModeToSceneTemplateId"),
						 new Object [] { responseModeToScene }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseModeToSceneMoodCode(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneMoodCode(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_MODE_TO_SCENE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseModeToSceneMoodCode(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneMoodCode(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_MODE_TO_SCENE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseModeToScene The receiving '<em><b>Response Mode To Scene</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseModeToSceneMoodCode(ResponseModeToScene responseModeToScene,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ResponseModeToSceneResponseModeToSceneMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_RESPONSE_MODE_TO_SCENE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_MODE_TO_SCENE);
			try {
				VALIDATE_RESPONSE_MODE_TO_SCENE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_MODE_TO_SCENE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_MODE_TO_SCENE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseModeToScene)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_MODE_TO_SCENE__RESPONSE_MODE_TO_SCENE_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ResponseModeToSceneResponseModeToSceneMoodCode"),
						 new Object [] { responseModeToScene }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseModeToSceneCodeP(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneCodeP(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_MODE_TO_SCENE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseModeToSceneCodeP(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneCodeP(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_MODE_TO_SCENE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseModeToScene The receiving '<em><b>Response Mode To Scene</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseModeToSceneCodeP(ResponseModeToScene responseModeToScene,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ResponseModeToSceneResponseModeToSceneCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_RESPONSE_MODE_TO_SCENE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_MODE_TO_SCENE);
			try {
				VALIDATE_RESPONSE_MODE_TO_SCENE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_MODE_TO_SCENE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_MODE_TO_SCENE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseModeToScene)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_MODE_TO_SCENE__RESPONSE_MODE_TO_SCENE_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ResponseModeToSceneResponseModeToSceneCodeP"),
						 new Object [] { responseModeToScene }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToSceneCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToSceneCodeP", passToken);
				}
				passToken.add(responseModeToScene);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseModeToSceneCode(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneCode(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_MODE_TO_SCENE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67482-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseModeToSceneCode(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneCode(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_MODE_TO_SCENE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseModeToScene The receiving '<em><b>Response Mode To Scene</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseModeToSceneCode(ResponseModeToScene responseModeToScene,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToSceneCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(responseModeToScene)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ResponseModeToSceneResponseModeToSceneCode","ERROR");
    
  	  
  	  
		if (VALIDATE_RESPONSE_MODE_TO_SCENE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_MODE_TO_SCENE);
			try {
				VALIDATE_RESPONSE_MODE_TO_SCENE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_MODE_TO_SCENE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_MODE_TO_SCENE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseModeToScene)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_MODE_TO_SCENE__RESPONSE_MODE_TO_SCENE_CODE,
						 EmspcrPlugin.INSTANCE.getString("ResponseModeToSceneResponseModeToSceneCode"),
						 new Object [] { responseModeToScene }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseModeToSceneValue(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneValue(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17177-9' or value.code = 'LA17178-7' or value.code = 'LA17179-5' or value.code = 'LA17180-3')))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseModeToSceneValue(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneValue(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseModeToScene The receiving '<em><b>Response Mode To Scene</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseModeToSceneValue(ResponseModeToScene responseModeToScene,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ResponseModeToSceneResponseModeToSceneValue","ERROR");
    
  	  
  	  
		if (VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_MODE_TO_SCENE);
			try {
				VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseModeToScene)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_MODE_TO_SCENE__RESPONSE_MODE_TO_SCENE_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ResponseModeToSceneResponseModeToSceneValue"),
						 new Object [] { responseModeToScene }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseModeToSceneValueP(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneValueP(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseModeToSceneValueP(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneValueP(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseModeToScene The receiving '<em><b>Response Mode To Scene</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseModeToSceneValueP(ResponseModeToScene responseModeToScene,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ResponseModeToSceneResponseModeToSceneValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_MODE_TO_SCENE);
			try {
				VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseModeToScene)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_MODE_TO_SCENE__RESPONSE_MODE_TO_SCENE_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("ResponseModeToSceneResponseModeToSceneValueP"),
						 new Object [] { responseModeToScene }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseModeToSceneResponseModeQualifier(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Response Mode Qualifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneResponseModeQualifier(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_MODE_TO_SCENE_RESPONSE_MODE_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(emspcr::ResponseModeQualifier))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseModeToSceneResponseModeQualifier(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Response Mode Qualifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseModeToSceneResponseModeQualifier(ResponseModeToScene, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_MODE_TO_SCENE_RESPONSE_MODE_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseModeToScene The receiving '<em><b>Response Mode To Scene</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseModeToSceneResponseModeQualifier(ResponseModeToScene responseModeToScene,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ResponseModeToSceneResponseModeToSceneResponseModeQualifier","ERROR");
    
  	  
  	  
		if (VALIDATE_RESPONSE_MODE_TO_SCENE_RESPONSE_MODE_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RESPONSE_MODE_TO_SCENE);
			try {
				VALIDATE_RESPONSE_MODE_TO_SCENE_RESPONSE_MODE_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_MODE_TO_SCENE_RESPONSE_MODE_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_MODE_TO_SCENE_RESPONSE_MODE_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseModeToScene)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.RESPONSE_MODE_TO_SCENE__RESPONSE_MODE_TO_SCENE_RESPONSE_MODE_QUALIFIER,
						 EmspcrPlugin.INSTANCE.getString("ResponseModeToSceneResponseModeToSceneResponseModeQualifier"),
						 new Object [] { responseModeToScene }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getResponseModeQualifier(ResponseModeToScene) <em>Get Response Mode Qualifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseModeQualifier(ResponseModeToScene)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESPONSE_MODE_QUALIFIER__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ResponseModeQualifier))->asSequence()->any(true).oclAsType(emspcr::ResponseModeQualifier)";

	/**
	 * The cached OCL query for the '{@link #getResponseModeQualifier(ResponseModeToScene) <em>Get Response Mode Qualifier</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseModeQualifier(ResponseModeToScene)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESPONSE_MODE_QUALIFIER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ResponseModeQualifier getResponseModeQualifier(ResponseModeToScene responseModeToScene) {
	
	
	
		if (GET_RESPONSE_MODE_QUALIFIER__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.RESPONSE_MODE_TO_SCENE, EmspcrPackage.Literals.RESPONSE_MODE_TO_SCENE.getEAllOperations().get(58));
			try {
				GET_RESPONSE_MODE_QUALIFIER__EOCL_QRY = helper.createQuery(GET_RESPONSE_MODE_QUALIFIER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_RESPONSE_MODE_QUALIFIER__EOCL_QRY);
		return (ResponseModeQualifier) query.evaluate(responseModeToScene);
	}

} // ResponseModeToSceneOperations
