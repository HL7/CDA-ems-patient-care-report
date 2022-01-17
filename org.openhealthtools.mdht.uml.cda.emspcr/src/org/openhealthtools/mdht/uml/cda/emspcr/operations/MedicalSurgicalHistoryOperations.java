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

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.MedicalSurgicalHistory;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medical Surgical History</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicalSurgicalHistory#validateMedicalSurgicalHistoryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicalSurgicalHistory#validateMedicalSurgicalHistoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicalSurgicalHistory#validateMedicalSurgicalHistoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicalSurgicalHistory#validateMedicalSurgicalHistoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicalSurgicalHistory#validateMedicalSurgicalHistoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicalSurgicalHistory#validateMedicalSurgicalHistoryValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicalSurgicalHistory#validateMedicalSurgicalHistoryNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Negation Ind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicalSurgicalHistoryOperations extends ClinicalStatementOperations {
 
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
	protected MedicalSurgicalHistoryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalSurgicalHistoryTemplateId(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSurgicalHistoryTemplateId(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_SURGICAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.61' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalSurgicalHistoryTemplateId(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSurgicalHistoryTemplateId(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MEDICAL_SURGICAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalSurgicalHistory The receiving '<em><b>Medical Surgical History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicalSurgicalHistoryTemplateId(MedicalSurgicalHistory medicalSurgicalHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"MedicalSurgicalHistoryMedicalSurgicalHistoryTemplateId","null");
    
  	  
  	  
		if (VALIDATE_MEDICAL_SURGICAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICAL_SURGICAL_HISTORY);
			try {
				VALIDATE_MEDICAL_SURGICAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MEDICAL_SURGICAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MEDICAL_SURGICAL_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(medicalSurgicalHistory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.MEDICAL_SURGICAL_HISTORY__MEDICAL_SURGICAL_HISTORY_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalSurgicalHistoryMedicalSurgicalHistoryTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalSurgicalHistory, context) }),
						 new Object [] { medicalSurgicalHistory }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalSurgicalHistoryMoodCode(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSurgicalHistoryMoodCode(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_SURGICAL_HISTORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalSurgicalHistoryMoodCode(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSurgicalHistoryMoodCode(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MEDICAL_SURGICAL_HISTORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalSurgicalHistory The receiving '<em><b>Medical Surgical History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicalSurgicalHistoryMoodCode(MedicalSurgicalHistory medicalSurgicalHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"MedicalSurgicalHistoryMedicalSurgicalHistoryMoodCode","null");
    
  	  
  	  
		if (VALIDATE_MEDICAL_SURGICAL_HISTORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICAL_SURGICAL_HISTORY);
			try {
				VALIDATE_MEDICAL_SURGICAL_HISTORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MEDICAL_SURGICAL_HISTORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MEDICAL_SURGICAL_HISTORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(medicalSurgicalHistory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.MEDICAL_SURGICAL_HISTORY__MEDICAL_SURGICAL_HISTORY_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalSurgicalHistoryMedicalSurgicalHistoryMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalSurgicalHistory, context) }),
						 new Object [] { medicalSurgicalHistory }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalSurgicalHistoryCodeP(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSurgicalHistoryCodeP(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_SURGICAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalSurgicalHistoryCodeP(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSurgicalHistoryCodeP(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MEDICAL_SURGICAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalSurgicalHistory The receiving '<em><b>Medical Surgical History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicalSurgicalHistoryCodeP(MedicalSurgicalHistory medicalSurgicalHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"MedicalSurgicalHistoryMedicalSurgicalHistoryCodeP","null");
    
  	  
  	  
		if (VALIDATE_MEDICAL_SURGICAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICAL_SURGICAL_HISTORY);
			try {
				VALIDATE_MEDICAL_SURGICAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MEDICAL_SURGICAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MEDICAL_SURGICAL_HISTORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(medicalSurgicalHistory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.MEDICAL_SURGICAL_HISTORY__MEDICAL_SURGICAL_HISTORY_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalSurgicalHistoryMedicalSurgicalHistoryCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalSurgicalHistory, context) }),
						 new Object [] { medicalSurgicalHistory }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalSurgicalHistoryCode(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSurgicalHistoryCode(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_SURGICAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '68487-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalSurgicalHistoryCode(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSurgicalHistoryCode(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MEDICAL_SURGICAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalSurgicalHistory The receiving '<em><b>Medical Surgical History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicalSurgicalHistoryCode(MedicalSurgicalHistory medicalSurgicalHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"MedicalSurgicalHistoryMedicalSurgicalHistoryCode","null");
    
  	  
  	  
		if (VALIDATE_MEDICAL_SURGICAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICAL_SURGICAL_HISTORY);
			try {
				VALIDATE_MEDICAL_SURGICAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MEDICAL_SURGICAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MEDICAL_SURGICAL_HISTORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(medicalSurgicalHistory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.MEDICAL_SURGICAL_HISTORY__MEDICAL_SURGICAL_HISTORY_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalSurgicalHistoryMedicalSurgicalHistoryCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalSurgicalHistory, context) }),
						 new Object [] { medicalSurgicalHistory }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalSurgicalHistoryValue(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSurgicalHistoryValue(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_SURGICAL_HISTORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalSurgicalHistoryValue(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSurgicalHistoryValue(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MEDICAL_SURGICAL_HISTORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalSurgicalHistory The receiving '<em><b>Medical Surgical History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicalSurgicalHistoryValue(MedicalSurgicalHistory medicalSurgicalHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"MedicalSurgicalHistoryMedicalSurgicalHistoryValue","null");
    
  	  
  	  
		if (VALIDATE_MEDICAL_SURGICAL_HISTORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICAL_SURGICAL_HISTORY);
			try {
				VALIDATE_MEDICAL_SURGICAL_HISTORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MEDICAL_SURGICAL_HISTORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MEDICAL_SURGICAL_HISTORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(medicalSurgicalHistory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.MEDICAL_SURGICAL_HISTORY__MEDICAL_SURGICAL_HISTORY_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalSurgicalHistoryMedicalSurgicalHistoryValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalSurgicalHistory, context) }),
						 new Object [] { medicalSurgicalHistory }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalSurgicalHistoryValueP(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSurgicalHistoryValueP(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_SURGICAL_HISTORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalSurgicalHistoryValueP(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSurgicalHistoryValueP(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MEDICAL_SURGICAL_HISTORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalSurgicalHistory The receiving '<em><b>Medical Surgical History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicalSurgicalHistoryValueP(MedicalSurgicalHistory medicalSurgicalHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"MedicalSurgicalHistoryMedicalSurgicalHistoryValueP","null");
    
  	  
  	  
		if (VALIDATE_MEDICAL_SURGICAL_HISTORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICAL_SURGICAL_HISTORY);
			try {
				VALIDATE_MEDICAL_SURGICAL_HISTORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MEDICAL_SURGICAL_HISTORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MEDICAL_SURGICAL_HISTORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(medicalSurgicalHistory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.MEDICAL_SURGICAL_HISTORY__MEDICAL_SURGICAL_HISTORY_VALUE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalSurgicalHistoryMedicalSurgicalHistoryValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalSurgicalHistory, context) }),
						 new Object [] { medicalSurgicalHistory }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalSurgicalHistoryNegationInd(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSurgicalHistoryNegationInd(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_SURGICAL_HISTORY_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalSurgicalHistoryNegationInd(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Surgical History Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalSurgicalHistoryNegationInd(MedicalSurgicalHistory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MEDICAL_SURGICAL_HISTORY_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalSurgicalHistory The receiving '<em><b>Medical Surgical History</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMedicalSurgicalHistoryNegationInd(MedicalSurgicalHistory medicalSurgicalHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"MedicalSurgicalHistoryMedicalSurgicalHistoryNegationInd","null");
    
  	  
  	  
		if (VALIDATE_MEDICAL_SURGICAL_HISTORY_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.MEDICAL_SURGICAL_HISTORY);
			try {
				VALIDATE_MEDICAL_SURGICAL_HISTORY_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MEDICAL_SURGICAL_HISTORY_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MEDICAL_SURGICAL_HISTORY_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(medicalSurgicalHistory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.MEDICAL_SURGICAL_HISTORY__MEDICAL_SURGICAL_HISTORY_NEGATION_IND,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalSurgicalHistoryMedicalSurgicalHistoryNegationInd", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalSurgicalHistory, context) }),
						 new Object [] { medicalSurgicalHistory }));
			}
			 
			return false;
		}
		return true;
	}

} // MedicalSurgicalHistoryOperations