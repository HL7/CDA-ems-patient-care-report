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

import org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Protocol Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionProtocolObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Protocol Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionCandidatePatientRegistryType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Candidate Patient Registry Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#getProtocolObservations() <em>Get Protocol Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#getCandidatePatientRegistryType() <em>Get Candidate Patient Registry Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSProtocolSectionOperations extends SectionOperations {

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
	protected EMSProtocolSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSProtocolSectionTemplateId(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProtocolSectionTemplateId(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PROTOCOL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.7' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSProtocolSectionTemplateId(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProtocolSectionTemplateId(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_PROTOCOL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsProtocolSection The receiving '<em><b>EMS Protocol Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSProtocolSectionTemplateId(EMSProtocolSection emsProtocolSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSProtocolSectionEMSProtocolSectionTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_PROTOCOL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PROTOCOL_SECTION);
			try {
				VALIDATE_EMS_PROTOCOL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_PROTOCOL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_PROTOCOL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsProtocolSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_PROTOCOL_SECTION__EMS_PROTOCOL_SECTION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("EMSProtocolSectionEMSProtocolSectionTemplateId"),
						 new Object [] { emsProtocolSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSProtocolSectionCode(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProtocolSectionCode(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PROTOCOL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67663-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSProtocolSectionCode(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProtocolSectionCode(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_PROTOCOL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsProtocolSection The receiving '<em><b>EMS Protocol Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSProtocolSectionCode(EMSProtocolSection emsProtocolSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSProtocolSectionEMSProtocolSectionCode","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_PROTOCOL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PROTOCOL_SECTION);
			try {
				VALIDATE_EMS_PROTOCOL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_PROTOCOL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_PROTOCOL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsProtocolSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_PROTOCOL_SECTION__EMS_PROTOCOL_SECTION_CODE,
						 EmspcrPlugin.INSTANCE.getString("EMSProtocolSectionEMSProtocolSectionCode"),
						 new Object [] { emsProtocolSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSProtocolSectionCodeP(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProtocolSectionCodeP(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PROTOCOL_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSProtocolSectionCodeP(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProtocolSectionCodeP(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_PROTOCOL_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsProtocolSection The receiving '<em><b>EMS Protocol Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSProtocolSectionCodeP(EMSProtocolSection emsProtocolSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSProtocolSectionEMSProtocolSectionCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_PROTOCOL_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PROTOCOL_SECTION);
			try {
				VALIDATE_EMS_PROTOCOL_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_PROTOCOL_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_PROTOCOL_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsProtocolSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_PROTOCOL_SECTION__EMS_PROTOCOL_SECTION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("EMSProtocolSectionEMSProtocolSectionCodeP"),
						 new Object [] { emsProtocolSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSProtocolSectionTitle(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProtocolSectionTitle(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PROTOCOL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSProtocolSectionTitle(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProtocolSectionTitle(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_PROTOCOL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsProtocolSection The receiving '<em><b>EMS Protocol Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSProtocolSectionTitle(EMSProtocolSection emsProtocolSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSProtocolSectionEMSProtocolSectionTitle","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_PROTOCOL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PROTOCOL_SECTION);
			try {
				VALIDATE_EMS_PROTOCOL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_PROTOCOL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_PROTOCOL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsProtocolSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_PROTOCOL_SECTION__EMS_PROTOCOL_SECTION_TITLE,
						 EmspcrPlugin.INSTANCE.getString("EMSProtocolSectionEMSProtocolSectionTitle"),
						 new Object [] { emsProtocolSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSProtocolSectionText(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProtocolSectionText(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PROTOCOL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSProtocolSectionText(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProtocolSectionText(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_PROTOCOL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsProtocolSection The receiving '<em><b>EMS Protocol Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSProtocolSectionText(EMSProtocolSection emsProtocolSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSProtocolSectionEMSProtocolSectionText","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_PROTOCOL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PROTOCOL_SECTION);
			try {
				VALIDATE_EMS_PROTOCOL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_PROTOCOL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_PROTOCOL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsProtocolSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_PROTOCOL_SECTION__EMS_PROTOCOL_SECTION_TEXT,
						 EmspcrPlugin.INSTANCE.getString("EMSProtocolSectionEMSProtocolSectionText"),
						 new Object [] { emsProtocolSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSProtocolSectionProtocolObservation(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Protocol Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProtocolSectionProtocolObservation(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PROTOCOL_SECTION_PROTOCOL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::ProtocolObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSProtocolSectionProtocolObservation(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Protocol Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProtocolSectionProtocolObservation(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_PROTOCOL_SECTION_PROTOCOL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsProtocolSection The receiving '<em><b>EMS Protocol Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSProtocolSectionProtocolObservation(EMSProtocolSection emsProtocolSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSProtocolSectionEMSProtocolSectionProtocolObservation","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_PROTOCOL_SECTION_PROTOCOL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PROTOCOL_SECTION);
			try {
				VALIDATE_EMS_PROTOCOL_SECTION_PROTOCOL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_PROTOCOL_SECTION_PROTOCOL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_PROTOCOL_SECTION_PROTOCOL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsProtocolSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_PROTOCOL_SECTION__EMS_PROTOCOL_SECTION_PROTOCOL_OBSERVATION,
						 EmspcrPlugin.INSTANCE.getString("EMSProtocolSectionEMSProtocolSectionProtocolObservation"),
						 new Object [] { emsProtocolSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSProtocolSectionCandidatePatientRegistryType(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Candidate Patient Registry Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProtocolSectionCandidatePatientRegistryType(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PROTOCOL_SECTION_CANDIDATE_PATIENT_REGISTRY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::CandidatePatientRegistryType) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSProtocolSectionCandidatePatientRegistryType(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Candidate Patient Registry Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSProtocolSectionCandidatePatientRegistryType(EMSProtocolSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EMS_PROTOCOL_SECTION_CANDIDATE_PATIENT_REGISTRY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsProtocolSection The receiving '<em><b>EMS Protocol Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSProtocolSectionCandidatePatientRegistryType(EMSProtocolSection emsProtocolSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSProtocolSectionEMSProtocolSectionCandidatePatientRegistryType","INFO");
    
  	  
  	  
		if (VALIDATE_EMS_PROTOCOL_SECTION_CANDIDATE_PATIENT_REGISTRY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PROTOCOL_SECTION);
			try {
				VALIDATE_EMS_PROTOCOL_SECTION_CANDIDATE_PATIENT_REGISTRY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_PROTOCOL_SECTION_CANDIDATE_PATIENT_REGISTRY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_PROTOCOL_SECTION_CANDIDATE_PATIENT_REGISTRY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsProtocolSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_PROTOCOL_SECTION__EMS_PROTOCOL_SECTION_CANDIDATE_PATIENT_REGISTRY_TYPE,
						 EmspcrPlugin.INSTANCE.getString("EMSProtocolSectionEMSProtocolSectionCandidatePatientRegistryType"),
						 new Object [] { emsProtocolSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProtocolObservations(EMSProtocolSection) <em>Get Protocol Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolObservations(EMSProtocolSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROTOCOL_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ProtocolObservation)).oclAsType(emspcr::ProtocolObservation)";

	/**
	 * The cached OCL query for the '{@link #getProtocolObservations(EMSProtocolSection) <em>Get Protocol Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolObservations(EMSProtocolSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROTOCOL_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProtocolObservation> getProtocolObservations(EMSProtocolSection emsProtocolSection) {
	
	
	
		if (GET_PROTOCOL_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_PROTOCOL_SECTION, EmspcrPackage.Literals.EMS_PROTOCOL_SECTION.getEAllOperations().get(62));
			try {
				GET_PROTOCOL_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_PROTOCOL_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROTOCOL_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProtocolObservation> result = (Collection<ProtocolObservation>) query.evaluate(emsProtocolSection);
		return new BasicEList.UnmodifiableEList<ProtocolObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCandidatePatientRegistryType(EMSProtocolSection) <em>Get Candidate Patient Registry Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidatePatientRegistryType(EMSProtocolSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CANDIDATE_PATIENT_REGISTRY_TYPE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::CandidatePatientRegistryType))->asSequence()->any(true).oclAsType(emspcr::CandidatePatientRegistryType)";

	/**
	 * The cached OCL query for the '{@link #getCandidatePatientRegistryType(EMSProtocolSection) <em>Get Candidate Patient Registry Type</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidatePatientRegistryType(EMSProtocolSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CANDIDATE_PATIENT_REGISTRY_TYPE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static CandidatePatientRegistryType getCandidatePatientRegistryType(EMSProtocolSection emsProtocolSection) {
	
	
	
		if (GET_CANDIDATE_PATIENT_REGISTRY_TYPE__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_PROTOCOL_SECTION, EmspcrPackage.Literals.EMS_PROTOCOL_SECTION.getEAllOperations().get(63));
			try {
				GET_CANDIDATE_PATIENT_REGISTRY_TYPE__EOCL_QRY = helper.createQuery(GET_CANDIDATE_PATIENT_REGISTRY_TYPE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CANDIDATE_PATIENT_REGISTRY_TYPE__EOCL_QRY);
		return (CandidatePatientRegistryType) query.evaluate(emsProtocolSection);
	}

} // EMSProtocolSectionOperations
