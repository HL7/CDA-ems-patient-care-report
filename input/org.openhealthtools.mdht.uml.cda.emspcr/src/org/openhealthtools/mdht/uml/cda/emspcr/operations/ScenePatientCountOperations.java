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
import org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Scene Patient Count</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount#validateScenePatientCountTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount#validateScenePatientCountMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount#validateScenePatientCountCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount#validateScenePatientCountCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount#validateScenePatientCountValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount#validateScenePatientCountValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenePatientCountOperations extends ClinicalStatementOperations {

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
	protected ScenePatientCountOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScenePatientCountTemplateId(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountTemplateId(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCENE_PATIENT_COUNT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.86' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateScenePatientCountTemplateId(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountTemplateId(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_SCENE_PATIENT_COUNT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param scenePatientCount The receiving '<em><b>Scene Patient Count</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateScenePatientCountTemplateId(ScenePatientCount scenePatientCount,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ScenePatientCountScenePatientCountTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_SCENE_PATIENT_COUNT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SCENE_PATIENT_COUNT);
			try {
				VALIDATE_SCENE_PATIENT_COUNT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SCENE_PATIENT_COUNT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SCENE_PATIENT_COUNT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(scenePatientCount)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.SCENE_PATIENT_COUNT__SCENE_PATIENT_COUNT_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ScenePatientCountScenePatientCountTemplateId"),
						 new Object [] { scenePatientCount }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScenePatientCountMoodCode(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountMoodCode(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCENE_PATIENT_COUNT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateScenePatientCountMoodCode(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountMoodCode(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_SCENE_PATIENT_COUNT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param scenePatientCount The receiving '<em><b>Scene Patient Count</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateScenePatientCountMoodCode(ScenePatientCount scenePatientCount,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ScenePatientCountScenePatientCountMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_SCENE_PATIENT_COUNT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SCENE_PATIENT_COUNT);
			try {
				VALIDATE_SCENE_PATIENT_COUNT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SCENE_PATIENT_COUNT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SCENE_PATIENT_COUNT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(scenePatientCount)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.SCENE_PATIENT_COUNT__SCENE_PATIENT_COUNT_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ScenePatientCountScenePatientCountMoodCode"),
						 new Object [] { scenePatientCount }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScenePatientCountCodeP(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountCodeP(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCENE_PATIENT_COUNT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateScenePatientCountCodeP(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountCodeP(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_SCENE_PATIENT_COUNT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param scenePatientCount The receiving '<em><b>Scene Patient Count</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateScenePatientCountCodeP(ScenePatientCount scenePatientCount,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ScenePatientCountScenePatientCountCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_SCENE_PATIENT_COUNT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SCENE_PATIENT_COUNT);
			try {
				VALIDATE_SCENE_PATIENT_COUNT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SCENE_PATIENT_COUNT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SCENE_PATIENT_COUNT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(scenePatientCount)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.SCENE_PATIENT_COUNT__SCENE_PATIENT_COUNT_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ScenePatientCountScenePatientCountCodeP"),
						 new Object [] { scenePatientCount }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCountCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCountCodeP", passToken);
				}
				passToken.add(scenePatientCount);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScenePatientCountCode(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountCode(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCENE_PATIENT_COUNT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67489-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateScenePatientCountCode(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountCode(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_SCENE_PATIENT_COUNT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param scenePatientCount The receiving '<em><b>Scene Patient Count</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateScenePatientCountCode(ScenePatientCount scenePatientCount,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCountCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(scenePatientCount)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ScenePatientCountScenePatientCountCode","ERROR");
    
  	  
  	  
		if (VALIDATE_SCENE_PATIENT_COUNT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SCENE_PATIENT_COUNT);
			try {
				VALIDATE_SCENE_PATIENT_COUNT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SCENE_PATIENT_COUNT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SCENE_PATIENT_COUNT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(scenePatientCount)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.SCENE_PATIENT_COUNT__SCENE_PATIENT_COUNT_CODE,
						 EmspcrPlugin.INSTANCE.getString("ScenePatientCountScenePatientCountCode"),
						 new Object [] { scenePatientCount }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScenePatientCountValue(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountValue(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCENE_PATIENT_COUNT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17717-2' or value.code = 'LA15382-7' or value.code = 'LA137-2')))";

	/**
	 * The cached OCL invariant for the '{@link #validateScenePatientCountValue(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountValue(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_SCENE_PATIENT_COUNT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param scenePatientCount The receiving '<em><b>Scene Patient Count</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateScenePatientCountValue(ScenePatientCount scenePatientCount,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ScenePatientCountScenePatientCountValue","ERROR");
    
  	  
  	  
		if (VALIDATE_SCENE_PATIENT_COUNT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SCENE_PATIENT_COUNT);
			try {
				VALIDATE_SCENE_PATIENT_COUNT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SCENE_PATIENT_COUNT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SCENE_PATIENT_COUNT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(scenePatientCount)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.SCENE_PATIENT_COUNT__SCENE_PATIENT_COUNT_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ScenePatientCountScenePatientCountValue"),
						 new Object [] { scenePatientCount }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScenePatientCountValueP(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountValueP(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCENE_PATIENT_COUNT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateScenePatientCountValueP(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScenePatientCountValueP(ScenePatientCount, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_SCENE_PATIENT_COUNT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param scenePatientCount The receiving '<em><b>Scene Patient Count</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateScenePatientCountValueP(ScenePatientCount scenePatientCount, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ScenePatientCountScenePatientCountValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_SCENE_PATIENT_COUNT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SCENE_PATIENT_COUNT);
			try {
				VALIDATE_SCENE_PATIENT_COUNT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_SCENE_PATIENT_COUNT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_SCENE_PATIENT_COUNT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(scenePatientCount)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.SCENE_PATIENT_COUNT__SCENE_PATIENT_COUNT_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("ScenePatientCountScenePatientCountValueP"),
						 new Object [] { scenePatientCount }));
			}
			 
			return false;
		}
		return true;
	}

} // ScenePatientCountOperations
