/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.mdht.uml.cda.operations.SectionOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfConditionOrSurgery;
import org.openhealthtools.mdht.uml.cda.emspcr.MedicalSurgicalHistory;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Past Medical History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#validateEMSPastMedicalHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#validateEMSPastMedicalHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#validateEMSPastMedicalHistorySectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#validateEMSPastMedicalHistorySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#validateEMSPastMedicalHistorySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#validateEMSPastMedicalHistorySectionExistenceOfHistoryOfCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Existence Of History Of Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#validateEMSPastMedicalHistorySectionHistoryOfCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section History Of Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#getExistenceOfHistoryOfCondition() <em>Get Existence Of History Of Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#getHistoryOfConditions() <em>Get History Of Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSPastMedicalHistorySectionOperations extends SectionOperations {
 
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
	protected EMSPastMedicalHistorySectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPastMedicalHistorySectionTemplateId(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPastMedicalHistorySectionTemplateId(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.19' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPastMedicalHistorySectionTemplateId(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPastMedicalHistorySectionTemplateId(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPastMedicalHistorySection The receiving '<em><b>EMS Past Medical History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSPastMedicalHistorySectionTemplateId(EMSPastMedicalHistorySection emsPastMedicalHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSPastMedicalHistorySectionEMSPastMedicalHistorySectionTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PAST_MEDICAL_HISTORY_SECTION);
			try {
				VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsPastMedicalHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_PAST_MEDICAL_HISTORY_SECTION__EMS_PAST_MEDICAL_HISTORY_SECTION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("EMSPastMedicalHistorySectionEMSPastMedicalHistorySectionTemplateId"),
						 new Object [] { emsPastMedicalHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPastMedicalHistorySectionCode(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPastMedicalHistorySectionCode(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67842-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPastMedicalHistorySectionCode(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPastMedicalHistorySectionCode(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPastMedicalHistorySection The receiving '<em><b>EMS Past Medical History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSPastMedicalHistorySectionCode(EMSPastMedicalHistorySection emsPastMedicalHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSPastMedicalHistorySectionEMSPastMedicalHistorySectionCode","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PAST_MEDICAL_HISTORY_SECTION);
			try {
				VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsPastMedicalHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_PAST_MEDICAL_HISTORY_SECTION__EMS_PAST_MEDICAL_HISTORY_SECTION_CODE,
						 EmspcrPlugin.INSTANCE.getString("EMSPastMedicalHistorySectionEMSPastMedicalHistorySectionCode"),
						 new Object [] { emsPastMedicalHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPastMedicalHistorySectionCodeP(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPastMedicalHistorySectionCodeP(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPastMedicalHistorySectionCodeP(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPastMedicalHistorySectionCodeP(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPastMedicalHistorySection The receiving '<em><b>EMS Past Medical History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSPastMedicalHistorySectionCodeP(EMSPastMedicalHistorySection emsPastMedicalHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSPastMedicalHistorySectionEMSPastMedicalHistorySectionCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PAST_MEDICAL_HISTORY_SECTION);
			try {
				VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsPastMedicalHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_PAST_MEDICAL_HISTORY_SECTION__EMS_PAST_MEDICAL_HISTORY_SECTION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("EMSPastMedicalHistorySectionEMSPastMedicalHistorySectionCodeP"),
						 new Object [] { emsPastMedicalHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPastMedicalHistorySectionTitle(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPastMedicalHistorySectionTitle(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPastMedicalHistorySectionTitle(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPastMedicalHistorySectionTitle(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPastMedicalHistorySection The receiving '<em><b>EMS Past Medical History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSPastMedicalHistorySectionTitle(EMSPastMedicalHistorySection emsPastMedicalHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSPastMedicalHistorySectionEMSPastMedicalHistorySectionTitle","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PAST_MEDICAL_HISTORY_SECTION);
			try {
				VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsPastMedicalHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_PAST_MEDICAL_HISTORY_SECTION__EMS_PAST_MEDICAL_HISTORY_SECTION_TITLE,
						 EmspcrPlugin.INSTANCE.getString("EMSPastMedicalHistorySectionEMSPastMedicalHistorySectionTitle"),
						 new Object [] { emsPastMedicalHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPastMedicalHistorySectionText(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPastMedicalHistorySectionText(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPastMedicalHistorySectionText(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPastMedicalHistorySectionText(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPastMedicalHistorySection The receiving '<em><b>EMS Past Medical History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSPastMedicalHistorySectionText(EMSPastMedicalHistorySection emsPastMedicalHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSPastMedicalHistorySectionEMSPastMedicalHistorySectionText","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PAST_MEDICAL_HISTORY_SECTION);
			try {
				VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsPastMedicalHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_PAST_MEDICAL_HISTORY_SECTION__EMS_PAST_MEDICAL_HISTORY_SECTION_TEXT,
						 EmspcrPlugin.INSTANCE.getString("EMSPastMedicalHistorySectionEMSPastMedicalHistorySectionText"),
						 new Object [] { emsPastMedicalHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPastMedicalHistorySectionExistenceOfHistoryOfCondition(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Existence Of History Of Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPastMedicalHistorySectionExistenceOfHistoryOfCondition(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_EXISTENCE_OF_HISTORY_OF_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::ExistenceOfHistoryOfConditionOrSurgery) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPastMedicalHistorySectionExistenceOfHistoryOfCondition(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Existence Of History Of Condition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPastMedicalHistorySectionExistenceOfHistoryOfCondition(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_EXISTENCE_OF_HISTORY_OF_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPastMedicalHistorySection The receiving '<em><b>EMS Past Medical History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSPastMedicalHistorySectionExistenceOfHistoryOfCondition(EMSPastMedicalHistorySection emsPastMedicalHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSPastMedicalHistorySectionEMSPastMedicalHistorySectionExistenceOfHistoryOfCondition","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_EXISTENCE_OF_HISTORY_OF_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PAST_MEDICAL_HISTORY_SECTION);
			try {
				VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_EXISTENCE_OF_HISTORY_OF_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_EXISTENCE_OF_HISTORY_OF_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_EXISTENCE_OF_HISTORY_OF_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsPastMedicalHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_PAST_MEDICAL_HISTORY_SECTION__EMS_PAST_MEDICAL_HISTORY_SECTION_EXISTENCE_OF_HISTORY_OF_CONDITION,
						 EmspcrPlugin.INSTANCE.getString("EMSPastMedicalHistorySectionEMSPastMedicalHistorySectionExistenceOfHistoryOfCondition"),
						 new Object [] { emsPastMedicalHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPastMedicalHistorySectionHistoryOfCondition(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section History Of Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPastMedicalHistorySectionHistoryOfCondition(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_HISTORY_OF_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::MedicalSurgicalHistory) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPastMedicalHistorySectionHistoryOfCondition(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section History Of Condition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPastMedicalHistorySectionHistoryOfCondition(EMSPastMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_HISTORY_OF_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPastMedicalHistorySection The receiving '<em><b>EMS Past Medical History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSPastMedicalHistorySectionHistoryOfCondition(EMSPastMedicalHistorySection emsPastMedicalHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSPastMedicalHistorySectionEMSPastMedicalHistorySectionHistoryOfCondition","INFO");
    
  	  
  	  
		if (VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_HISTORY_OF_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PAST_MEDICAL_HISTORY_SECTION);
			try {
				VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_HISTORY_OF_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_HISTORY_OF_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_HISTORY_OF_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsPastMedicalHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_PAST_MEDICAL_HISTORY_SECTION__EMS_PAST_MEDICAL_HISTORY_SECTION_HISTORY_OF_CONDITION,
						 EmspcrPlugin.INSTANCE.getString("EMSPastMedicalHistorySectionEMSPastMedicalHistorySectionHistoryOfCondition"),
						 new Object [] { emsPastMedicalHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getExistenceOfHistoryOfCondition(EMSPastMedicalHistorySection) <em>Get Existence Of History Of Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistenceOfHistoryOfCondition(EMSPastMedicalHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EXISTENCE_OF_HISTORY_OF_CONDITION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ExistenceOfHistoryOfConditionOrSurgery))->asSequence()->any(true).oclAsType(emspcr::ExistenceOfHistoryOfConditionOrSurgery)";

	/**
	 * The cached OCL query for the '{@link #getExistenceOfHistoryOfCondition(EMSPastMedicalHistorySection) <em>Get Existence Of History Of Condition</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistenceOfHistoryOfCondition(EMSPastMedicalHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EXISTENCE_OF_HISTORY_OF_CONDITION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ExistenceOfHistoryOfConditionOrSurgery getExistenceOfHistoryOfCondition(EMSPastMedicalHistorySection emsPastMedicalHistorySection) {
	
	
	
		if (GET_EXISTENCE_OF_HISTORY_OF_CONDITION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_PAST_MEDICAL_HISTORY_SECTION, EmspcrPackage.Literals.EMS_PAST_MEDICAL_HISTORY_SECTION.getEAllOperations().get(62));
			try {
				GET_EXISTENCE_OF_HISTORY_OF_CONDITION__EOCL_QRY = helper.createQuery(GET_EXISTENCE_OF_HISTORY_OF_CONDITION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_EXISTENCE_OF_HISTORY_OF_CONDITION__EOCL_QRY);
		return (ExistenceOfHistoryOfConditionOrSurgery) query.evaluate(emsPastMedicalHistorySection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfConditions(EMSPastMedicalHistorySection) <em>Get History Of Conditions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfConditions(EMSPastMedicalHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_CONDITIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::MedicalSurgicalHistory)).oclAsType(emspcr::MedicalSurgicalHistory)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfConditions(EMSPastMedicalHistorySection) <em>Get History Of Conditions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfConditions(EMSPastMedicalHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_CONDITIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<MedicalSurgicalHistory> getHistoryOfConditions(EMSPastMedicalHistorySection emsPastMedicalHistorySection) {
	
	
	
		if (GET_HISTORY_OF_CONDITIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_PAST_MEDICAL_HISTORY_SECTION, EmspcrPackage.Literals.EMS_PAST_MEDICAL_HISTORY_SECTION.getEAllOperations().get(63));
			try {
				GET_HISTORY_OF_CONDITIONS__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_CONDITIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_HISTORY_OF_CONDITIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MedicalSurgicalHistory> result = (Collection<MedicalSurgicalHistory>) query.evaluate(emsPastMedicalHistorySection);
		return new BasicEList.UnmodifiableEList<MedicalSurgicalHistory>(result.size(), result.toArray());
	}

} // EMSPastMedicalHistorySectionOperations