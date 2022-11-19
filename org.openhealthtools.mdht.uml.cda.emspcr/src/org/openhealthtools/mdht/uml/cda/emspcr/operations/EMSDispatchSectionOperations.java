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

import org.openhealthtools.mdht.uml.cda.emspcr.DispatchReason;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Dispatch Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection#validateEMSDispatchSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection#validateEMSDispatchSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection#validateEMSDispatchSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection#validateEMSDispatchSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection#validateEMSDispatchSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection#validateEMSDispatchSectionEmergencyMedicalDispatchObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Emergency Medical Dispatch Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection#validateEMSDispatchSectionComplaintReportedByDispatch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Complaint Reported By Dispatch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection#getEmergencyMedicalDispatchObservation() <em>Get Emergency Medical Dispatch Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection#getComplaintReportedByDispatch() <em>Get Complaint Reported By Dispatch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSDispatchSectionOperations extends SectionOperations {

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
	protected EMSDispatchSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispatchSectionTemplateId(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispatchSectionTemplateId(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPATCH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.2' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispatchSectionTemplateId(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispatchSectionTemplateId(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPATCH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispatchSection The receiving '<em><b>EMS Dispatch Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSDispatchSectionTemplateId(EMSDispatchSection emsDispatchSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispatchSectionEMSDispatchSectionTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPATCH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPATCH_SECTION);
			try {
				VALIDATE_EMS_DISPATCH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPATCH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPATCH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispatchSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPATCH_SECTION__EMS_DISPATCH_SECTION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("EMSDispatchSectionEMSDispatchSectionTemplateId"),
						 new Object [] { emsDispatchSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispatchSectionCode(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispatchSectionCode(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPATCH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67660-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispatchSectionCode(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispatchSectionCode(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPATCH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispatchSection The receiving '<em><b>EMS Dispatch Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSDispatchSectionCode(EMSDispatchSection emsDispatchSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispatchSectionEMSDispatchSectionCode","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPATCH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPATCH_SECTION);
			try {
				VALIDATE_EMS_DISPATCH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPATCH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPATCH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispatchSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPATCH_SECTION__EMS_DISPATCH_SECTION_CODE,
						 EmspcrPlugin.INSTANCE.getString("EMSDispatchSectionEMSDispatchSectionCode"),
						 new Object [] { emsDispatchSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispatchSectionCodeP(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispatchSectionCodeP(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPATCH_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispatchSectionCodeP(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispatchSectionCodeP(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPATCH_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispatchSection The receiving '<em><b>EMS Dispatch Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSDispatchSectionCodeP(EMSDispatchSection emsDispatchSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispatchSectionEMSDispatchSectionCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPATCH_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPATCH_SECTION);
			try {
				VALIDATE_EMS_DISPATCH_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPATCH_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPATCH_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispatchSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPATCH_SECTION__EMS_DISPATCH_SECTION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("EMSDispatchSectionEMSDispatchSectionCodeP"),
						 new Object [] { emsDispatchSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispatchSectionTitle(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispatchSectionTitle(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPATCH_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispatchSectionTitle(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispatchSectionTitle(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPATCH_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispatchSection The receiving '<em><b>EMS Dispatch Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSDispatchSectionTitle(EMSDispatchSection emsDispatchSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispatchSectionEMSDispatchSectionTitle","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPATCH_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPATCH_SECTION);
			try {
				VALIDATE_EMS_DISPATCH_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPATCH_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPATCH_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispatchSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPATCH_SECTION__EMS_DISPATCH_SECTION_TITLE,
						 EmspcrPlugin.INSTANCE.getString("EMSDispatchSectionEMSDispatchSectionTitle"),
						 new Object [] { emsDispatchSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispatchSectionText(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispatchSectionText(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPATCH_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispatchSectionText(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispatchSectionText(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPATCH_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispatchSection The receiving '<em><b>EMS Dispatch Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSDispatchSectionText(EMSDispatchSection emsDispatchSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispatchSectionEMSDispatchSectionText","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPATCH_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPATCH_SECTION);
			try {
				VALIDATE_EMS_DISPATCH_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPATCH_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPATCH_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispatchSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPATCH_SECTION__EMS_DISPATCH_SECTION_TEXT,
						 EmspcrPlugin.INSTANCE.getString("EMSDispatchSectionEMSDispatchSectionText"),
						 new Object [] { emsDispatchSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispatchSectionEmergencyMedicalDispatchObservation(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Emergency Medical Dispatch Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispatchSectionEmergencyMedicalDispatchObservation(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPATCH_SECTION_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::EmergencyMedicalDispatchObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispatchSectionEmergencyMedicalDispatchObservation(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Emergency Medical Dispatch Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispatchSectionEmergencyMedicalDispatchObservation(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPATCH_SECTION_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispatchSection The receiving '<em><b>EMS Dispatch Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSDispatchSectionEmergencyMedicalDispatchObservation(
			EMSDispatchSection emsDispatchSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispatchSectionEMSDispatchSectionEmergencyMedicalDispatchObservation","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPATCH_SECTION_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPATCH_SECTION);
			try {
				VALIDATE_EMS_DISPATCH_SECTION_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPATCH_SECTION_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPATCH_SECTION_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispatchSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPATCH_SECTION__EMS_DISPATCH_SECTION_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("EMSDispatchSectionEMSDispatchSectionEmergencyMedicalDispatchObservation"),
						 new Object [] { emsDispatchSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispatchSectionComplaintReportedByDispatch(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Complaint Reported By Dispatch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispatchSectionComplaintReportedByDispatch(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPATCH_SECTION_COMPLAINT_REPORTED_BY_DISPATCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::DispatchReason) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispatchSectionComplaintReportedByDispatch(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Complaint Reported By Dispatch</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispatchSectionComplaintReportedByDispatch(EMSDispatchSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPATCH_SECTION_COMPLAINT_REPORTED_BY_DISPATCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispatchSection The receiving '<em><b>EMS Dispatch Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSDispatchSectionComplaintReportedByDispatch(EMSDispatchSection emsDispatchSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispatchSectionEMSDispatchSectionComplaintReportedByDispatch","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPATCH_SECTION_COMPLAINT_REPORTED_BY_DISPATCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPATCH_SECTION);
			try {
				VALIDATE_EMS_DISPATCH_SECTION_COMPLAINT_REPORTED_BY_DISPATCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPATCH_SECTION_COMPLAINT_REPORTED_BY_DISPATCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPATCH_SECTION_COMPLAINT_REPORTED_BY_DISPATCH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispatchSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPATCH_SECTION__EMS_DISPATCH_SECTION_COMPLAINT_REPORTED_BY_DISPATCH,
						 EmspcrPlugin.INSTANCE.getString("EMSDispatchSectionEMSDispatchSectionComplaintReportedByDispatch"),
						 new Object [] { emsDispatchSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEmergencyMedicalDispatchObservation(EMSDispatchSection) <em>Get Emergency Medical Dispatch Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyMedicalDispatchObservation(EMSDispatchSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::EmergencyMedicalDispatchObservation))->asSequence()->any(true).oclAsType(emspcr::EmergencyMedicalDispatchObservation)";

	/**
	 * The cached OCL query for the '{@link #getEmergencyMedicalDispatchObservation(EMSDispatchSection) <em>Get Emergency Medical Dispatch Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyMedicalDispatchObservation(EMSDispatchSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EmergencyMedicalDispatchObservation getEmergencyMedicalDispatchObservation(
			EMSDispatchSection emsDispatchSection) {
	
	
	
		if (GET_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPATCH_SECTION, EmspcrPackage.Literals.EMS_DISPATCH_SECTION.getEAllOperations().get(62));
			try {
				GET_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__EOCL_QRY = helper.createQuery(GET_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_EMERGENCY_MEDICAL_DISPATCH_OBSERVATION__EOCL_QRY);
		return (EmergencyMedicalDispatchObservation) query.evaluate(emsDispatchSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComplaintReportedByDispatch(EMSDispatchSection) <em>Get Complaint Reported By Dispatch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplaintReportedByDispatch(EMSDispatchSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMPLAINT_REPORTED_BY_DISPATCH__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::DispatchReason))->asSequence()->any(true).oclAsType(emspcr::DispatchReason)";

	/**
	 * The cached OCL query for the '{@link #getComplaintReportedByDispatch(EMSDispatchSection) <em>Get Complaint Reported By Dispatch</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplaintReportedByDispatch(EMSDispatchSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMPLAINT_REPORTED_BY_DISPATCH__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static DispatchReason getComplaintReportedByDispatch(EMSDispatchSection emsDispatchSection) {
	
	
	
		if (GET_COMPLAINT_REPORTED_BY_DISPATCH__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPATCH_SECTION, EmspcrPackage.Literals.EMS_DISPATCH_SECTION.getEAllOperations().get(63));
			try {
				GET_COMPLAINT_REPORTED_BY_DISPATCH__EOCL_QRY = helper.createQuery(GET_COMPLAINT_REPORTED_BY_DISPATCH__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_COMPLAINT_REPORTED_BY_DISPATCH__EOCL_QRY);
		return (DispatchReason) query.evaluate(emsDispatchSection);
	}

} // EMSDispatchSectionOperations
