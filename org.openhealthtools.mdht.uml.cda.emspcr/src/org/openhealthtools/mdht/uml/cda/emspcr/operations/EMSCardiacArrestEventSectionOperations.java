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

import org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Cardiac Arrest Event Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection#validateEMSCardiacArrestEventSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection#validateEMSCardiacArrestEventSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection#validateEMSCardiacArrestEventSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection#validateEMSCardiacArrestEventSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection#validateEMSCardiacArrestEventSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection#validateEMSCardiacArrestEventSectionCardiacArrestExistence(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Cardiac Arrest Existence</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection#getCardiacArrestExistence() <em>Get Cardiac Arrest Existence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSCardiacArrestEventSectionOperations extends SectionOperations {
 
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
	protected EMSCardiacArrestEventSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSCardiacArrestEventSectionTemplateId(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionTemplateId(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.14' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSCardiacArrestEventSectionTemplateId(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionTemplateId(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsCardiacArrestEventSection The receiving '<em><b>EMS Cardiac Arrest Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSCardiacArrestEventSectionTemplateId(EMSCardiacArrestEventSection emsCardiacArrestEventSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSCardiacArrestEventSectionEMSCardiacArrestEventSectionTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT_SECTION);
			try {
				VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsCardiacArrestEventSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_CARDIAC_ARREST_EVENT_SECTION__EMS_CARDIAC_ARREST_EVENT_SECTION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("EMSCardiacArrestEventSectionEMSCardiacArrestEventSectionTemplateId"),
						 new Object [] { emsCardiacArrestEventSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSCardiacArrestEventSectionCode(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionCode(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '67799-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSCardiacArrestEventSectionCode(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionCode(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsCardiacArrestEventSection The receiving '<em><b>EMS Cardiac Arrest Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSCardiacArrestEventSectionCode(EMSCardiacArrestEventSection emsCardiacArrestEventSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSCardiacArrestEventSectionEMSCardiacArrestEventSectionCode","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT_SECTION);
			try {
				VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsCardiacArrestEventSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_CARDIAC_ARREST_EVENT_SECTION__EMS_CARDIAC_ARREST_EVENT_SECTION_CODE,
						 EmspcrPlugin.INSTANCE.getString("EMSCardiacArrestEventSectionEMSCardiacArrestEventSectionCode"),
						 new Object [] { emsCardiacArrestEventSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSCardiacArrestEventSectionCodeP(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionCodeP(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSCardiacArrestEventSectionCodeP(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionCodeP(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsCardiacArrestEventSection The receiving '<em><b>EMS Cardiac Arrest Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSCardiacArrestEventSectionCodeP(EMSCardiacArrestEventSection emsCardiacArrestEventSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSCardiacArrestEventSectionEMSCardiacArrestEventSectionCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT_SECTION);
			try {
				VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsCardiacArrestEventSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_CARDIAC_ARREST_EVENT_SECTION__EMS_CARDIAC_ARREST_EVENT_SECTION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("EMSCardiacArrestEventSectionEMSCardiacArrestEventSectionCodeP"),
						 new Object [] { emsCardiacArrestEventSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSCardiacArrestEventSectionTitle(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionTitle(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Cardiac Arrest Event')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSCardiacArrestEventSectionTitle(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionTitle(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsCardiacArrestEventSection The receiving '<em><b>EMS Cardiac Arrest Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSCardiacArrestEventSectionTitle(EMSCardiacArrestEventSection emsCardiacArrestEventSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSCardiacArrestEventSectionEMSCardiacArrestEventSectionTitle","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT_SECTION);
			try {
				VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsCardiacArrestEventSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_CARDIAC_ARREST_EVENT_SECTION__EMS_CARDIAC_ARREST_EVENT_SECTION_TITLE,
						 EmspcrPlugin.INSTANCE.getString("EMSCardiacArrestEventSectionEMSCardiacArrestEventSectionTitle"),
						 new Object [] { emsCardiacArrestEventSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSCardiacArrestEventSectionText(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionText(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSCardiacArrestEventSectionText(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionText(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsCardiacArrestEventSection The receiving '<em><b>EMS Cardiac Arrest Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSCardiacArrestEventSectionText(EMSCardiacArrestEventSection emsCardiacArrestEventSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSCardiacArrestEventSectionEMSCardiacArrestEventSectionText","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT_SECTION);
			try {
				VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsCardiacArrestEventSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_CARDIAC_ARREST_EVENT_SECTION__EMS_CARDIAC_ARREST_EVENT_SECTION_TEXT,
						 EmspcrPlugin.INSTANCE.getString("EMSCardiacArrestEventSectionEMSCardiacArrestEventSectionText"),
						 new Object [] { emsCardiacArrestEventSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSCardiacArrestEventSectionCardiacArrestExistence(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Cardiac Arrest Existence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionCardiacArrestExistence(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CARDIAC_ARREST_EXISTENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::CardiacArrest) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSCardiacArrestEventSectionCardiacArrestExistence(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Cardiac Arrest Existence</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSCardiacArrestEventSectionCardiacArrestExistence(EMSCardiacArrestEventSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CARDIAC_ARREST_EXISTENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsCardiacArrestEventSection The receiving '<em><b>EMS Cardiac Arrest Event Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEMSCardiacArrestEventSectionCardiacArrestExistence(EMSCardiacArrestEventSection emsCardiacArrestEventSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"EMSCardiacArrestEventSectionEMSCardiacArrestEventSectionCardiacArrestExistence","ERROR");
    
  	  
  	  
		if (VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CARDIAC_ARREST_EXISTENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT_SECTION);
			try {
				VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CARDIAC_ARREST_EXISTENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CARDIAC_ARREST_EXISTENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CARDIAC_ARREST_EXISTENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(emsCardiacArrestEventSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EMS_CARDIAC_ARREST_EVENT_SECTION__EMS_CARDIAC_ARREST_EVENT_SECTION_CARDIAC_ARREST_EXISTENCE,
						 EmspcrPlugin.INSTANCE.getString("EMSCardiacArrestEventSectionEMSCardiacArrestEventSectionCardiacArrestExistence"),
						 new Object [] { emsCardiacArrestEventSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCardiacArrestExistence(EMSCardiacArrestEventSection) <em>Get Cardiac Arrest Existence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardiacArrestExistence(EMSCardiacArrestEventSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CARDIAC_ARREST_EXISTENCE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::CardiacArrest))->asSequence()->any(true).oclAsType(emspcr::CardiacArrest)";

	/**
	 * The cached OCL query for the '{@link #getCardiacArrestExistence(EMSCardiacArrestEventSection) <em>Get Cardiac Arrest Existence</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardiacArrestExistence(EMSCardiacArrestEventSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CARDIAC_ARREST_EXISTENCE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  CardiacArrest getCardiacArrestExistence(EMSCardiacArrestEventSection emsCardiacArrestEventSection) {
	
	
	
		if (GET_CARDIAC_ARREST_EXISTENCE__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT_SECTION, EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT_SECTION.getEAllOperations().get(61));
			try {
				GET_CARDIAC_ARREST_EXISTENCE__EOCL_QRY = helper.createQuery(GET_CARDIAC_ARREST_EXISTENCE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CARDIAC_ARREST_EXISTENCE__EOCL_QRY);
		return (CardiacArrest) query.evaluate(emsCardiacArrestEventSection);
	}

} // EMSCardiacArrestEventSectionOperations