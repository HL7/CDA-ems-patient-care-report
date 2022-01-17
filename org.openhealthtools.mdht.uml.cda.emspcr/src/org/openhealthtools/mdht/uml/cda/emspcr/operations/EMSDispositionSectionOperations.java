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

import org.openhealthtools.mdht.uml.cda.emspcr.CrewDisposition;
import org.openhealthtools.mdht.uml.cda.emspcr.DestinationHospitalCapability;
import org.openhealthtools.mdht.uml.cda.emspcr.DestinationWard;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionAtDestinationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientEngagement;
import org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.TransportDisposition;
import org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.TransportModeObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitDisposition;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Disposition Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionNumberOfPatientsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Number Of Patients Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionTransportModeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Transport Mode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionTransportMethodObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Transport Method Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionReasonForChoosingDestinationObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Reason For Choosing Destination Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionPrearrivalActivationObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Prearrival Activation Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionPatientConditionChangeAtDestinationObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Patient Condition Change At Destination Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionPrimaryDestinationHospitalCapability(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Primary Destination Hospital Capability</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionDestinationWard(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Destination Ward</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionUnitDisposition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Unit Disposition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionPatientEngagement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Patient Engagement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionCrewDisposition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Crew Disposition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionTransportDisposition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Transport Disposition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getNumberOfPatientsObservation() <em>Get Number Of Patients Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getTransportModeObservation() <em>Get Transport Mode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getTransportMethodObservation() <em>Get Transport Method Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getReasonForChoosingDestinationObservation() <em>Get Reason For Choosing Destination Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getPrearrivalActivationObservations() <em>Get Prearrival Activation Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getPatientConditionChangeAtDestinationObservation() <em>Get Patient Condition Change At Destination Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getPrimaryDestinationHospitalCapability() <em>Get Primary Destination Hospital Capability</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getDestinationWard() <em>Get Destination Ward</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getUnitDisposition() <em>Get Unit Disposition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getPatientEngagement() <em>Get Patient Engagement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getCrewDisposition() <em>Get Crew Disposition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#getTransportDisposition() <em>Get Transport Disposition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSDispositionSectionOperations extends SectionOperations {
 
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
	protected EMSDispositionSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionTemplateId(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionTemplateId(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.4' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionTemplateId(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionTemplateId(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionTemplateId(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispositionSectionEMSDispositionSectionTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionTemplateId"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionCode(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionCode(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67661-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionCode(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionCode(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionCode(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispositionSectionEMSDispositionSectionCode","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_CODE,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionCode"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionCodeP(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionCodeP(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionCodeP(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionCodeP(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionCodeP(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispositionSectionEMSDispositionSectionCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionCodeP"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionTitle(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionTitle(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Disposition')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionTitle(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionTitle(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionTitle(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispositionSectionEMSDispositionSectionTitle","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_TITLE,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionTitle"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionText(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionText(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionText(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionText(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionText(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispositionSectionEMSDispositionSectionText","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_TEXT,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionText"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionNumberOfPatientsObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Number Of Patients Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionNumberOfPatientsObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::NumberOfPatientsTransportedObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionNumberOfPatientsObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Number Of Patients Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionNumberOfPatientsObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionNumberOfPatientsObservation(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispositionSectionEMSDispositionSectionNumberOfPatientsObservation","INFO");
    
  	  
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_NUMBER_OF_PATIENTS_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionNumberOfPatientsObservation"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionTransportModeObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Transport Mode Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionTransportModeObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::TransportModeObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionTransportModeObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Transport Mode Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionTransportModeObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionTransportModeObservation(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispositionSectionEMSDispositionSectionTransportModeObservation","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_TRANSPORT_MODE_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionTransportModeObservation"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionTransportMethodObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Transport Method Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionTransportMethodObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::TransportMethodObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionTransportMethodObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Transport Method Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionTransportMethodObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionTransportMethodObservation(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispositionSectionEMSDispositionSectionTransportMethodObservation","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_TRANSPORT_METHOD_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionTransportMethodObservation"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionReasonForChoosingDestinationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Reason For Choosing Destination Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionReasonForChoosingDestinationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::ReasonForChoosingDestinationObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionReasonForChoosingDestinationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Reason For Choosing Destination Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionReasonForChoosingDestinationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionReasonForChoosingDestinationObservation(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispositionSectionEMSDispositionSectionReasonForChoosingDestinationObservation","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionReasonForChoosingDestinationObservation"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionPrearrivalActivationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Prearrival Activation Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionPrearrivalActivationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PrearrivalActivationObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionPrearrivalActivationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Prearrival Activation Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionPrearrivalActivationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionPrearrivalActivationObservation(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispositionSectionEMSDispositionSectionPrearrivalActivationObservation","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_PREARRIVAL_ACTIVATION_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionPrearrivalActivationObservation"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionPatientConditionChangeAtDestinationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Patient Condition Change At Destination Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionPatientConditionChangeAtDestinationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PatientConditionAtDestinationObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionPatientConditionChangeAtDestinationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Patient Condition Change At Destination Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionPatientConditionChangeAtDestinationObservation(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionPatientConditionChangeAtDestinationObservation(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispositionSectionEMSDispositionSectionPatientConditionChangeAtDestinationObservation","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionPatientConditionChangeAtDestinationObservation"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionPrimaryDestinationHospitalCapability(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Primary Destination Hospital Capability</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionPrimaryDestinationHospitalCapability(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::DestinationHospitalCapability) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionPrimaryDestinationHospitalCapability(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Primary Destination Hospital Capability</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionPrimaryDestinationHospitalCapability(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPOSITION_SECTION_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionPrimaryDestinationHospitalCapability(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispositionSectionEMSDispositionSectionPrimaryDestinationHospitalCapability","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPOSITION_SECTION_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionPrimaryDestinationHospitalCapability"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionDestinationWard(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Destination Ward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionDestinationWard(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_DESTINATION_WARD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::DestinationWard) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionDestinationWard(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Destination Ward</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionDestinationWard(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPOSITION_SECTION_DESTINATION_WARD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionDestinationWard(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispositionSectionEMSDispositionSectionDestinationWard","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_DESTINATION_WARD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_DESTINATION_WARD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_DESTINATION_WARD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPOSITION_SECTION_DESTINATION_WARD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_DESTINATION_WARD,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionDestinationWard"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionUnitDisposition(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Unit Disposition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionUnitDisposition(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_UNIT_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::UnitDisposition) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionUnitDisposition(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Unit Disposition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionUnitDisposition(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPOSITION_SECTION_UNIT_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionUnitDisposition(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispositionSectionEMSDispositionSectionUnitDisposition","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_UNIT_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_UNIT_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_UNIT_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPOSITION_SECTION_UNIT_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_UNIT_DISPOSITION,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionUnitDisposition"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionPatientEngagement(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Patient Engagement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionPatientEngagement(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_PATIENT_ENGAGEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PatientEngagement) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionPatientEngagement(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Patient Engagement</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionPatientEngagement(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPOSITION_SECTION_PATIENT_ENGAGEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionPatientEngagement(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispositionSectionEMSDispositionSectionPatientEngagement","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_PATIENT_ENGAGEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_PATIENT_ENGAGEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_PATIENT_ENGAGEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPOSITION_SECTION_PATIENT_ENGAGEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_PATIENT_ENGAGEMENT,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionPatientEngagement"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionCrewDisposition(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Crew Disposition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionCrewDisposition(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_CREW_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::CrewDisposition) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionCrewDisposition(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Crew Disposition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionCrewDisposition(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPOSITION_SECTION_CREW_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionCrewDisposition(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispositionSectionEMSDispositionSectionCrewDisposition","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_CREW_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_CREW_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_CREW_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPOSITION_SECTION_CREW_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_CREW_DISPOSITION,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionCrewDisposition"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSDispositionSectionTransportDisposition(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Transport Disposition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionTransportDisposition(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::TransportDisposition) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSDispositionSectionTransportDisposition(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Transport Disposition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSDispositionSectionTransportDisposition(EMSDispositionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsDispositionSection The receiving '<em><b>EMS Disposition Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSDispositionSectionTransportDisposition(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSDispositionSectionEMSDispositionSectionTransportDisposition","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION);
			try {
				VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_DISPOSITION_SECTION_TRANSPORT_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsDispositionSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_TRANSPORT_DISPOSITION,
						 EmspcrPlugin.INSTANCE.getString("EMSDispositionSectionEMSDispositionSectionTransportDisposition"),
						 new Object [] { emsDispositionSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getNumberOfPatientsObservation(EMSDispositionSection) <em>Get Number Of Patients Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPatientsObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUMBER_OF_PATIENTS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::NumberOfPatientsTransportedObservation))->asSequence()->any(true).oclAsType(emspcr::NumberOfPatientsTransportedObservation)";

	/**
	 * The cached OCL query for the '{@link #getNumberOfPatientsObservation(EMSDispositionSection) <em>Get Number Of Patients Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPatientsObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUMBER_OF_PATIENTS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  NumberOfPatientsTransportedObservation getNumberOfPatientsObservation(EMSDispositionSection emsDispositionSection) {
	
	
	
		if (GET_NUMBER_OF_PATIENTS_OBSERVATION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION, EmspcrPackage.Literals.EMS_DISPOSITION_SECTION.getEAllOperations().get(72));
			try {
				GET_NUMBER_OF_PATIENTS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_NUMBER_OF_PATIENTS_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_NUMBER_OF_PATIENTS_OBSERVATION__EOCL_QRY);
		return (NumberOfPatientsTransportedObservation) query.evaluate(emsDispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getTransportModeObservation(EMSDispositionSection) <em>Get Transport Mode Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportModeObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TRANSPORT_MODE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::TransportModeObservation))->asSequence()->any(true).oclAsType(emspcr::TransportModeObservation)";

	/**
	 * The cached OCL query for the '{@link #getTransportModeObservation(EMSDispositionSection) <em>Get Transport Mode Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportModeObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TRANSPORT_MODE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  TransportModeObservation getTransportModeObservation(EMSDispositionSection emsDispositionSection) {
	
	
	
		if (GET_TRANSPORT_MODE_OBSERVATION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION, EmspcrPackage.Literals.EMS_DISPOSITION_SECTION.getEAllOperations().get(73));
			try {
				GET_TRANSPORT_MODE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_TRANSPORT_MODE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_TRANSPORT_MODE_OBSERVATION__EOCL_QRY);
		return (TransportModeObservation) query.evaluate(emsDispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getTransportMethodObservation(EMSDispositionSection) <em>Get Transport Method Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportMethodObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TRANSPORT_METHOD_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::TransportMethodObservation))->asSequence()->any(true).oclAsType(emspcr::TransportMethodObservation)";

	/**
	 * The cached OCL query for the '{@link #getTransportMethodObservation(EMSDispositionSection) <em>Get Transport Method Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportMethodObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TRANSPORT_METHOD_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  TransportMethodObservation getTransportMethodObservation(EMSDispositionSection emsDispositionSection) {
	
	
	
		if (GET_TRANSPORT_METHOD_OBSERVATION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION, EmspcrPackage.Literals.EMS_DISPOSITION_SECTION.getEAllOperations().get(74));
			try {
				GET_TRANSPORT_METHOD_OBSERVATION__EOCL_QRY = helper.createQuery(GET_TRANSPORT_METHOD_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_TRANSPORT_METHOD_OBSERVATION__EOCL_QRY);
		return (TransportMethodObservation) query.evaluate(emsDispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReasonForChoosingDestinationObservation(EMSDispositionSection) <em>Get Reason For Choosing Destination Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForChoosingDestinationObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ReasonForChoosingDestinationObservation))->asSequence()->any(true).oclAsType(emspcr::ReasonForChoosingDestinationObservation)";

	/**
	 * The cached OCL query for the '{@link #getReasonForChoosingDestinationObservation(EMSDispositionSection) <em>Get Reason For Choosing Destination Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForChoosingDestinationObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ReasonForChoosingDestinationObservation getReasonForChoosingDestinationObservation(EMSDispositionSection emsDispositionSection) {
	
	
	
		if (GET_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION, EmspcrPackage.Literals.EMS_DISPOSITION_SECTION.getEAllOperations().get(75));
			try {
				GET_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__EOCL_QRY = helper.createQuery(GET_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION__EOCL_QRY);
		return (ReasonForChoosingDestinationObservation) query.evaluate(emsDispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPrearrivalActivationObservations(EMSDispositionSection) <em>Get Prearrival Activation Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrearrivalActivationObservations(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PREARRIVAL_ACTIVATION_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PrearrivalActivationObservation)).oclAsType(emspcr::PrearrivalActivationObservation)";

	/**
	 * The cached OCL query for the '{@link #getPrearrivalActivationObservations(EMSDispositionSection) <em>Get Prearrival Activation Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrearrivalActivationObservations(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PREARRIVAL_ACTIVATION_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<PrearrivalActivationObservation> getPrearrivalActivationObservations(EMSDispositionSection emsDispositionSection) {
	
	
	
		if (GET_PREARRIVAL_ACTIVATION_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION, EmspcrPackage.Literals.EMS_DISPOSITION_SECTION.getEAllOperations().get(76));
			try {
				GET_PREARRIVAL_ACTIVATION_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_PREARRIVAL_ACTIVATION_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PREARRIVAL_ACTIVATION_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PrearrivalActivationObservation> result = (Collection<PrearrivalActivationObservation>) query.evaluate(emsDispositionSection);
		return new BasicEList.UnmodifiableEList<PrearrivalActivationObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientConditionChangeAtDestinationObservation(EMSDispositionSection) <em>Get Patient Condition Change At Destination Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientConditionChangeAtDestinationObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PatientConditionAtDestinationObservation))->asSequence()->any(true).oclAsType(emspcr::PatientConditionAtDestinationObservation)";

	/**
	 * The cached OCL query for the '{@link #getPatientConditionChangeAtDestinationObservation(EMSDispositionSection) <em>Get Patient Condition Change At Destination Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientConditionChangeAtDestinationObservation(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PatientConditionAtDestinationObservation getPatientConditionChangeAtDestinationObservation(EMSDispositionSection emsDispositionSection) {
	
	
	
		if (GET_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION, EmspcrPackage.Literals.EMS_DISPOSITION_SECTION.getEAllOperations().get(77));
			try {
				GET_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__EOCL_QRY = helper.createQuery(GET_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION__EOCL_QRY);
		return (PatientConditionAtDestinationObservation) query.evaluate(emsDispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPrimaryDestinationHospitalCapability(EMSDispositionSection) <em>Get Primary Destination Hospital Capability</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryDestinationHospitalCapability(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::DestinationHospitalCapability))->asSequence()->any(true).oclAsType(emspcr::DestinationHospitalCapability)";

	/**
	 * The cached OCL query for the '{@link #getPrimaryDestinationHospitalCapability(EMSDispositionSection) <em>Get Primary Destination Hospital Capability</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryDestinationHospitalCapability(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DestinationHospitalCapability getPrimaryDestinationHospitalCapability(EMSDispositionSection emsDispositionSection) {
	
	
	
		if (GET_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION, EmspcrPackage.Literals.EMS_DISPOSITION_SECTION.getEAllOperations().get(78));
			try {
				GET_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__EOCL_QRY = helper.createQuery(GET_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PRIMARY_DESTINATION_HOSPITAL_CAPABILITY__EOCL_QRY);
		return (DestinationHospitalCapability) query.evaluate(emsDispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDestinationWard(EMSDispositionSection) <em>Get Destination Ward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationWard(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DESTINATION_WARD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::DestinationWard))->asSequence()->any(true).oclAsType(emspcr::DestinationWard)";

	/**
	 * The cached OCL query for the '{@link #getDestinationWard(EMSDispositionSection) <em>Get Destination Ward</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationWard(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DESTINATION_WARD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DestinationWard getDestinationWard(EMSDispositionSection emsDispositionSection) {
	
	
	
		if (GET_DESTINATION_WARD__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION, EmspcrPackage.Literals.EMS_DISPOSITION_SECTION.getEAllOperations().get(79));
			try {
				GET_DESTINATION_WARD__EOCL_QRY = helper.createQuery(GET_DESTINATION_WARD__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DESTINATION_WARD__EOCL_QRY);
		return (DestinationWard) query.evaluate(emsDispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getUnitDisposition(EMSDispositionSection) <em>Get Unit Disposition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitDisposition(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_UNIT_DISPOSITION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::UnitDisposition))->asSequence()->any(true).oclAsType(emspcr::UnitDisposition)";

	/**
	 * The cached OCL query for the '{@link #getUnitDisposition(EMSDispositionSection) <em>Get Unit Disposition</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitDisposition(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_UNIT_DISPOSITION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  UnitDisposition getUnitDisposition(EMSDispositionSection emsDispositionSection) {
	
	
	
		if (GET_UNIT_DISPOSITION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION, EmspcrPackage.Literals.EMS_DISPOSITION_SECTION.getEAllOperations().get(80));
			try {
				GET_UNIT_DISPOSITION__EOCL_QRY = helper.createQuery(GET_UNIT_DISPOSITION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_UNIT_DISPOSITION__EOCL_QRY);
		return (UnitDisposition) query.evaluate(emsDispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientEngagement(EMSDispositionSection) <em>Get Patient Engagement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientEngagement(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_ENGAGEMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PatientEngagement))->asSequence()->any(true).oclAsType(emspcr::PatientEngagement)";

	/**
	 * The cached OCL query for the '{@link #getPatientEngagement(EMSDispositionSection) <em>Get Patient Engagement</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientEngagement(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_ENGAGEMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PatientEngagement getPatientEngagement(EMSDispositionSection emsDispositionSection) {
	
	
	
		if (GET_PATIENT_ENGAGEMENT__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION, EmspcrPackage.Literals.EMS_DISPOSITION_SECTION.getEAllOperations().get(81));
			try {
				GET_PATIENT_ENGAGEMENT__EOCL_QRY = helper.createQuery(GET_PATIENT_ENGAGEMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PATIENT_ENGAGEMENT__EOCL_QRY);
		return (PatientEngagement) query.evaluate(emsDispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCrewDisposition(EMSDispositionSection) <em>Get Crew Disposition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrewDisposition(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CREW_DISPOSITION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::CrewDisposition))->asSequence()->any(true).oclAsType(emspcr::CrewDisposition)";

	/**
	 * The cached OCL query for the '{@link #getCrewDisposition(EMSDispositionSection) <em>Get Crew Disposition</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrewDisposition(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CREW_DISPOSITION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  CrewDisposition getCrewDisposition(EMSDispositionSection emsDispositionSection) {
	
	
	
		if (GET_CREW_DISPOSITION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION, EmspcrPackage.Literals.EMS_DISPOSITION_SECTION.getEAllOperations().get(82));
			try {
				GET_CREW_DISPOSITION__EOCL_QRY = helper.createQuery(GET_CREW_DISPOSITION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CREW_DISPOSITION__EOCL_QRY);
		return (CrewDisposition) query.evaluate(emsDispositionSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getTransportDisposition(EMSDispositionSection) <em>Get Transport Disposition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportDisposition(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TRANSPORT_DISPOSITION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::TransportDisposition))->asSequence()->any(true).oclAsType(emspcr::TransportDisposition)";

	/**
	 * The cached OCL query for the '{@link #getTransportDisposition(EMSDispositionSection) <em>Get Transport Disposition</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportDisposition(EMSDispositionSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TRANSPORT_DISPOSITION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  TransportDisposition getTransportDisposition(EMSDispositionSection emsDispositionSection) {
	
	
	
		if (GET_TRANSPORT_DISPOSITION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_DISPOSITION_SECTION, EmspcrPackage.Literals.EMS_DISPOSITION_SECTION.getEAllOperations().get(83));
			try {
				GET_TRANSPORT_DISPOSITION__EOCL_QRY = helper.createQuery(GET_TRANSPORT_DISPOSITION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_TRANSPORT_DISPOSITION__EOCL_QRY);
		return (TransportDisposition) query.evaluate(emsDispositionSection);
	}

} // EMSDispositionSectionOperations