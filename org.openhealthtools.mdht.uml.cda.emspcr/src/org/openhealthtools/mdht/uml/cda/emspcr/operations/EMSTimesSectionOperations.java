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

import org.openhealthtools.mdht.uml.cda.emspcr.CallTime;
import org.openhealthtools.mdht.uml.cda.emspcr.DispatchNotifiedTime;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatientTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitEnRouteTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitNotifiedTime;
import org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTime;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Times Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionCallTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Call Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionUnitNotifiedTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit Notified Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionUnitEnRouteTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit En Route Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionUnitOnSceneTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit On Scene Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionUnitAtPatienttTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit At Patientt Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionUnitLeftSceneTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit Left Scene Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionPatientArrivedAtDestinationTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Patient Arrived At Destination Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionUnitBackInServiceTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit Back In Service Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionDispatchNotifiedTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Dispatch Notified Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#getCallTime() <em>Get Call Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#getUnitNotifiedTime() <em>Get Unit Notified Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#getUnitEnRouteTime() <em>Get Unit En Route Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#getUnitOnSceneTime() <em>Get Unit On Scene Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#getUnitAtPatienttTime() <em>Get Unit At Patientt Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#getUnitLeftSceneTime() <em>Get Unit Left Scene Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#getPatientArrivedAtDestinationTime() <em>Get Patient Arrived At Destination Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#getUnitBackInServiceTime() <em>Get Unit Back In Service Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#getDispatchNotifiedTime() <em>Get Dispatch Notified Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSTimesSectionOperations extends SectionOperations {
 
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
	protected EMSTimesSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSTimesSectionTemplateId(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionTemplateId(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_TIMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.10' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSTimesSectionTemplateId(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionTemplateId(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_TIMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSTimesSectionTemplateId(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSTimesSectionEMSTimesSectionTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_TIMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
			try {
				VALIDATE_EMS_TIMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_TIMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsTimesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEMSTimesSectionTemplateId"),
						 new Object [] { emsTimesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSTimesSectionCode(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionCode(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_TIMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67667-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSTimesSectionCode(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionCode(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_TIMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSTimesSectionCode(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSTimesSectionEMSTimesSectionCode","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_TIMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
			try {
				VALIDATE_EMS_TIMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_TIMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsTimesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_CODE,
						 EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEMSTimesSectionCode"),
						 new Object [] { emsTimesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSTimesSectionCodeP(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionCodeP(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_TIMES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSTimesSectionCodeP(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionCodeP(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_TIMES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSTimesSectionCodeP(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSTimesSectionEMSTimesSectionCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_TIMES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
			try {
				VALIDATE_EMS_TIMES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_TIMES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsTimesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEMSTimesSectionCodeP"),
						 new Object [] { emsTimesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSTimesSectionTitle(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionTitle(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_TIMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSTimesSectionTitle(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionTitle(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_TIMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSTimesSectionTitle(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSTimesSectionEMSTimesSectionTitle","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_TIMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
			try {
				VALIDATE_EMS_TIMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_TIMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsTimesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_TITLE,
						 EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEMSTimesSectionTitle"),
						 new Object [] { emsTimesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSTimesSectionText(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionText(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_TIMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSTimesSectionText(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionText(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_TIMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSTimesSectionText(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSTimesSectionEMSTimesSectionText","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_TIMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
			try {
				VALIDATE_EMS_TIMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_TIMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsTimesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_TEXT,
						 EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEMSTimesSectionText"),
						 new Object [] { emsTimesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSTimesSectionCallTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Call Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionCallTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_TIMES_SECTION_CALL_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::CallTime) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSTimesSectionCallTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Call Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionCallTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_TIMES_SECTION_CALL_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSTimesSectionCallTime(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSTimesSectionEMSTimesSectionCallTime","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_TIMES_SECTION_CALL_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
			try {
				VALIDATE_EMS_TIMES_SECTION_CALL_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_CALL_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_TIMES_SECTION_CALL_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsTimesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_CALL_TIME,
						 EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEMSTimesSectionCallTime"),
						 new Object [] { emsTimesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSTimesSectionUnitNotifiedTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit Notified Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionUnitNotifiedTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_TIMES_SECTION_UNIT_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::UnitNotifiedTime) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSTimesSectionUnitNotifiedTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit Notified Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionUnitNotifiedTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_TIMES_SECTION_UNIT_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSTimesSectionUnitNotifiedTime(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSTimesSectionEMSTimesSectionUnitNotifiedTime","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_TIMES_SECTION_UNIT_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
			try {
				VALIDATE_EMS_TIMES_SECTION_UNIT_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_UNIT_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_TIMES_SECTION_UNIT_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsTimesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_UNIT_NOTIFIED_TIME,
						 EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEMSTimesSectionUnitNotifiedTime"),
						 new Object [] { emsTimesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSTimesSectionUnitEnRouteTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit En Route Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionUnitEnRouteTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_TIMES_SECTION_UNIT_EN_ROUTE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::UnitEnRouteTime) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSTimesSectionUnitEnRouteTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit En Route Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionUnitEnRouteTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_TIMES_SECTION_UNIT_EN_ROUTE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSTimesSectionUnitEnRouteTime(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSTimesSectionEMSTimesSectionUnitEnRouteTime","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_TIMES_SECTION_UNIT_EN_ROUTE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
			try {
				VALIDATE_EMS_TIMES_SECTION_UNIT_EN_ROUTE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_UNIT_EN_ROUTE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_TIMES_SECTION_UNIT_EN_ROUTE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsTimesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_UNIT_EN_ROUTE_TIME,
						 EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEMSTimesSectionUnitEnRouteTime"),
						 new Object [] { emsTimesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSTimesSectionUnitOnSceneTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit On Scene Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionUnitOnSceneTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_TIMES_SECTION_UNIT_ON_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::UnitOnSceneTime) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSTimesSectionUnitOnSceneTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit On Scene Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionUnitOnSceneTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_TIMES_SECTION_UNIT_ON_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSTimesSectionUnitOnSceneTime(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSTimesSectionEMSTimesSectionUnitOnSceneTime","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_TIMES_SECTION_UNIT_ON_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
			try {
				VALIDATE_EMS_TIMES_SECTION_UNIT_ON_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_UNIT_ON_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_TIMES_SECTION_UNIT_ON_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsTimesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_UNIT_ON_SCENE_TIME,
						 EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEMSTimesSectionUnitOnSceneTime"),
						 new Object [] { emsTimesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSTimesSectionUnitAtPatienttTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit At Patientt Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionUnitAtPatienttTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_TIMES_SECTION_UNIT_AT_PATIENTT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::UnitAtPatientTime) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSTimesSectionUnitAtPatienttTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit At Patientt Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionUnitAtPatienttTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_TIMES_SECTION_UNIT_AT_PATIENTT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSTimesSectionUnitAtPatienttTime(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSTimesSectionEMSTimesSectionUnitAtPatienttTime","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_TIMES_SECTION_UNIT_AT_PATIENTT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
			try {
				VALIDATE_EMS_TIMES_SECTION_UNIT_AT_PATIENTT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_UNIT_AT_PATIENTT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_TIMES_SECTION_UNIT_AT_PATIENTT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsTimesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_UNIT_AT_PATIENTT_TIME,
						 EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEMSTimesSectionUnitAtPatienttTime"),
						 new Object [] { emsTimesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSTimesSectionUnitLeftSceneTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit Left Scene Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionUnitLeftSceneTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_TIMES_SECTION_UNIT_LEFT_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::UnitLeftSceneTime) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSTimesSectionUnitLeftSceneTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit Left Scene Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionUnitLeftSceneTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_TIMES_SECTION_UNIT_LEFT_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSTimesSectionUnitLeftSceneTime(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSTimesSectionEMSTimesSectionUnitLeftSceneTime","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_TIMES_SECTION_UNIT_LEFT_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
			try {
				VALIDATE_EMS_TIMES_SECTION_UNIT_LEFT_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_UNIT_LEFT_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_TIMES_SECTION_UNIT_LEFT_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsTimesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_UNIT_LEFT_SCENE_TIME,
						 EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEMSTimesSectionUnitLeftSceneTime"),
						 new Object [] { emsTimesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSTimesSectionPatientArrivedAtDestinationTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Patient Arrived At Destination Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionPatientArrivedAtDestinationTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_TIMES_SECTION_PATIENT_ARRIVED_AT_DESTINATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PatientArrivedAtDestinationTime) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSTimesSectionPatientArrivedAtDestinationTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Patient Arrived At Destination Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionPatientArrivedAtDestinationTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_TIMES_SECTION_PATIENT_ARRIVED_AT_DESTINATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSTimesSectionPatientArrivedAtDestinationTime(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSTimesSectionEMSTimesSectionPatientArrivedAtDestinationTime","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_TIMES_SECTION_PATIENT_ARRIVED_AT_DESTINATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
			try {
				VALIDATE_EMS_TIMES_SECTION_PATIENT_ARRIVED_AT_DESTINATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_PATIENT_ARRIVED_AT_DESTINATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_TIMES_SECTION_PATIENT_ARRIVED_AT_DESTINATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsTimesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_PATIENT_ARRIVED_AT_DESTINATION_TIME,
						 EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEMSTimesSectionPatientArrivedAtDestinationTime"),
						 new Object [] { emsTimesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSTimesSectionUnitBackInServiceTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit Back In Service Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionUnitBackInServiceTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_TIMES_SECTION_UNIT_BACK_IN_SERVICE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::UnitBackInServiceTime) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSTimesSectionUnitBackInServiceTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Unit Back In Service Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionUnitBackInServiceTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_TIMES_SECTION_UNIT_BACK_IN_SERVICE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSTimesSectionUnitBackInServiceTime(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSTimesSectionEMSTimesSectionUnitBackInServiceTime","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_TIMES_SECTION_UNIT_BACK_IN_SERVICE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
			try {
				VALIDATE_EMS_TIMES_SECTION_UNIT_BACK_IN_SERVICE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_UNIT_BACK_IN_SERVICE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_TIMES_SECTION_UNIT_BACK_IN_SERVICE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsTimesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_UNIT_BACK_IN_SERVICE_TIME,
						 EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEMSTimesSectionUnitBackInServiceTime"),
						 new Object [] { emsTimesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSTimesSectionDispatchNotifiedTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Dispatch Notified Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionDispatchNotifiedTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_TIMES_SECTION_DISPATCH_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::DispatchNotifiedTime) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSTimesSectionDispatchNotifiedTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Dispatch Notified Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSTimesSectionDispatchNotifiedTime(EMSTimesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_TIMES_SECTION_DISPATCH_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsTimesSection The receiving '<em><b>EMS Times Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSTimesSectionDispatchNotifiedTime(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSTimesSectionEMSTimesSectionDispatchNotifiedTime","INFO");
    
  	  
  	  
		if (VALIDATE_EMS_TIMES_SECTION_DISPATCH_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_TIMES_SECTION);
			try {
				VALIDATE_EMS_TIMES_SECTION_DISPATCH_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_TIMES_SECTION_DISPATCH_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_TIMES_SECTION_DISPATCH_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsTimesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_TIMES_SECTION__EMS_TIMES_SECTION_DISPATCH_NOTIFIED_TIME,
						 EmspcrPlugin.INSTANCE.getString("EMSTimesSectionEMSTimesSectionDispatchNotifiedTime"),
						 new Object [] { emsTimesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCallTime(EMSTimesSection) <em>Get Call Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallTime(EMSTimesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CALL_TIME__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::CallTime))->asSequence()->any(true).oclAsType(emspcr::CallTime)";

	/**
	 * The cached OCL query for the '{@link #getCallTime(EMSTimesSection) <em>Get Call Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallTime(EMSTimesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CALL_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  CallTime getCallTime(EMSTimesSection emsTimesSection) {
	
	
	
		if (GET_CALL_TIME__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_TIMES_SECTION, EmspcrPackage.Literals.EMS_TIMES_SECTION.getEAllOperations().get(69));
			try {
				GET_CALL_TIME__EOCL_QRY = helper.createQuery(GET_CALL_TIME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CALL_TIME__EOCL_QRY);
		return (CallTime) query.evaluate(emsTimesSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getUnitNotifiedTime(EMSTimesSection) <em>Get Unit Notified Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitNotifiedTime(EMSTimesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_UNIT_NOTIFIED_TIME__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::UnitNotifiedTime))->asSequence()->any(true).oclAsType(emspcr::UnitNotifiedTime)";

	/**
	 * The cached OCL query for the '{@link #getUnitNotifiedTime(EMSTimesSection) <em>Get Unit Notified Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitNotifiedTime(EMSTimesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_UNIT_NOTIFIED_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  UnitNotifiedTime getUnitNotifiedTime(EMSTimesSection emsTimesSection) {
	
	
	
		if (GET_UNIT_NOTIFIED_TIME__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_TIMES_SECTION, EmspcrPackage.Literals.EMS_TIMES_SECTION.getEAllOperations().get(70));
			try {
				GET_UNIT_NOTIFIED_TIME__EOCL_QRY = helper.createQuery(GET_UNIT_NOTIFIED_TIME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_UNIT_NOTIFIED_TIME__EOCL_QRY);
		return (UnitNotifiedTime) query.evaluate(emsTimesSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getUnitEnRouteTime(EMSTimesSection) <em>Get Unit En Route Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitEnRouteTime(EMSTimesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_UNIT_EN_ROUTE_TIME__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::UnitEnRouteTime))->asSequence()->any(true).oclAsType(emspcr::UnitEnRouteTime)";

	/**
	 * The cached OCL query for the '{@link #getUnitEnRouteTime(EMSTimesSection) <em>Get Unit En Route Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitEnRouteTime(EMSTimesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_UNIT_EN_ROUTE_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  UnitEnRouteTime getUnitEnRouteTime(EMSTimesSection emsTimesSection) {
	
	
	
		if (GET_UNIT_EN_ROUTE_TIME__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_TIMES_SECTION, EmspcrPackage.Literals.EMS_TIMES_SECTION.getEAllOperations().get(71));
			try {
				GET_UNIT_EN_ROUTE_TIME__EOCL_QRY = helper.createQuery(GET_UNIT_EN_ROUTE_TIME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_UNIT_EN_ROUTE_TIME__EOCL_QRY);
		return (UnitEnRouteTime) query.evaluate(emsTimesSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getUnitOnSceneTime(EMSTimesSection) <em>Get Unit On Scene Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOnSceneTime(EMSTimesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_UNIT_ON_SCENE_TIME__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::UnitOnSceneTime))->asSequence()->any(true).oclAsType(emspcr::UnitOnSceneTime)";

	/**
	 * The cached OCL query for the '{@link #getUnitOnSceneTime(EMSTimesSection) <em>Get Unit On Scene Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOnSceneTime(EMSTimesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_UNIT_ON_SCENE_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  UnitOnSceneTime getUnitOnSceneTime(EMSTimesSection emsTimesSection) {
	
	
	
		if (GET_UNIT_ON_SCENE_TIME__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_TIMES_SECTION, EmspcrPackage.Literals.EMS_TIMES_SECTION.getEAllOperations().get(72));
			try {
				GET_UNIT_ON_SCENE_TIME__EOCL_QRY = helper.createQuery(GET_UNIT_ON_SCENE_TIME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_UNIT_ON_SCENE_TIME__EOCL_QRY);
		return (UnitOnSceneTime) query.evaluate(emsTimesSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getUnitAtPatienttTime(EMSTimesSection) <em>Get Unit At Patientt Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitAtPatienttTime(EMSTimesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_UNIT_AT_PATIENTT_TIME__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::UnitAtPatientTime))->asSequence()->any(true).oclAsType(emspcr::UnitAtPatientTime)";

	/**
	 * The cached OCL query for the '{@link #getUnitAtPatienttTime(EMSTimesSection) <em>Get Unit At Patientt Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitAtPatienttTime(EMSTimesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_UNIT_AT_PATIENTT_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  UnitAtPatientTime getUnitAtPatienttTime(EMSTimesSection emsTimesSection) {
	
	
	
		if (GET_UNIT_AT_PATIENTT_TIME__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_TIMES_SECTION, EmspcrPackage.Literals.EMS_TIMES_SECTION.getEAllOperations().get(73));
			try {
				GET_UNIT_AT_PATIENTT_TIME__EOCL_QRY = helper.createQuery(GET_UNIT_AT_PATIENTT_TIME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_UNIT_AT_PATIENTT_TIME__EOCL_QRY);
		return (UnitAtPatientTime) query.evaluate(emsTimesSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getUnitLeftSceneTime(EMSTimesSection) <em>Get Unit Left Scene Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitLeftSceneTime(EMSTimesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_UNIT_LEFT_SCENE_TIME__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::UnitLeftSceneTime))->asSequence()->any(true).oclAsType(emspcr::UnitLeftSceneTime)";

	/**
	 * The cached OCL query for the '{@link #getUnitLeftSceneTime(EMSTimesSection) <em>Get Unit Left Scene Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitLeftSceneTime(EMSTimesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_UNIT_LEFT_SCENE_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  UnitLeftSceneTime getUnitLeftSceneTime(EMSTimesSection emsTimesSection) {
	
	
	
		if (GET_UNIT_LEFT_SCENE_TIME__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_TIMES_SECTION, EmspcrPackage.Literals.EMS_TIMES_SECTION.getEAllOperations().get(74));
			try {
				GET_UNIT_LEFT_SCENE_TIME__EOCL_QRY = helper.createQuery(GET_UNIT_LEFT_SCENE_TIME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_UNIT_LEFT_SCENE_TIME__EOCL_QRY);
		return (UnitLeftSceneTime) query.evaluate(emsTimesSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientArrivedAtDestinationTime(EMSTimesSection) <em>Get Patient Arrived At Destination Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientArrivedAtDestinationTime(EMSTimesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_ARRIVED_AT_DESTINATION_TIME__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PatientArrivedAtDestinationTime))->asSequence()->any(true).oclAsType(emspcr::PatientArrivedAtDestinationTime)";

	/**
	 * The cached OCL query for the '{@link #getPatientArrivedAtDestinationTime(EMSTimesSection) <em>Get Patient Arrived At Destination Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientArrivedAtDestinationTime(EMSTimesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_ARRIVED_AT_DESTINATION_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PatientArrivedAtDestinationTime getPatientArrivedAtDestinationTime(EMSTimesSection emsTimesSection) {
	
	
	
		if (GET_PATIENT_ARRIVED_AT_DESTINATION_TIME__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_TIMES_SECTION, EmspcrPackage.Literals.EMS_TIMES_SECTION.getEAllOperations().get(75));
			try {
				GET_PATIENT_ARRIVED_AT_DESTINATION_TIME__EOCL_QRY = helper.createQuery(GET_PATIENT_ARRIVED_AT_DESTINATION_TIME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PATIENT_ARRIVED_AT_DESTINATION_TIME__EOCL_QRY);
		return (PatientArrivedAtDestinationTime) query.evaluate(emsTimesSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getUnitBackInServiceTime(EMSTimesSection) <em>Get Unit Back In Service Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitBackInServiceTime(EMSTimesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_UNIT_BACK_IN_SERVICE_TIME__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::UnitBackInServiceTime))->asSequence()->any(true).oclAsType(emspcr::UnitBackInServiceTime)";

	/**
	 * The cached OCL query for the '{@link #getUnitBackInServiceTime(EMSTimesSection) <em>Get Unit Back In Service Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitBackInServiceTime(EMSTimesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_UNIT_BACK_IN_SERVICE_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  UnitBackInServiceTime getUnitBackInServiceTime(EMSTimesSection emsTimesSection) {
	
	
	
		if (GET_UNIT_BACK_IN_SERVICE_TIME__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_TIMES_SECTION, EmspcrPackage.Literals.EMS_TIMES_SECTION.getEAllOperations().get(76));
			try {
				GET_UNIT_BACK_IN_SERVICE_TIME__EOCL_QRY = helper.createQuery(GET_UNIT_BACK_IN_SERVICE_TIME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_UNIT_BACK_IN_SERVICE_TIME__EOCL_QRY);
		return (UnitBackInServiceTime) query.evaluate(emsTimesSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDispatchNotifiedTime(EMSTimesSection) <em>Get Dispatch Notified Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatchNotifiedTime(EMSTimesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISPATCH_NOTIFIED_TIME__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::DispatchNotifiedTime))->asSequence()->any(true).oclAsType(emspcr::DispatchNotifiedTime)";

	/**
	 * The cached OCL query for the '{@link #getDispatchNotifiedTime(EMSTimesSection) <em>Get Dispatch Notified Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatchNotifiedTime(EMSTimesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISPATCH_NOTIFIED_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DispatchNotifiedTime getDispatchNotifiedTime(EMSTimesSection emsTimesSection) {
	
	
	
		if (GET_DISPATCH_NOTIFIED_TIME__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_TIMES_SECTION, EmspcrPackage.Literals.EMS_TIMES_SECTION.getEAllOperations().get(77));
			try {
				GET_DISPATCH_NOTIFIED_TIME__EOCL_QRY = helper.createQuery(GET_DISPATCH_NOTIFIED_TIME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DISPATCH_NOTIFIED_TIME__EOCL_QRY);
		return (DispatchNotifiedTime) query.evaluate(emsTimesSection);
	}

} // EMSTimesSectionOperations