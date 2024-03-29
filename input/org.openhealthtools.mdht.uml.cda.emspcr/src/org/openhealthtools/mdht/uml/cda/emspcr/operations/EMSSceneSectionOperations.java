/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.mdht.uml.cda.operations.SectionOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicator;
import org.openhealthtools.mdht.uml.cda.emspcr.LocationTypeObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicator;
import org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Scene Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionFirstUnitIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section First Unit Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionScenePatientCount(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Scene Patient Count</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionMassCasualtyIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Mass Casualty Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionLocationTypeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Location Type Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#getFirstUnitIndicator() <em>Get First Unit Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#getScenePatientCount() <em>Get Scene Patient Count</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#getMassCasualtyIndicator() <em>Get Mass Casualty Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#getLocationTypeObservation() <em>Get Location Type Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSSceneSectionOperations extends SectionOperations {

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
	protected EMSSceneSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSceneSectionTemplateId(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSceneSectionTemplateId(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SCENE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.8' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSceneSectionTemplateId(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSceneSectionTemplateId(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_SCENE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSceneSection The receiving '<em><b>EMS Scene Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSceneSectionTemplateId(EMSSceneSection emsSceneSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSSceneSectionEMSSceneSectionTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_SCENE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SCENE_SECTION);
			try {
				VALIDATE_EMS_SCENE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_SCENE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_SCENE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsSceneSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_SCENE_SECTION__EMS_SCENE_SECTION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("EMSSceneSectionEMSSceneSectionTemplateId"),
						 new Object [] { emsSceneSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSceneSectionCode(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSceneSectionCode(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SCENE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67665-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSceneSectionCode(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSceneSectionCode(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_SCENE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSceneSection The receiving '<em><b>EMS Scene Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSceneSectionCode(EMSSceneSection emsSceneSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSSceneSectionEMSSceneSectionCode","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_SCENE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SCENE_SECTION);
			try {
				VALIDATE_EMS_SCENE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_SCENE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_SCENE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsSceneSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_SCENE_SECTION__EMS_SCENE_SECTION_CODE,
						 EmspcrPlugin.INSTANCE.getString("EMSSceneSectionEMSSceneSectionCode"),
						 new Object [] { emsSceneSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSceneSectionCodeP(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSceneSectionCodeP(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SCENE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSceneSectionCodeP(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSceneSectionCodeP(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_SCENE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSceneSection The receiving '<em><b>EMS Scene Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSceneSectionCodeP(EMSSceneSection emsSceneSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSSceneSectionEMSSceneSectionCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_SCENE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SCENE_SECTION);
			try {
				VALIDATE_EMS_SCENE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_SCENE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_SCENE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsSceneSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_SCENE_SECTION__EMS_SCENE_SECTION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("EMSSceneSectionEMSSceneSectionCodeP"),
						 new Object [] { emsSceneSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSceneSectionTitle(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSceneSectionTitle(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SCENE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSceneSectionTitle(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSceneSectionTitle(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_SCENE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSceneSection The receiving '<em><b>EMS Scene Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSceneSectionTitle(EMSSceneSection emsSceneSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSSceneSectionEMSSceneSectionTitle","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_SCENE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SCENE_SECTION);
			try {
				VALIDATE_EMS_SCENE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_SCENE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_SCENE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsSceneSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_SCENE_SECTION__EMS_SCENE_SECTION_TITLE,
						 EmspcrPlugin.INSTANCE.getString("EMSSceneSectionEMSSceneSectionTitle"),
						 new Object [] { emsSceneSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSceneSectionText(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSceneSectionText(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SCENE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSceneSectionText(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSceneSectionText(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_SCENE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSceneSection The receiving '<em><b>EMS Scene Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSceneSectionText(EMSSceneSection emsSceneSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSSceneSectionEMSSceneSectionText","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_SCENE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SCENE_SECTION);
			try {
				VALIDATE_EMS_SCENE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_SCENE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_SCENE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsSceneSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_SCENE_SECTION__EMS_SCENE_SECTION_TEXT,
						 EmspcrPlugin.INSTANCE.getString("EMSSceneSectionEMSSceneSectionText"),
						 new Object [] { emsSceneSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSceneSectionFirstUnitIndicator(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section First Unit Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSceneSectionFirstUnitIndicator(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SCENE_SECTION_FIRST_UNIT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::FirstUnitIndicator) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSceneSectionFirstUnitIndicator(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section First Unit Indicator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSceneSectionFirstUnitIndicator(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_SCENE_SECTION_FIRST_UNIT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSceneSection The receiving '<em><b>EMS Scene Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSceneSectionFirstUnitIndicator(EMSSceneSection emsSceneSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSSceneSectionEMSSceneSectionFirstUnitIndicator","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_SCENE_SECTION_FIRST_UNIT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SCENE_SECTION);
			try {
				VALIDATE_EMS_SCENE_SECTION_FIRST_UNIT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_SCENE_SECTION_FIRST_UNIT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_SCENE_SECTION_FIRST_UNIT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsSceneSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_SCENE_SECTION__EMS_SCENE_SECTION_FIRST_UNIT_INDICATOR,
						 EmspcrPlugin.INSTANCE.getString("EMSSceneSectionEMSSceneSectionFirstUnitIndicator"),
						 new Object [] { emsSceneSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSceneSectionScenePatientCount(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Scene Patient Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSceneSectionScenePatientCount(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SCENE_SECTION_SCENE_PATIENT_COUNT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::ScenePatientCount) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSceneSectionScenePatientCount(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Scene Patient Count</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSceneSectionScenePatientCount(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_SCENE_SECTION_SCENE_PATIENT_COUNT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSceneSection The receiving '<em><b>EMS Scene Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSceneSectionScenePatientCount(EMSSceneSection emsSceneSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSSceneSectionEMSSceneSectionScenePatientCount","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_SCENE_SECTION_SCENE_PATIENT_COUNT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SCENE_SECTION);
			try {
				VALIDATE_EMS_SCENE_SECTION_SCENE_PATIENT_COUNT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_SCENE_SECTION_SCENE_PATIENT_COUNT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_SCENE_SECTION_SCENE_PATIENT_COUNT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsSceneSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_SCENE_SECTION__EMS_SCENE_SECTION_SCENE_PATIENT_COUNT,
						 EmspcrPlugin.INSTANCE.getString("EMSSceneSectionEMSSceneSectionScenePatientCount"),
						 new Object [] { emsSceneSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSceneSectionMassCasualtyIndicator(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Mass Casualty Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSceneSectionMassCasualtyIndicator(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SCENE_SECTION_MASS_CASUALTY_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::MassCasualtyIndicator) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSceneSectionMassCasualtyIndicator(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Mass Casualty Indicator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSceneSectionMassCasualtyIndicator(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_SCENE_SECTION_MASS_CASUALTY_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSceneSection The receiving '<em><b>EMS Scene Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSceneSectionMassCasualtyIndicator(EMSSceneSection emsSceneSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSSceneSectionEMSSceneSectionMassCasualtyIndicator","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_SCENE_SECTION_MASS_CASUALTY_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SCENE_SECTION);
			try {
				VALIDATE_EMS_SCENE_SECTION_MASS_CASUALTY_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_SCENE_SECTION_MASS_CASUALTY_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_SCENE_SECTION_MASS_CASUALTY_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsSceneSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_SCENE_SECTION__EMS_SCENE_SECTION_MASS_CASUALTY_INDICATOR,
						 EmspcrPlugin.INSTANCE.getString("EMSSceneSectionEMSSceneSectionMassCasualtyIndicator"),
						 new Object [] { emsSceneSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSceneSectionLocationTypeObservation(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Location Type Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSceneSectionLocationTypeObservation(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SCENE_SECTION_LOCATION_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::LocationTypeObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSceneSectionLocationTypeObservation(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Location Type Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSceneSectionLocationTypeObservation(EMSSceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_SCENE_SECTION_LOCATION_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSceneSection The receiving '<em><b>EMS Scene Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSceneSectionLocationTypeObservation(EMSSceneSection emsSceneSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSSceneSectionEMSSceneSectionLocationTypeObservation","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_SCENE_SECTION_LOCATION_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SCENE_SECTION);
			try {
				VALIDATE_EMS_SCENE_SECTION_LOCATION_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_SCENE_SECTION_LOCATION_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_SCENE_SECTION_LOCATION_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsSceneSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_SCENE_SECTION__EMS_SCENE_SECTION_LOCATION_TYPE_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("EMSSceneSectionEMSSceneSectionLocationTypeObservation"),
						 new Object [] { emsSceneSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getFirstUnitIndicator(EMSSceneSection) <em>Get First Unit Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstUnitIndicator(EMSSceneSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FIRST_UNIT_INDICATOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::FirstUnitIndicator))->asSequence()->any(true).oclAsType(emspcr::FirstUnitIndicator)";

	/**
	 * The cached OCL query for the '{@link #getFirstUnitIndicator(EMSSceneSection) <em>Get First Unit Indicator</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstUnitIndicator(EMSSceneSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FIRST_UNIT_INDICATOR__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FirstUnitIndicator getFirstUnitIndicator(EMSSceneSection emsSceneSection) {
	
	
	
		if (GET_FIRST_UNIT_INDICATOR__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_SCENE_SECTION, EmspcrPackage.Literals.EMS_SCENE_SECTION.getEAllOperations().get(64));
			try {
				GET_FIRST_UNIT_INDICATOR__EOCL_QRY = helper.createQuery(GET_FIRST_UNIT_INDICATOR__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_FIRST_UNIT_INDICATOR__EOCL_QRY);
		return (FirstUnitIndicator) query.evaluate(emsSceneSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getScenePatientCount(EMSSceneSection) <em>Get Scene Patient Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenePatientCount(EMSSceneSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SCENE_PATIENT_COUNT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ScenePatientCount))->asSequence()->any(true).oclAsType(emspcr::ScenePatientCount)";

	/**
	 * The cached OCL query for the '{@link #getScenePatientCount(EMSSceneSection) <em>Get Scene Patient Count</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenePatientCount(EMSSceneSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SCENE_PATIENT_COUNT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ScenePatientCount getScenePatientCount(EMSSceneSection emsSceneSection) {
	
	
	
		if (GET_SCENE_PATIENT_COUNT__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_SCENE_SECTION, EmspcrPackage.Literals.EMS_SCENE_SECTION.getEAllOperations().get(65));
			try {
				GET_SCENE_PATIENT_COUNT__EOCL_QRY = helper.createQuery(GET_SCENE_PATIENT_COUNT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_SCENE_PATIENT_COUNT__EOCL_QRY);
		return (ScenePatientCount) query.evaluate(emsSceneSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMassCasualtyIndicator(EMSSceneSection) <em>Get Mass Casualty Indicator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassCasualtyIndicator(EMSSceneSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MASS_CASUALTY_INDICATOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::MassCasualtyIndicator))->asSequence()->any(true).oclAsType(emspcr::MassCasualtyIndicator)";

	/**
	 * The cached OCL query for the '{@link #getMassCasualtyIndicator(EMSSceneSection) <em>Get Mass Casualty Indicator</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassCasualtyIndicator(EMSSceneSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MASS_CASUALTY_INDICATOR__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MassCasualtyIndicator getMassCasualtyIndicator(EMSSceneSection emsSceneSection) {
	
	
	
		if (GET_MASS_CASUALTY_INDICATOR__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_SCENE_SECTION, EmspcrPackage.Literals.EMS_SCENE_SECTION.getEAllOperations().get(66));
			try {
				GET_MASS_CASUALTY_INDICATOR__EOCL_QRY = helper.createQuery(GET_MASS_CASUALTY_INDICATOR__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_MASS_CASUALTY_INDICATOR__EOCL_QRY);
		return (MassCasualtyIndicator) query.evaluate(emsSceneSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getLocationTypeObservation(EMSSceneSection) <em>Get Location Type Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationTypeObservation(EMSSceneSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LOCATION_TYPE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::LocationTypeObservation))->asSequence()->any(true).oclAsType(emspcr::LocationTypeObservation)";

	/**
	 * The cached OCL query for the '{@link #getLocationTypeObservation(EMSSceneSection) <em>Get Location Type Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationTypeObservation(EMSSceneSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LOCATION_TYPE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static LocationTypeObservation getLocationTypeObservation(EMSSceneSection emsSceneSection) {
	
	
	
		if (GET_LOCATION_TYPE_OBSERVATION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_SCENE_SECTION, EmspcrPackage.Literals.EMS_SCENE_SECTION.getEAllOperations().get(67));
			try {
				GET_LOCATION_TYPE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_LOCATION_TYPE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_LOCATION_TYPE_OBSERVATION__EOCL_QRY);
		return (LocationTypeObservation) query.evaluate(emsSceneSection);
	}

} // EMSSceneSectionOperations
