/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.AbdomenAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Abdomen Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbdomenAssessment#validateAbdomenAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbdomenAssessment#validateAbdomenAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbdomenAssessment#validateAbdomenAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbdomenAssessment#validateAbdomenAssessmentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbdomenAssessment#validateAbdomenAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbdomenAssessment#validateAbdomenAssessmentValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbdomenAssessment#validateAbdomenAssessmentTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbdomenAssessment#validateAbdomenAssessmentTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Target Site Code P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbdomenAssessmentOperations extends ClinicalStatementOperations {

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
	protected AbdomenAssessmentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbdomenAssessmentTemplateId(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbdomenAssessmentTemplateId(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABDOMEN_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.117' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateAbdomenAssessmentTemplateId(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbdomenAssessmentTemplateId(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_ABDOMEN_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abdomenAssessment The receiving '<em><b>Abdomen Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAbdomenAssessmentTemplateId(AbdomenAssessment abdomenAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"AbdomenAssessmentAbdomenAssessmentTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_ABDOMEN_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ABDOMEN_ASSESSMENT);
			try {
				VALIDATE_ABDOMEN_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ABDOMEN_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ABDOMEN_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(abdomenAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ABDOMEN_ASSESSMENT__ABDOMEN_ASSESSMENT_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("AbdomenAssessmentAbdomenAssessmentTemplateId"),
						 new Object [] { abdomenAssessment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbdomenAssessmentMoodCode(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbdomenAssessmentMoodCode(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABDOMEN_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAbdomenAssessmentMoodCode(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbdomenAssessmentMoodCode(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_ABDOMEN_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abdomenAssessment The receiving '<em><b>Abdomen Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAbdomenAssessmentMoodCode(AbdomenAssessment abdomenAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"AbdomenAssessmentAbdomenAssessmentMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_ABDOMEN_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ABDOMEN_ASSESSMENT);
			try {
				VALIDATE_ABDOMEN_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ABDOMEN_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ABDOMEN_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(abdomenAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ABDOMEN_ASSESSMENT__ABDOMEN_ASSESSMENT_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("AbdomenAssessmentAbdomenAssessmentMoodCode"),
						 new Object [] { abdomenAssessment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbdomenAssessmentCode(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbdomenAssessmentCode(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABDOMEN_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67530-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAbdomenAssessmentCode(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbdomenAssessmentCode(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_ABDOMEN_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abdomenAssessment The receiving '<em><b>Abdomen Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAbdomenAssessmentCode(AbdomenAssessment abdomenAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"AbdomenAssessmentAbdomenAssessmentCode","ERROR");
    
  	  
  	  
		if (VALIDATE_ABDOMEN_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ABDOMEN_ASSESSMENT);
			try {
				VALIDATE_ABDOMEN_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ABDOMEN_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ABDOMEN_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(abdomenAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ABDOMEN_ASSESSMENT__ABDOMEN_ASSESSMENT_CODE,
						 EmspcrPlugin.INSTANCE.getString("AbdomenAssessmentAbdomenAssessmentCode"),
						 new Object [] { abdomenAssessment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbdomenAssessmentEffectiveTime(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbdomenAssessmentEffectiveTime(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABDOMEN_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAbdomenAssessmentEffectiveTime(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbdomenAssessmentEffectiveTime(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_ABDOMEN_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abdomenAssessment The receiving '<em><b>Abdomen Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAbdomenAssessmentEffectiveTime(AbdomenAssessment abdomenAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"AbdomenAssessmentAbdomenAssessmentEffectiveTime","ERROR");
    
  	  
  	  
		if (VALIDATE_ABDOMEN_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ABDOMEN_ASSESSMENT);
			try {
				VALIDATE_ABDOMEN_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ABDOMEN_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ABDOMEN_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(abdomenAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ABDOMEN_ASSESSMENT__ABDOMEN_ASSESSMENT_EFFECTIVE_TIME,
						 EmspcrPlugin.INSTANCE.getString("AbdomenAssessmentAbdomenAssessmentEffectiveTime"),
						 new Object [] { abdomenAssessment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbdomenAssessmentValue(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbdomenAssessmentValue(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABDOMEN_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17208-2' or value.code = 'LA17209-0' or value.code = 'LA17213-2' or value.code = 'LA17214-0' or value.code = 'LA17242-1' or value.code = 'LA17243-9' or value.code = 'LA17212-4' or value.code = 'LA17246-2' or value.code = 'LA17247-0' or value.code = 'LA17709-9' or value.code = 'LA18220-6' or value.code = 'LA18221-4' or value.code = 'LA18222-2' or value.code = 'LA18223-0' or value.code = 'LA18224-8' or value.code = 'LA18226-3' or value.code = 'LA18247-9' or value.code = 'LA18248-7' or value.code = 'LA6626-1' or value.code = 'LA7410-9' or value.code = 'LA7452-1' or value.code = 'LA7460-4' or value.code = 'LA23814-9' or value.code = 'LA23815-6' or value.code = 'LA17229-8' or value.code = 'LA22440-4' or value.code = 'LA7423-2' or value.code = 'LA18225-5')))";

	/**
	 * The cached OCL invariant for the '{@link #validateAbdomenAssessmentValue(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbdomenAssessmentValue(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_ABDOMEN_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abdomenAssessment The receiving '<em><b>Abdomen Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAbdomenAssessmentValue(AbdomenAssessment abdomenAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"AbdomenAssessmentAbdomenAssessmentValue","ERROR");
    
  	  
  	  
		if (VALIDATE_ABDOMEN_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ABDOMEN_ASSESSMENT);
			try {
				VALIDATE_ABDOMEN_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ABDOMEN_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ABDOMEN_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(abdomenAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ABDOMEN_ASSESSMENT__ABDOMEN_ASSESSMENT_VALUE,
						 EmspcrPlugin.INSTANCE.getString("AbdomenAssessmentAbdomenAssessmentValue"),
						 new Object [] { abdomenAssessment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbdomenAssessmentValueP(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbdomenAssessmentValueP(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABDOMEN_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAbdomenAssessmentValueP(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbdomenAssessmentValueP(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_ABDOMEN_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abdomenAssessment The receiving '<em><b>Abdomen Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAbdomenAssessmentValueP(AbdomenAssessment abdomenAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"AbdomenAssessmentAbdomenAssessmentValueP","WARNING");
    
  	  
  	  
		if (VALIDATE_ABDOMEN_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ABDOMEN_ASSESSMENT);
			try {
				VALIDATE_ABDOMEN_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ABDOMEN_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ABDOMEN_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(abdomenAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ABDOMEN_ASSESSMENT__ABDOMEN_ASSESSMENT_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("AbdomenAssessmentAbdomenAssessmentValueP"),
						 new Object [] { abdomenAssessment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbdomenAssessmentTargetSiteCode(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbdomenAssessmentTargetSiteCode(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABDOMEN_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA12698-9' or value.code = 'LA18721-3' or value.code = 'LA18722-1' or value.code = 'LA18723-9' or value.code = 'LA18724-7' or value.code = 'LA18725-4' or value.code = 'LA23813-1')))";

	/**
	 * The cached OCL invariant for the '{@link #validateAbdomenAssessmentTargetSiteCode(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbdomenAssessmentTargetSiteCode(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_ABDOMEN_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abdomenAssessment The receiving '<em><b>Abdomen Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAbdomenAssessmentTargetSiteCode(AbdomenAssessment abdomenAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"AbdomenAssessmentAbdomenAssessmentTargetSiteCode","ERROR");
    
  	  
  	  
		if (VALIDATE_ABDOMEN_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ABDOMEN_ASSESSMENT);
			try {
				VALIDATE_ABDOMEN_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ABDOMEN_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ABDOMEN_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(abdomenAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ABDOMEN_ASSESSMENT__ABDOMEN_ASSESSMENT_TARGET_SITE_CODE,
						 EmspcrPlugin.INSTANCE.getString("AbdomenAssessmentAbdomenAssessmentTargetSiteCode"),
						 new Object [] { abdomenAssessment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAbdomenAssessmentTargetSiteCodeP(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Target Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbdomenAssessmentTargetSiteCodeP(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ABDOMEN_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (( not self.targetSiteCode->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateAbdomenAssessmentTargetSiteCodeP(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Target Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAbdomenAssessmentTargetSiteCodeP(AbdomenAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_ABDOMEN_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param abdomenAssessment The receiving '<em><b>Abdomen Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAbdomenAssessmentTargetSiteCodeP(AbdomenAssessment abdomenAssessment,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"AbdomenAssessmentAbdomenAssessmentTargetSiteCodeP","WARNING");
    
  	  
  	  
		if (VALIDATE_ABDOMEN_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ABDOMEN_ASSESSMENT);
			try {
				VALIDATE_ABDOMEN_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ABDOMEN_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ABDOMEN_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(abdomenAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ABDOMEN_ASSESSMENT__ABDOMEN_ASSESSMENT_TARGET_SITE_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("AbdomenAssessmentAbdomenAssessmentTargetSiteCodeP"),
						 new Object [] { abdomenAssessment }));
			}
			 
			return false;
		}
		return true;
	}

} // AbdomenAssessmentOperations
